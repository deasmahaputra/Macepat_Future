/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package PatternKnowladge;

import java.util.ArrayList;

/**
 *
 * @author DEAS
 */
public class FiturNpParser {
    
    String tampung = " ";
    public static ArrayList<String> listtamp = new ArrayList<>();
    public ArrayList<String> npFitur (String hasilTax, ArrayList<String> listCorp){
            String fitur = " ";
        System.out.println("Isi HASIL CLEANING : " + hasilTax);
            String[] taxHasil = hasilTax.split(" ");
            
            for(int i = 0; i < listCorp.size() ; i++){
                for(int j = 0; j < taxHasil.length; j++){
               if(taxHasil[j].equalsIgnoreCase(listCorp.get(i).trim().replaceAll("\\s+", " "))){
                   listtamp.add(taxHasil[j]);
                   fitur += taxHasil[j];
                   System.out.println("ISI FITURNYA DEASSSSSSSSS :" + listtamp);
               
               } 
                   }
            }
    
    return listtamp;
    }
    
}
