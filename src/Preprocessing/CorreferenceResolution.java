/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Preprocessing;

import java.util.Properties

import scala.collection.JavaConversions._
import scala.collection.mutable.ArrayBuffer

import edu.stanford.nlp.pipeline.StanfordCoreNLP
import edu.stanford.nlp.pipeline.Annotation
import edu.stanford.nlp.dcoref.CorefCoreAnnotations.CorefChainAnnotation
import edu.stanford.nlp.ling.CoreAnnotations.SentencesAnnotation
import edu.stanford.nlp.ling.CoreAnnotations.TokensAnnotation
import edu.stanford.nlp.util.IntPair
import edu.stanford.nlp.dcoref.CorefChain.CorefMention
import edu.stanford.nlp.ling.CoreAnnotations.TextAnnotation

/**
 *
 * @author DEAS
 */
public class CorreferenceResolution {
    
    
    public static String Coref (String doc){
    
         Properties props = new Properties();
        props.put("annotators", "tokenize, ssplit, pos, lemma, ner, parse, dcoref");
        props.put("dcoref.score", true);
        pipeline = new StanfordCoreNLP(props);
        Annotation document = new Annotation("The atom is a basic unit of matter, it   consists of a dense central nucleus surrounded by a cloud of negatively charged electrons.");

        pipeline.annotate(document);
        Map<Integer, CorefChain> graph = document.get(CorefChainAnnotation.class);

        println aText

        for(Map.Entry<Integer, CorefChain> entry : graph) {

          CorefChain c =   entry.getValue();                
          println "ClusterId: " + entry.getKey();
          CorefMention cm = c.getRepresentativeMention();
          println "Representative Mention: " + aText.subSequence(cm.startIndex, cm.endIndex);

          List<CorefMention> cms = c.getCorefMentions();
          println  "Mentions:  ";
          cms.each { it -> 
              print aText.subSequence(it.startIndex, it.endIndex) + "|"; 
          } 
                println ""          
        }
    return null;
    }

    
    
}
