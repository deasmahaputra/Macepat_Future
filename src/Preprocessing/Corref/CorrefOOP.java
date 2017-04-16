/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Preprocessing.Corref;

/**
 *
 * @author DEAS
 */
import edu.stanford.nlp.dcoref.CorefChain;
import edu.stanford.nlp.dcoref.CorefCoreAnnotations;
import edu.stanford.nlp.ling.CoreAnnotations;
import edu.stanford.nlp.ling.CoreLabel;
import edu.stanford.nlp.pipeline.Annotation;
import edu.stanford.nlp.pipeline.StanfordCoreNLP;
import edu.stanford.nlp.semgraph.SemanticGraph;
import edu.stanford.nlp.semgraph.SemanticGraphCoreAnnotations;
import edu.stanford.nlp.trees.Tree;
import edu.stanford.nlp.trees.TreeCoreAnnotations;
import edu.stanford.nlp.util.CoreMap;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Properties;

/**
 *
 * @author DEAS
 */
public class CorrefOOP {
   
    
   public static MyResult Corref(String text){
       //MyResult result = new MyResult(tamp, clust);
    List<String> tumpukan = new ArrayList<>();
    //String[] tumpukan = null;
    GetCorref getcorref = GetCorref.getInstance();
    String dataset = getcorref.getInputan();
       
    Properties props = new Properties();
    props.put("annotators", "tokenize, ssplit, pos, lemma, ner, parse, dcoref");
    ;                   // The path for a file that includes a list of demonyms 

    StanfordCoreNLP pipeline = new StanfordCoreNLP(props);
    String tamp = null;
    tamp = " ";
    
    String tampung[] = {};
    
    
     String clust = null;
     clust = " ";
     
     
    // read some text in the text variable
   // String text ="Ram and Lakshman went to the market he purchased";
        //String text ="The Revolutionary War occurred during the 1700s and it was the first war in the United States";
        //String text = "The atom is a basic unit of matter, it consists of a dense central nucleus surrounded by a cloud of negatively charged electrons."; 

    // create an empty Annotation just with the given text
      //for(String text2 : text){
      
    Annotation document = new Annotation(text);
       //System.out.println("Test Dokumen : " + document);

    // run all Annotators on this text
    pipeline.annotate(document);

    // these are all the sentences in this document
    // a CoreMap is essentially a Map that uses class objects as keys and has values with custom types
    List<CoreMap> sentences = document.get(CoreAnnotations.SentencesAnnotation.class);

    for(CoreMap sentence: sentences) {
      // traversing the words in the current sentence
      // a CoreLabel is a CoreMap with additional token-specific methods
      for (CoreLabel token: sentence.get(CoreAnnotations.TokensAnnotation.class)) {
        // this is the text of the token
        String word = token.get(CoreAnnotations.TextAnnotation.class);
        // this is the POS tag of the token
        String pos = token.get(CoreAnnotations.PartOfSpeechAnnotation.class);
        // this is the NER label of the token
        String ne = token.get(CoreAnnotations.NamedEntityTagAnnotation.class);       
      }

      // this is the parse tree of the current sentence
      Tree tree = sentence.get(TreeCoreAnnotations.TreeAnnotation.class);

      // this is the Stanford dependency graph of the current sentence
      SemanticGraph dependencies = sentence.get(SemanticGraphCoreAnnotations.CollapsedCCProcessedDependenciesAnnotation.class);

       //System.out.println("Dependencies "+dependencies);
    }

    // This is the coreference link graph
    // Each chain stores a set of mentions that link to each other,
    // along with a method for getting the most representative mention
    // Both sentence and token offsets start at 1!
    Map <Integer, CorefChain> graph = document.get(CorefCoreAnnotations.CorefChainAnnotation.class); 

    //System.out.println("Graph "+graph);
//    for(int i=1;i<graph.size();i++)
//    {
//         System.out.println(graph.get(i));
//    }
   for(Map.Entry<Integer, CorefChain> entry : graph.entrySet()) {
            CorefChain c = entry.getValue();

            //this is because it prints out a lot of self references which aren't that useful
            if(c.getMentionsInTextualOrder().size() <= 1)
                continue;
//            if(c.getCorefMentions().size() <= 1)
//                continue;

            CorefChain.CorefMention cm = c.getRepresentativeMention();
           
            
            List<CoreLabel> tks = document.get(CoreAnnotations.SentencesAnnotation.class).get(cm.sentNum-1).get(CoreAnnotations.TokensAnnotation.class);
            for(int i = cm.startIndex-1; i < cm.endIndex-1; i++)
                clust += tks.get(i).get(CoreAnnotations.TextAnnotation.class) + " ";
            clust = clust.trim();
            System.out.println("representative mention: \"" + clust + "\" is mentioned by:");

            for(CorefChain.CorefMention m : c.getMentionsInTextualOrder()){
               String clust2 = "";
                tks = document.get(CoreAnnotations.SentencesAnnotation.class).get(m.sentNum-1).get(CoreAnnotations.TokensAnnotation.class);
                for(int i = m.startIndex-1; i < m.endIndex-1; i++)
                    clust2 += tks.get(i).get(CoreAnnotations.TextAnnotation.class) + " ";
                clust2 = clust2.trim();
                //don't need the self mention
                if(clust.equals(clust2))
                    continue;

                //System.out.println("Hasilnya : " + clust2);
                //String clus3 = clust2;
                 tumpukan.add(clust2 + " ");
                 for(String hasiltamp : tumpukan)
                 tamp += hasiltamp;
                 System.out.println("Ini isinya tamp : " +tamp);      
                 getcorref.setMention(clust);
                 getcorref.setResult(tamp);
//                 for(int j = 0; j < tumpukan.size(); j++){
//                 getcorref.setInputan(dataset.replaceAll(clust, " "+tumpukan.get(j)));
//              };
           // }
           
    }       
   }
   
   return new MyResult(clust, tamp);
   }
}
