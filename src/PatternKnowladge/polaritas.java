/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package PatternKnowladge;

import java.util.ArrayList;
import java.util.Collections;

/**
 *
 * @author DEAS
 */
public class polaritas {
    SWN3 test = new SWN3();
    outputFile output = new outputFile();
    
    //mendapatkan polaritas dengan swn
    public ArrayList<String> getPolarSWN(ArrayList<String> fitur,ArrayList<ArrayList<String>> fitop){
        ArrayList<String> polaritas = new ArrayList<String>(); //array menyimpan fitur dan polaritasnya
        
        //mencari setiap opini yg dimiliki fitur
        for (int i = 0; i < fitur.size(); i++){
            //cek jika fitur ada dan pasangan fitur opini ada
            if(fitur.get(i) != "-" && fitop.size()!= 0){
                double totalScore = 0; //untuk menyimpan score fitur
                int totScore = 0;
                int ada = 0; //untuk penanda apakah fitur memiliki opini atau tidak
                for (int x = 0; x < fitop.size(); x++){
                    if(fitur.get(i).equalsIgnoreCase(fitop.get(x).get(0))){
                        String opini = fitop.get(x).get(1);
                        opini = opini.replaceAll("([^a-zA-Z\\s])", "");
                        if (test.extract(opini) != null){
                            totalScore += test.extract(opini);
                        }
                        output.tulis("opini : "+opini+" "+totalScore);
                        ada = 1;
                    }
                }
                //cek apakah fitur memiliki opini
                //jika ada
                //totalScore = Math.round(totalScore);
                //totScore = (int)totalScore;
                if(ada != 0){
                    if(totalScore>0){
                        //polaritas.add(fitur.get(i)+",[+"+totScore+"]"); //dengan skor
                        polaritas.add(fitur.get(i)+",[+]"); //tanpa skor
                    }
                    else if(totalScore<0){
                        //polaritas.add(fitur.get(i)+",["+totScore+"]"); //dengan skor
                        polaritas.add(fitur.get(i)+",[-]"); //tanpa skor
                    }
                    else{
                        //polaritas.add(fitur.get(i)+",[netral]");
                        polaritas.add(fitur.get(i)+",[no opini]");
                    }
                }
                //jika tidak
                else{
                    polaritas.add(fitur.get(i)+",[no opini]");
                }
            }
            //ada fitur tapi tidak memiliki pasangan fitur dan opini
            else if(fitur.get(i) != "-" && fitop.size()==0 ){
                polaritas.add(fitur.get(i)+",[no opini]");
            }
            //else
            else{
                polaritas.add("-");
            }
        }
        return polaritas;
    }
    
    public ArrayList<String> getPolarSWNopini(ArrayList<String> fitur,ArrayList<ArrayList<String>> fitop){
        ArrayList<String> polaritas = new ArrayList<String>(); //array menyimpan fitur dan polaritasnya
        
        //mencari setiap opini yg dimiliki fitur
        for (int i = 0; i < fitur.size(); i++){
            //cek jika fitur ada dan pasangan fitur opini ada
            if(fitur.get(i) != "-" && fitop.size()!= 0){
                double totalScore = 0; //untuk menyimpan score fitur
                int totScore = 0;
                int ada = 0; //untuk penanda apakah fitur memiliki opini atau tidak
                for (int x = 0; x < fitop.size(); x++){
                    if(fitur.get(i).equalsIgnoreCase(fitop.get(x).get(0))){
                        String opini = fitop.get(x).get(1);
                        opini = opini.replaceAll("([^a-zA-Z\\s])", "");
                        if (test.extract(opini) != null){
                            totalScore += test.extract(opini);
                        }
                        output.tulis("opini : "+opini+" "+totalScore);
                        ada = 1;
                    }
                }
                //cek apakah fitur memiliki opini
                //jika ada
                //totalScore = Math.round(totalScore);
                //totScore = (int)totalScore;
                if(ada != 0){
                    if(totalScore>0){
                        //polaritas.add(fitur.get(i)+",[+"+totScore+"]"); //dengan skor
                        polaritas.add(fitur.get(i)+",[+]"); //tanpa skor
                    }
                    else if(totalScore<0){
                        //polaritas.add(fitur.get(i)+",["+totScore+"]"); //dengan skor
                        polaritas.add(fitur.get(i)+",[-]"); //tanpa skor
                    }
                    else{
                        //polaritas.add(fitur.get(i)+",[netral]");
                        polaritas.add(fitur.get(i)+",[no opini]");
                    }
                }
                //jika tidak
                else{
                    polaritas.add(fitur.get(i)+",[no opini]");
                }
            }
            //ada fitur tapi tidak memiliki pasangan fitur dan opini
            else if(fitur.get(i) != "-" && fitop.size()==0 ){
                polaritas.add(fitur.get(i)+",[no opini]");
            }
            //else
            else{
                polaritas.add("-");
            }
        }
        return polaritas;
    }
    
    //mendapatkan polaritas dengan opinion lexicon selain SWN
    public ArrayList<String> getPolarElse(ArrayList<String> fitur,ArrayList<ArrayList<String>> fitop, ArrayList<String> opPos, ArrayList<String> opNeg){
        
        ArrayList<String> polaritas = new ArrayList<String>(); //array menyimpan fitur dan polaritasnya
        
        //mencari setiap opini yg dimiliki fitur
        for (int i = 0; i < fitur.size(); i++){
            //cek jika fitur ada dan pasangan fitur opini ada
            if(fitur.get(i) != "-" && fitop.size()!= 0 ){
                int pos = 0; //untuk menyimpan jumlah positif dlm 1 fitur
                int neg = 0; //untuk menyimpan jumlah negatif dlm 1 fitur
                int ada = 0; //untuk penanda apakah fitur memiliki opini atau tidak
                for (int x = 0; x < fitop.size(); x++){
                    if(fitur.get(i).equalsIgnoreCase(fitop.get(x).get(0))){
                        String opini = fitop.get(x).get(1);
                        opini = opini.replaceAll("([^a-zA-Z\\s])", "");
                        if ( (Collections.frequency(opPos, opini)) > 0 ){
                            pos = pos+1;
                        }
                        else if ( (Collections.frequency(opNeg, opini)) > 0 ){
                            neg = neg+1;
                        }
                        ada = 1;
                    }
                }
                //cek apakah fitur memiliki opini
                //jika ada
                if(ada != 0){
                    if(pos-neg > 0){
                        polaritas.add(fitur.get(i)+",[+]");
                    }
                    else if(pos-neg < 0){
                        polaritas.add(fitur.get(i)+",[-]");
                    }
                    else{
                        polaritas.add(fitur.get(i)+",[netral]");
                    }
                }
                //jika tidak
                else{
                    polaritas.add(fitur.get(i)+",[no opini]");
                }
            }
            
            //ada fitur tapi tidak memiliki pasangan fitur dan opini
            else if(fitur.get(i) != "-" && fitop.size()==0 ){
                polaritas.add(fitur.get(i)+",[no opini]");
            }
            //else
            else{
                polaritas.add("-");
            }
        }
        return polaritas;
    }
    
    //mengubah format fitur dan polar ekstraksi
    public ArrayList<ArrayList<String>> cgForm(ArrayList<String> fiturP){
        ArrayList<ArrayList<String>> polaritas = new ArrayList<ArrayList<String>>(); //array menyimpan fitur dan polaritasnya
        
        for(int i = 0; i<fiturP.size(); i++){
            ArrayList<String> tmp = new ArrayList<>();
            String[] words = fiturP.get(i).split(",");
            
            for (String word : words) {
                word = word.replaceAll("\\[", "");
                word = word.replaceAll("\\]", "");
                tmp.add(word);
            }
            
            polaritas.add(tmp);
        }
        return polaritas;
    }
}
