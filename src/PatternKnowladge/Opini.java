/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package PatternKnowladge;

import java.util.ArrayList;
import java.util.StringTokenizer;

/**
 *
 * @author DEAS
 */
public class Opini {
    
    public static ArrayList<String> totValid = new ArrayList<String>();
    
    public static String[] tag = {
        "_CC","_CD","_DT","_EX","_FW","_IN","_JJ","_JJR","_JJS","_LS","_MD","_NN","_NNS","_NNP","_NNPS","_PDT","_POS","_PRP","_PRP$","_RB","_RBR","_RBS","_RP","_SYM","_TO","_UH","_VB","_VBD","_VBG","_VBN","_VBP","_VBZ","_WDT","_WP","_WP$","_WRB","_#","_$","_.","_,","_:","_(","_)","_`","_'"
    };
    
    //mendapatkan token (JJ,JJR,JJS,RB,RBR,RBS)
    public ArrayList<String> getToken(String kalimat){
        ArrayList<String> tList = new ArrayList<String>();
        
        // creating string tokenizer
        StringTokenizer st = new StringTokenizer(kalimat);

        // checking elements
        while (st.hasMoreTokens()){
            String tempStr = st.nextToken();
            //hilangin tanda didepan dan blakang kata
            if(tempStr.endsWith("_JJ") || tempStr.endsWith("_JJR") ||tempStr.endsWith("_JJS") || tempStr.endsWith("_RB") || tempStr.endsWith("_RBR") || tempStr.endsWith("_RBS")){
                tempStr = delTAg(tempStr);
                tList.add(tempStr);
            }
        }
        return tList;
    }
    
    //menghilangkan tag pada kata
    public String delTAg(String kata) {
        for (int a = 0; a < tag.length; a++) {
            if(kata.endsWith(tag[a])){
                kata=kata.replace(tag[a], "");
            }
        }
        return kata;
    }
    
    //untuk nyari benar,salah,jumlah dataset, jumlah ekstrak. untuk menghitung akurasi opini dengan SWN
    public ArrayList<String> validasiOpini(ArrayList<ArrayList<String>> fitpoDataset,ArrayList<ArrayList<String>> fitpoEks){
        totValid.add("0");// 0 benar
        totValid.add("0");// 1 salah
        totValid.add("0");// 2 fitur op dataset
        totValid.add("0");// 3 fitur op ekstrak
        totValid.add("0");// 4 precision
        totValid.add("0");// 5 recall
        
        totValid.add("0");// 6 benar positif
        totValid.add("0");// 7 benar negatif
        totValid.add("0");// 8 fitur dataset positif
        totValid.add("0");// 9 fitur dataset negatif
        totValid.add("0");// 10 fitur ekstrak positif
        totValid.add("0");// 11 fitur ekstrak negatif
        totValid.add("0");// 12 precision positif
        totValid.add("0");// 13 precision negatif
        totValid.add("0");// 14 recall positif
        totValid.add("0");// 15 recall negatif
        
        double tmpbenar=0;
        double tmpsalah=0;
        double nilaibenar=0;
        int jmlfitop =0;
        int jmldatsetpos = 0;
        int jmldatsetneg = 0;
        int jmlekspos = 0;
        int jmleksneg = 0;
        
        String kata = "-";
        
        if(!fitpoDataset.isEmpty()){
            for(int k = 0; k<fitpoDataset.size(); k++){
                //dataset positif +1
                if(fitpoDataset.get(k).get(1).equalsIgnoreCase("+")){
                    jmldatsetpos = jmldatsetpos+1;
                }
                //dataset negatif +1
                else if(fitpoDataset.get(k).get(1).equalsIgnoreCase("-")){
                    jmldatsetneg = jmldatsetneg+1;
                }
            }
            
            for(int i = 0; i<fitpoEks.size(); i++){
                //cek apakah polaritas fitur nya no opini
                if(fitpoEks.get(i).get(0) != "-"){
                    if(!fitpoEks.get(i).get(1).contains("no opini")){
                        if(fitpoDataset.contains(fitpoEks.get(i))){
                            int nilai=0;
                            //jika bener
                            nilai=Integer.parseInt(totValid.get(0))+1;
                            //tmpbenar=tmpbenar+1;
                            totValid.set(0, Integer.toString(nilai));
                            
                            //jika polaritas +
                            if(fitpoEks.get(i).get(1).equalsIgnoreCase("+")){
                                //positif benar +1, posiif terekstrak +1
                                int nilaipos =0;
                               
                                nilaipos = Integer.parseInt(totValid.get(6))+1; //ekstrak positif benar
                                //tmpbenar=tmpbenar+1;
                                totValid.set(6, Integer.toString(nilaipos));
                                jmlekspos = jmlekspos+1;
                            }
                            //jika polaritas -
                            else if(fitpoEks.get(i).get(1).equalsIgnoreCase("-")){
                                //negatif benar +1, negatif terekstrak +1
                                int nilaineg =0;
                               
                                nilaineg = Integer.parseInt(totValid.get(7))+1; //ekstrak negatif benar
                                //tmpbenar=tmpbenar+1;
                                totValid.set(7, Integer.toString(nilaineg));
                                jmleksneg = jmleksneg+1;
                            }
                        }
                        else{
                            int nilai=0;
                            //jika salah
                            nilai=Integer.parseInt(totValid.get(1))+1;
                            //tmpsalah=tmpsalah+1;
                            totValid.set(1, Integer.toString(nilai));
                            
                            //jika polaritas +
                            if(fitpoEks.get(i).get(1).equalsIgnoreCase("+")){
                                //posiif terekstrak +1
                                jmlekspos = 1;
                            }
                            //jika polaritas -
                            else if(fitpoEks.get(i).get(1).equalsIgnoreCase("-")){
                                //negatif terekstrak +1
                                jmleksneg = 1;
                            }
                        }
                        jmlfitop = jmlfitop +1;
                    }
                }
            }
            
            //jika opini tdak dapat diekstrak (no opini, -) maka dihitung sebagai dpt mengekstrak 1 dan dianggap salah
            if(jmlfitop == 0){
                jmlfitop = 1;
                int nilai=0;
                //jika salah
                nilai=Integer.parseInt(totValid.get(1))+1;
                //tmpsalah=tmpsalah+1;
                totValid.set(1, Integer.toString(nilai));
            }
            
            //jika dataset positif tidak ada, sedangkan negatif ada
            if(jmldatsetpos == 0){
                if(jmlekspos == 0){
                    int nilaipos =0;
                               
                    nilaipos = Integer.parseInt(totValid.get(6))+1; //ekstrak positif benar
                    //tmpbenar=tmpbenar+1;
                    totValid.set(6, Integer.toString(nilaipos));
                    jmlekspos = 1;
                }
                //dataset positif +1
                jmldatsetpos = 1;
            }
            //jika dataset negatif tidak ada, sedangkan positif ada
            if(jmldatsetneg == 0){
                if(jmleksneg == 0){
                    int nilaineg =0;
                               
                    nilaineg = Integer.parseInt(totValid.get(7))+1; //ekstrak negatif benar
                    //tmpbenar=tmpbenar+1;
                    totValid.set(7, Integer.toString(nilaineg));
                    jmleksneg = 1;
                }
                //dataset negatif +1
                jmldatsetneg = 1;
            }
            
            //jika fitur positif terekstrak tidak ada, fitur negatif terekstrak ada
            if(jmlekspos == 0){
                jmlekspos = 1;
            }
            //jika fitur negatif terekstrak tidak ada, fitur positif terekstrak ada
            if(jmleksneg == 0){
                jmleksneg = 1;
            }
            
            //hitung jumlah fitur pada data fitur dan ekstraksi
            totValid.set(2, Integer.toString(fitpoDataset.size()));
            totValid.set(3, Integer.toString(jmlfitop));
            
            //hitung jumlah dataset dan ekstraksi positif dan negatif
            totValid.set(8, Integer.toString(jmldatsetpos)); //dataset positif
            totValid.set(9, Integer.toString(jmldatsetneg)); //dataset negatif
            totValid.set(10, Integer.toString(jmlekspos)); //ekstrak positif
            totValid.set(11, Integer.toString(jmleksneg)); //ekstrak negatif
        }
        else{
            if (fitpoEks.get(0).get(0) != "-"){
                for(int i = 0; i<fitpoEks.size(); i++){
                    if(!fitpoEks.get(i).get(1).contains("no opini")){
                        jmlfitop = jmlfitop +1;
                        
                        //jika polaritas +
                        if(fitpoEks.get(i).get(1).equalsIgnoreCase("+")){
                            //posiif terekstrak +1
                            jmlekspos = jmlekspos+1;
                        }
                        //jika polaritas -
                        else if(fitpoEks.get(i).get(1).equalsIgnoreCase("-")){
                            //negatif terekstrak +1
                            jmleksneg = jmleksneg+1;
                        }
                    }
                }
                //jika opini tdak dapat diekstrak (no opini, -) maka dihitung sebagai dpt mengekstrak 1 dan dianggap benar
                if(jmlfitop == 0){
                    int nilai=0;
                    //jika bener
                    nilai=Integer.parseInt(totValid.get(0))+1;
                    //tmpbenar=tmpbenar+1;
                    totValid.set(0, Integer.toString(nilai));
                    
                    //dianggap terekstrak 1 yaitu "-"
                    totValid.set(3, Integer.toString(1));
                }
                else{
                    totValid.set(3, Integer.toString(jmlfitop));
                }
                
                //jika dataset positif tidak ada, sedangkan negatif ada
                if(jmldatsetpos == 0){
                    if(jmlekspos == 0){
                        int nilaipos =0;

                        nilaipos = Integer.parseInt(totValid.get(6))+1; //ekstrak positif benar
                        //tmpbenar=tmpbenar+1;
                        totValid.set(6, Integer.toString(nilaipos));
                        jmlekspos = 1;
                    }
                    //dataset positif +1
                    jmldatsetpos = 1;
                }
                //jika dataset negatif tidak ada, sedangkan positif ada
                if(jmldatsetneg == 0){
                    if(jmleksneg == 0){
                        int nilaineg =0;

                        nilaineg = Integer.parseInt(totValid.get(7))+1; //ekstrak negatif benar
                        //tmpbenar=tmpbenar+1;
                        totValid.set(7, Integer.toString(nilaineg));
                        jmleksneg = 1;
                    }
                    //dataset negatif +1
                    jmldatsetneg = 1;
                }
                
                //jika fitur positif terekstrak tidak ada, fitur negatif terekstrak ada
                if(jmlekspos == 0){
                    jmlekspos = 1;
                }
                //jika fitur negatif terekstrak tidak ada, fitur positif terekstrak ada
                if(jmleksneg == 0){
                    jmleksneg = 1;
                }
                
                totValid.set(1, Integer.toString(jmlfitop));
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
                
                //bener positif +1, terekstrak positif +1
                int nilaipos =0;
                               
                nilaipos = Integer.parseInt(totValid.get(6))+1; //ekstrak positif benar
                totValid.set(6, Integer.toString(nilaipos));
                jmlekspos = 1;
                
                //bener negatif +1, terekstrak negatif +1
                int nilaineg =0;
                               
                nilaineg = Integer.parseInt(totValid.get(7))+1; //ekstrak negatif benar
                //tmpbenar=tmpbenar+1;
                totValid.set(7, Integer.toString(nilaineg));
                jmleksneg = 1;
                
                //dataset positif +1
                jmldatsetpos = 1;
                //dataset negatif +1
                jmldatsetneg = 1;
            }
            
            //hitung jumlah dataset dan ekstraksi positif dan negatif
            totValid.set(8, Integer.toString(jmldatsetpos)); //dataset positif
            totValid.set(9, Integer.toString(jmldatsetneg)); //dataset negatif
            totValid.set(10, Integer.toString(jmlekspos)); //ekstrak positif
            totValid.set(11, Integer.toString(jmleksneg)); //ekstrak negatif
            
        }
        
        //hitung precision recall per kalimat
        //precision : benar/ekstrak * 100%
        double prc=(Double.parseDouble(totValid.get(0))/Double.parseDouble(totValid.get(3)));
        //recall : benar/dataset *100%;
        double rcl=(Double.parseDouble(totValid.get(0))/Double.parseDouble(totValid.get(2)));
        
        totValid.set(4, Double.toString(prc));
        totValid.set(5, Double.toString(rcl));

        //precision recall positif
        double prcPOS=(Double.parseDouble(totValid.get(6))/Double.parseDouble(totValid.get(10)));
        double rclPOS=(Double.parseDouble(totValid.get(6))/Double.parseDouble(totValid.get(8)));
        //precision recall negatif
        double prcNEG=(Double.parseDouble(totValid.get(7))/Double.parseDouble(totValid.get(11)));
        double rclNEG=(Double.parseDouble(totValid.get(7))/Double.parseDouble(totValid.get(9)));
        
        totValid.set(12, Double.toString(prcPOS));
        totValid.set(13, Double.toString(prcNEG));
        totValid.set(14, Double.toString(rclPOS));
        totValid.set(15, Double.toString(rclNEG));
        
        return totValid;
   }
    
   //untuk nyari benar,salah,jumlah dataset, jumlah ekstrak. untuk menghitung akurasi opini dengan OP.lexicon
    public ArrayList<String> validasiOpiniOP(ArrayList<ArrayList<String>> fitpoDataset,ArrayList<ArrayList<String>> fitpoEks){
        totValid.add("0");// 0 benar
        totValid.add("0");// 1 salah
        totValid.add("0");// 2 fitur op dataset
        totValid.add("0");// 3 fitur op ekstrak
        totValid.add("0");// 4 precision
        totValid.add("0");// 5 recall
        
        double tmpbenar=0;
        double tmpsalah=0;
        double nilaibenar=0;
        int jmlfitop =0;
        
        String kata = "-";
        
        if(!fitpoDataset.isEmpty()){
            for(int i = 0; i<fitpoEks.size(); i++){
                //cek apakah polaritas fitur nya no opini
                if(!fitpoEks.get(i).get(0).contains("-")){
                    if(!fitpoEks.get(i).get(1).contains("no opini")){
                        
                        //jika dataset dan ekstrak sama
                        if(fitpoDataset.contains(fitpoEks.get(i))){
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
                        jmlfitop = jmlfitop +1;
                    }
                }
            }
            
            //jika opini tdak dapat diekstrak (no opini, -) maka dihitung sebagai dpt mengekstrak 1 dan dianggap salah
            if(jmlfitop == 0){
                jmlfitop = 1;
                int nilai=0;
                //jika salah
                nilai=Integer.parseInt(totValid.get(1))+1;
                //tmpsalah=tmpsalah+1;
                totValid.set(1, Integer.toString(nilai));
            }
            
            //hitung jumlah fitur pada data fitur dan ekstraksi
            totValid.set(2, Integer.toString(fitpoDataset.size()));
            totValid.set(3, Integer.toString(jmlfitop));
        }
        else{
            if (!fitpoEks.get(0).contains("-")){
                for(int i = 0; i<fitpoEks.size(); i++){
                    if(!fitpoEks.get(i).get(1).contains("no opini")){
                        jmlfitop = jmlfitop +1;
                    }
                }
                //jika opini tdak dapat diekstrak (no opini, -) maka dihitung sebagai dpt mengekstrak 1 dan dianggap benar
                if(jmlfitop == 0){
                    int nilai=0;
                    //jika bener
                    nilai=Integer.parseInt(totValid.get(0))+1;
                    //tmpbenar=tmpbenar+1;
                    totValid.set(0, Integer.toString(nilai));
                    
                    //dianggap terekstrak 1 yaitu "-"
                    totValid.set(3, Integer.toString(1));
                }
                else{
                    totValid.set(3, Integer.toString(jmlfitop));
                }
                
                totValid.set(1, Integer.toString(jmlfitop));
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

        return totValid;
   }
    
}
