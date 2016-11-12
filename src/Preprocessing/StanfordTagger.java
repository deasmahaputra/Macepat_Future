/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Preprocessing;


import edu.stanford.nlp.tagger.maxent.MaxentTagger;
/**
 *
 * @author DEAS
 */
public class StanfordTagger {
    MaxentTagger max;
    
    public StanfordTagger(){
     max = new MaxentTagger("lib/english-bidirectional-distsim.tagger");
    }
     public String tagger(String input){
         
         String target = input;
         String sample = max.tagString(target);
         
         System.out.println(sample);
         return sample;
     
     }
    
}
