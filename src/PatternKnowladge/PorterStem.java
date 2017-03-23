/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package PatternKnowladge;
import java.util.ArrayList;
import snowballstemmer.PorterStemmer;
/**
 *
 * @author cahyadi
 */

public class PorterStem {
    public static ArrayList<String> list = new ArrayList<String>();
    public static ArrayList<String> listKal = new ArrayList<String>();
    //tes public static String PortStem="";
    
    public static String[] tagger = {
        "_CC","_CD","_DT","_EX","_FW","_IN","_JJ","_JJR","_JJS","_LS","_MD","_NN","_NNS","_NNP","_NNPS","_PDT","_POS","_PRP","_PRP$","_RB","_RBR","_RBS","_RP","_SYM","_TO","_UH","_VB","_VBD","_VBG","_VBN","_VBP","_VBZ","_WDT","_WP","_WP$","_WRB","_#","_$","_.","_,","_:","_(","_)","_`","_'"
    };
    
    public static String stemmer(String input) {
        //tambahan
        String PortStem=null;
        PortStem="";
        //
        
        //create a new instance of PorterStemmer
        PorterStemmer stemmer = new PorterStemmer();

        //menyimpan input ke array
        String StringStem=input;
        StringStem=StringStem.trim().replaceAll("\\s+", " ");
        String[] wordsStem = StringStem.split(" ");
        
        //tambahan
        list.clear();
        //
        
        for (String wordS : wordsStem) {
            list.add(wordS);
        }
        
        for (int i = 0; i < list.size(); i++) {
            String sList=list.get(i);
            for (int j = 0; j < tagger.length; j++) {
                String sTag=tagger[j];
                if (list.get(i).endsWith(sTag)) {
                    String kata=sList.replace(sTag,"");
                    //set the word to be stemmed
                    stemmer.setCurrent(kata);
                    
                    //call stem() method. stem() method returns boolean value. 
                    if(stemmer.stem())
                    {
                        //If stemming is successful obtain the stem of the given word
                        String HasilStem=stemmer.getCurrent();
                        PortStem =PortStem+HasilStem+sTag+" ";
                    }
                }

            }
        }
        return PortStem;
    }
    
    public static String removetag(String kalimat){
        //menyimpan input ke array
        String kalimatFull = "";
        String StringKal=kalimat;
        StringKal=StringKal.trim().replaceAll("\\s+", " ");
        String[] wordsKal = StringKal.split(" ");
        
        //tambahan
        listKal.clear();
        //
        
        for (String wordS : wordsKal) {
            listKal.add(wordS);
        }
        
        for (int i = 0; i < listKal.size(); i++) {
            String sList=listKal.get(i);
            for (int j = 0; j < tagger.length; j++) {
                String sTag=tagger[j];
                if (listKal.get(i).endsWith(sTag)) {
                    String kata=sList.replace(sTag,"");
                    kalimatFull = kalimatFull+kata+" ";
                }
            }
        }
        kalimatFull = kalimatFull.trim().replaceAll("\\s+", " ");
        return kalimatFull;
    }
    
    public static String stemmernotag(String input) {
        //tambahan
        String PortStem=null;
        PortStem="";
        String HasilStem="";
        //
        
        //create a new instance of PorterStemmer
        PorterStemmer stemmer = new PorterStemmer();

        //set the word to be stemmed
        stemmer.setCurrent(input);
        
        //call stem() method. stem() method returns boolean value. 
        if(stemmer.stem())
        {
            //If stemming is successful obtain the stem of the given word
            HasilStem=stemmer.getCurrent();
        }
        return HasilStem;
    }
    
}
