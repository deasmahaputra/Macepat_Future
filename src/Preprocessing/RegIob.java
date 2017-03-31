/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Preprocessing;

import java.util.regex.Pattern;
import java.util.regex.Matcher;

/**
 *
 * @author DEAS
 */
public class RegIob {
    
    public static String RegBio(String input){
        String hasilReg = null;
        
        String reg1 = "\\S*_I-NP+\\S* \\S*_I-NP+\\S* \\S*_I-NP+\\S*"; //is inside a noun phrase.
        //String reg2 = "\\S*_I-VP+\\S*"; //is inside a verb phrase.
        String reg2 = "\\S*_I-NP+\\S*"; //is inside a verb phrase.
        //String reg3 = "\\S*_I-ADVP+\\S*"; //is inside an adverbial phrase.
        String reg3 = "\\S*_I-NP+\\S* \\S*_I-NP+\\S*";
        String reg4 = "\\S*_I-ADJP+\\S*"; //is inside an adjective phrase.
        String reg5 = "\\S*_I-CONJP+\\S*"; //is inside a conjunctive phrase.
        String reg6 = "\\S*_I-INTJ+\\S*"; //is inside an interjection.
        String reg7 = "\\S*_I-LST+\\S*"; //is inside a list marker.
        String reg8 = "\\S*_I-PP+\\S*"; //is inside a prepositional phrase.
        String reg9 = "\\S*_I-PRT+\\S*"; //is inside a particle.
        String reg10 = "\\S*_I-SBAR+\\S*"; //is inside a subordinated clause.
        String reg11 = "\\S*_I-UCP+\\S*"; //is inside an unlike coordinated phrase.
        
        Pattern p = Pattern.compile(reg1 + "|" + reg2 + "|" + reg3);
        Matcher m = p.matcher(input);
        while(m.find()){
            hasilReg = m.group();
        }
        
    return hasilReg;
    }
}
