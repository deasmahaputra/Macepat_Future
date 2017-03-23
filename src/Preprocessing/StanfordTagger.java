/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Preprocessing;


import edu.stanford.nlp.tagger.maxent.MaxentTagger;
import java.io.IOException;
/**
 *
 * @author cahyadi
 */
public class StanfordTagger {
    MaxentTagger target;
    public StanfordTagger(){
        target = new MaxentTagger("lib/english-bidirectional-distsim.tagger");
    }
    
    public String tagger(String input) {
        // TODO code application logic here
        
        // The sample string
 
        String sample = input;

        // The tagged string

        String tagged = target.tagString(sample);

        // Output the result

        System.out.println(tagged);
        
        return tagged;
    }
}
