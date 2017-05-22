/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Taxonomy;

import java.util.ArrayList;
import java.util.Collections;

/**
 *
 * @author DEAS
 */
public class FiturTaxonomy {
    String tampung = " ";
    public static ArrayList<String> listtamp = new ArrayList<>();
    public ArrayList<String> taxoFitur (String hasilTax, ArrayList<String> listCorp){
    
            String[] taxHasil = hasilTax.split(" ");
            
            for(int i = 0; i < listCorp.size() ; i++){
                for(int j = 0; j < taxHasil.length; j++){
               if(taxHasil[j].equalsIgnoreCase(listCorp.get(i).trim().replaceAll("\\s+", " "))){
                   if ( (Collections.frequency(listtamp, taxHasil[j])) < 1 ){
                   listtamp.add(taxHasil[j]);
                   System.out.println("ISI FITURNYA DEASSSSSSSSS :" + listtamp);
                   }
               } 
                   }
            }
    
    return listtamp;
    }
    
}
