/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Taxonomy;

import static Preprocessing.SW.wordsList;
import static Taxonomy.OntologyTranverserAPI2.kalimat;
import static Taxonomy.OntologyTranverserAPI2.tag;
import static Taxonomy.OntologyTranverserAPI2.wordsList;
import java.util.ArrayList;

/**
 *
 * @author DEAS
 */
public class CleaningFitur {
    
    public static ArrayList<String> wordsList = new ArrayList<String>();
    
    public String Clean (String WordTag){
        String kalim = " ";
        String StopW=null;
        StopW="";
    
        String s = WordTag;
        s=s.trim().replaceAll("\\s+", " ");
        String[] words = s.split(" ");
        
        //tambahan
        wordsList.clear();
        
        for (String word : words) {
            wordsList.add(word);
        }
        
        for (int i = 0; i < wordsList.size(); i++) {
            String sList=wordsList.get(i);
            for (int j = 0; j < tag.length; j++) {
                String sTag=tag[j];
                if (wordsList.get(i).endsWith(tag[j])) {
                    kalim=kalim+wordsList.get(i).replace(tag[j],"")+" ";
                    //kalimat.add(wordsList.get(i).replace(tag[j],"")+" ");
                    System.out.println(" ISI dari KALIMAT :" + kalimat );
                }
            }
        }
        
//        for(String has : kalimat){
//            kalim += has;
//        }
        
        
    
    
    return kalim;
    }
}
