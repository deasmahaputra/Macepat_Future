///*
// * To change this license header, choose License Headers in Project Properties.
// * To change this template file, choose Tools | Templates
// * and open the template in the editor.
// */
//package Preprocessing;
//
//
//
///**
// *
// * @author DEAS
// */
//import java.util.Properties;
//
//
//
//import edu.stanford.nlp.dcoref.CorefCoreAnnotations;
//import edu.stanford.nlp.dcoref.CorefChain;
//import edu.stanford.nlp.dcoref.CorefChain.CorefMention;
//import edu.stanford.nlp.dcoref.Mention;
//import edu.stanford.nlp.ling.CoreAnnotations;
//import edu.stanford.nlp.ling.CoreAnnotations.SentencesAnnotation;
//import edu.stanford.nlp.ling.CoreAnnotations.TextAnnotation;
//import edu.stanford.nlp.ling.CoreAnnotations.TokensAnnotation;
//import edu.stanford.nlp.ling.CoreLabel;
//import edu.stanford.nlp.ling.CorefCoreAnnotations.CorefChainAnnotation;
//import edu.stanford.nlp.pipeline.Annotation;
//import edu.stanford.nlp.pipeline.StanfordCoreNLP;
//import edu.stanford.nlp.util.CoreMap;
//import java.util.List;
//import java.util.Map;
//
//public class CorreferenceResolution {
//  public static void main(String[] args) throws Exception {
//    Annotation document = new Annotation("Barack Obama was born in Hawaii.  He is the president. Obama was elected in 2008.");
//    Properties props = new Properties();
//    props.setProperty("annotators", "tokenize,ssplit,pos,lemma,ner,parse,mention,coref");
//    StanfordCoreNLP pipeline = new StanfordCoreNLP(props);
//    pipeline.annotate(document);
//    Map<Integer, CorefChain> coref = document.get(CorefChainAnnotation.class);
//
//        for(Map.Entry<Integer, CorefChain> entry : coref.entrySet()) {
//            CorefChain c = entry.getValue();
//
//            //this is because it prints out a lot of self references which aren't that useful
//            if(c.getCorefMentions.size() <= 1)
//                continue;
//
//            CorefMention cm = c.getRepresentativeMention();
//            String clust = "";
//            List<CoreLabel> tks = document.get(SentencesAnnotation.class).get(cm.sentNum-1).get(TokensAnnotation.class);
//            for(int i = cm.startIndex-1; i < cm.endIndex-1; i++)
//                clust += tks.get(i).get(TextAnnotation.class) + " ";
//            clust = clust.trim();
//            System.out.println("representative mention: \"" + clust + "\" is mentioned by:");
//
//            for(CorefMention m : c.getCorefMentions()){
//                String clust2 = "";
//                tks = document.get(SentencesAnnotation.class).get(m.sentNum-1).get(TokensAnnotation.class);
//                for(int i = m.startIndex-1; i < m.endIndex-1; i++)
//                    clust2 += tks.get(i).get(TextAnnotation.class) + " ";
//                clust2 = clust2.trim();
//                //don't need the self mention
//                if(clust.equals(clust2))
//                    continue;
//
//                System.out.println("\t" + clust2);
//            }
//        }
//   
//  }
//}
//
