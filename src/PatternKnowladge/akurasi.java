package PatternKnowladge;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author cahyadi
 */
public class akurasi {
    double nilai=0;
    public double precision(double prc, double jmlKalimat) {
        nilai=(prc/jmlKalimat)*100;
        return nilai;
    }
    
    public double recall(double rcl, double jmlKalimat) {
        nilai=(rcl/jmlKalimat)*100;
        return nilai;
    }
    
    public double precisionTP(double tp, double fp) {
        nilai=(tp/(tp+fp))*100;
        return nilai;
    }
    
    public double recallTP(double tp, double fn) {
        nilai=(tp/(tp+fn))*100;
        return nilai;
    }
    
    public double precPrediksi(double benar, double terekstrak) {
        nilai=(benar/terekstrak)*100;
        
        System.out.println("ISI Jumlah Benar :" + benar);
        System.out.println("Fitur yang Terekstrak :" + terekstrak);
        System.out.println("Nilainya : " + nilai);
        return nilai;
    }
    
    public double recPrediksi(double benar, double datafit) {
        nilai=(benar/datafit)*100;
        
        System.out.println("ISI Jumlah Benar Recall Prediksi :" + benar);
        System.out.println("Fitur Sebenarnya :" + datafit);
        System.out.println("Nilainya : " + nilai);
        return nilai;
    }
}
