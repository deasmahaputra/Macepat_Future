///*
// * To change this license header, choose License Headers in Project Properties.
// * To change this template file, choose Tools | Templates
// * and open the template in the editor.
// */
package Preprocessing;
//
//
//
///**
// *
// * @author DEAS
// */
import java.util.Properties;
//
//
//
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
import java.util.List;
import java.util.Map;
import java.util.Properties;

public class CorreferenceResolution {

   public String Corref(String text){
   System.out.println("Data yang Masuk : "+text);
    
    Properties props = new Properties();
    props.put("annotators", "tokenize, ssplit, pos, lemma, ner, parse, dcoref");
    // The path for a file that includes a list of demonyms 

    StanfordCoreNLP pipeline = new StanfordCoreNLP(props);
    String tamp = null;
    tamp = " "; 
    Annotation document = new Annotation(text);
    pipeline.annotate(document);
    List<CoreMap> sentences = document.get(CoreAnnotations.SentencesAnnotation.class);

    for(CoreMap sentence: sentences){
      // traversing the words in the current sentence
      // a CoreLabel is a CoreMap with additional token-specific methods
      for (CoreLabel token: sentence.get(CoreAnnotations.TokensAnnotation.class)){
        // this is the text of the token
        String word = token.get(CoreAnnotations.TextAnnotation.class);
        // this is the POS tag of the token
        String pos = token.get(CoreAnnotations.PartOfSpeechAnnotation.class);
        // this is the NER label of the token
        String ne = token.get(CoreAnnotations.NamedEntityTagAnnotation.class);       
      }
      Tree tree = sentence.get(TreeCoreAnnotations.TreeAnnotation.class);
      
      SemanticGraph dependencies = sentence.get(SemanticGraphCoreAnnotations.CollapsedCCProcessedDependenciesAnnotation.class);

    }

    Map <Integer, CorefChain> graph = document.get(CorefCoreAnnotations.CorefChainAnnotation.class); 
   for(Map.Entry<Integer, CorefChain> entry : graph.entrySet()) {
            CorefChain c = entry.getValue();
            if(c.getMentionsInTextualOrder().size() <= 1)
                continue;
            CorefChain.CorefMention cm = c.getRepresentativeMention();
            String clust = "";
            
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

                System.out.println("Hasilnya : " + clust2);
                //String clus3 = clust2;
                 tamp = tamp + clust2;
//     
           // }
    }
            
    }
   return tamp;
   }
  
}
//
