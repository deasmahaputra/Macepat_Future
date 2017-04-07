/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Preprocessing;

import static PatternKnowladge.Rule.listinput;
import java.util.ArrayList;
import java.util.List;
import java.util.regex.Pattern;
import java.util.regex.Matcher;

/**
 *
 * @author DEAS
 */
public class RegIob {
    
    public static ArrayList<String> listinput = new ArrayList<String>();
    
    
    public static String RegBio(String input){
        String tampReg = null;
        String Str = new String(input);  
        List<String> list = new ArrayList<String>();
        
         for (String retval: Str.split(" ")){
           listinput.add(retval);
       }
        
        String reg1 = "\\S*_I-NP+\\S* \\S*_I-NP+\\S* \\S*_I-NP+\\S*"; //is inside a noun phrase.
        //String reg2 = "\\S*_I-VP+\\S*"; //is inside a verb phrase.
        String reg2 = "\\S*_I-NP+\\S*"; //is inside a verb phrase.
        //String reg3 = "\\S*_I-ADVP+\\S*"; //is inside an adverbial phrase.
        String reg3 = "\\S*_I-NP+\\S* \\S*_I-NP+\\S*";
        String regNP4 = "\\S*_I-NP+\\S* \\S*_I-NP+\\S* \\S*_I-NP+\\S* \\S*_I-NP+\\S*";
        String reg4 = "\\S*_I-ADJP+\\S*"; //is inside an adjective phrase.
        String reg5 = "\\S*_I-CONJP+\\S*"; //is inside a conjunctive phrase.
        String reg6 = "\\S*_I-INTJ+\\S*"; //is inside an interjection.
        String reg7 = "\\S*_I-LST+\\S*"; //is inside a list marker.
        String reg8 = "\\S*_I-PP+\\S*"; //is inside a prepositional phrase.
        String reg9 = "\\S*_I-PRT+\\S*"; //is inside a particle.
        String reg10 = "\\S*_I-SBAR+\\S*"; //is inside a subordinated clause.
        String reg11 = "\\S*_I-UCP+\\S*"; //is inside an unlike coordinated phrase.
        String coba = "\\*([\\w -]+) *\\I_\\";
        
        
        Pattern p = Pattern.compile("\\S*_I+\\S*");
        Matcher m = p.matcher(input);
        while(m.find()){
            list.add(m.group() + " ");
        }
        
        for(String hasilReg : list){
            tampReg = tampReg + hasilReg;
        }
        
        return tampReg;
    }
}
