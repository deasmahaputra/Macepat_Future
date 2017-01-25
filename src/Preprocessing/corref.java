/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Preprocessing;

/**
 *
 * @author DEAS
 */

import java.util.Properties;


import edu.stanford.nlp.dcoref.CorefCoreAnnotations;
import edu.stanford.nlp.dcoref.CorefChain;
import edu.stanford.nlp.dcoref.Mention;
import edu.stanford.nlp.ling.CoreAnnotations;
import edu.stanford.nlp.pipeline.Annotation;
import edu.stanford.nlp.pipeline.StanfordCoreNLP;
import edu.stanford.nlp.util.CoreMap;
import java.util.Map;
public class corref {
    
      public static void main(String[] args) {
        Properties props = new Properties();
        props.setProperty("annotators", "tokenize,ssplit,pos,lemma,ner,parse,mention,coref");
        props.put("dcoref.score", true);
        Annotation document = new Annotation("The atom is a basic unit of matter, it   consists of a dense central nucleus surrounded by a cloud of negatively charged electrons.");
        StanfordCoreNLP pipeline = new StanfordCoreNLP(props);
        pipeline.annotate(document);
       

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
  }
    
}
