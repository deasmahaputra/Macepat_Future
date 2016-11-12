///*
// * To change this license header, choose License Headers in Project Properties.
// * To change this template file, choose Tools | Templates
// * and open the template in the editor.
// */
//package Preprocessing;
//
//import edu.stanford.nlp.ling.CoreAnnotations.LemmaAnnotation; 
//import edu.stanford.nlp.ling.CoreAnnotations.SentencesAnnotation; 
//import edu.stanford.nlp.ling.CoreAnnotations.TokensAnnotation; 
//import edu.stanford.nlp.ling.CoreLabel; 
//import edu.stanford.nlp.pipeline.Annotation; 
//import edu.stanford.nlp.pipeline.StanfordCoreNLP; 
//import edu.stanford.nlp.util.CoreMap; 
//import java.util.ArrayList; 
//import java.util.List; 
//import java.util.Properties; 
//
///**
// *
// * @author DEAS
// */
//public class Lemmatization {
//    
//    protected StanfordCoreNLP pipeline;
//
//public Lemmatization(){
//
//    Properties props = new Properties();
//    props.put("annotator", "tokenizw , ssplit, pos, lemma");
//    
//    this.pipeline = new StanfordCoreNLP(props);
//}    
//public List<String> lemaList(String input){
//    List<String> lemmas = new ArrayList<>();
//    
//    Annotation dokumen = new Annotation(input);
//    
//    this.pipeline.annotate(dokumen);
//    
//    List<CoreMap> sentence = dokumen.get(SentencesAnnotation.class);
//    for(CoreMap sentences : sentence){
//        for(CoreLabel token: sentences.get(TokensAnnotation.class)){
//            lemmas.add(token.get(LemmaAnnotation.class));
//        }
//    }
//    return lemmas;
//}
//}
