/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Preprocessing;

import java.util.LinkedList;
import java.util.List;
import java.util.Properties;

import edu.stanford.nlp.ling.CoreAnnotations.LemmaAnnotation;
import edu.stanford.nlp.ling.CoreAnnotations.SentencesAnnotation;
import edu.stanford.nlp.ling.CoreAnnotations.TokensAnnotation;
import edu.stanford.nlp.ling.CoreLabel;
import edu.stanford.nlp.pipeline.Annotation;
import edu.stanford.nlp.pipeline.StanfordCoreNLP;
import edu.stanford.nlp.util.CoreMap;
import java.util.ArrayList;

/**
 *
 * @author DEAS
 */
public class Lemmatization {
    
       protected StanfordCoreNLP pipeline;

    public static String[] tag = {
            "_CC","_CD","_DT","_EX","_FW","_IN","_JJ","_JJR","_JJS","_LS","_MD","_NN","_NNS","_NNP","_NNPS","_PDT","_POS","_PRP","_PRP$","_RB","_RBR","_RBS","_RP","_SYM","_TO","_UH","_VB","_VBD","_VBG","_VBN","_VBP","_VBZ","_WDT","_WP","_WP$","_WRB","_#","_$","_.","_,","_:","_(","_)","_`","_'"
    };

    public Lemmatization() {
        // Create StanfordCoreNLP object properties, with POS tagging
        // (required for lemmatization), and lemmatization
        Properties props;
        props = new Properties();
        props.put("annotators", "tokenize, ssplit, pos, lemma");

        /*
         * This is a pipeline that takes in a string and returns various analyzed linguistic forms. 
         * The String is tokenized via a tokenizer (such as PTBTokenizerAnnotator), 
         * and then other sequence model style annotation can be used to add things like lemmas, 
         * POS tags, and named entities. These are returned as a list of CoreLabels. 
         * Other analysis components build and store parse trees, dependency graphs, etc. 
         * 
         * This class is designed to apply multiple Annotators to an Annotation. 
         * The idea is that you first build up the pipeline by adding Annotators, 
         * and then you take the objects you wish to annotate and pass them in and 
         * get in return a fully annotated object.
         * 
         *  StanfordCoreNLP loads a lot of models, so you probably
         *  only want to do this once per execution
         */
        this.pipeline = new StanfordCoreNLP(props);
    }

    public String lemmatize(String documentText)
    {
        List<String> lemmas = new LinkedList<String>();
        String kalimat ="";
        documentText=documentText.trim().replaceAll("\\s+", " ");
        String[] words = documentText.split(" ");
        String tes="";
        
        //tambahan
        ArrayList<String> listKata = new ArrayList<String>();
                
        for (String wordS : words) {
            listKata.add(wordS);
        }
        
        for (int i = 0; i < listKata.size(); i++) {
            
            String sList=listKata.get(i);
            for (int j = 0; j < tag.length; j++) {
                String sTag=tag[j];
                if (listKata.get(i).endsWith(sTag)) {
                    String kata=sList.replace(sTag,"");
                    
                    // Create an empty Annotation just with the given text
                    Annotation document = new Annotation(kata);
                    // run all Annotators on this text
                    this.pipeline.annotate(document);
                    // Iterate over all of the sentences found
                    List<CoreMap> sentences = document.get(SentencesAnnotation.class);
        
                    for(CoreMap sentence: sentences) {
                        // Iterate over all tokens in a sentence
                        for (CoreLabel token: sentence.get(TokensAnnotation.class)) {
                            // Retrieve and add the lemma for each word into the
                            // list of lemmas
                            kata = token.get(LemmaAnnotation.class)+sTag+" ";
                            lemmas.add(kata.trim().replaceAll("\\s+", " "));
                        }
                    }
                }

            }
        }
        
        for(int i = 0; i<lemmas.size(); i++){
            kalimat = kalimat + lemmas.get(i) +" ";
        }
        kalimat.trim().replaceAll("\\s+", " ");
        return kalimat;
    }
    
    public String lemmatizenotag(String kata)
    {
        String fitur = kata;
        String kalimat ="";
        List<String> lemmas = new LinkedList<String>();
        // Create an empty Annotation just with the given text
        Annotation document = new Annotation(fitur);
        // run all Annotators on this text
        this.pipeline.annotate(document);
        // Iterate over all of the sentences found
        List<CoreMap> sentences = document.get(SentencesAnnotation.class);

        for(CoreMap sentence: sentences) {
            // Iterate over all tokens in a sentence
            for (CoreLabel token: sentence.get(TokensAnnotation.class)) {
                // Retrieve and add the lemma for each word into the
                // list of lemmas
                fitur = token.get(LemmaAnnotation.class);
                lemmas.add(fitur.trim().replaceAll("\\s+", " "));
            }
        }
        for(int i = 0; i<lemmas.size(); i++){
            kalimat = kalimat + lemmas.get(i) +" ";
        }
        kalimat.trim().replaceAll("\\s+", " ");
        if(kalimat.endsWith(" ")){
            kalimat = kalimat.substring(0, kalimat.length()-1);
        }
        return kalimat;
    }
}
