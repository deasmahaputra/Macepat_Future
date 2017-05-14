/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package PatternKnowladge;


import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author DEAS
 */
public class NpPherase {
    
    public static String[] tag = {
        "_I-ADJP", "_I-ADVP", "_I-CONJP", "_I-INTJ", "_I-LST", "_I-NP", "_I-PP", "_I-PRT", "_I-SBAR", "_I-UCP", "_I-VP", "_B-NP"
    };
    public static ArrayList<String> wordsList = new ArrayList<String>();
    public static ArrayList<String> kalimat = new ArrayList<String>();
    
    public static String NPPherase(String WordTag){
        
        //System.out.println("ISI WORDTAG NP PARSER :" + WordTag);
    
     System.out.println("Isi Masukan sudah isi tag : " + WordTag);
        String tamp = " ";
        //inputan += hasilextraksi;
        //tamp += hasilextraksi.trim().replaceAll("\\S+"," ");
        String words[] = WordTag.split(" ");
        String kalim = " ";
        
        wordsList.clear();
        
        System.out.println("ISI WORD :" + tamp);
        for(String word : words){
            wordsList.add(word);
        }
         
        System.out.println("ISI WORD LIST :" + wordsList);
        for (int i = 0; i < wordsList.size(); i++) {
            String sList=wordsList.get(i);
            for (int j = 0; j < tag.length; j++) {
                String sTag=tag[j];
                if (wordsList.get(i).endsWith(tag[j])) {
                    kalim=kalim+wordsList.get(i).replace(tag[j],"")+" ";
                    //kalimat.add(wordsList.get(i).replace(tag[j],"")+" ");
                    kalimat.add(kalim);
                }
            }
        }
        
//        for(String has : kalimat){
//            kalim += has;
//        }
        
        
    
        System.out.println("ISI KALIM NP PARSER :" + kalimat);
        return kalim;
    }
    
    public static List<String> NPPherasee(String WordTag){
        
        //System.out.println("ISI WORDTAG NP PARSER :" + WordTag);
    
     System.out.println("Isi Masukan sudah isi tag : " + WordTag);
        String tamp = " ";
        //inputan += hasilextraksi;
        //tamp += hasilextraksi.trim().replaceAll("\\S+"," ");
        String words[] = WordTag.split(" ");
        String kalim = " ";
        
        wordsList.clear();
        
        System.out.println("ISI WORD :" + tamp);
        for(String word : words){
            wordsList.add(word);
        }
         
        System.out.println("ISI WORD LIST :" + wordsList);
        for (int i = 0; i < wordsList.size(); i++) {
            String sList=wordsList.get(i);
            for (int j = 0; j < tag.length; j++) {
                String sTag=tag[j];
                if (wordsList.get(i).endsWith(tag[j])) {
                    kalim=kalim+wordsList.get(i).replace(tag[j],"")+" ";
                    //kalimat.add(wordsList.get(i).replace(tag[j],"")+" ");
                    kalimat.add(kalim);
                }
            }
        }
        
//        for(String has : kalimat){
//            kalim += has;
//        }
        
        
    
        System.out.println("ISI KALIM NP PARSER :" + kalimat);
        return kalimat;
    }
    
}
