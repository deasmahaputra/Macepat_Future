/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package PatternKnowladge;

import edu.smu.tspell.wordnet.WordNetDatabase;
import java.util.ArrayList;
import java.util.HashSet;

/**
 *
 * @author DEAS
 */
public class grouping {
    public static ArrayList<String> getSynonyms ( WordNetDatabase database , String word){
        ArrayList<String> syn = new ArrayList<String>();
        String wordForm = word;
        edu.smu.tspell.wordnet.Synset[] synsets = database.getSynsets(wordForm);
        if (synsets.length > 0){
            ArrayList<String> al = new ArrayList<String>();
            // add elements to al, including duplicates
            HashSet hs = new HashSet();
            for (int i = 0; i < synsets.length; i++){
                String[] wordForms = synsets[i].getWordForms();
                for (int j = 0; j < wordForms.length; j++)
                {
                    al.add(wordForms[j]);
                }

            }
            //removing duplicates
            hs.addAll(al);
            al.clear();
            al.addAll(hs);

            syn=al;
        }

        return syn;
    }
    
    public static ArrayList<String> findGroup (String klas, String fitur, ArrayList<String> Lpolaritas, String kalimat, WordNetDatabase database){
        ArrayList<String> group = new ArrayList<String>();
        ArrayList<String> syn = new ArrayList<String>();
        syn = getSynonyms(database, klas);
        
        if(!syn.isEmpty()){
            if(syn.contains(fitur)){
                group.add(klas);
                group.add(Lpolaritas.toString());
                group.add(kalimat);
            }
        }
        else{
            if(klas == fitur){
                group.add(klas);
                group.add(Lpolaritas.toString());
                group.add(kalimat);
            }
        }
        return group;
    }
}
