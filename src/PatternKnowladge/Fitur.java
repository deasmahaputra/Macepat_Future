/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package PatternKnowladge;

import java.util.ArrayList;
import java.util.Collections;
import ta_deas.outputFile;

/**
 *
 * @author DEAS
 */
public class Fitur {
    
    public static ArrayList<String> listFitur = new ArrayList<String>();
    public static ArrayList<String> listDataFitur = new ArrayList<String>();
    public static ArrayList<String> listKandidat = new ArrayList<String>();
    public static ArrayList<String> fitur = new ArrayList<String>();
    public static ArrayList<String> totValid = new ArrayList<String>();
    public static ArrayList<String> listKandidat2 = new ArrayList<String>();
    public static ArrayList<String> kataNgram = new ArrayList<String>();
    
    public static String[] tag = {
        "_CC","_CD","_DT","_EX","_FW","_IN","_JJ","_JJR","_JJS","_LS","_MD","_NN","_NNS","_NNP","_NNPS","_PDT","_POS","_PRP","_PRP$","_RB","_RBR","_RBS","_RP","_SYM","_TO","_UH","_VB","_VBD","_VBG","_VBN","_VBP","_VBZ","_WDT","_WP","_WP$","_WRB","_#","_$","_.","_,","_:","_(","_)","_`","_'"
    };
    
    outputFile output = new outputFile();
    
    //mengekstrak fitur dengan corpus
    public ArrayList<String> getFitur(String kandidat,ArrayList<String> listCorp){
        String[] words = kandidat.split(" ");
        String kata1=null;
        String kata2=null;
        String frase;
        String tes="";
        String tes2="";
        
        //tambahan
        listKandidat.clear();
        listFitur.clear();
        
        //
               
        for (String word : words) {
            listKandidat.add(word);
        }
        
        //frase hasil rule sebagai kandidat
        for (int z = 0; z < listKandidat.size(); z++) {
            //ngilangin tag pada kandidat
            for (int x = 0; x < tag.length; x++) {
                if(listKandidat.get(z).endsWith(tag[x])){
                    tes=tes+listKandidat.get(z).replace(tag[x], "")+" ";
                }
            }
            //
        }
        tes=tes.trim().replaceAll("\\s+", " ");
        //ngecek hasil rule dengan corpus
        for (int y = 0; y < listCorp.size(); y++) {
            if (tes.equalsIgnoreCase(listCorp.get(y).trim().replaceAll("\\s+", " "))){
                if ( (Collections.frequency(listFitur, tes)) < 1 ){
                    listFitur.add(tes);
                } 
            }
        }
        //
        
        //jika rule tidak menghasilkan fitur
        if(listFitur.isEmpty()){
            //menghilangkan tag pada setiap kata hasil rule
            for (int i = 0; i < listKandidat.size(); i++) {
                for (int a = 0; a < tag.length; a++) {
                    if(listKandidat.get(i).endsWith(tag[a])){
                        tes2=listKandidat.get(i).replace(tag[a], "");
                        tes2=tes2.trim().replaceAll("\\s+", " ");
                    }
                }
            //mengecek setiap kata hasil rule dengan corpus    
                for (int j = 0; j < listCorp.size(); j++) {
                    if (tes2.equalsIgnoreCase(listCorp.get(j).trim().replaceAll("\\s+", " "))){
                        if ( (Collections.frequency(listFitur, tes2)) < 1 ){
                            listFitur.add(tes2);
                        } 
                    }
                }
            }
            //
            //mendapatkan frase fitur
            for (int i = 0; i < listKandidat.size()-1; i++) {
                for (int k = 0; k < tag.length; k++) {
                    if(listKandidat.get(i).endsWith("_NN") && listKandidat.get(i+1).endsWith("_NN")){
                        kata1=listKandidat.get(i).replaceAll("_NN", "").trim().replaceAll("\\s+", " ");
                        kata2=listKandidat.get(i+1).replaceAll("_NN", "").trim().replaceAll("\\s+", " ");
                        frase= kata1+" "+kata2;
                        frase=frase.trim().replaceAll("\\s+", " ");
                        for (int j = 0; j < listCorp.size(); j++) {
                            if (frase.equalsIgnoreCase(listCorp.get(j).trim().replaceAll("\\s+", " "))){
                                if ( (Collections.frequency(listFitur, frase)) < 1 ){
                                    listFitur.add(frase);
                                } 
                            }
                        }
                    }
                    /*if(listKandidat.get(i+1).endsWith("_NN")){
                        kata2=listKandidat.get(i+1).replaceAll("_NN", "");
                    }*/
                    else if(listKandidat.get(i).endsWith("_NN") && listKandidat.get(i+1).endsWith("_NNS")){
                        kata1=listKandidat.get(i).replaceAll("_NN", "").trim().replaceAll("\\s+", " ");
                        kata2=listKandidat.get(i+1).replaceAll("_NNS", "").trim().replaceAll("\\s+", " ");
                        frase= kata1+" "+kata2;
                        frase=frase.trim().replaceAll("\\s+", " ");
                        for (int j = 0; j < listCorp.size(); j++) {
                            if (frase.equalsIgnoreCase(listCorp.get(j).trim().replaceAll("\\s+", " "))){
                                if ( (Collections.frequency(listFitur, frase)) < 1 ){
                                    listFitur.add(frase);
                                } 
                            }
                        }
                    }
                }
                /*frase= kata1+" "+kata2;
                for (int j = 0; j < listCorp.size(); j++) {
                    if (frase.equalsIgnoreCase(listCorp.get(j))){
                        if ( (Collections.frequency(listFitur, frase)) < 1 ){
                            listFitur.add(frase);
                        } 
                    }
                }*/
            }
        }
        
        return listFitur;
    }
    
    //mengekstrak fitur tanpa corpus
    public ArrayList<String> getFiturNoCorp(String kandidat){
        String[] words = kandidat.split(" ");
        String kata1=null;
        String kata2=null;
        String kata3=null;
        String frase;
        String tes="";
        String tes2="";
        
        //tambahan
        listKandidat.clear();
        listFitur.clear();
        
        //
               
        for (String word : words) {
            listKandidat.add(word);
        }
        
        //frase hasil rule sebagai kandidat
        for (int z = 0; z < listKandidat.size(); z++) {
            //ngilangin tag pada kandidat
            for (int x = 0; x < tag.length; x++) {
                if(listKandidat.get(z).endsWith(tag[x])){
                    tes=tes+listKandidat.get(z).replace(tag[x], "")+" ";
                }
            }
            //
        }
        tes=tes.trim().replaceAll("\\s+", " ");
        
        //ngecek frase 3 kata
        if(listKandidat.size()>2){
            for (int i = 0; i < listKandidat.size()-2; i++) {
                for (int k = 0; k < tag.length; k++) {
                    if(listKandidat.get(i).endsWith("_NN") && listKandidat.get(i+1).endsWith("_NN") && listKandidat.get(i+2).endsWith("_NN")){
                        kata1=listKandidat.get(i).replaceAll("_NN", "").trim().replaceAll("\\s+", " ");
                        kata2=listKandidat.get(i+1).replaceAll("_NN", "").trim().replaceAll("\\s+", " ");
                        kata3=listKandidat.get(i+2).replaceAll("_NN", "").trim().replaceAll("\\s+", " ");
                        frase= kata1+" "+kata2+" "+kata3;
                        frase=frase.trim().replaceAll("\\s+", " ");
                        if ( (Collections.frequency(listFitur, frase)) < 1 ){
                            listFitur.add(frase);
                        }
                    }
                    else if(listKandidat.get(i).endsWith("_NN") && listKandidat.get(i+1).endsWith("_NNS") && listKandidat.get(i+2).endsWith("_NNS")){
                        kata1=listKandidat.get(i).replaceAll("_NN", "").trim().replaceAll("\\s+", " ");
                        kata2=listKandidat.get(i+1).replaceAll("_NNS", "").trim().replaceAll("\\s+", " ");
                        kata3=listKandidat.get(i+2).replaceAll("_NNS", "").trim().replaceAll("\\s+", " ");
                        frase= kata1+" "+kata2+" "+kata3;
                        frase=frase.trim().replaceAll("\\s+", " ");
                        if ( (Collections.frequency(listFitur, frase)) < 1 ){
                            listFitur.add(frase);
                        }
                    }
                }
            }
        }
        
        //
        
        //jika rule tidak menghasilkan fitur
        if(listFitur.isEmpty()){
            //menghilangkan tag pada setiap kata hasil rule
            for (int i = 0; i < listKandidat.size(); i++) {
                if(listKandidat.get(i).endsWith("_NN")){
                    tes2=listKandidat.get(i).replace("_NN", "");
                    tes2=tes2.trim().replaceAll("\\s+", " ");
                    if ( (Collections.frequency(listFitur, tes2)) < 1 ){
                        listFitur.add(tes2);
                    }
                }  
            }
            //
            //mendapatkan frase fitur 2 kata
            for (int i = 0; i < listKandidat.size()-1; i++) {
                for (int k = 0; k < tag.length; k++) {
                    if(listKandidat.get(i).endsWith("_NN") && listKandidat.get(i+1).endsWith("_NN")){
                        kata1=listKandidat.get(i).replaceAll("_NN", "").trim().replaceAll("\\s+", " ");
                        kata2=listKandidat.get(i+1).replaceAll("_NN", "").trim().replaceAll("\\s+", " ");
                        frase= kata1+" "+kata2;
                        frase=frase.trim().replaceAll("\\s+", " ");
                        if ( (Collections.frequency(listFitur, frase)) < 1 ){
                            listFitur.add(frase);
                        } 
                    }
                    else if(listKandidat.get(i).endsWith("_NN") && listKandidat.get(i+1).endsWith("_NNS")){
                        kata1=listKandidat.get(i).replaceAll("_NN", "").trim().replaceAll("\\s+", " ");
                        kata2=listKandidat.get(i+1).replaceAll("_NNS", "").trim().replaceAll("\\s+", " ");
                        frase= kata1+" "+kata2;
                        frase=frase.trim().replaceAll("\\s+", " ");
                        if ( (Collections.frequency(listFitur, frase)) < 1 ){
                            listFitur.add(frase);
                        }   
                    }
                }
            }
        }
        
        return listFitur;
    }
    
    //get fitur untuk stanford parser. cek NP dengan corpus
    public ArrayList<String> getFiturParser(String kandidat,ArrayList<String> listCorp){
        //tambahan
        listKandidat.clear();
        listFitur.clear();
        
        listKandidat.add(kandidat);
        
        //untuk ngecek NP stanford parser dengan corpus
        for (int i = 0; i < listKandidat.size(); i++) {
            for (int j = 0; j < listCorp.size(); j++) {
                if (listKandidat.get(i).equalsIgnoreCase(listCorp.get(j).trim().replaceAll("\\s+", " "))){
                    if ( (Collections.frequency(listFitur, listKandidat.get(i))) < 1 ){
                        listFitur.add(listKandidat.get(i));
                    } 
                }
            }
        }
        return listFitur;
    }
    
    //get fitur untuk stanford parser. cek NP dengan corpus
    public ArrayList<String> getFiturParserNoCorp(String kandidat){
        //tambahan
        listKandidat.clear();
        listFitur.clear();
        
        listKandidat.add(kandidat);
        
        //untuk ngecek NP stanford parser dengan corpus
        for (int i = 0; i < listKandidat.size(); i++) {
            if ( (Collections.frequency(listFitur, listKandidat.get(i))) < 1 ){
                listFitur.add(listKandidat.get(i));
            }
        }
        return listFitur;
    }
    
    //cari kata pada NP parser jika NP tidak ada pada corpus
    public ArrayList<String> getFiturParser2(String kandidat,ArrayList<String> listCorp){
        //tambahan
        listKandidat.clear();
        listFitur.clear();
        
        String[] words = kandidat.split(" ");
        for (String word : words) {
            listKandidat.add(word);
        }
        
        //untuk ngecek setiap kata pada NP dengan corpus
        for (int i = 0; i < listKandidat.size(); i++) {
            for (int j = 0; j < listCorp.size(); j++) {
                if (listKandidat.get(i).equalsIgnoreCase(listCorp.get(j).trim().replaceAll("\\s+", " "))){
                    if ( (Collections.frequency(listFitur, listKandidat.get(i))) < 1 ){
                        listFitur.add(listKandidat.get(i));
                    } 
                }
            }
        }
        return listFitur;
    }
    
    //cari kata pada NP parser jika NP tidak ada pada corpus
    public ArrayList<String> getFiturParser2NoCorp(String kandidat){
        //tambahan
        listKandidat.clear();
        listFitur.clear();
        
        String[] words = kandidat.split(" ");
        for (String word : words) {
            listKandidat.add(word);
        }
        
        //untuk ngecek setiap kata pada NP dengan corpus
        for (int i = 0; i < listKandidat.size(); i++) {
            if ( (Collections.frequency(listFitur, listKandidat.get(i))) < 1 ){
                listFitur.add(listKandidat.get(i));
            }   
        }
        return listFitur;
    }
    
    //cek biar fitur dalam 1 kalimat tidak double
    public ArrayList<String> cekFitur(ArrayList<String> temp1,ArrayList<String> temp2){
        fitur.clear();
        String kata="";
        
        if(temp1.isEmpty() && temp2.isEmpty()){
            fitur.add("-");
        }
        else{
            //ngilangin tag
            for (int i = 0; i < temp1.size(); i++) {
                if (temp1.get(i).contains("_")){
                    for (int j = 0; j < tag.length; j++){
                        if (temp1.get(i).contains(tag[j])){
                            kata=temp1.get(i).replaceAll(tag[j], "");
                        }
                    }
                }
                else{
                    kata=temp1.get(i);
                }
                if ( (Collections.frequency(fitur, kata)) < 1 ){
                    fitur.add(kata);
                } 
            }
            for (int i = 0; i < temp2.size(); i++) {
                if (temp2.get(i).contains("_")){
                    for (int j = 0; j < tag.length; j++){
                        if (temp2.get(i).contains(tag[j])){
                            kata=temp2.get(i).replaceAll(tag[j], "");
                        }
                    }
                }
                else{
                    kata=temp2.get(i);
                }
                if ( (Collections.frequency(fitur, kata)) < 1 ){
                    fitur.add(kata);
                } 
            }
            //
        }
        
        return fitur;
    }
    
    //untuk nyari benar,salah,jumlah dataset, jumlah ekstrak (alt 1)
    public ArrayList<String> validasiFitur(ArrayList<String> fiturEkstrak,String fiturPro){
        totValid.add("0");// 0 benar
        totValid.add("0");// 1 salah
        totValid.add("0");// 2 fitur dataset
        totValid.add("0");// 3 fitur ekstrak
        
        double tmpbenar=0;
        double tmpsalah=0;
        double nilaibenar=0;
        
        String kata = "-";
                 
        String[] kataFitur = fiturPro.split(",");
        listDataFitur.clear();
        
        for (String fitur : kataFitur) {
            listDataFitur.add(fitur);
        }
        
        if(!listDataFitur.contains("-")){
            //System.out.println("masuk ini");
            for(int i = 0; i<fiturEkstrak.size(); i++){
                for (int k = 0; k < tag.length; k++) {
                    if(fiturEkstrak.get(i).endsWith(tag[k])){
                        kata=fiturEkstrak.get(i).replaceAll(tag[k], "");
                    }
                    if(!fiturEkstrak.get(i).contains("_")){
                        kata=fiturEkstrak.get(i);
                    }
                }
                if(listDataFitur.contains(kata)){
                    int nilai=0;
                    //jika bener
                    nilai=Integer.parseInt(totValid.get(0))+1;
                    tmpbenar=tmpbenar+1;
                    //totValid.set(0, Integer.toString(nilai));
                }
                else{
                    int nilai=0;
                    //jika salah
                    nilai=Integer.parseInt(totValid.get(1))+1;
                    tmpsalah=tmpsalah+1;
                    totValid.set(1, Integer.toString(nilai));
                }

                /*if(fiturEkstrak.size()<listDataFitur.size()){
                    int nilai=0;
                    int gap=listDataFitur.size()-fiturEkstrak.size();
                    //jumlah tidak terekstrak
                    nilai=totValid.get(2)+gap;
                    totValid.set(2, nilai);
                }*/

            }
            //hitung jumlah fitur pada data fitur
            totValid.set(2, "1"/*listDataFitur.size()*/);
            if (!fiturEkstrak.contains("-")){
                totValid.set(3, "1"/*fiturEkstrak.size()*/);
            }
        }
        else{
            if (!fiturEkstrak.contains("-")){
                totValid.set(1, Integer.toString(fiturEkstrak.size()));
                tmpsalah=tmpsalah+1;
                totValid.set(3, "1"/*fiturEkstrak.size()*/);
            }
            else{
                int nilai=0;
                //jika bener
                nilai=Integer.parseInt(totValid.get(0))+1;
                //totValid.set(0, Integer.toString(nilai));
                //tmpbenar=tmpbenar+1;
                //System.out.println("- dan -");
            }
        }
        //hitung nilai benar
        if(tmpbenar==0){
            //totValid.set(0, 0);
            nilaibenar=0;
        }
        else{
            nilaibenar=(tmpbenar/listDataFitur.size());
        }
        totValid.set(0, Double.toString(nilaibenar));
//        System.out.println("ini dia= "+totValid.get(0)+" dan ini = "+tmpbenar);
//        System.out.println("benar = "+tmpbenar);
//        System.out.println("size = "+listDataFitur.size());
//        System.out.println("nilai = "+nilaibenar);
        return totValid;
    }
    
    //untuk nyari benar,salah,jumlah dataset, jumlah ekstrak (alt 2)
    public ArrayList<String> validasiFitur2(ArrayList<String> fiturEkstrak,String fiturPro){
        totValid.add("0");// 0 benar
        totValid.add("0");// 1 salah
        totValid.add("0");// 2 fitur dataset
        totValid.add("0");// 3 fitur ekstrak
        
        double tmpbenar=0;
        double tmpsalah=0;
        double nilaibenar=0;
        
        String kata = "-";
                 
        String[] kataFitur = fiturPro.split(",");
        listDataFitur.clear();
        
        for (String fitur : kataFitur) {
            listDataFitur.add(fitur);
        }
        
        if(!listDataFitur.contains("-")){
            for(int i = 0; i<fiturEkstrak.size(); i++){
                for (int k = 0; k < tag.length; k++) {
                    if(fiturEkstrak.get(i).endsWith(tag[k])){
                        kata=fiturEkstrak.get(i).replaceAll(tag[k], "");
                    }
                    if(!fiturEkstrak.get(i).contains("_")){
                        kata=fiturEkstrak.get(i);
                    }
                }
                if(listDataFitur.contains(kata)){
                    int nilai=0;
                    //jika bener
                    nilai=Integer.parseInt(totValid.get(0))+1;
                    tmpbenar=tmpbenar+1;
                    //totValid.set(0, Integer.toString(nilai));
                }
                else{
                    int nilai=0;
                    //jika salah
                    nilai=Integer.parseInt(totValid.get(1))+1;
                    tmpsalah=tmpsalah+1;
                    totValid.set(1, Integer.toString(nilai));
                }

                /*if(fiturEkstrak.size()<listDataFitur.size()){
                    int nilai=0;
                    int gap=listDataFitur.size()-fiturEkstrak.size();
                    //jumlah tidak terekstrak
                    nilai=totValid.get(2)+gap;
                    totValid.set(2, nilai);
                }*/

            }
            //hitung jumlah fitur pada data fitur
            totValid.set(2, "1"/*listDataFitur.size()*/);
            if (!fiturEkstrak.contains("-")){
                totValid.set(3, "1"/*fiturEkstrak.size()*/);
            }
        }
        else{
            if (!fiturEkstrak.contains("-")){
                totValid.set(1, Integer.toString(fiturEkstrak.size()));
                tmpsalah=tmpsalah+1;
                totValid.set(3, "1"/*fiturEkstrak.size()*/);
            }
            else{
                int nilai=0;
                //jika bener
                nilai=Integer.parseInt(totValid.get(0))+1;
                //totValid.set(0, Integer.toString(nilai));
                //tmpbenar=tmpbenar+1;
            }
        }
        //hitung nilai benar
        if(tmpbenar==0){
            //totValid.set(0, 0);
            nilaibenar=0;
        }
        else{
            int nilai=0;
            nilai=Integer.parseInt(totValid.get(0))+1;
            totValid.set(0, Integer.toString(nilai));
            nilaibenar=nilai;
        }
        totValid.set(0, Double.toString(nilaibenar));
        return totValid;
    }
    
    //untuk nyari benar,salah,jumlah dataset, jumlah ekstrak (awal)
    public ArrayList<String> validasiFiturA(ArrayList<String> fiturEkstrak,String fiturPro){
        totValid.add("0");// 0 benar
        totValid.add("0");// 1 salah
        totValid.add("0");// 2 fitur dataset
        totValid.add("0");// 3 fitur ekstrak
        totValid.add("0");// 4 precision
        totValid.add("0");// 5 recall
        
        double tmpbenar=0;
        double tmpsalah=0;
        double nilaibenar=0;
        
        String kata = "-";
                 
        String[] kataFitur = fiturPro.split(",");
        listDataFitur.clear();
        
        for (String fitur : kataFitur) {
            String s = fitur;
            if(s.contains("[") || s.contains("]")){
                s = s.replaceAll("\\[.*","");
                listDataFitur.add(s);
            }
            else{
                listDataFitur.add(fitur);
            }
        }
        
        if(!listDataFitur.contains("-")){
            for(int i = 0; i<fiturEkstrak.size(); i++){
                for (int k = 0; k < tag.length; k++) {
                    if(fiturEkstrak.get(i).endsWith(tag[k])){
                        kata=fiturEkstrak.get(i).replaceAll(tag[k], "");
                    }
                    if(!fiturEkstrak.get(i).contains("_")){
                        kata=fiturEkstrak.get(i);
                    }
                }
                if(listDataFitur.contains(kata)){
                    int nilai=0;
                    //jika bener
                    nilai=Integer.parseInt(totValid.get(0))+1;
                    //tmpbenar=tmpbenar+1;
                    totValid.set(0, Integer.toString(nilai));
                }
                else{
                    int nilai=0;
                    //jika salah
                    nilai=Integer.parseInt(totValid.get(1))+1;
                    //tmpsalah=tmpsalah+1;
                    totValid.set(1, Integer.toString(nilai));
                }

                /*if(fiturEkstrak.size()<listDataFitur.size()){
                    int nilai=0;
                    int gap=listDataFitur.size()-fiturEkstrak.size();
                    //jumlah tidak terekstrak
                    nilai=totValid.get(2)+gap;
                    totValid.set(2, nilai);
                }*/

            }
            //hitung jumlah fitur pada data fitur
            totValid.set(2, Integer.toString(listDataFitur.size()));
            totValid.set(3, Integer.toString(fiturEkstrak.size()));

            //if (!fiturEkstrak.contains("-")){
                //totValid.set(3, "1"/*fiturEkstrak.size()*/);
            //}
        }
        else{
            if (!fiturEkstrak.contains("-")){
                totValid.set(3, Integer.toString(fiturEkstrak.size()));
                totValid.set(1, Integer.toString(fiturEkstrak.size()));
            }
        }
        return totValid;
    }
    
    //untuk nyari benar,salah,jumlah dataset, jumlah ekstrak (alternatif 3)
    public ArrayList<String> validasiFitur3(ArrayList<String> fiturEkstrak,String fiturPro){
        totValid.add("0");// 0 benar
        totValid.add("0");// 1 salah
        totValid.add("0");// 2 fitur dataset
        totValid.add("0");// 3 fitur ekstrak
        totValid.add("0");// 4 precision
        totValid.add("0");// 5 recall
        
        double tmpbenar=0;
        double tmpsalah=0;
        double nilaibenar=0;
        
        String kata = "-";
                 
        String[] kataFitur = fiturPro.split(",");
        listDataFitur.clear();
        
        for (String fitur : kataFitur) {
            String s = fitur;
            if(s.contains("[") || s.contains("]")){
                s = s.replaceAll("\\[.*","");
                listDataFitur.add(s.trim().replaceAll("\\s+", " "));
            }
            else{
                listDataFitur.add(fitur.trim().replaceAll("\\s+", " "));
            }
        }
        
        if(!listDataFitur.contains("-")){
            for(int i = 0; i<fiturEkstrak.size(); i++){
                for (int k = 0; k < tag.length; k++) {
                    if(fiturEkstrak.get(i).endsWith(tag[k])){
                        kata=fiturEkstrak.get(i).replaceAll(tag[k], "");
                    }
                    if(!fiturEkstrak.get(i).contains("_")){
                        kata=fiturEkstrak.get(i);
                    }
                }
                if(listDataFitur.contains(kata)){
                    output.tulis("List fitur dataset : "+listDataFitur);
                    output.tulis("kata fiturnta : "+kata);
                    output.tulis("masuk sini if");
                    int nilai=0;
                    //jika bener
                    nilai=Integer.parseInt(totValid.get(0))+1;
                    //tmpbenar=tmpbenar+1;
                    totValid.set(0, Integer.toString(nilai));
                }
                else{
                    output.tulis("List fitur dataset : "+listDataFitur);
                    output.tulis("kata fiturnta : "+kata);
                    output.tulis("masuk sini else");
                    int nilai=0;
                    //jika salah
                    nilai=Integer.parseInt(totValid.get(1))+1;
                    //tmpsalah=tmpsalah+1;
                    totValid.set(1, Integer.toString(nilai));
                }

                /*if(fiturEkstrak.size()<listDataFitur.size()){
                    int nilai=0;
                    int gap=listDataFitur.size()-fiturEkstrak.size();
                    //jumlah tidak terekstrak
                    nilai=totValid.get(2)+gap;
                    totValid.set(2, nilai);
                }*/

            }
            //hitung jumlah fitur pada data fitur
            totValid.set(2, Integer.toString(listDataFitur.size()));
            totValid.set(3, Integer.toString(fiturEkstrak.size()));

            //if (!fiturEkstrak.contains("-")){
                //totValid.set(3, "1"/*fiturEkstrak.size()*/);
            //}
        }
        else{
            if (!fiturEkstrak.contains("-")){
                totValid.set(3, Integer.toString(fiturEkstrak.size()));
                totValid.set(1, Integer.toString(fiturEkstrak.size()));
                totValid.set(2, Integer.toString(1));
            }
            else{
                int nilai=0;
                //jika bener
                nilai=Integer.parseInt(totValid.get(0))+1;
                //tmpbenar=tmpbenar+1;
                totValid.set(0, Integer.toString(nilai));
                totValid.set(3, Integer.toString(1));
                totValid.set(2, Integer.toString(1));
            }
        }
        
        //hitung precision recall per kalimat
        //precision : benar/ekstrak * 100%
        double prc=(Double.parseDouble(totValid.get(0))/Double.parseDouble(totValid.get(3)));
        
        //recall : benar/dataset *100%;
        double rcl=(Double.parseDouble(totValid.get(0))/Double.parseDouble(totValid.get(2)));
        
        totValid.set(4, Double.toString(prc));
        totValid.set(5, Double.toString(rcl));
        //
        return totValid;
    }
    
    //
    
    //untuk nyari benar,salah,jumlah dataset, jumlah ekstrak (alt 4)
    public ArrayList<String> validasiFitur4(ArrayList<String> fiturEkstrak,String fiturPro){
        totValid.add("0");// 0 nilai P tiap baris
        totValid.add("0");// 1 salah
        totValid.add("0");// 2 nilai R tiap baris
        totValid.add("0");// 3 jumlah baris
        
        double tmpbenar=0;
        double tmpsalah=0;
        double nilaibenar=0;
        double nilaiR=0;
        
        String kata = "-";
                 
        String[] kataFitur = fiturPro.split(",");
        listDataFitur.clear();
        
        for (String fitur : kataFitur) {
            String s = fitur;
            if(s.contains("[") || s.contains("]")){
                s = s.replaceAll("\\[.*","");
                listDataFitur.add(s);
            }
            else{
                listDataFitur.add(fitur);
            }
        }
                
        if(!listDataFitur.contains("-")){
            for(int i = 0; i<fiturEkstrak.size(); i++){
                for (int k = 0; k < tag.length; k++) {
                    if(fiturEkstrak.get(i).endsWith(tag[k])){
                        kata=fiturEkstrak.get(i).replaceAll(tag[k], "");
                    }
                    if(!fiturEkstrak.get(i).contains("_")){
                        kata=fiturEkstrak.get(i);
                    }
                }
                if(listDataFitur.contains(kata)){
                    int nilai=0;
                    //jika bener
                    //nilai=Integer.parseInt(totValid.get(0))+1;
                    tmpbenar=tmpbenar+1;
                    //totValid.set(0, Integer.toString(nilai));
                }
                else{
                    int nilai=0;
                    //jika salah
                    nilai=Integer.parseInt(totValid.get(1))+1;
                    tmpsalah=tmpsalah+1;
                    totValid.set(1, Integer.toString(nilai));
                }

                /*if(fiturEkstrak.size()<listDataFitur.size()){
                    int nilai=0;
                    int gap=listDataFitur.size()-fiturEkstrak.size();
                    //jumlah tidak terekstrak
                    nilai=totValid.get(2)+gap;
                    totValid.set(2, nilai);
                }*/
            }
            totValid.set(3, "1"/*fiturEkstrak.size()*/);
            
        }
        else{
            if (!fiturEkstrak.contains("-")){
                int nilai=0;
                nilai=Integer.parseInt(totValid.get(1))+1;
                totValid.set(1, Integer.toString(nilai));
                tmpsalah=tmpsalah+1;
                totValid.set(3, "1"/*fiturEkstrak.size()*/);
            }
            else{
                int nilai=0;
                //jika bener
                //nilai=Integer.parseInt(totValid.get(0))+1;
                //totValid.set(0, Integer.toString(nilai));
                //tmpbenar=tmpbenar+1;
            }
        }
        //hitung nilai P dan R per baris
        if(tmpbenar==0){
            //totValid.set(0, 0);
            nilaibenar=0;
            nilaiR=0;
        }
        else{
            nilaibenar=(tmpbenar/fiturEkstrak.size());
            nilaiR=(tmpbenar/listDataFitur.size());
        }
        totValid.set(0, Double.toString(nilaibenar));
        totValid.set(2, Double.toString(nilaiR));
        return totValid;
    }
    //
    
    public ArrayList<String> getKandidat(ArrayList<String> listOpini,ArrayList<String> listNgram){
        listKandidat2.clear();
        for (int i = 0; i < listNgram.size(); i++) {
            kataNgram.clear();
            for (String retval: listNgram.get(i).split(" ")){
                kataNgram.add(retval);
            }
            for (int k = 0; k < listOpini.size(); k++) {
                for (int l = 0; l < tag.length; l++) {
                    if(kataNgram.get(0).equalsIgnoreCase(listOpini.get(k)+tag[l])){
                        if(kataNgram.get(1).endsWith("_NN") || kataNgram.get(1).endsWith("_NNS")){
                            listKandidat2.add(kataNgram.get(1));
                        }
                    }
                    else if(kataNgram.get(1).equalsIgnoreCase(listOpini.get(k)+tag[l])){
                        if(kataNgram.get(0).endsWith("_NN") || kataNgram.get(0).endsWith("_NNS")){
                            listKandidat2.add(kataNgram.get(0));
                        }
                    }
                }
            }
            
        }
        return listKandidat2;
    }
    
}
