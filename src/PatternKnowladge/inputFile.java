/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package PatternKnowladge;

import Preprocessing.Lemmatization;
import Preprocessing.PorterStem;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 *
 * @author DEAS
 */
public class inputFile {
    
    public static ArrayList<String> listString = new ArrayList<String>();
    public static ArrayList<String> listKalimat = new ArrayList<String>();
    public static ArrayList<String> listCorpus = new ArrayList<String>();
    public static ArrayList<String> noDobelSet = new ArrayList<String>();
    public static ArrayList<String> listFiturPro = new ArrayList<String>();
    //public static ArrayList<String> listOpi = new ArrayList<String>();
    public static ArrayList<String> listMPQA = new ArrayList<String>();
    public static ArrayList<String> listOp = new ArrayList<String>();
    
    PorterStem Ps = new PorterStem();
    Lemmatization lemma = new Lemmatization();
    
    public static ArrayList<String> inp(String inputan){
        try {
                File file = new File(inputan);
                FileReader fileReader = new FileReader(file);
                BufferedReader bufferedReader = new BufferedReader(fileReader);
                StringBuffer stringBuffer = new StringBuffer();
                String line;
                while ((line = bufferedReader.readLine()) != null) {
                    String s = line.toString();
                    if(s.contains("##")){
                        s = s.replaceAll(".*##","");
                        listString.add(s.trim().replaceAll("\\s+", " "));
                    }
                }
                fileReader.close();
                
	} catch (IOException e) {
                e.printStackTrace();
	}
        return listString;
    }
    
    public static ArrayList<String> inpFull(String inputan){
        try {
                File file = new File(inputan);
                FileReader fileReader = new FileReader(file);
                BufferedReader bufferedReader = new BufferedReader(fileReader);
                StringBuffer stringBuffer = new StringBuffer();
                String line;
                while ((line = bufferedReader.readLine()) != null) {
                    String s = line.toString();
                    if(s.contains("##")){
                        listKalimat.add(s.trim().replaceAll("\\s+", " "));
                    }
                }
                fileReader.close();
                
	} catch (IOException e) {
                e.printStackTrace();
	}
        return listKalimat;
    }
    
    public ArrayList<String> corpus(String train){
        try {
                File fileCorpus = new File(train);
                FileReader fileReaderC = new FileReader(fileCorpus);
                BufferedReader bufferedReaderC = new BufferedReader(fileReaderC);
                StringBuffer stringBufferC = new StringBuffer();
                String line;
                while ((line = bufferedReaderC.readLine()) != null) {
                    String s = line.toString();
                    if(s.contains("##")){
                        s = s.replaceAll("##.*","");
                        if(!s.isEmpty()){
                        String[] words = s.split(",");
                            for (String word : words) {
                                if(word.contains("[") || word.contains("]")){
                                    word = word.replaceAll("\\[.*","");
                                    listCorpus.add(word.trim().replaceAll("\\s+", " "));
                                }
                            }
                        }
                    }
                }
                fileReaderC.close();
                
	} catch (IOException e) {
                e.printStackTrace();
	}
        return listCorpus;
    }
    
    public ArrayList<String> corpuspre(ArrayList<String> corp,int v){
        ArrayList<String> corppre = new ArrayList<>();
        for(int i = 0; i<corp.size(); i++){
            String corpus = "";
            //stemmer
            if(v == 0){
                corpus = Ps.stemmernotag(corp.get(i));
            }
            //lemma
            else if(v == 1){
                corpus = lemma.lemmatizenotag(corp.get(i));
            }
            //lemma dan stem
            else if(v == 2){
                corpus = lemma.lemmatizenotag(corp.get(i));
                corpus = Ps.stemmernotag(corpus);
            }
            corppre.add(corpus);
        }
        return corppre;
    }
    
    public ArrayList<String> dataSetNoDBL(String train){
        try {
                File fileCorpus = new File(train);
                FileReader fileReaderC = new FileReader(fileCorpus);
                BufferedReader bufferedReaderC = new BufferedReader(fileReaderC);
                StringBuffer stringBufferC = new StringBuffer();
                String line;
                while ((line = bufferedReaderC.readLine()) != null) {
                    String s = line.toString();
                    if(s.contains("##")){
                        s = s.replaceAll("##.*","");
                        if(!s.isEmpty()){
                        String[] words = s.split(",");
                            for (String word : words) {
                                if(word.contains("[") || word.contains("]")){
                                    word = word.replaceAll("\\[.*","");
                                    listCorpus.add(word);
                                    if ( (Collections.frequency(noDobelSet, word.trim().replaceAll("\\s+", " "))) < 1 ){
                                        noDobelSet.add(word.trim().replaceAll("\\s+", " "));
                                    }
                                }
                            }
                        }
                    }
                }
                fileReaderC.close();
                
	} catch (IOException e) {
                e.printStackTrace();
	}
        return noDobelSet;
    }
    
    public ArrayList<String> fiturpro(String inputFitur){
        try {
                File file = new File(inputFitur);
                FileReader fileReader = new FileReader(file);
                BufferedReader bufferedReader = new BufferedReader(fileReader);
                StringBuffer stringBuffer = new StringBuffer();
                String line;
                while ((line = bufferedReader.readLine()) != null) {
                    String s = line.toString();
                    if(s.contains("##")){
                        s = s.replaceAll("##.*","");
                        if(s.isEmpty()){
                            listFiturPro.add("-");
                        }
                        else{
                            listFiturPro.add(s.trim().replaceAll("\\s+", " "));
                        }
                    }
                }
                fileReader.close();
                
	} catch (IOException e) {
                e.printStackTrace();
	}
        return listFiturPro;
    }
    
    //merubah dataset menjadi stem
    public ArrayList<String> fiturproPre(ArrayList<String> inputFitur){
        ArrayList<String> fiturds = new ArrayList<String>();
        for(int i = 0; i<inputFitur.size(); i++){
            String fiturkalimat="";
            String[] words = inputFitur.get(i).split(",");
            for (String word : words) {
                Pattern p = Pattern.compile("^(.+?)(?=\\[)");
                Matcher m = p.matcher(word);
                if (m.find()) {
                    String fitur = m.group();
                    fitur = Ps.stemmernotag(fitur);
                    //fitur = lemma.lemmatize(fitur);
                    String fiturasli = word;
                    String fitpoPre = fiturasli.replaceAll("^(.+?)(?=\\[)", fitur);
                    fiturkalimat = fiturkalimat + fitpoPre + ",";
                }
                else{
                    fiturds.add(word);
                }
            }
            if(fiturkalimat.endsWith(",")){
                fiturkalimat = fiturkalimat.substring(0,fiturkalimat.length()-1);
                fiturds.add(fiturkalimat.trim().replaceAll("\\s+", " "));
            }
        }
        return fiturds;
    }
    
    //merubah dataset menjadi lemma
    public ArrayList<String> fiturproPre2(ArrayList<String> inputFitur){
        ArrayList<String> fiturds = new ArrayList<String>();
        for(int i = 0; i<inputFitur.size(); i++){
            String fiturkalimat="";
            String[] words = inputFitur.get(i).split(",");
            for (String word : words) {
                Pattern p = Pattern.compile("^(.+?)(?=\\[)");
                Matcher m = p.matcher(word);
                if (m.find()) {
                    String fitur = m.group();
                    //fitur = Ps.stemmernotag(fitur);
                    fitur = lemma.lemmatizenotag(fitur);
                    /*if(fitur.endsWith(" ")){
                        fitur.substring(0, fitur.length()-1);
                    }*/
                    String fiturasli = word;
                    String fitpoPre = fiturasli.replaceAll("^(.+?)(?=\\[)", fitur);
                    fiturkalimat = fiturkalimat + fitpoPre + ",";
                }
                else{
                    fiturds.add(word);
                }
            }
            if(fiturkalimat.endsWith(",")){
                fiturkalimat = fiturkalimat.substring(0,fiturkalimat.length()-1);
                fiturds.add(fiturkalimat.trim().replaceAll("\\s+", " "));
            }
        }
        return fiturds;
    }
    
    //merubah dataset menjadi lemma, kemudian di stem
    public ArrayList<String> fiturproPre3(ArrayList<String> inputFitur){
        ArrayList<String> fiturds = new ArrayList<String>();
        for(int i = 0; i<inputFitur.size(); i++){
            String fiturkalimat="";
            String[] words = inputFitur.get(i).split(",");
            for (String word : words) {
                Pattern p = Pattern.compile("^(.+?)(?=\\[)");
                Matcher m = p.matcher(word);
                if (m.find()) {
                    String fitur = m.group();
                    fitur = lemma.lemmatizenotag(fitur);
                    fitur = Ps.stemmernotag(fitur);
                    String fiturasli = word;
                    String fitpoPre = fiturasli.replaceAll("^(.+?)(?=\\[)", fitur);
                    fiturkalimat = fiturkalimat + fitpoPre + ",";
                }
                else{
                    fiturds.add(word);
                }
            }
            if(fiturkalimat.endsWith(",")){
                fiturkalimat = fiturkalimat.substring(0,fiturkalimat.length()-1);
                fiturds.add(fiturkalimat.trim().replaceAll("\\s+", " "));
            }
        }
        return fiturds;
    }
    
    public ArrayList<ArrayList<String>> dataSetFP(String train,int nilai){
        ArrayList<ArrayList<String>> datasetFP = new ArrayList<>();
        
        String word1;
        String word2;
        if(train.contains("##")){
            train = train.replaceAll("##.*","");
            if(!train.isEmpty()){
                String[] words = train.split(",");
                for (String word : words) {
                    ArrayList<String> tmp = new ArrayList<>();
                    if(word.contains("[") || word.contains("]")){
                        word1 = word.replaceAll("\\[.*","");
                        if(nilai == 1){
                            word1 = Ps.stemmernotag(word1);
                        }
                        else if(nilai == 2){
                            word1 = lemma.lemmatizenotag(word1);
                        }
                        else if(nilai == 3){
                            word1 = lemma.lemmatize(word1);
                            word1 = Ps.stemmernotag(word1);
                        }
                        word2 = word.replaceFirst("\\d\\].*", ""); //menghilangkan skor dan hanya menyisakan +/-
                        word2 = word2.replaceFirst(".*\\[", "");
                        tmp.add(word1.trim().replaceAll("\\s+", " "));
                        tmp.add(word2.trim().replaceAll("\\s+", " "));
                        datasetFP.add(tmp);
                    }
                }
            }
        }
        //System.out.println("dataset polaritas pre: "+datasetFP);
        return datasetFP;
    }
    
    public ArrayList<String> opi(String inputOpi){
        ArrayList<String> listOpi = new ArrayList<String>();
        try {
                File filePositif = new File(inputOpi);
                FileReader fileReaderP = new FileReader(filePositif);
                BufferedReader bufferedReaderP = new BufferedReader(fileReaderP);
                StringBuffer stringBufferP = new StringBuffer();
                String line;
                while ((line = bufferedReaderP.readLine()) != null) {
                    listOpi.add(line.toString().trim().replaceAll("\\s+", " "));
                }
                fileReaderP.close();
                
	} catch (IOException e) {
                e.printStackTrace();
	}
        return listOpi;
    }
    
    public ArrayList<String> ReadMPQA(String inputMPQA){
        try {
                File fileMPQA = new File(inputMPQA);
                FileReader fileReaderM = new FileReader(fileMPQA);
                BufferedReader bufferedReaderM = new BufferedReader(fileReaderM);
                StringBuffer stringBufferM = new StringBuffer();
                String line;
                while ((line = bufferedReaderM.readLine()) != null) {
                    ArrayList<String> tmp = new ArrayList<String>();
                    String s = line.toString().trim().replaceAll("\\s+", " ");
                    String[] words = s.split(" ");
                    for (String word : words) {
                        tmp.add(word);
                    }
                    listMPQA.add(tmp.get(2));
                }
                fileReaderM.close();
                
	} catch (IOException e) {
                e.printStackTrace();
	}
        return listMPQA;
    }
    
    public ArrayList<String> ReadOpini(String inputOp){
        try {
                File fileOp = new File(inputOp);
                FileReader fileReaderO = new FileReader(fileOp);
                BufferedReader bufferedReaderO = new BufferedReader(fileReaderO);
                StringBuffer stringBufferO = new StringBuffer();
                String line;
                while ((line = bufferedReaderO.readLine()) != null) {
                    String s = line.toString().trim().replaceAll("\\s+", " ");
                    String[] words = s.split(" ");
                    for (String word : words) {
                        if(word.startsWith("word1=")){
                            listOp.add(word.replace("word1=", ""));
                        }
                    }
                }
                fileReaderO.close();
                
	} catch (IOException e) {
                e.printStackTrace();
	}
        return listOp;
    }
    
}
