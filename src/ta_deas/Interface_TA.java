/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ta_deas;

//import Preprocessing.Lemmatization;
//import Preprocessing.Lemmatization;
import PatternKnowladge.inputFile;
import PatternKnowladge.Fitur;
import PatternKnowladge.GetDataRule;
import PatternKnowladge.GetRule;
import PatternKnowladge.Opini;
import PatternKnowladge.Rule;
import PatternKnowladge.StanParser;
import PatternKnowladge.ngram;
import Preprocessing.BioChunking;
import Preprocessing.Corref.GetCorref;
import Preprocessing.CorreferenceResolution;
import Preprocessing.IobChunk;
import Preprocessing.Lemmatization;
import Preprocessing.PorterStem;
import Preprocessing.RegIob;
import Preprocessing.SW;
import Preprocessing.StanfordTagger;
//import Preprocessing.example;
//import Preprocessing.Stop;
import Preprocessing.Stopwords;
import Preprocessing.getData;
import edu.smu.tspell.wordnet.WordNetDatabase;
import edu.stanford.nlp.trees.Tree;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintStream;
import java.io.PrintWriter;
import java.io.Writer;
//import Preprocessing.CorreferenceResolution;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author DEAS
 */
public class Interface_TA extends javax.swing.JFrame {

    /**
     * Creates new form Interface_TA
     */
    public Interface_TA() {
        initComponents();
    }
    //public static ArrayList<String> inputan = new ArrayList<String>();
    public static ArrayList<String> inputanFull = new ArrayList<String>();
    public static List<String> nounPhrases = new ArrayList<String>();
    public static ArrayList<String> corpus = new ArrayList<String>();
    public static ArrayList<String> corpuspre = new ArrayList<String>();
    public static ArrayList<String> dataFit = new ArrayList<String>();
    public static ArrayList<String> dataFitPre = new ArrayList<String>();
    public static ArrayList<String> noDobelDataFit = new ArrayList<String>();
    public static ArrayList<String> opPos = new ArrayList<String>();
    public static ArrayList<String> opNeg = new ArrayList<String>();
    public static ArrayList<String> inpOpini = new ArrayList<String>();
    public static ArrayList<String> kalimatPre = new ArrayList<String>();
    public static ArrayList<String> ngram = new ArrayList<String>();
    public static ArrayList<String> ngram2 = new ArrayList<String>();
    public static ArrayList<String> listFit = new ArrayList<String>();
    public static ArrayList<String> noDobel = new ArrayList<String>();
    public static ArrayList<String> listKandidat = new ArrayList<String>();
    public static ArrayList<String> listKandidat2 = new ArrayList<String>();
    public static ArrayList<String> temp1 = new ArrayList<String>();
    public static ArrayList<String> temp2 = new ArrayList<String>();
    public static ArrayList<String> fiturrule = new ArrayList<String>();
    public static ArrayList<String> tmpfit = new ArrayList<String>();
    public static ArrayList<String> fixFit = new ArrayList<String>();
    public static ArrayList<String> polaritas = new ArrayList<String>();
    public static ArrayList<ArrayList<String>> fp = new ArrayList<ArrayList<String>>();
    public static ArrayList<String> temp3 = new ArrayList<String>();
    public static ArrayList<String> temp4 = new ArrayList<String>();
    public static ArrayList<String> totalfitur = new ArrayList<String>();
    public static ArrayList<String> fiturkalimat = new ArrayList<String>();
    public static ArrayList<ArrayList<String>> fiturkalimattotal = new ArrayList<ArrayList<String>>();
    public static ArrayList<ArrayList<String>> fiturpolaritastotal = new ArrayList<ArrayList<String>>();
    public static ArrayList<ArrayList<String>> totalfiturfp = new ArrayList<ArrayList<String>>();
    public static ArrayList<Double> jumlah = new ArrayList<Double>();
    public static ArrayList<Double> jumlah2 = new ArrayList<Double>();
    public static ArrayList<String> typeD = new ArrayList<String>();
    public static ArrayList<ArrayList<String>> listGroup = new ArrayList<ArrayList<String>>();
    public static ArrayList<String> tmpOpini = new ArrayList<>();
    //public static ArrayList<String> tmpFitOp = new ArrayList<>();\
    public static ArrayList<ArrayList<String>> listFitOp = new ArrayList<ArrayList<String>>();
    public static Tree tree;
    
    //=== opini ===//
    public static ArrayList<String> token = new ArrayList<String>();
    //============//
    
    
    public static ArrayList<String> inputan = new ArrayList<String>();
    public static List<String> inputann = new ArrayList<>();

    CallFile call = new CallFile();
    Stopwords sw = new Stopwords();
    SW stopword = new SW();
    StanfordTagger ST = new StanfordTagger();
    Lemmatization lemma = new Lemmatization();
    BioChunking bio = new BioChunking();
    CorreferenceResolution corref = new CorreferenceResolution();
    outputFile output = new outputFile();
    ngram Ng = new ngram();
    Rule Rl= new Rule();
    Opini Op = new Opini();
    Fitur Fit = new Fitur();
    PorterStem Ps = new PorterStem();
    StanParser Parser = new StanParser();
    inputFile input = new inputFile();
    IobChunk iobchunk = new IobChunk();
//    GetRule ruleget = new GetRule();
    RegIob regbio = new RegIob();
    
    
    public void getRuleSelected(){
        
        GetDataRule getdatarule = GetDataRule.getInstance();
        String rulesatua = jComboBoxRule1a4.getSelectedItem().toString();
        String rulesatub = jComboBoxRule1b4.getSelectedItem().toString();
        String rulesatuc = jComboBoxRule1C4.getSelectedItem().toString();
        String ruleduaa = jComboBoxRule2a4.getSelectedItem().toString();
        String ruleduab = jComboBoxRule2b4.getSelectedItem().toString();
        String ruleduac = jComboBoxRule2c4.getSelectedItem().toString();
        String ruletigaa = jComboBoxRule3a4.getSelectedItem().toString();
        String ruletigab = jComboBoxRule3b4.getSelectedItem().toString();
        String ruletigac = jComboBoxRule3c4.getSelectedItem().toString();
        String ruleempata = jComboBoxRule4a4.getSelectedItem().toString();
        String ruleempatb = jComboBoxRule4b4.getSelectedItem().toString();
        String ruleempatc = jComboBoxRule4c4.getSelectedItem().toString();
        String rulelimaa = jComboBoxRule5a4.getSelectedItem().toString();
        String rulelimab = jComboBoxRule5b4.getSelectedItem().toString();
        String rulelimac = jComboBoxRule5c4.getSelectedItem().toString();
        String ruleenama = jComboBoxRule6a4.getSelectedItem().toString();
        String ruleenamb = jComboBoxRule6b4.getSelectedItem().toString();
        String ruleenamc = jComboBoxRule6c4.getSelectedItem().toString();
        String ruletujuha = jComboBoxRule7a4.getSelectedItem().toString();
        String ruletujuhb = jComboBoxRule7b4.getSelectedItem().toString();
        String ruletujuhc = jComboBoxRule7c4.getSelectedItem().toString();
        String ruledelapana = jComboBoxRule8a4.getSelectedItem().toString();
        String ruledelapanb = jComboBoxRule8b4.getSelectedItem().toString();
        String ruledelapanc = jComboBoxRule8c4.getSelectedItem().toString();
        String rulesembilana = jComboBoxRule9a4.getSelectedItem().toString();
        String rulesembilanb = jComboBoxRule9b4.getSelectedItem().toString();
        String rulesembilanc = jComboBoxRule9c4.getSelectedItem().toString();
        String rulesepuluha = jComboBoxRule10a4.getSelectedItem().toString();
        String rulesepuluhb = jComboBoxRule10b4.getSelectedItem().toString();
        String rulesepuluhc = jComboBoxRule10c4.getSelectedItem().toString();
        String rulesebelasa = jComboBoxRule11a4.getSelectedItem().toString();
        String rulesebelasb = jComboBoxRule11b4.getSelectedItem().toString();
        String rulesebelasc = jComboBoxRule11c4.getSelectedItem().toString();
        String ruleduabelasa = jComboBoxRule12a4.getSelectedItem().toString();
        String ruleduabelasb = jComboBoxRule12b4.getSelectedItem().toString();
        String ruleduabelasc = jComboBoxRule12c4.getSelectedItem().toString();
        String ruletigabelasa = jComboBoxRule13a4.getSelectedItem().toString();
        String ruletigabelasb = jComboBoxRule13b4.getSelectedItem().toString();
        String ruletigabelasc = jComboBoxRule13c4.getSelectedItem().toString();
        String ruleempatbelasa = jComboBoxRule14a4.getSelectedItem().toString();
        String ruleempatbelasb = jComboBoxRule14b4.getSelectedItem().toString();
        String ruleempatbelasc = jComboBoxRule14c4.getSelectedItem().toString();
        String rulelimabelasa = jComboBoxRule15a4.getSelectedItem().toString();
        String rulelimabelasb = jComboBoxRule15b4.getSelectedItem().toString();
        String rulelimabelasc = jComboBoxRule15c4.getSelectedItem().toString();
        String ruleenambelasa = jComboBoxRule16a4.getSelectedItem().toString();
        String ruleenambelasb = jComboBoxRule16b4.getSelectedItem().toString();
        String ruleenambelasc = jComboBoxRule16c4.getSelectedItem().toString();
        String ruletujuhbelasa = jComboBoxRule17a4.getSelectedItem().toString();
        String ruletujuhbelasb = jComboBoxRule17b4.getSelectedItem().toString();
        String ruletujuhbelasc = jComboBoxRule17c4.getSelectedItem().toString();
        String ruledelapanbelasa = jComboBoxRule18a4.getSelectedItem().toString();
        String ruledelapanbelasb = jComboBoxRule18b4.getSelectedItem().toString();
        String ruledelapanbelasc = jComboBoxRule18c4.getSelectedItem().toString();
        
        if(rulesatua == "-"){
            getdatarule.setRule1A1(" ");
            getdatarule.setRule1A2(" ");
            getdatarule.setRule1a3(" ");
        
        }else{
            String[] temp1a;
            String delimiter = " ";

            temp1a = rulesatua.split(delimiter);
            getdatarule.setRule1A1(temp1a[0].toString());
            getdatarule.setRule1A2(temp1a[1].toString());
            getdatarule.setRule1a3(temp1a[2].toString());
        }
        if(rulesatub == "-"){
            getdatarule.setRule1B1(" ");
            getdatarule.setRule1B2(" ");
            getdatarule.setRule1B3(" ");
        
        }else{
            String[] temp1b;
            String delimiter = " ";

            temp1b = rulesatub.split(delimiter);
            getdatarule.setRule1B1(temp1b[0].toString());
            getdatarule.setRule1B2(temp1b[1].toString());
            getdatarule.setRule1B3(temp1b[2].toString());
        }
        
        if(rulesatuc == "-"){
            getdatarule.setRule1C1(" ");
            getdatarule.setRule1C2(" ");
            getdatarule.setRule1C3(" ");
        
        }else{
            String[] temp1c;
            String delimiter = " ";

            temp1c = rulesatuc.split(delimiter);
            getdatarule.setRule1C1(temp1c[0].toString());
            getdatarule.setRule1C2(temp1c[1].toString());
            getdatarule.setRule1C3(temp1c[2].toString());
        }
        
        if(ruleduaa == "-"){
            getdatarule.setRule2A1(" ");
            getdatarule.setRule2A2(" ");
            getdatarule.setRule2a3(" ");
        
        }else{
            String[] temp2a;
            String delimiter = " ";

            temp2a = ruleduaa.split(delimiter);
            getdatarule.setRule2A1(temp2a[0].toString());
            getdatarule.setRule2A2(temp2a[1].toString());
            getdatarule.setRule2a3(temp2a[2].toString());
        }
        
        if(ruleduab == "-"){
            getdatarule.setRule2B1(" ");
            getdatarule.setRule2B2(" ");
            getdatarule.setRule2B3(" ");
        
        }else{
            String[] temp2b;
            String delimiter = " ";

            temp2b = ruleduab.split(delimiter);
            getdatarule.setRule2B1(temp2b[0].toString());
            getdatarule.setRule2B2(temp2b[1].toString());
            getdatarule.setRule2B3(temp2b[2].toString());
        }
        
        if(ruleduac == "-"){
            getdatarule.setRule2C1(" ");
            getdatarule.setRule2C2(" ");
            getdatarule.setRule2C3(" ");
        
        }else{
            String[] temp2c;
            String delimiter = " ";

            temp2c = ruleduac.split(delimiter);
            getdatarule.setRule2C1(temp2c[0].toString());
            getdatarule.setRule2C2(temp2c[1].toString());
            getdatarule.setRule2C3(temp2c[2].toString());
        }
        
        if(ruletigaa == "-"){
            getdatarule.setRule3A1(" ");
            getdatarule.setRule3A2(" ");
            getdatarule.setRule3a3(" ");
        
        }else{
            String[] temp3a;
            String delimiter = " ";

            temp3a = ruletigaa.split(delimiter);
            getdatarule.setRule3A1(temp3a[0].toString());
            getdatarule.setRule3A2(temp3a[1].toString());
            getdatarule.setRule3a3(temp3a[2].toString());
        }
        
        if(ruletigab == "-"){
            getdatarule.setRule3B1(" ");
            getdatarule.setRule3B2(" ");
            getdatarule.setRule3B3(" ");
        
        }else{
            String[] temp3b;
            String delimiter = " ";

            temp3b = ruletigab.split(delimiter);
            getdatarule.setRule3B1(temp3b[0].toString());
            getdatarule.setRule3B2(temp3b[1].toString());
            getdatarule.setRule3B3(temp3b[2].toString());
        }
        
        if(ruletigac == "-"){
            getdatarule.setRule3C1(" ");
            getdatarule.setRule3C2(" ");
            getdatarule.setRule3C3(" ");
        
        }else{
            String[] temp3c;
            String delimiter = " ";

            temp3c = ruletigac.split(delimiter);
            getdatarule.setRule3C1(temp3c[0].toString());
            getdatarule.setRule3C2(temp3c[1].toString());
            getdatarule.setRule3C3(temp3c[2].toString());
        }
        
        if(ruleempata == "-"){
            getdatarule.setRule4A1(" ");
            getdatarule.setRule4A2(" ");
            getdatarule.setRule4a3(" ");
        
        }else{
            String[] temp4a;
            String delimiter = " ";

            temp4a = ruleempata.split(delimiter);
            getdatarule.setRule4A1(temp4a[0].toString());
            getdatarule.setRule4A2(temp4a[1].toString());
            getdatarule.setRule4a3(temp4a[2].toString());
        }
        
         if(ruleempatb == "-"){
            getdatarule.setRule4B1(" ");
            getdatarule.setRule4B2(" ");
            getdatarule.setRule4B3(" ");
        
        }else{
            String[] temp4b;
            String delimiter = " ";

            temp4b = ruleempatb.split(delimiter);
            getdatarule.setRule4B1(temp4b[0].toString());
            getdatarule.setRule4B2(temp4b[1].toString());
            getdatarule.setRule4B3(temp4b[2].toString());
        }
         
        if(ruleempatc == "-"){
            getdatarule.setRule4C1(" ");
            getdatarule.setRule4C2(" ");
            getdatarule.setRule4C3(" ");
        
        }else{
            String[] temp4c;
            String delimiter = " ";

            temp4c = ruleempatc.split(delimiter);
            getdatarule.setRule4C1(temp4c[0].toString());
            getdatarule.setRule4C2(temp4c[1].toString());
            getdatarule.setRule4C3(temp4c[2].toString());
        }
        
        if(rulelimaa == "-"){
            getdatarule.setRule5A1(" ");
            getdatarule.setRule5A2(" ");
            getdatarule.setRule5a3(" ");
        
        }else{
            String[] temp5a;
            String delimiter = " ";

            temp5a = rulelimaa.split(delimiter);
            getdatarule.setRule5A1(temp5a[0].toString());
            getdatarule.setRule5A2(temp5a[1].toString());
            getdatarule.setRule5a3(temp5a[2].toString());
        }
        
        if(rulelimab == "-"){
            getdatarule.setRule5B1(" ");
            getdatarule.setRule5B2(" ");
            getdatarule.setRule5B3(" ");
        
        }else{
            String[] temp5b;
            String delimiter = " ";

            temp5b = rulelimab.split(delimiter);
            getdatarule.setRule5B1(temp5b[0].toString());
            getdatarule.setRule5B2(temp5b[1].toString());
            getdatarule.setRule5B3(temp5b[2].toString());
        }
        
        if(rulelimac == "-"){
            getdatarule.setRule5C1(" ");
            getdatarule.setRule5C2(" ");
            getdatarule.setRule5C3(" ");
        
        }else{
            String[] temp5c;
            String delimiter = " ";

            temp5c = rulelimac.split(delimiter);
            getdatarule.setRule5C1(temp5c[0].toString());
            getdatarule.setRule5C2(temp5c[1].toString());
            getdatarule.setRule5C3(temp5c[2].toString());
        }
        
        if(ruleenama == "-"){
            getdatarule.setRule6A1(" ");
            getdatarule.setRule6A2(" ");
            getdatarule.setRule6a3(" ");
        
        }else{
            String[] temp6a;
            String delimiter = " ";

            temp6a = ruleenama.split(delimiter);
            getdatarule.setRule6A1(temp6a[0].toString());
            getdatarule.setRule6A2(temp6a[1].toString());
            getdatarule.setRule6a3(temp6a[2].toString());
        }
        
        if(ruleenamb == "-"){
            getdatarule.setRule6B1(" ");
            getdatarule.setRule6B2(" ");
            getdatarule.setRule6B3(" ");
        
        }else{
            String[] temp6b;
            String delimiter = " ";

            temp6b = ruleenamb.split(delimiter);
            getdatarule.setRule6B1(temp6b[0].toString());
            getdatarule.setRule6B2(temp6b[1].toString());
            getdatarule.setRule6B3(temp6b[2].toString());
        }
        
        if(ruleenamc == "-"){
            getdatarule.setRule6C1(" ");
            getdatarule.setRule6C2(" ");
            getdatarule.setRule6C3(" ");
        
        }else{
            String[] temp6c;
            String delimiter = " ";

            temp6c = ruleenamc.split(delimiter);
            getdatarule.setRule6C1(temp6c[0].toString());
            getdatarule.setRule6C2(temp6c[1].toString());
            getdatarule.setRule6C3(temp6c[2].toString());
        }
        
        if(ruletujuha == "-"){
            getdatarule.setRule7A1(" ");
            getdatarule.setRule7A2(" ");
            getdatarule.setRule7a3(" ");
        
        }else{
            String[] temp7a;
            String delimiter = " ";

            temp7a = ruletujuha.split(delimiter);
            getdatarule.setRule7A1(temp7a[0].toString());
            getdatarule.setRule7A2(temp7a[1].toString());
            getdatarule.setRule7a3(temp7a[2].toString());
        }
        
        if(ruletujuhb == "-"){
            getdatarule.setRule7B1(" ");
            getdatarule.setRule7B2(" ");
            getdatarule.setRule7B3(" ");
        
        }else{
            String[] temp7b;
            String delimiter = " ";

            temp7b = ruletujuhb.split(delimiter);
            getdatarule.setRule7B1(temp7b[0].toString());
            getdatarule.setRule7B2(temp7b[1].toString());
            getdatarule.setRule7B3(temp7b[2].toString());
        }
        
        if(ruletujuhc == "-"){
            getdatarule.setRule7C1(" ");
            getdatarule.setRule7C2(" ");
            getdatarule.setRule7C3(" ");
        
        }else{
            String[] temp7c;
            String delimiter = " ";

            temp7c = ruletujuhc.split(delimiter);
            getdatarule.setRule7C1(temp7c[0].toString());
            getdatarule.setRule7C2(temp7c[1].toString());
            getdatarule.setRule7C3(temp7c[2].toString());
        }
        
        if(ruledelapana == "-"){
            getdatarule.setRule8A1(" ");
            getdatarule.setRule8A2(" ");
            getdatarule.setRule8a3(" ");
        
        }else{
            String[] temp8a;
            String delimiter = " ";

            temp8a = ruledelapana.split(delimiter);
            getdatarule.setRule8A1(temp8a[0].toString());
            getdatarule.setRule8A2(temp8a[1].toString());
            getdatarule.setRule8a3(temp8a[2].toString());
        }
        
        if(ruledelapanb == "-"){
            getdatarule.setRule8B1(" ");
            getdatarule.setRule8B2(" ");
            getdatarule.setRule8B3(" ");
        
        }else{
            String[] temp8b;
            String delimiter = " ";

            temp8b = ruledelapanb.split(delimiter);
            getdatarule.setRule8B1(temp8b[0].toString());
            getdatarule.setRule8B2(temp8b[1].toString());
            getdatarule.setRule8B3(temp8b[2].toString());
        }
        
        if(ruledelapanc == "-"){
            getdatarule.setRule8C1(" ");
            getdatarule.setRule8C2(" ");
            getdatarule.setRule8C3(" ");
        
        }else{
            String[] temp8c;
            String delimiter = " ";

            temp8c = ruledelapanc.split(delimiter);
            getdatarule.setRule8C1(temp8c[0].toString());
            getdatarule.setRule8C2(temp8c[1].toString());
            getdatarule.setRule8C3(temp8c[2].toString());
        }
        
        if(rulesembilana == "-"){
            getdatarule.setRule9A1(" ");
            getdatarule.setRule9A2(" ");
            getdatarule.setRule9a3(" ");
        
        }else{
            String[] temp9a;
            String delimiter = " ";

            temp9a = rulesembilana.split(delimiter);
            getdatarule.setRule9A1(temp9a[0].toString());
            getdatarule.setRule9A2(temp9a[1].toString());
            getdatarule.setRule9a3(temp9a[2].toString());
        }
        
        if(rulesembilanb == "-"){
            getdatarule.setRule9B1(" ");
            getdatarule.setRule9B2(" ");
            getdatarule.setRule9B3(" ");
        
        }else{
            String[] temp9b;
            String delimiter = " ";

            temp9b = rulesembilanb.split(delimiter);
            getdatarule.setRule9B1(temp9b[0].toString());
            getdatarule.setRule9B2(temp9b[1].toString());
            getdatarule.setRule9B3(temp9b[2].toString());
        }
        
        if(rulesembilanc == "-"){
            getdatarule.setRule9C1(" ");
            getdatarule.setRule9C2(" ");
            getdatarule.setRule9C3(" ");
        
        }else{
            String[] temp9c;
            String delimiter = " ";

            temp9c = rulesembilanc.split(delimiter);
            getdatarule.setRule9C1(temp9c[0].toString());
            getdatarule.setRule9C2(temp9c[1].toString());
            getdatarule.setRule9C3(temp9c[2].toString());
        }
        
        if(rulesepuluha == "-"){
            getdatarule.setRule10A1(" ");
            getdatarule.setRule10A2(" ");
            getdatarule.setRule10a3(" ");
        
        }else{
            String[] temp10a;
            String delimiter = " ";

            temp10a = rulesepuluha.split(delimiter);
            getdatarule.setRule10A1(temp10a[0].toString());
            getdatarule.setRule10A2(temp10a[1].toString());
            getdatarule.setRule10a3(temp10a[2].toString());
        }
        
        if(rulesepuluhb == "-"){
            getdatarule.setRule10B1(" ");
            getdatarule.setRule10B2(" ");
            getdatarule.setRule10B3(" ");
        
        }else{
            String[] temp10b;
            String delimiter = " ";

            temp10b = rulesepuluhb.split(delimiter);
            getdatarule.setRule10B1(temp10b[0].toString());
            getdatarule.setRule10B2(temp10b[1].toString());
            getdatarule.setRule10B3(temp10b[2].toString());
        }
        
        if(rulesepuluhc == "-"){
            getdatarule.setRule10C1(" ");
            getdatarule.setRule10C2(" ");
            getdatarule.setRule10C3(" ");
        
        }else{
            String[] temp10c;
            String delimiter = " ";

            temp10c = rulesepuluhc.split(delimiter);
            getdatarule.setRule10A1(temp10c[0].toString());
            getdatarule.setRule10A2(temp10c[1].toString());
            getdatarule.setRule10a3(temp10c[2].toString());
        }
        
        if(rulesebelasa == "-"){
            getdatarule.setRule11A1(" ");
            getdatarule.setRule11A2(" ");
            getdatarule.setRule11a3(" ");
        
        }else{
            String[] temp11a;
            String delimiter = " ";

            temp11a = rulesebelasa.split(delimiter);
            getdatarule.setRule11A1(temp11a[0].toString());
            getdatarule.setRule11A2(temp11a[1].toString());
            getdatarule.setRule11a3(temp11a[2].toString());
        }
        
        if(rulesebelasb == "-"){
            getdatarule.setRule11B1(" ");
            getdatarule.setRule11B2(" ");
            getdatarule.setRule11B3(" ");
        
        }else{
            String[] temp11b;
            String delimiter = " ";

            temp11b = rulesebelasb.split(delimiter);
            getdatarule.setRule11B1(temp11b[0].toString());
            getdatarule.setRule11B2(temp11b[1].toString());
            getdatarule.setRule11B3(temp11b[2].toString());
        }
        
        if(rulesebelasc == "-"){
            getdatarule.setRule11C1(" ");
            getdatarule.setRule11C2(" ");
            getdatarule.setRule11C3(" ");
        
        }else{
            String[] temp11c;
            String delimiter = " ";

            temp11c = rulesebelasc.split(delimiter);
            getdatarule.setRule11C1(temp11c[0].toString());
            getdatarule.setRule11C2(temp11c[1].toString());
            getdatarule.setRule11C3(temp11c[2].toString());
        }
        
        if(ruleduabelasa == "-"){
            getdatarule.setRule12A1(" ");
            getdatarule.setRule12A2(" ");
            getdatarule.setRule12a3(" ");
        
        }else{
            String[] temp12a;
            String delimiter = " ";

            temp12a = ruleduabelasa.split(delimiter);
            getdatarule.setRule12A1(temp12a[0].toString());
            getdatarule.setRule12A2(temp12a[1].toString());
            getdatarule.setRule12a3(temp12a[2].toString());
        }
        
        if(ruleduabelasb == "-"){
            getdatarule.setRule12B1(" ");
            getdatarule.setRule12B2(" ");
            getdatarule.setRule12B3(" ");
        
        }else{
            String[] temp12b;
            String delimiter = " ";

            temp12b = ruleduabelasb.split(delimiter);
            getdatarule.setRule12B1(temp12b[0].toString());
            getdatarule.setRule12B2(temp12b[1].toString());
            getdatarule.setRule12B3(temp12b[2].toString());
        }
        
        if(ruleduabelasc == "-"){
            getdatarule.setRule12C1(" ");
            getdatarule.setRule12C2(" ");
            getdatarule.setRule12C3(" ");
        
        }else{
            String[] temp12c;
            String delimiter = " ";

            temp12c = ruleduabelasc.split(delimiter);
            getdatarule.setRule12C1(temp12c[0].toString());
            getdatarule.setRule12C2(temp12c[1].toString());
            getdatarule.setRule12C3(temp12c[2].toString());
        }
        
        if(ruletigabelasa == "-"){
            getdatarule.setRule13A1(" ");
            getdatarule.setRule13A2(" ");
            getdatarule.setRule13a3(" ");
        
        }else{
            String[] temp13a;
            String delimiter = " ";

            temp13a = ruletigabelasa.split(delimiter);
            getdatarule.setRule13A1(temp13a[0].toString());
            getdatarule.setRule13A2(temp13a[1].toString());
            getdatarule.setRule13a3(temp13a[2].toString());
        }
        
        if(ruletigabelasb == "-"){
            getdatarule.setRule13B1(" ");
            getdatarule.setRule13B2(" ");
            getdatarule.setRule13B3(" ");
        
        }else{
            String[] temp13b;
            String delimiter = " ";

            temp13b = ruletigabelasb.split(delimiter);
            getdatarule.setRule13B1(temp13b[0].toString());
            getdatarule.setRule13B2(temp13b[1].toString());
            getdatarule.setRule13B3(temp13b[2].toString());
        }
        
        if(ruletigabelasc == "-"){
            getdatarule.setRule13C1(" ");
            getdatarule.setRule13C2(" ");
            getdatarule.setRule13C3(" ");
        
        }else{
            String[] temp13c;
            String delimiter = " ";

            temp13c = ruletigabelasc.split(delimiter);
            getdatarule.setRule13C1(temp13c[0].toString());
            getdatarule.setRule13C2(temp13c[1].toString());
            getdatarule.setRule13C3(temp13c[2].toString());
        }
        
        if(ruleempatbelasa == "-"){
            getdatarule.setRule14A1(" ");
            getdatarule.setRule14A2(" ");
            getdatarule.setRule14a3(" ");
        
        }else{
            String[] temp14a;
            String delimiter = " ";

            temp14a = ruleempatbelasa.split(delimiter);
            getdatarule.setRule14A1(temp14a[0].toString());
            getdatarule.setRule14A2(temp14a[1].toString());
            getdatarule.setRule14a3(temp14a[2].toString());
        }
        
        if(ruleempatbelasb == "-"){
            getdatarule.setRule14B1(" ");
            getdatarule.setRule14B2(" ");
            getdatarule.setRule14B3(" ");
        
        }else{
            String[] temp14b;
            String delimiter = " ";

            temp14b = ruleempatbelasb.split(delimiter);
            getdatarule.setRule14B1(temp14b[0].toString());
            getdatarule.setRule14B2(temp14b[1].toString());
            getdatarule.setRule14B3(temp14b[2].toString());
        }
        
        if(ruleempatbelasc == "-"){
            getdatarule.setRule14C1(" ");
            getdatarule.setRule14C2(" ");
            getdatarule.setRule14C3(" ");
        
        }else{
            String[] temp14c;
            String delimiter = " ";

            temp14c = ruleempatbelasc.split(delimiter);
            getdatarule.setRule14C1(temp14c[0].toString());
            getdatarule.setRule14C2(temp14c[1].toString());
            getdatarule.setRule14C3(temp14c[2].toString());
        }
        
        if(rulelimabelasa == "-"){
            getdatarule.setRule15A1(" ");
            getdatarule.setRule15A2(" ");
            getdatarule.setRule15a3(" ");
        
        }else{
            String[] temp15a;
            String delimiter = " ";

            temp15a = rulelimabelasa.split(delimiter);
            getdatarule.setRule15A1(temp15a[0].toString());
            getdatarule.setRule15A2(temp15a[1].toString());
            getdatarule.setRule15a3(temp15a[2].toString());
        }
        
        if(rulelimabelasb == "-"){
            getdatarule.setRule15B1(" ");
            getdatarule.setRule15B2(" ");
            getdatarule.setRule15B3(" ");
        
        }else{
            String[] temp15b;
            String delimiter = " ";

            temp15b = rulelimabelasb.split(delimiter);
            getdatarule.setRule15B1(temp15b[0].toString());
            getdatarule.setRule15B2(temp15b[1].toString());
            getdatarule.setRule15B3(temp15b[2].toString());
        }
        
        if(rulelimabelasc == "-"){
            getdatarule.setRule15C1(" ");
            getdatarule.setRule15C2(" ");
            getdatarule.setRule15C3(" ");
        
        }else{
            String[] temp15c;
            String delimiter = " ";

            temp15c = rulelimabelasc.split(delimiter);
            getdatarule.setRule15C1(temp15c[0].toString());
            getdatarule.setRule15C2(temp15c[1].toString());
            getdatarule.setRule15C3(temp15c[2].toString());
        }
        
        if(ruleenambelasa == "-"){
            getdatarule.setRule16A1(" ");
            getdatarule.setRule16A2(" ");
            getdatarule.setRule16a3(" ");
        
        }else{
            String[] temp16a;
            String delimiter = " ";

            temp16a = ruleenambelasa.split(delimiter);
            getdatarule.setRule16A1(temp16a[0].toString());
            getdatarule.setRule16A2(temp16a[1].toString());
            getdatarule.setRule16a3(temp16a[2].toString());
        }
        
        if(ruleenambelasb == "-"){
            getdatarule.setRule16B1(" ");
            getdatarule.setRule16B2(" ");
            getdatarule.setRule16B3(" ");
        
        }else{
            String[] temp16b;
            String delimiter = " ";

            temp16b = ruleenambelasb.split(delimiter);
            getdatarule.setRule16B1(temp16b[0].toString());
            getdatarule.setRule16B2(temp16b[1].toString());
            getdatarule.setRule16B3(temp16b[2].toString());
        }
        
        if(ruleenambelasc == "-"){
            getdatarule.setRule16C1(" ");
            getdatarule.setRule16C2(" ");
            getdatarule.setRule16C3(" ");
        
        }else{
            String[] temp16c;
            String delimiter = " ";

            temp16c = ruleenambelasc.split(delimiter);
            getdatarule.setRule16C1(temp16c[0].toString());
            getdatarule.setRule16C2(temp16c[1].toString());
            getdatarule.setRule16C3(temp16c[2].toString());
        }
        
        if(ruletujuhbelasa == "-"){
            getdatarule.setRule17A1(" ");
            getdatarule.setRule17A2(" ");
            getdatarule.setRule17a3(" ");
        
        }else{
            String[] temp17a;
            String delimiter = " ";

            temp17a = ruletujuhbelasa.split(delimiter);
            getdatarule.setRule17A1(temp17a[0].toString());
            getdatarule.setRule17A2(temp17a[1].toString());
            getdatarule.setRule17a3(temp17a[2].toString());
        }
        
        if(ruletujuhbelasb == "-"){
            getdatarule.setRule17B1(" ");
            getdatarule.setRule17B2(" ");
            getdatarule.setRule17B3(" ");
        
        }else{
            String[] temp17b;
            String delimiter = " ";

            temp17b = ruletujuhbelasb.split(delimiter);
            getdatarule.setRule17B1(temp17b[0].toString());
            getdatarule.setRule17B2(temp17b[1].toString());
            getdatarule.setRule17B3(temp17b[2].toString());
        }
        
         if(ruletujuhbelasc == "-"){
            getdatarule.setRule17C1(" ");
            getdatarule.setRule17C2(" ");
            getdatarule.setRule17C3(" ");
        
        }else{
            String[] temp17c;
            String delimiter = " ";

            temp17c = ruletujuhbelasc.split(delimiter);
            getdatarule.setRule17C1(temp17c[0].toString());
            getdatarule.setRule17C2(temp17c[1].toString());
            getdatarule.setRule17C3(temp17c[2].toString());
        }
        
         if(ruledelapanbelasa == "-"){
            getdatarule.setRule18A1(" ");
            getdatarule.setRule18A2(" ");
            getdatarule.setRule18a3(" ");
        
        }else{
            String[] temp18a;
            String delimiter = " ";

            temp18a = ruledelapanbelasa.split(delimiter);
            getdatarule.setRule18A1(temp18a[0].toString());
            getdatarule.setRule18A2(temp18a[1].toString());
            getdatarule.setRule18a3(temp18a[2].toString());
        }
         
         if(ruledelapanbelasb == "-"){
            getdatarule.setRule18B1(" ");
            getdatarule.setRule18B2(" ");
            getdatarule.setRule18B3(" ");
        
        }else{
            String[] temp18b;
            String delimiter = " ";

            temp18b = ruledelapanbelasb.split(delimiter);
            getdatarule.setRule18B1(temp18b[0].toString());
            getdatarule.setRule18B2(temp18b[1].toString());
            getdatarule.setRule18B3(temp18b[2].toString());
        }
         
         if(ruledelapanbelasc == "-"){
            getdatarule.setRule18C1(" ");
            getdatarule.setRule18C2(" ");
            getdatarule.setRule18C3(" ");
        
        }else{
            String[] temp18c;
            String delimiter = " ";

            temp18c = ruledelapanbelasc.split(delimiter);
            getdatarule.setRule18C1(temp18c[0].toString());
            getdatarule.setRule18C2(temp18c[1].toString());
            getdatarule.setRule18C3(temp18c[2].toString());
        }
        
    }
    //CorreferenceResolution cr = new CorreferenceResolution();
    //example ex = new example();
    //Stop st = new Stop();
    //Lemmatization lema = new Lemmatization();
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jTabbedPane1 = new javax.swing.JTabbedPane();
        jPanel2 = new javax.swing.JPanel();
        jPanel4 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        ComboDataset = new javax.swing.JComboBox<>();
        jButton1 = new javax.swing.JButton();
        jPanel5 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        AreaDataset = new javax.swing.JTextArea();
        jPanel3 = new javax.swing.JPanel();
        jPanel7 = new javax.swing.JPanel();
        CheckSW = new javax.swing.JCheckBox();
        CheckLemma = new javax.swing.JCheckBox();
        CheckPT = new javax.swing.JCheckBox();
        CheckBC = new javax.swing.JCheckBox();
        CheckCR = new javax.swing.JCheckBox();
        ButtonPreprocessing = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jPanel8 = new javax.swing.JPanel();
        jScrollPane2 = new javax.swing.JScrollPane();
        AreaSW = new javax.swing.JTextArea();
        jPanel6 = new javax.swing.JPanel();
        jPanel10 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        CheckRule = new javax.swing.JCheckBox();
        jCheckBoxTypeDepedency = new javax.swing.JCheckBox();
        jCheckBoxNpParser = new javax.swing.JCheckBox();
        jLabel3 = new javax.swing.JLabel();
        jCheckBox4 = new javax.swing.JCheckBox();
        jButton3 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        jScrollPane3 = new javax.swing.JScrollPane();
        AreaExtraksi = new javax.swing.JTextArea();
        jTabbedPane3 = new javax.swing.JTabbedPane();
        jPanel14 = new javax.swing.JPanel();
        jScrollPane5 = new javax.swing.JScrollPane();
        jPanel20 = new javax.swing.JPanel();
        jComboBoxRule1a4 = new javax.swing.JComboBox<>();
        jComboBoxRule1b4 = new javax.swing.JComboBox<>();
        jLabel77 = new javax.swing.JLabel();
        jLabel78 = new javax.swing.JLabel();
        jComboBoxRule2a4 = new javax.swing.JComboBox<>();
        jComboBoxRule2b4 = new javax.swing.JComboBox<>();
        jLabel79 = new javax.swing.JLabel();
        jComboBoxRule3a4 = new javax.swing.JComboBox<>();
        jComboBoxRule3b4 = new javax.swing.JComboBox<>();
        jLabel80 = new javax.swing.JLabel();
        jComboBoxRule4a4 = new javax.swing.JComboBox<>();
        jComboBoxRule4b4 = new javax.swing.JComboBox<>();
        jLabel81 = new javax.swing.JLabel();
        jLabel82 = new javax.swing.JLabel();
        jComboBoxRule6a4 = new javax.swing.JComboBox<>();
        jComboBoxRule6b4 = new javax.swing.JComboBox<>();
        jLabel83 = new javax.swing.JLabel();
        jComboBoxRule7a4 = new javax.swing.JComboBox<>();
        jComboBoxRule7b4 = new javax.swing.JComboBox<>();
        jComboBoxRule1C4 = new javax.swing.JComboBox<>();
        jComboBoxRule2c4 = new javax.swing.JComboBox<>();
        jComboBoxRule3c4 = new javax.swing.JComboBox<>();
        jComboBoxRule4c4 = new javax.swing.JComboBox<>();
        jComboBoxRule5a4 = new javax.swing.JComboBox<>();
        jComboBoxRule6c4 = new javax.swing.JComboBox<>();
        jComboBoxRule7c4 = new javax.swing.JComboBox<>();
        jComboBoxRule5b4 = new javax.swing.JComboBox<>();
        jComboBoxRule5c4 = new javax.swing.JComboBox<>();
        jLabel84 = new javax.swing.JLabel();
        jComboBoxRule8a4 = new javax.swing.JComboBox<>();
        jComboBoxRule8b4 = new javax.swing.JComboBox<>();
        jComboBoxRule8c4 = new javax.swing.JComboBox<>();
        jLabel85 = new javax.swing.JLabel();
        jComboBoxRule9a4 = new javax.swing.JComboBox<>();
        jComboBoxRule9b4 = new javax.swing.JComboBox<>();
        jComboBoxRule9c4 = new javax.swing.JComboBox<>();
        jLabel86 = new javax.swing.JLabel();
        jComboBoxRule10a4 = new javax.swing.JComboBox<>();
        jComboBoxRule10b4 = new javax.swing.JComboBox<>();
        jComboBoxRule10c4 = new javax.swing.JComboBox<>();
        jLabel87 = new javax.swing.JLabel();
        jComboBoxRule11a4 = new javax.swing.JComboBox<>();
        jComboBoxRule11b4 = new javax.swing.JComboBox<>();
        jComboBoxRule11c4 = new javax.swing.JComboBox<>();
        jLabel88 = new javax.swing.JLabel();
        jComboBoxRule12a4 = new javax.swing.JComboBox<>();
        jComboBoxRule12b4 = new javax.swing.JComboBox<>();
        jComboBoxRule12c4 = new javax.swing.JComboBox<>();
        jLabel89 = new javax.swing.JLabel();
        jComboBoxRule13a4 = new javax.swing.JComboBox<>();
        jComboBoxRule13b4 = new javax.swing.JComboBox<>();
        jComboBoxRule13c4 = new javax.swing.JComboBox<>();
        jLabel90 = new javax.swing.JLabel();
        jComboBoxRule14a4 = new javax.swing.JComboBox<>();
        jComboBoxRule14b4 = new javax.swing.JComboBox<>();
        jComboBoxRule14c4 = new javax.swing.JComboBox<>();
        jLabel91 = new javax.swing.JLabel();
        jComboBoxRule15a4 = new javax.swing.JComboBox<>();
        jComboBoxRule15b4 = new javax.swing.JComboBox<>();
        jComboBoxRule15c4 = new javax.swing.JComboBox<>();
        jLabel92 = new javax.swing.JLabel();
        jComboBoxRule16a4 = new javax.swing.JComboBox<>();
        jComboBoxRule16b4 = new javax.swing.JComboBox<>();
        jComboBoxRule16c4 = new javax.swing.JComboBox<>();
        jLabel93 = new javax.swing.JLabel();
        jComboBoxRule17a4 = new javax.swing.JComboBox<>();
        jComboBoxRule17b4 = new javax.swing.JComboBox<>();
        jComboBoxRule17c4 = new javax.swing.JComboBox<>();
        jLabel94 = new javax.swing.JLabel();
        jComboBoxRule18a4 = new javax.swing.JComboBox<>();
        jComboBoxRule18b4 = new javax.swing.JComboBox<>();
        jComboBoxRule18c4 = new javax.swing.JComboBox<>();
        jPanel16 = new javax.swing.JPanel();
        jLabel7 = new javax.swing.JLabel();
        jPanel9 = new javax.swing.JPanel();
        jPanel11 = new javax.swing.JPanel();
        jScrollPane4 = new javax.swing.JScrollPane();
        jTextArea2 = new javax.swing.JTextArea();
        jTabbedPane2 = new javax.swing.JTabbedPane();
        jPanel12 = new javax.swing.JPanel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));

        jPanel4.setBackground(new java.awt.Color(255, 255, 255));
        jPanel4.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "DATASET", javax.swing.border.TitledBorder.CENTER, javax.swing.border.TitledBorder.TOP, new java.awt.Font("Tahoma", 1, 12))); // NOI18N

        jLabel1.setText("File :");

        ComboDataset.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Apex DVD player", "Canon G3", "Zen Mp3 Player", "Nikon coolpix 4300", "Nokia 6610", "Nokia 6600", "Canon PowerShot SD500", "Canon S100", "Diaper Champ", "Hitachi router", "ipod", "Linksys Router", "MicroMP3", "norton", "data" }));
        ComboDataset.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ComboDatasetActionPerformed(evt);
            }
        });

        jButton1.setText("Reset");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addGap(29, 29, 29)
                        .addComponent(jLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(ComboDataset, javax.swing.GroupLayout.PREFERRED_SIZE, 277, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addGap(158, 158, 158)
                        .addComponent(jButton1)))
                .addContainerGap(48, Short.MAX_VALUE))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(ComboDataset, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 16, Short.MAX_VALUE)
                .addComponent(jButton1)
                .addContainerGap())
        );

        jPanel5.setBackground(new java.awt.Color(255, 255, 255));
        jPanel5.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "View Dataset", javax.swing.border.TitledBorder.CENTER, javax.swing.border.TitledBorder.DEFAULT_POSITION));

        AreaDataset.setColumns(20);
        AreaDataset.setRows(5);
        jScrollPane1.setViewportView(AreaDataset);

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 797, Short.MAX_VALUE)
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 637, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(96, 96, 96)
                .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(178, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(283, 283, 283))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jPanel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        jTabbedPane1.addTab("Dataset", jPanel2);

        jPanel3.setBackground(new java.awt.Color(255, 255, 255));

        jPanel7.setBackground(new java.awt.Color(255, 255, 255));
        jPanel7.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "PREPROCESSING", javax.swing.border.TitledBorder.CENTER, javax.swing.border.TitledBorder.TOP, new java.awt.Font("Tahoma", 1, 12))); // NOI18N

        CheckSW.setText("Stopwords");
        CheckSW.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CheckSWActionPerformed(evt);
            }
        });

        CheckLemma.setText("Lemmatization");

        CheckPT.setSelected(true);
        CheckPT.setText("POS Tagging");
        CheckPT.setEnabled(false);
        CheckPT.setFocusPainted(false);
        CheckPT.setFocusable(false);
        CheckPT.setRequestFocusEnabled(false);
        CheckPT.setRolloverEnabled(false);
        CheckPT.setVerifyInputWhenFocusTarget(false);
        CheckPT.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CheckPTActionPerformed(evt);
            }
        });

        CheckBC.setText("BIO Chunking");

        CheckCR.setText("Coreference Resolution");

        ButtonPreprocessing.setText("OK");
        ButtonPreprocessing.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ButtonPreprocessingActionPerformed(evt);
            }
        });

        jButton2.setText("Reset");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel7Layout = new javax.swing.GroupLayout(jPanel7);
        jPanel7.setLayout(jPanel7Layout);
        jPanel7Layout.setHorizontalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel7Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(CheckSW)
                .addGap(51, 51, 51)
                .addComponent(CheckLemma)
                .addGap(51, 51, 51)
                .addComponent(CheckPT)
                .addGap(47, 47, 47)
                .addComponent(CheckBC)
                .addGap(34, 34, 34)
                .addComponent(CheckCR)
                .addGap(32, 32, 32)
                .addComponent(ButtonPreprocessing)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jButton2)
                .addContainerGap(16, Short.MAX_VALUE))
        );
        jPanel7Layout.setVerticalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel7Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(CheckSW)
                    .addComponent(CheckLemma)
                    .addComponent(CheckPT)
                    .addComponent(CheckBC)
                    .addComponent(CheckCR)
                    .addComponent(ButtonPreprocessing)
                    .addComponent(jButton2))
                .addGap(40, 40, 40))
        );

        jPanel8.setBackground(new java.awt.Color(255, 255, 255));
        jPanel8.setBorder(javax.swing.BorderFactory.createTitledBorder("Preprocessing"));

        AreaSW.setColumns(20);
        AreaSW.setRows(5);
        jScrollPane2.setViewportView(AreaSW);

        javax.swing.GroupLayout jPanel8Layout = new javax.swing.GroupLayout(jPanel8);
        jPanel8.setLayout(jPanel8Layout);
        jPanel8Layout.setHorizontalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 941, Short.MAX_VALUE)
        );
        jPanel8Layout.setVerticalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel8Layout.createSequentialGroup()
                .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 519, Short.MAX_VALUE)
                .addContainerGap())
        );

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(55, 55, 55)
                        .addComponent(jPanel8, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(100, 100, 100)
                        .addComponent(jPanel7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(75, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(43, 43, 43)
                .addComponent(jPanel7, javax.swing.GroupLayout.PREFERRED_SIZE, 77, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(28, 28, 28)
                .addComponent(jPanel8, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(104, Short.MAX_VALUE))
        );

        jTabbedPane1.addTab("Preprocessing", jPanel3);

        jPanel6.setBackground(new java.awt.Color(255, 255, 255));

        jPanel10.setBackground(new java.awt.Color(255, 255, 255));
        jPanel10.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Extraxtion", javax.swing.border.TitledBorder.CENTER, javax.swing.border.TitledBorder.TOP, new java.awt.Font("Tahoma", 1, 14))); // NOI18N

        jLabel2.setText("Pattern Knowladge");

        CheckRule.setText("Rule");
        CheckRule.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CheckRuleActionPerformed(evt);
            }
        });

        jCheckBoxTypeDepedency.setText("Type Depedency");

        jCheckBoxNpParser.setText("NP Parser");
        jCheckBoxNpParser.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCheckBoxNpParserActionPerformed(evt);
            }
        });

        jLabel3.setText("Taxonomy");

        jCheckBox4.setText("Automatic Taxonomy");

        jButton3.setText("OK");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        jButton4.setText("Clear");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel10Layout = new javax.swing.GroupLayout(jPanel10);
        jPanel10.setLayout(jPanel10Layout);
        jPanel10Layout.setHorizontalGroup(
            jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel10Layout.createSequentialGroup()
                .addGap(62, 62, 62)
                .addGroup(jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel2)
                    .addComponent(CheckRule)
                    .addComponent(jCheckBoxTypeDepedency)
                    .addComponent(jCheckBoxNpParser))
                .addGap(72, 72, 72)
                .addGroup(jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jButton4, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3)
                    .addComponent(jCheckBox4))
                .addContainerGap(131, Short.MAX_VALUE))
        );
        jPanel10Layout.setVerticalGroup(
            jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel10Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(jLabel3))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(CheckRule)
                    .addComponent(jCheckBox4))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jCheckBoxTypeDepedency)
                    .addComponent(jButton3))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jCheckBoxNpParser)
                    .addComponent(jButton4))
                .addContainerGap(15, Short.MAX_VALUE))
        );

        AreaExtraksi.setColumns(20);
        AreaExtraksi.setRows(5);
        jScrollPane3.setViewportView(AreaExtraksi);

        jPanel14.setBackground(new java.awt.Color(255, 255, 255));

        jPanel20.setBackground(new java.awt.Color(255, 255, 255));

        jComboBoxRule1a4.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "-", "_JJ _JJR _JJS", "_NN _NNS _", "_RB _RBR _RBS", "_VBN _VBD _" }));
        jComboBoxRule1a4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBoxRule1a4jComboBoxRule1aActionPerformed(evt);
            }
        });

        jComboBoxRule1b4.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "-", "_JJ _JJR _JJS", "_NN _NNS _", "_RB _RBR _RBS", "_VBN _VBD _" }));
        jComboBoxRule1b4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBoxRule1b4jComboBoxRule1bActionPerformed(evt);
            }
        });

        jLabel77.setText("Rule 1");

        jLabel78.setText("Rule 2");

        jComboBoxRule2a4.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "-", "_JJ _JJR _JJS", "_NN _NNS _", "_RB _RBR _RBS", "_VBN _VBD _" }));
        jComboBoxRule2a4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBoxRule2a4jComboBoxRule2aActionPerformed(evt);
            }
        });

        jComboBoxRule2b4.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "-", "_JJ _JJR _JJS", "_NN _NNS _", "_RB _RBR _RBS", "_VBN _VBD _" }));
        jComboBoxRule2b4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBoxRule2b4jComboBoxRule2bActionPerformed(evt);
            }
        });

        jLabel79.setText("Rule 3");

        jComboBoxRule3a4.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "-", "_JJ _JJR _JJS", "_NN _NNS _", "_RB _RBR _RBS", "_VBN _VBD _" }));
        jComboBoxRule3a4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBoxRule3a4jComboBoxRule3aActionPerformed(evt);
            }
        });

        jComboBoxRule3b4.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "-", "_JJ _JJR _JJS", "_NN _NNS _", "_RB _RBR _RBS", "_VBN _VBD _" }));
        jComboBoxRule3b4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBoxRule3b4jComboBoxRule3bActionPerformed(evt);
            }
        });

        jLabel80.setText("Rule 4");

        jComboBoxRule4a4.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "-", "_JJ _JJR _JJS", "_NN _NNS _", "_RB _RBR _RBS", "_VBN _VBD _" }));
        jComboBoxRule4a4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBoxRule4a4jComboBoxRule4aActionPerformed(evt);
            }
        });

        jComboBoxRule4b4.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "-", "_JJ _JJR _JJS", "_NN _NNS _", "_RB _RBR _RBS", "_VBN _VBD _" }));
        jComboBoxRule4b4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBoxRule4b4jComboBoxRule4bActionPerformed(evt);
            }
        });

        jLabel81.setText("Rule 5");

        jLabel82.setText("Rule 6");

        jComboBoxRule6a4.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "-", "_JJ _JJR _JJS", "_NN _NNS _", "_RB _RBR _RBS", "_VBN _VBD _" }));
        jComboBoxRule6a4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBoxRule6a4jComboBoxRule6aActionPerformed(evt);
            }
        });

        jComboBoxRule6b4.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "-", "_JJ _JJR _JJS", "_NN _NNS _", "_RB _RBR _RBS", "_VBN _VBD _" }));
        jComboBoxRule6b4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBoxRule6b4jComboBoxRule6bActionPerformed(evt);
            }
        });

        jLabel83.setText("Rule 7");

        jComboBoxRule7a4.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "-", "_JJ _JJR _JJS", "_NN _NNS _", "_RB _RBR _RBS", "_VBN _VBD _" }));
        jComboBoxRule7a4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBoxRule7a4jComboBoxRule7aActionPerformed(evt);
            }
        });

        jComboBoxRule7b4.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "-", "_JJ _JJR _JJS", "_NN _NNS _", "_RB _RBR _RBS", "_VBN _VBD _" }));
        jComboBoxRule7b4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBoxRule7b4jComboBoxRule7bActionPerformed(evt);
            }
        });

        jComboBoxRule1C4.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "-", "_JJ _JJR _JJS", "_NN _NNS _", "_RB _RBR _RBS", "_VBN _VBD _" }));
        jComboBoxRule1C4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBoxRule1C4jComboBoxRule1CActionPerformed(evt);
            }
        });

        jComboBoxRule2c4.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "-", "_JJ _JJR _JJS", "_NN _NNS _", "_RB _RBR _RBS", "_VBN _VBD _" }));
        jComboBoxRule2c4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBoxRule2c4jComboBoxRule2cActionPerformed(evt);
            }
        });

        jComboBoxRule3c4.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "-", "_JJ _JJR _JJS", "_NN _NNS _", "_RB _RBR _RBS", "_VBN _VBD _" }));
        jComboBoxRule3c4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBoxRule3c4jComboBoxRule3cActionPerformed(evt);
            }
        });

        jComboBoxRule4c4.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "-", "_JJ _JJR _JJS", "_NN _NNS _", "_RB _RBR _RBS", "_VBN _VBD _" }));
        jComboBoxRule4c4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBoxRule4c4jComboBoxRule4cActionPerformed(evt);
            }
        });

        jComboBoxRule5a4.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "-", "_JJ _JJR _JJS", "_NN _NNS _", "_RB _RBR _RBS", "_VBN _VBD _" }));
        jComboBoxRule5a4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBoxRule5a4jComboBoxRule5aActionPerformed(evt);
            }
        });

        jComboBoxRule6c4.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "-", "_JJ _JJR _JJS", "_NN _NNS _", "_RB _RBR _RBS", "_VBN _VBD _" }));
        jComboBoxRule6c4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBoxRule6c4jComboBoxRule6cActionPerformed(evt);
            }
        });

        jComboBoxRule7c4.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "-", "_JJ _JJR _JJS", "_NN _NNS _", "_RB _RBR _RBS", "_VBN _VBD _" }));
        jComboBoxRule7c4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBoxRule7c4jComboBoxRule7cActionPerformed(evt);
            }
        });

        jComboBoxRule5b4.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "-", "_JJ _JJR _JJS", "_NN _NNS _", "_RB _RBR _RBS", "_VBN _VBD _" }));
        jComboBoxRule5b4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBoxRule5b4jComboBoxRule5bActionPerformed(evt);
            }
        });

        jComboBoxRule5c4.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "-", "_JJ _JJR _JJS", "_NN _NNS _", "_RB _RBR _RBS", "_VBN _VBD _" }));
        jComboBoxRule5c4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBoxRule5c4jComboBoxRule5cActionPerformed(evt);
            }
        });

        jLabel84.setText("Rule 8");

        jComboBoxRule8a4.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "-", "_JJ _JJR _JJS", "_NN _NNS _", "_RB _RBR _RBS", "_VBN _VBD _" }));

        jComboBoxRule8b4.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "-", "_JJ _JJR _JJS", "_NN _NNS _", "_RB _RBR _RBS", "_VBN _VBD _" }));

        jComboBoxRule8c4.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "-", "_JJ _JJR _JJS", "_NN _NNS _", "_RB _RBR _RBS", "_VBN _VBD _" }));

        jLabel85.setText("Rule 9");

        jComboBoxRule9a4.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "-", "_JJ _JJR _JJS", "_NN _NNS _", "_RB _RBR _RBS", "_VBN _VBD _" }));

        jComboBoxRule9b4.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "-", "_JJ _JJR _JJS", "_NN _NNS _", "_RB _RBR _RBS", "_VBN _VBD _" }));

        jComboBoxRule9c4.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "-", "_JJ _JJR _JJS", "_NN _NNS _", "_RB _RBR _RBS", "_VBN _VBD _" }));

        jLabel86.setText("Rule 10");

        jComboBoxRule10a4.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "-", "_JJ _JJR _JJS", "_NN _NNS _", "_RB _RBR _RBS", "_VBN _VBD _" }));

        jComboBoxRule10b4.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "-", "_JJ _JJR _JJS", "_NN _NNS _", "_RB _RBR _RBS", "_VBN _VBD _" }));

        jComboBoxRule10c4.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "-", "_JJ _JJR _JJS", "_NN _NNS _", "_RB _RBR _RBS", "_VBN _VBD _" }));

        jLabel87.setText("Rule 11");

        jComboBoxRule11a4.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "-", "_JJ _JJR _JJS", "_NN _NNS _", "_RB _RBR _RBS", "_VBN _VBD _" }));

        jComboBoxRule11b4.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "-", "_JJ _JJR _JJS", "_NN _NNS _", "_RB _RBR _RBS", "_VBN _VBD _" }));

        jComboBoxRule11c4.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "-", "_JJ _JJR _JJS", "_NN _NNS _", "_RB _RBR _RBS", "_VBN _VBD _" }));

        jLabel88.setText("Rule 12");

        jComboBoxRule12a4.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "-", "_JJ _JJR _JJS", "_NN _NNS _", "_RB _RBR _RBS", "_VBN _VBD _" }));

        jComboBoxRule12b4.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "-", "_JJ _JJR _JJS", "_NN _NNS _", "_RB _RBR _RBS", "_VBN _VBD _" }));

        jComboBoxRule12c4.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "-", "_JJ _JJR _JJS", "_NN _NNS _", "_RB _RBR _RBS", "_VBN _VBD _" }));

        jLabel89.setText("Rule 13");

        jComboBoxRule13a4.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "-", "_JJ _JJR _JJS", "_NN _NNS _", "_RB _RBR _RBS", "_VBN _VBD _" }));

        jComboBoxRule13b4.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "-", "_JJ _JJR _JJS", "_NN _NNS _", "_RB _RBR _RBS", "_VBN _VBD _" }));

        jComboBoxRule13c4.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "-", "_JJ _JJR _JJS", "_NN _NNS _", "_RB _RBR _RBS", "_VBN _VBD _" }));

        jLabel90.setText("Rule 14");

        jComboBoxRule14a4.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "-", "_JJ _JJR _JJS", "_NN _NNS _", "_RB _RBR _RBS", "_VBN _VBD _" }));

        jComboBoxRule14b4.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "-", "_JJ _JJR _JJS", "_NN _NNS _", "_RB _RBR _RBS", "_VBN _VBD _" }));

        jComboBoxRule14c4.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "-", "_JJ _JJR _JJS", "_NN _NNS _", "_RB _RBR _RBS", "_VBN _VBD _" }));

        jLabel91.setText("Rule 15");

        jComboBoxRule15a4.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "-", "_JJ _JJR _JJS", "_NN _NNS _", "_RB _RBR _RBS", "_VBN _VBD _" }));

        jComboBoxRule15b4.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "-", "_JJ _JJR _JJS", "_NN _NNS _", "_RB _RBR _RBS", "_VBN _VBD _" }));

        jComboBoxRule15c4.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "-", "_JJ _JJR _JJS", "_NN _NNS _", "_RB _RBR _RBS", "_VBN _VBD _" }));

        jLabel92.setText("Rule 16");

        jComboBoxRule16a4.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "-", "_JJ _JJR _JJS", "_NN _NNS _", "_RB _RBR _RBS", "_VBN _VBD _" }));

        jComboBoxRule16b4.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "-", "_JJ _JJR _JJS", "_NN _NNS _", "_RB _RBR _RBS", "_VBN _VBD _" }));

        jComboBoxRule16c4.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "-", "_JJ _JJR _JJS", "_NN _NNS _", "_RB _RBR _RBS", "_VBN _VBD _" }));

        jLabel93.setText("Rule 17");

        jComboBoxRule17a4.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "-", "_JJ _JJR _JJS", "_NN _NNS _", "_RB _RBR _RBS", "_VBN _VBD _" }));

        jComboBoxRule17b4.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "-", "_JJ _JJR _JJS", "_NN _NNS _", "_RB _RBR _RBS", "_VBN _VBD _" }));

        jComboBoxRule17c4.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "-", "_JJ _JJR _JJS", "_NN _NNS _", "_RB _RBR _RBS", "_VBN _VBD _" }));

        jLabel94.setText("Rule 18");

        jComboBoxRule18a4.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "-", "_JJ _JJR _JJS", "_NN _NNS _", "_RB _RBR _RBS", "_VBN _VBD _" }));

        jComboBoxRule18b4.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "-", "_JJ _JJR _JJS", "_NN _NNS _", "_RB _RBR _RBS", "_VBN _VBD _" }));

        jComboBoxRule18c4.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "-", "_JJ _JJR _JJS", "_NN _NNS _", "_RB _RBR _RBS", "_VBN _VBD _" }));

        javax.swing.GroupLayout jPanel20Layout = new javax.swing.GroupLayout(jPanel20);
        jPanel20.setLayout(jPanel20Layout);
        jPanel20Layout.setHorizontalGroup(
            jPanel20Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel20Layout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addGroup(jPanel20Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel20Layout.createSequentialGroup()
                        .addComponent(jLabel94)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jComboBoxRule18a4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jComboBoxRule18b4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jComboBoxRule18c4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel20Layout.createSequentialGroup()
                        .addComponent(jLabel93)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jComboBoxRule17a4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jComboBoxRule17b4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jComboBoxRule17c4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel20Layout.createSequentialGroup()
                        .addComponent(jLabel92)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jComboBoxRule16a4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jComboBoxRule16b4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jComboBoxRule16c4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel20Layout.createSequentialGroup()
                        .addComponent(jLabel91)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jComboBoxRule15a4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jComboBoxRule15b4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jComboBoxRule15c4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel20Layout.createSequentialGroup()
                        .addComponent(jLabel87)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jComboBoxRule11a4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jComboBoxRule11b4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jComboBoxRule11c4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel20Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addGroup(jPanel20Layout.createSequentialGroup()
                            .addGroup(jPanel20Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jLabel77)
                                .addComponent(jLabel78)
                                .addComponent(jLabel79)
                                .addComponent(jLabel80)
                                .addComponent(jLabel81, javax.swing.GroupLayout.Alignment.TRAILING)
                                .addComponent(jLabel82))
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                            .addGroup(jPanel20Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addGroup(jPanel20Layout.createSequentialGroup()
                                    .addComponent(jComboBoxRule4a4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(jComboBoxRule4b4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(jComboBoxRule4c4, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addGroup(jPanel20Layout.createSequentialGroup()
                                    .addComponent(jComboBoxRule3a4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(jComboBoxRule3b4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(jComboBoxRule3c4, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel20Layout.createSequentialGroup()
                                    .addGroup(jPanel20Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                        .addComponent(jComboBoxRule2a4, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(jComboBoxRule1a4, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addGroup(jPanel20Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                        .addGroup(jPanel20Layout.createSequentialGroup()
                                            .addComponent(jComboBoxRule1b4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                            .addComponent(jComboBoxRule1C4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGroup(jPanel20Layout.createSequentialGroup()
                                            .addComponent(jComboBoxRule2b4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                            .addComponent(jComboBoxRule2c4, 0, 1, Short.MAX_VALUE))))
                                .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel20Layout.createSequentialGroup()
                                    .addGroup(jPanel20Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                        .addComponent(jComboBoxRule5a4, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(jComboBoxRule6a4, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                    .addGroup(jPanel20Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(jPanel20Layout.createSequentialGroup()
                                            .addGap(5, 5, 5)
                                            .addComponent(jComboBoxRule6b4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                            .addGroup(jPanel20Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                .addComponent(jComboBoxRule7c4, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                .addComponent(jComboBoxRule6c4, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                                        .addGroup(jPanel20Layout.createSequentialGroup()
                                            .addGap(7, 7, 7)
                                            .addComponent(jComboBoxRule5b4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                            .addComponent(jComboBoxRule5c4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addGap(0, 0, Short.MAX_VALUE))))))
                        .addGroup(jPanel20Layout.createSequentialGroup()
                            .addGroup(jPanel20Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addGroup(jPanel20Layout.createSequentialGroup()
                                    .addComponent(jLabel85)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                    .addComponent(jComboBoxRule9a4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(jComboBoxRule9b4, 0, 1, Short.MAX_VALUE))
                                .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel20Layout.createSequentialGroup()
                                    .addGroup(jPanel20Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                        .addGroup(jPanel20Layout.createSequentialGroup()
                                            .addComponent(jLabel84)
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                            .addComponent(jComboBoxRule8a4, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                        .addGroup(jPanel20Layout.createSequentialGroup()
                                            .addComponent(jLabel83)
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                            .addComponent(jComboBoxRule7a4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                    .addGroup(jPanel20Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                        .addGroup(jPanel20Layout.createSequentialGroup()
                                            .addGap(5, 5, 5)
                                            .addComponent(jComboBoxRule7b4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGroup(jPanel20Layout.createSequentialGroup()
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                            .addComponent(jComboBoxRule8b4, 0, 1, Short.MAX_VALUE)))))
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addGroup(jPanel20Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jComboBoxRule8c4, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jComboBoxRule9c4, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                        .addGroup(jPanel20Layout.createSequentialGroup()
                            .addComponent(jLabel86)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(jComboBoxRule10a4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(jComboBoxRule10b4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(jComboBoxRule10c4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel20Layout.createSequentialGroup()
                        .addGroup(jPanel20Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addGroup(jPanel20Layout.createSequentialGroup()
                                .addComponent(jLabel88)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jComboBoxRule12a4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jComboBoxRule12b4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel20Layout.createSequentialGroup()
                                .addGroup(jPanel20Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel89)
                                    .addComponent(jLabel90, javax.swing.GroupLayout.Alignment.TRAILING))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPanel20Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel20Layout.createSequentialGroup()
                                        .addComponent(jComboBoxRule14a4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(jComboBoxRule14b4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(0, 0, Short.MAX_VALUE))
                                    .addGroup(jPanel20Layout.createSequentialGroup()
                                        .addComponent(jComboBoxRule13a4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(jComboBoxRule13b4, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel20Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jComboBoxRule12c4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jComboBoxRule13c4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jComboBoxRule14c4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel20Layout.setVerticalGroup(
            jPanel20Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel20Layout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addGroup(jPanel20Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jComboBoxRule1a4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jComboBoxRule1b4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel77)
                    .addComponent(jComboBoxRule1C4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel20Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel78)
                    .addComponent(jComboBoxRule2a4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jComboBoxRule2b4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jComboBoxRule2c4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel20Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel79)
                    .addComponent(jComboBoxRule3a4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jComboBoxRule3b4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jComboBoxRule3c4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel20Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel80)
                    .addComponent(jComboBoxRule4a4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jComboBoxRule4b4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jComboBoxRule4c4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel20Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel81)
                    .addComponent(jComboBoxRule5a4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jComboBoxRule5b4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jComboBoxRule5c4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(14, 14, 14)
                .addGroup(jPanel20Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel82)
                    .addGroup(jPanel20Layout.createSequentialGroup()
                        .addGroup(jPanel20Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jComboBoxRule6b4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jComboBoxRule6a4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jComboBoxRule6c4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel20Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jComboBoxRule7a4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jComboBoxRule7b4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel83)
                            .addComponent(jComboBoxRule7c4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel20Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel84)
                    .addComponent(jComboBoxRule8a4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jComboBoxRule8b4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jComboBoxRule8c4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel20Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel85)
                    .addComponent(jComboBoxRule9a4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jComboBoxRule9b4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jComboBoxRule9c4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel20Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel86)
                    .addComponent(jComboBoxRule10a4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jComboBoxRule10b4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jComboBoxRule10c4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel20Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel87)
                    .addComponent(jComboBoxRule11a4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jComboBoxRule11b4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jComboBoxRule11c4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel20Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel88)
                    .addComponent(jComboBoxRule12a4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jComboBoxRule12b4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jComboBoxRule12c4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel20Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jComboBoxRule13a4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel89)
                    .addComponent(jComboBoxRule13b4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jComboBoxRule13c4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel20Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel90)
                    .addComponent(jComboBoxRule14a4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jComboBoxRule14b4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jComboBoxRule14c4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel20Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel91)
                    .addComponent(jComboBoxRule15a4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jComboBoxRule15b4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jComboBoxRule15c4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel20Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel92)
                    .addComponent(jComboBoxRule16a4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jComboBoxRule16b4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jComboBoxRule16c4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel20Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel93)
                    .addComponent(jComboBoxRule17a4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jComboBoxRule17b4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jComboBoxRule17c4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel20Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel94)
                    .addComponent(jComboBoxRule18a4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jComboBoxRule18b4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jComboBoxRule18c4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(236, Short.MAX_VALUE))
        );

        jScrollPane5.setViewportView(jPanel20);

        javax.swing.GroupLayout jPanel14Layout = new javax.swing.GroupLayout(jPanel14);
        jPanel14.setLayout(jPanel14Layout);
        jPanel14Layout.setHorizontalGroup(
            jPanel14Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel14Layout.createSequentialGroup()
                .addComponent(jScrollPane5, javax.swing.GroupLayout.DEFAULT_SIZE, 491, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel14Layout.setVerticalGroup(
            jPanel14Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel14Layout.createSequentialGroup()
                .addComponent(jScrollPane5, javax.swing.GroupLayout.DEFAULT_SIZE, 744, Short.MAX_VALUE)
                .addContainerGap())
        );

        jTabbedPane3.addTab("Rule", jPanel14);

        jLabel7.setText("jLabel7");

        javax.swing.GroupLayout jPanel16Layout = new javax.swing.GroupLayout(jPanel16);
        jPanel16.setLayout(jPanel16Layout);
        jPanel16Layout.setHorizontalGroup(
            jPanel16Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel16Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel7)
                .addContainerGap(457, Short.MAX_VALUE))
        );
        jPanel16Layout.setVerticalGroup(
            jPanel16Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel16Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel7)
                .addContainerGap(730, Short.MAX_VALUE))
        );

        jTabbedPane3.addTab("NP Parser", jPanel16);

        javax.swing.GroupLayout jPanel6Layout = new javax.swing.GroupLayout(jPanel6);
        jPanel6.setLayout(jPanel6Layout);
        jPanel6Layout.setHorizontalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addComponent(jTabbedPane3)
                .addGap(18, 18, 18)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jPanel10, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jScrollPane3))
                .addGap(48, 48, 48))
        );
        jPanel6Layout.setVerticalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel6Layout.createSequentialGroup()
                        .addGap(23, 23, 23)
                        .addComponent(jPanel10, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jScrollPane3))
                    .addGroup(jPanel6Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jTabbedPane3)))
                .addContainerGap())
        );

        jTabbedPane1.addTab("Extraction", jPanel6);

        jPanel11.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "HASIL EKSTRAKSI", javax.swing.border.TitledBorder.CENTER, javax.swing.border.TitledBorder.TOP, new java.awt.Font("Tahoma", 1, 14))); // NOI18N

        jTextArea2.setColumns(20);
        jTextArea2.setRows(5);
        jScrollPane4.setViewportView(jTextArea2);

        javax.swing.GroupLayout jPanel11Layout = new javax.swing.GroupLayout(jPanel11);
        jPanel11.setLayout(jPanel11Layout);
        jPanel11Layout.setHorizontalGroup(
            jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel11Layout.createSequentialGroup()
                .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 1010, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        jPanel11Layout.setVerticalGroup(
            jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane4, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 486, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout jPanel9Layout = new javax.swing.GroupLayout(jPanel9);
        jPanel9.setLayout(jPanel9Layout);
        jPanel9Layout.setHorizontalGroup(
            jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel9Layout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addComponent(jPanel11, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(31, Short.MAX_VALUE))
        );
        jPanel9Layout.setVerticalGroup(
            jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel9Layout.createSequentialGroup()
                .addGap(28, 28, 28)
                .addComponent(jPanel11, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jTabbedPane1.addTab("Feature & Opinion", jPanel9);
        jTabbedPane1.addTab("Evaluation", jTabbedPane2);

        javax.swing.GroupLayout jPanel12Layout = new javax.swing.GroupLayout(jPanel12);
        jPanel12.setLayout(jPanel12Layout);
        jPanel12Layout.setHorizontalGroup(
            jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 1083, Short.MAX_VALUE)
        );
        jPanel12Layout.setVerticalGroup(
            jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 805, Short.MAX_VALUE)
        );

        jTabbedPane1.addTab("tab6", jPanel12);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jTabbedPane1)
                .addGap(19, 19, 19))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jTabbedPane1)
                .addGap(19, 19, 19))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        // TODO add your handling code here:
        //FITUR
       
//        GetRule getrule = GetRule.getInstance();
//        String r1a = jComboBoxRule1a.getSelectedItem().toString();
//        getrule.setRule1a(r1a);
//        
//        String r1b = jComboBoxRule1b.getSelectedItem().toString();
//        getrule.setRule1b(r1b);
//        
//        String r1c = jComboBoxRule1C.getSelectedItem().toString();
//        getrule.setRule1c(r1c);
//        
//        String r2a = jComboBoxRule2a.getSelectedItem().toString();
//        getrule.setRule2a(r2a);
//
//        String r2b = jComboBoxRule2b.getSelectedItem().toString();
//        getrule.setRule2b(r2b);        
//
//        String r2c = jComboBoxRule2c.getSelectedItem().toString();
//        getrule.setRule2c(r2c);
//        
//        String r3a = jComboBoxRule3a.getSelectedItem().toString();
//        getrule.setRule3a(r3a);
//        
//        String r3b = jComboBoxRule3b.getSelectedItem().toString();
//        getrule.setRule3b(r3b); 
//        
//        String r3c = jComboBoxRule3c.getSelectedItem().toString();
//        getrule.setRule3c(r3c);
//        
//        String r4a = jComboBoxRule4a.getSelectedItem().toString();
//        getrule.setRule4a(r4a); 
//        
//        String r4b = jComboBoxRule4b.getSelectedItem().toString();
//        getrule.setRule4b(r4b);    
//        
//        String r4c = jComboBoxRule4c.getSelectedItem().toString();
//        getrule.setRule4c(r4c);   
//        
//        String r5a = jComboBoxRule5a.getSelectedItem().toString();
//        getrule.setRule5a(r5a);  
//        
//        String r5b = jComboBoxRule5b.getSelectedItem().toString();
//        getrule.setRule5b(r5b);
//        
//        String r5c = jComboBoxRule5c.getSelectedItem().toString();
//        getrule.setRule5c(r5c);        
//
//        String r6a = jComboBoxRule6a.getSelectedItem().toString();
//        getrule.setRule6a(r6a);   
//        
//        String r6b = jComboBoxRule6b.getSelectedItem().toString();
//        getrule.setRule6b(r6b);
//        
//        String r6c = jComboBoxRule6c.getSelectedItem().toString();
//        getrule.setRule6c(r6c);    
//        
//        String r7a = jComboBoxRule7a.getSelectedItem().toString();
//        getrule.setRule7a(r7a);  
//        
//        String r7b = jComboBoxRule7b.getSelectedItem().toString();
//        getrule.setRule7b(r7b);
//
//        String r7c = jComboBoxRule7c.getSelectedItem().toString();
//        getrule.setRule7c(r7c);        
        
        //System.out.println("Isi rule gui : " + r1a + r1b);
        fiturkalimat.clear();
        fiturkalimattotal.clear();
        
        fiturpolaritastotal.clear();
        noDobel.clear();

        jumlah.clear();
        jumlah2.clear();

        //jumlah benar,salah,tidak terekstrak
        jumlah.add(0.0); //benar
        jumlah.add(0.0); //salah
        jumlah.add(0.0); //fitur data set
        jumlah.add(0.0); //fitur ekstraksi
        jumlah.add(0.0); //precision
        jumlah.add(0.0); //recall
        //

        //OPINI
        //jumlah benar,salah,tidak terekstrak
        jumlah2.add(0.0); //benar
        jumlah2.add(0.0); //salah
        jumlah2.add(0.0); //fitur data set
        jumlah2.add(0.0); //fitur ekstraksi
        jumlah2.add(0.0); //precision
        jumlah2.add(0.0); //recall

        jumlah2.add(0.0);// 6 benar positif
        jumlah2.add(0.0);// 7 benar negatif
        jumlah2.add(0.0);// 8 fitur dataset positif
        jumlah2.add(0.0);// 9 fitur dataset negatif
        jumlah2.add(0.0);// 10 fitur ekstrak positif
        jumlah2.add(0.0);// 11 fitur ekstrak negatif
        jumlah2.add(0.0);// 12 precision positif
        jumlah2.add(0.0);// 13 precision negatif
        jumlah2.add(0.0);// 14 recall positif
        jumlah2.add(0.0);// 15 recall negatif

        int total=0;
        int benar=0;
        
        
//        String rule1a1 = temp1a[0];   
//        String rule1a2 = temp1a[1];
//        String rule1a3 = temp1a[2];
//        
        //System.out.println("Isi a : "+ a + "Isi b : " +b +" Isi c : "+ c);
//        
//        GetRule rule1 = new GetRule(rulesatua, rulesatub, rulesatuc);

        File f=new File("C:/Program Files (x86)/WordNet/2.1/dict");
        System.setProperty("wordnet.database.dir", f.toString());
        //setting path for the WordNet Directory

        WordNetDatabase database = WordNetDatabase.getFileInstance();
        //============================//
        //System.out.println("Isi Kalimat Pre" + kalimatPre);
        for(int i = 0; i<kalimatPre.size(); i++){
            nounPhrases.clear();
            fixFit.clear();
            temp1.clear();
            temp2.clear();
            fiturrule.clear();
            temp3.clear();
            temp4.clear();
            tmpfit.clear();
            listKandidat.clear();
            listKandidat2.clear();
            typeD.clear();
            token.clear();
            tree=null;
            listFitOp.clear();
            listFit.clear();
            totalfiturfp.clear();
            totalfitur.clear();
            polaritas.clear();
            fp.clear();

            output.tulis(i+1+". Kalimat : "+kalimatPre.get(i));

            ArrayList<ArrayList<String>> fitpo = new ArrayList<ArrayList<String>>();
            
            if(CheckLemma.isSelected()){
                fitpo = input.dataSetFP(inputanFull.get(i),2); //lakukan lemma pada dataset polar
            }
            
            /*
            else if(jCheckBox3.isSelected() && jCheckBox3.isSelected()){ //lakukan lemma kemudian di stemming pada dataset polar
                fitpo = input.dataSetFP(inputanFull.get(i),3);
            }*/
            else{
                fitpo = input.dataSetFP(inputanFull.get(i),0);
            }
            
            ngram=Ng.PNgrams(kalimatPre.get(i));

            // 3 Grams
            ngram2=Ng.PNgrams2(kalimatPre.get(i));

            if(CheckRule.isSelected()){
                getRuleSelected();
                ArrayList<String> fiturdanopini = new ArrayList<>();
                AreaExtraksi.append(i+1+". Hasil Rule :");
                AreaExtraksi.append("\n");
                output.tulis("Hasil Rule : ");
                String fiturkalimat = "";
                String fituropinikalimat = "";
                //2-gram ==========================================================
                for (int j = 0; j < ngram.size(); j++) {
                    String opi=Rl.rules(ngram.get(j));
                    if(opi!=null){
                        //hasil rule
                        //output.tulis(opi);

                        AreaExtraksi.append(opi);
                        AreaExtraksi.append("\n");

                        //ambil opini dari ngram adj/adv
                        tmpOpini = Op.getToken(ngram.get(j));

                        //pilih fitur
                        //if(jRadioButton1.isSelected()){
                            listFit=Fit.getFitur(opi, corpuspre); //dengan corpus
                            //}

                        /*else if(jRadioButton2.isSelected()){
                            listFit=Fit.getFiturNoCorp(opi); //tanpa corpus
                        }*/

                        //pilih fitur
                        for (int k = 0; k < listFit.size(); k++) {
                            String fitr=listFit.get(k);
                            if(fitr!=null){
                                //fiturkalimat = fiturkalimat + fitr + ",";

                                //masukkan opini pada list jika fitur dari 2-gram didapatkan
                                //pasangkan opini dengan fitur
                                if(!tmpOpini.isEmpty()){
                                    for(int count = 0; count < tmpOpini.size(); count++){
                                        //kata fitur dan opini tidak boleh sama / fitur tidak boleh mengandung kata opini
                                        if(!fitr.contains(tmpOpini.get(count))){
                                            //tmpFitOp.clear();
                                            ArrayList<String> tmpFitOp = new ArrayList<String>();
                                            tmpFitOp.add(fitr);
                                            tmpFitOp.add(tmpOpini.get(count));
                                            if ( (Collections.frequency(listFitOp, tmpFitOp)) < 1 ){
                                                listFitOp.add(tmpFitOp);
                                                String fituropini = fitr + "-" + tmpOpini.get(count);
                                                fiturdanopini.add(fituropini);
                                            }
                                        }
                                    }
                                }

                                //masukkan fitur ke list fitur
                                //System.out.println("Fitur : "+fitr);
                                if ( (Collections.frequency(temp1, fitr)) < 1 ){
                                    temp1.add(fitr);
                                    //output.tulis("dari rule 2gram = "+fitr);
                                }
                                if ( (Collections.frequency(fiturrule, fitr)) < 1 ){
                                    fiturrule.add(fitr);
                                    //output.tulis("dari rule 2gram = "+fitr);
                                }

                            }
                        }
                    }
                }

                //3-gram ==========================================================

                for (int j = 0; j < ngram2.size(); j++) {
                    String opi2=Rl.rules(ngram2.get(j));
                    if(opi2!=null){
                        //output.tulis(opi2);

                        AreaExtraksi.append(opi2);
                        AreaExtraksi.append("\n");

                        //ambil opini dari ngram adj/adv
                        tmpOpini = Op.getToken(ngram2.get(j));

                        //pilih fitur
                        //if(jRadioButton1.isSelected()){
                            listFit=Fit.getFitur(opi2, corpuspre); //dengan corpus
                            //}

                        /*else if(jRadioButton2.isSelected()){
                            listFit=Fit.getFiturNoCorp(opi2); //tanpa corpus
                        }*/

                        for (int k = 0; k < listFit.size(); k++) {
                            String fitr=listFit.get(k);
                            if(fitr!=null){
                                //fiturkalimat = fiturkalimat + fitr + ",";

                                //masukkan opini pada list jika fitur dari 3-gram didapatkan
                                //pasangkan opini dengan fitur
                                if(!tmpOpini.isEmpty()){
                                    for(int count = 0; count < tmpOpini.size(); count++){
                                        //kata fitur dan opini tidak boleh sama / fitur tidak boleh mengandung kata opini
                                        if(!fitr.contains(tmpOpini.get(count))){
                                            //tmpFitOp.clear();
                                            ArrayList<String> tmpFitOp = new ArrayList<String>();
                                            tmpFitOp.add(fitr);
                                            tmpFitOp.add(tmpOpini.get(count));
                                            if ( (Collections.frequency(listFitOp, tmpFitOp)) < 1 ){
                                                listFitOp.add(tmpFitOp);
                                                String fituropini = fitr + "-" + tmpOpini.get(count);
                                                fiturdanopini.add(fituropini);
                                            }
                                        }
                                    }
                                }

                                    System.out.println("Fiturnya :" + fitr);
                                if ((Collections.frequency(temp2, fitr)) < 1 ){
                                    temp2.add(fitr);
                                    //output.tulis("dari rule 3gram = "+fitr);
                                }
                                if ((Collections.frequency(fiturrule, fitr)) < 1 ){
                                    fiturrule.add(fitr);
                                    System.out.print("dari rule 3gram = "+fitr);
                                    System.out.println("ISI RULE" + fiturrule);
                                }
                            }
                            //System.out.println("Fiturnya : "+fitr);
                        }
                         
                         //System.out.println("ISI RULE" + fiturrule);
                    }
                }
                System.out.println("ISI RULE" + fiturrule);
                 //AreaExtraksi.append("ISI FITURRULE" + fiturrule.get(i));
                if(!fiturrule.isEmpty()){
                    
                    for(int cnt = 0; cnt < fiturrule.size(); cnt++){
                        fiturkalimat = fiturkalimat + fiturrule.get(cnt) + ",";
                    }
                    fiturkalimat = fiturkalimat.substring(0, fiturkalimat.length()-1);
                }
                else{
                    fiturkalimat = "-";
                }

                if(!fiturdanopini.isEmpty()){
                    for(int cnt = 0; cnt < fiturdanopini.size(); cnt++){
                        fituropinikalimat = fituropinikalimat + fiturdanopini.get(cnt) + ",";
                    }
                    fituropinikalimat = fituropinikalimat.substring(0, fituropinikalimat.length()-1);
                }
                else{
                    fituropinikalimat = "-";
                }

                output.tulis("Hasil Rule : "+fiturkalimat);
                AreaExtraksi.append("Fitur : "+fiturkalimat);
                AreaExtraksi.append("\n");
                AreaExtraksi.append("Fitur - Opini : "+fituropinikalimat);
                AreaExtraksi.append("\n");
                AreaExtraksi.append("=============================================");
                AreaExtraksi.append("\n");
            }
//==============================================NP PARSER==============================================================================
            //NP PARSER CODE..
            if(jCheckBoxNpParser.isSelected()){
            ArrayList<String> fiturdanopini = new ArrayList<>();
                String fiturkalimat = "";
                String fituropinikalimat = "";
                
                AreaExtraksi.append(i+1+". Hasil NP parser :");
                AreaExtraksi.append("\n");
                // Stanford Parser=================================================
                //get tree

                tree = Parser.parse(kalimatPre.get(i));
                List<Tree> leaves = tree.getLeaves();
                for (Tree leaf : leaves) { 
                    Tree parent = leaf.parent(tree);
                    //System.out.print(leaf.label().value() + "-" + parent.label().value() + " ");
                }
                //output.tulis("Tree = "+tree);
                AreaExtraksi.append(tree.toString());
                AreaExtraksi.append("\n");
                
                //ambil tag NP pada tree dgn maks 3 kata
                nounPhrases=Parser.GetNounPhrases(tree);

                for(int it = 0; it < nounPhrases.size(); it++)
                {
                    //output.tulis("Hasil NounPhrases : "+nounPhrases.get(it));

                    AreaExtraksi.append(nounPhrases.get(it));
                    AreaExtraksi.append("\n");
                    //if(jRadioButton1.isSelected()){
                        //cek Np dengan corpus
                        listFit=Fit.getFiturParser(nounPhrases.get(it), corpuspre); //dengan corpus
                    //}
                        
                    /*else if(jRadioButton1.isSelected()){
                        listFit=Fit.getFiturParserNoCorp(nounPhrases.get(it)); //tanpa corpus
                    }*/

                    //hasil fitur dari parser dimasukkan ke list
                    if(!listFit.isEmpty()){
                        for (int l = 0; l < listFit.size(); l++) {
                            //jTextArea16.append("Fitur : ");
                            String fitr=listFit.get(l);
                            if(fitr!=null){
                                fiturkalimat = fiturkalimat + fitr + ",";
                                
                                if ( (Collections.frequency(temp1, fitr)) < 1 ){
                                    //output.tulis("Dari parser: "+fitr);
                                    temp1.add(fitr);
                                }
                                //mendapatkan pasangan fitur dan opini
                                //2gram
                                for (int j = 0; j < ngram.size(); j++) {
                                    //ambil opini dari ngram adj/adv
                                    tmpOpini = Op.getToken(ngram.get(j));
                                    String kalNgram = Ps.removetag(ngram.get(j));
                                    
                                    if(!tmpOpini.isEmpty()){
                                        if(kalNgram.toLowerCase().contains(fitr.toLowerCase())){
                                            for(int count = 0; count < tmpOpini.size(); count++){
                                                //kata fitur dan opini tidak boleh sama / fitur tidak boleh mengandung kata opini
                                                if(!fitr.contains(tmpOpini.get(count))){
                                                    //tmpFitOp.clear();
                                                    ArrayList<String> tmpFitOp = new ArrayList<String>();
                                                    tmpFitOp.add(fitr);
                                                    tmpFitOp.add(tmpOpini.get(count));
                                                    String fituropini = fitr + "-" + tmpOpini.get(count);
                                                    if ( (Collections.frequency(fiturdanopini, fituropini)) < 1 ){
                                                        fiturdanopini.add(fituropini);
                                                    }
                                                    if ( (Collections.frequency(listFitOp, tmpFitOp)) < 1 ){
                                                        listFitOp.add(tmpFitOp);
                                                    }
                                                }
                                            }
                                        }
                                    }
                                }
                                //3gram
                                for (int j = 0; j < ngram2.size(); j++) {
                                    //ambil opini dari ngram adj/adv
                                    tmpOpini = Op.getToken(ngram2.get(j));
                                    String kalNgram = Ps.removetag(ngram2.get(j));
                                    
                                    if(!tmpOpini.isEmpty()){
                                        if(kalNgram.toLowerCase().contains(fitr.toLowerCase())){
                                            for(int count = 0; count < tmpOpini.size(); count++){
                                                //kata fitur dan opini tidak boleh sama / fitur tidak boleh mengandung kata opini
                                                if(!fitr.contains(tmpOpini.get(count))){
                                                    //tmpFitOp.clear();
                                                    ArrayList<String> tmpFitOp = new ArrayList<String>();
                                                    tmpFitOp.add(fitr);
                                                    tmpFitOp.add(tmpOpini.get(count));
                                                    String fituropini = fitr + "-" + tmpOpini.get(count);
                                                    if ( (Collections.frequency(fiturdanopini, fituropini)) < 1 ){
                                                        fiturdanopini.add(fituropini);
                                                    }
                                                    if ( (Collections.frequency(listFitOp, tmpFitOp)) < 1 ){
                                                        listFitOp.add(tmpFitOp);
                                                    }
                                                }
                                            }
                                        }
                                    }
                                }
                                
                            }
                        }
                    }
                    //jika hasil parser tidak ada fitur
                    //cek setiap kata yg ada pada NP dengan corpus
                    else{
                        //if(jRadioButton1.isSelected()){
                            listFit=Fit.getFiturParser2(nounPhrases.get(it), corpuspre); //dengan corpus
                        //}
                            
                        /*           
                        else if(jRadioButton2.isSelected()){
                            listFit=Fit.getFiturParser2NoCorp(nounPhrases.get(it)); //tanpa corpus
                        }
                        */    
                        
                        for (int l = 0; l < listFit.size(); l++) {
                            String fitr=listFit.get(l);
                            if(fitr!=null){
                                fiturkalimat = fiturkalimat + fitr + ",";
                                
                                if ( (Collections.frequency(temp1, fitr)) < 1 ){
                                    temp1.add(fitr);
                                } 
                                
                                //mendapatkan pasangan fitur dan opini
                                //2gram
                                for (int j = 0; j < ngram.size(); j++) {
                                    //ambil opini dari ngram adj/adv
                                    tmpOpini = Op.getToken(ngram.get(j));
                                    String kalNgram = Ps.removetag(ngram.get(j));
                                    
                                    if(!tmpOpini.isEmpty()){
                                        if(kalNgram.toLowerCase().contains(fitr.toLowerCase())){
                                            for(int count = 0; count < tmpOpini.size(); count++){
                                                //kata fitur dan opini tidak boleh sama / fitur tidak boleh mengandung kata opini
                                                if(!fitr.contains(tmpOpini.get(count))){
                                                    //tmpFitOp.clear();
                                                    ArrayList<String> tmpFitOp = new ArrayList<String>();
                                                    tmpFitOp.add(fitr);
                                                    tmpFitOp.add(tmpOpini.get(count));
                                                    String fituropini = fitr + "-" + tmpOpini.get(count);
                                                    if ( (Collections.frequency(fiturdanopini, fituropini)) < 1 ){
                                                        fiturdanopini.add(fituropini);
                                                    }
                                                    if ( (Collections.frequency(listFitOp, tmpFitOp)) < 1 ){
                                                        listFitOp.add(tmpFitOp);
                                                    }
                                                }
                                            }
                                        }
                                    }
                                }
                                //3gram
                                for (int j = 0; j < ngram2.size(); j++) {
                                    //ambil opini dari ngram adj/adv
                                    tmpOpini = Op.getToken(ngram2.get(j));
                                    String kalNgram = Ps.removetag(ngram2.get(j));
                                    
                                    if(!tmpOpini.isEmpty()){
                                        if(kalNgram.toLowerCase().contains(fitr.toLowerCase())){
                                            for(int count = 0; count < tmpOpini.size(); count++){
                                                //kata fitur dan opini tidak boleh sama / fitur tidak boleh mengandung kata opini
                                                if(!fitr.contains(tmpOpini.get(count))){
                                                    //tmpFitOp.clear();
                                                    ArrayList<String> tmpFitOp = new ArrayList<String>();
                                                    tmpFitOp.add(fitr);
                                                    tmpFitOp.add(tmpOpini.get(count));
                                                    String fituropini = fitr + "-" + tmpOpini.get(count);
                                                    if ( (Collections.frequency(fiturdanopini, fituropini)) < 1 ){
                                                        fiturdanopini.add(fituropini);
                                                    }
                                                    if ( (Collections.frequency(listFitOp, tmpFitOp)) < 1 ){
                                                        listFitOp.add(tmpFitOp);
                                                    }
                                                }
                                            }
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
                if(fiturkalimat != ""){
                    fiturkalimat = fiturkalimat.substring(0, fiturkalimat.length()-1);
                }
                else{
                    fiturkalimat = "-";
                }
                
                if(!fiturdanopini.isEmpty()){
                    for(int cnt = 0; cnt < fiturdanopini.size(); cnt++){
                        fituropinikalimat = fituropinikalimat + fiturdanopini.get(cnt) + ",";
                    }
                    fituropinikalimat = fituropinikalimat.substring(0, fituropinikalimat.length()-1);
                }
                else{
                    fituropinikalimat = "-";
                }
                
                output.tulis("Hasil Nounphrase : "+fiturkalimat);
                AreaExtraksi.append("Fitur : "+fiturkalimat);
                AreaExtraksi.append("\n");
                AreaExtraksi.append("Fitur - Opini : "+fituropinikalimat);
                AreaExtraksi.append("\n");
                AreaExtraksi.append("=============================================");
                AreaExtraksi.append("\n");
            
            }
            
            
//======================================TYPE DEPEDENCY============================================================================
            //Depedency parser
            if(jCheckBoxTypeDepedency.isSelected()){
                ArrayList<String> fiturdanopini = new ArrayList<>();
                String fiturkalimat = "";
                String fituropinikalimat = "";
                
                AreaExtraksi.append(i+1+". Hasil Type Dependencies :");
                AreaExtraksi.append("\n");
                
                //typeD=Parser.typeDP(Ps.removetag(kalimatPre.get(i)));
                typeD=Parser.typeDP(inputan.get(i));
                AreaExtraksi.append(Parser.tes);
                AreaExtraksi.append("\n");
                //jTextArea15.append(Parser.typeDPTree(inputan.get(i)).toString());
                //jTextArea15.append("\n");
                //output.tulis("Fitur dan opini : "+typeD);
                for(int it=0;it<typeD.size();it++){
                    AreaExtraksi.append(typeD.get(it));
                    AreaExtraksi.append("\n");
                    String[] words = typeD.get(it).split(" ");

                    String tdFitur=words[0].trim().replaceAll("\\s+", " "); //mengambil fitur
                    String tdOpini=words[1].trim().replaceAll("\\s+", " "); //mengambil opini

                    //if(jRadioButton1.isSelected()){
                        listFit=Fit.getFiturParser(tdFitur, corpuspre); //cek fitur dengan corpus
                    //}
                    
                    /*
                    else if(jRadioButton2.isSelected()){
                        listFit=Fit.getFiturParserNoCorp(tdFitur); //cek fitur tanpa corpus
                    }
                    */
                        
                    if(!listFit.isEmpty()){

                        //ambil pasangan fitur dan opini nya
                        //tmpFitOp.clear();
                        ArrayList<String> tmpFitOp = new ArrayList<String>();
                        tmpFitOp.add(tdFitur);
                        tmpFitOp.add(tdOpini);
                        String fituropini = tdFitur + "-" + tdOpini;
                        System.out.println("Isi Dari FiturOpini : " + fituropini);
                        if ( (Collections.frequency(fiturdanopini, fituropini)) < 1 ){
                            fiturdanopini.add(fituropini);
                        }
                        if ( (Collections.frequency(listFitOp, tmpFitOp)) < 1 ){
                            listFitOp.add(tmpFitOp);
                        }
                        //

                        for (int l = 0; l < listFit.size(); l++) {
                            String fitr=listFit.get(l);
                            
                            if(fitr!=null){                                
                                fiturkalimat = fiturkalimat + fitr + ",";
                                
                                if ( (Collections.frequency(temp1, fitr)) < 1 ){
                                    temp1.add(fitr);
                                    //output.tulis("TD = "+fitr);
                                } 
                            }
                        }
                    }
                }
                if(fiturkalimat != ""){
                    fiturkalimat = fiturkalimat.substring(0, fiturkalimat.length()-1);
                }
                else{
                    fiturkalimat = "-";
                }
                
                if(!fiturdanopini.isEmpty()){
                    for(int cnt = 0; cnt < fiturdanopini.size(); cnt++){
                        fituropinikalimat = fituropinikalimat + fiturdanopini.get(cnt) + ",";
                    }
                    fituropinikalimat = fituropinikalimat.substring(0, fituropinikalimat.length()-1);
                }
                else{
                    fituropinikalimat = "-";
                }
                
                output.tulis("Hasil Parser : "+fiturkalimat);
                AreaExtraksi.append("Fitur : "+fiturkalimat);
                AreaExtraksi.append("\n");
                AreaExtraksi.append("Fitur - Opini : "+fituropinikalimat);
                AreaExtraksi.append("\n");
                AreaExtraksi.append("=============================================");
                AreaExtraksi.append("\n");
            }
            
           
        }
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jCheckBoxNpParserActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCheckBoxNpParserActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jCheckBoxNpParserActionPerformed

    private void CheckRuleActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CheckRuleActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_CheckRuleActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        AreaSW.setText(" ");
    }//GEN-LAST:event_jButton2ActionPerformed

    private void ButtonPreprocessingActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ButtonPreprocessingActionPerformed
        //        String value = ComboPre.getSelectedItem().toString();
        //        inputan = call.Inputan("resources/dataset/"+value+".txt");
        kalimatPre.clear();
        
        if(CheckLemma.isSelected()){
            dataFitPre= input.fiturproPre2(dataFit);
            corpuspre = input.corpuspre(corpus, 1);
            //noDobelDataFit = corpuspre;
        }
        
        //System.out.println("ukuran datafit pre : "+dataFitPre.size());
        //for(int count = 0; count < dataFitPre.size(); count++){
            //System.out.println("data fitur pre1 : "+dataFitPre.get(count));
        //}
        
        //for(int count = 0; count < corpuspre.size(); count++){
            //System.out.println("corpus pre1 : "+corpuspre.get(count));
        //}
        
        for(int count = 0; count < corpuspre.size(); count++){
            if ( (Collections.frequency(noDobelDataFit, corpuspre.get(count))) < 1 ){
                noDobelDataFit.add(corpuspre.get(count));
            }
        }
       
        for(int i = 0; i < inputan.size(); i++){
            nounPhrases.clear();
            temp1.clear();
            temp2.clear();
            fiturrule.clear();
            temp3.clear();
            temp4.clear();
            tmpfit.clear();
            fixFit.clear();
            listKandidat.clear();
            listKandidat2.clear();
            typeD.clear();
            listFit.clear();
            token.clear();
            tree=null;
            listFitOp.clear();
            //String data = inputan.get(i);
            
            String result = ST.tagger(inputan.get(i));
            String tagging = ST.tagger(inputan.get(i));
            String lemanotag = lemma.lemmatizenotag(inputan.get(i));
            String stop = stopword.stopword(inputan.get(i));
           
            //pos tagging

            //String tag = ST.tagger(inputan.get(i));
            
            
            //AreaSW.append(i + 1 + "." + inputan.get(i));

            //
            //             if(CheckPT.isSelected() && !CheckBC.isSelected() && !CheckCR.isSelected()
                //                    && !CheckSW.isSelected() && !CheckLemma.isSelected()){
                //                String tag = ST.tagger(inputan.get(i));
                //                AreaSW.append(i + 1 + "." + inputan.get(i));
                //                AreaSW.append("\n");
                //                AreaSW.append("Hasil : " + tag);
                //                AreaSW.append("\n");
                //
                //            }
            //stopwords && POS TAG
            if(CheckSW.isSelected() && CheckPT.isSelected() && !CheckBC.isSelected() && !CheckCR.isSelected()
                && !CheckLemma.isSelected()){
                result = ST.tagger(stop);
                AreaSW.append(i + 1 + "." + inputan.get(i));
                AreaSW.append("\n");
                AreaSW.append("Hasil POS Tagging : " + tagging);
                AreaSW.append("\n");
                AreaSW.append("Hasil Stopwords :" + result);
                AreaSW.append("\n");
                //                AreaSW.append("Hasil Coba : " + stop);
            }
            //STOPWORD
            if(CheckSW.isSelected() && !CheckPT.isSelected() && !CheckBC.isSelected() && !CheckCR.isSelected()
                && !CheckLemma.isSelected()){
                result = stopword.stopword(inputan.get(i));
                //String pt = ST.tagger(st);
                //String stpt = stopword.stopwordwithTag(tag);
                
                AreaSW.append(i + 1 + "." + inputan.get(i));
                AreaSW.append("\n");
                AreaSW.append("Hasil : " + result);
                AreaSW.append("\n");
                
               

                //                AreaSW.append("Hasil Coba : " + stop);
            }
            //lemma
            if(CheckLemma.isSelected() && !CheckBC.isSelected() && !CheckCR.isSelected()
                && !CheckSW.isSelected() && !CheckPT.isSelected()){
                result = lemma.lemmatizenotag(inputan.get(i));
                AreaSW.append(i + 1 + "." + inputan.get(i));
                AreaSW.append("\n");
                AreaSW.append("Hasil :" + result);
                AreaSW.append("\n");

            }
            //Coref
//            if(!CheckLemma.isSelected() && !CheckBC.isSelected() && CheckCR.isSelected()
//                && !CheckSW.isSelected() && !CheckPT.isSelected()){
//                
////                String[] stockArr = new String[inputan.size()];
////                stockArr = inputan.toArray(stockArr);
//                String[] text = {
//                "The atom is a basic unit of matter, it consists of a dense central nucleus surrounded by a cloud of negatively charged electrons.", 
//                "Barack Obama was born in Hawaii.  He is the president. Obama was elected in 2008.",
//                "Cannon 6D the best camera 2016. it has 16 MP Resolution"
//                }; 
//                for(String s : text){
//                System.out.println(s);
//                //StringBuilder sb = new StringBuilder();
////                for(String tampung : inputan){
////                sb.append(tampung);
//                //String tamp = tamp;
//                //System.out.println(tamp);
//                String cr = corref.Corref(s);
//                AreaSW.append(i + 1 + "." + inputan.get(i));
//                AreaSW.append("\n");
//                AreaSW.append("Hasil Coref :" + cr);
//                AreaSW.append("\n");
//                }
//
//            }

//=========================================CORREF RESOLUTION =========================================================
             if(!CheckLemma.isSelected() && !CheckBC.isSelected() && CheckCR.isSelected()
                && !CheckSW.isSelected() && !CheckPT.isSelected()){
                 
//                 StringBuilder sb = new StringBuilder();
//                 sb.append(inputan.get(i));
//                getData data = new getData();
//                data.setDataIob(sb.toString());
//                String[] tamp = new String[inputan.size()];
//                tamp = inputan.toArray(tamp);
//                GetCorref getcorref = GetCorref.getInstance();
//                getcorref.setInputan(inputan.get(i));
                AreaSW.append(i + 1 + "." + inputan.get(i));
                AreaSW.append("\n");
                AreaSW.append("Hasil :" + result);
                AreaSW.append("\n");
                 
             }
             
//             if(!CheckLemma.isSelected() && !CheckBC.isSelected() && CheckCR.isSelected()
//                && !CheckSW.isSelected() && !CheckPT.isSelected()){
//                GetCorref hasilcoref = new GetCorref();
//                result = hasilcoref.getHasilcoref();
//                AreaSW.append(i + 1 + "." + inputan.get(i));
//                AreaSW.append("\n");
//                AreaSW.append("Hasil :" + result);
//                AreaSW.append("\n");
//                 
//             }
//             
//==========================================POS TAG ============================================================

                        if(CheckPT.isSelected() && !CheckSW.isSelected() && !CheckBC.isSelected()
                                    && !CheckCR.isSelected() && !CheckLemma.isSelected()){
                               //String[] tampung = ST.tagger(inputan.get(i)).split("");
                                FileWriter writer;
                                String tamp = " ";
                                //tampung = 
                                //String hasil = tampung.toString();
                        try {
                          writer = new FileWriter("output/POSTAGBaru.txt");
                          List<String> hasil = new ArrayList<>();
                          String tampung = ST.tagger(inputan.get(i));
                          hasil.add(tampung);
                           for(String str: hasil) {
                                   tamp += str;
                                   //hasil.add(tagging);
                                  // String tamp = Arrays.toString(hasil);
                                  writer.write(tamp);
                                }
                                writer.close();
                        } catch (IOException ex) {
                           Logger.getLogger(Interface_TA.class.getName()).log(Level.SEVERE, null, ex);
                         }
                               

                                AreaSW.append(i + 1 + "." + inputan.get(i));
                                AreaSW.append("\n");
                                AreaSW.append("Hasil Pos Tagging : " + tagging);
                                AreaSW.append("\n");
                
                            }
            //Lemma dan Stopwords
            if(CheckLemma.isSelected() && CheckSW.isSelected() && !CheckBC.isSelected() &&
                !CheckCR.isSelected() && !CheckPT.isSelected()){
                result = sw.stopword(lemanotag);
                AreaSW.append(i + 1 + "." + inputan.get(i));
                AreaSW.append("Hasil Lemmatization :" + lemanotag);
                AreaSW.append("\n");
                AreaSW.append("Hasil : "+ result);
                AreaSW.append("\n");

            }
            //Post tag dan lemma
            if(CheckPT.isSelected() && CheckLemma.isSelected() && !CheckBC.isSelected()
                && !CheckCR.isSelected() && !CheckSW.isSelected()){
                result = lemma.lemmatize(tagging);
                String[] tampung = result.split("");
                AreaSW.append(i + 1 + "." + inputan.get(i));
                AreaSW.append("\n");
                AreaSW.append("Hasil : " + result);
                AreaSW.append("\n");
                
                 PrintWriter out = null;
                try {
                    File file = new File("output/PosLemmatizationa.txt");
                    out = new PrintWriter(new FileWriter(file));
                    for (String s : tampung) {
                        out.println(s);
                    }
                } catch (IOException ex) {
                    System.out.println(ex);
                } finally {
                    out.close();
                }

            }
            //POS TAG, LEMMA, STOPWORDS
            if(CheckPT.isSelected() && CheckLemma.isSelected() && CheckSW.isSelected() && !CheckBC.isSelected()
                && !CheckCR.isSelected() ){
                //String st = stopword.stopwordwithTag(tag);
                String st = stopword.stopword(inputan.get(i));
                String pt = ST.tagger(st);
                String stpt = stopword.stopwordwithTag(tagging);
                //String posstop = stopword.stopwordwithTag(tag);
                String lemmas = lemma.lemmatize(stpt);
                AreaSW.append(i + 1 + "." + inputan.get(i));
                AreaSW.append("\n");
                AreaSW.append("Hasil POS Tagging : " + tagging);
                AreaSW.append("\n");
                AreaSW.append("Hasil Stopwords : " + stpt);
                AreaSW.append("\n");
                AreaSW.append("Hasil Lemmatization : " + lemmas);
                AreaSW.append("\n");

            }
            //POS TAG, LEMMA, STOPWORDS, IOB
            if(CheckPT.isSelected() && CheckLemma.isSelected() && CheckSW.isSelected() && CheckBC.isSelected()
                && !CheckCR.isSelected() ){
                //String st = stopword.stopwordwithTag(tag);
                
                try {
                    String Bio = bio.Chunker(stop);
                    String st = stopword.stopword(inputan.get(i));
                    String pt = ST.tagger(st);
                    String stpt = stopword.stopwordwithTag(tagging);
                    String lemmas = lemma.lemmatize(stpt);
                    String[] tamp = new String[inputan.size()];
                    tamp = inputan.toArray(tamp);
                    result = iobchunk.Iob(stop);
                    String reg = regbio.RegBio(result);
                    
                    AreaSW.append(i + 1 + "." + inputan.get(i));
                    AreaSW.append("\n");
                    AreaSW.append("Hasil POS Tagging : " + tagging);
                    AreaSW.append("\n");
                    AreaSW.append("Hasil IOB" + Bio);
                    AreaSW.append("\n");
                    AreaSW.append("Hasil Stopwords : " + stpt);
                    AreaSW.append("\n");
                    AreaSW.append("Hasil Lemmatization : " + result);
                    AreaSW.append("\n");
                } catch (IOException ex) {
                    Logger.getLogger(Interface_TA.class.getName()).log(Level.SEVERE, null, ex);
                }
                //String posstop = stopword.stopwordwithTag(tag);
                

            }
//=======================================BIO CHUNKING ========================================================
            if(!CheckLemma.isSelected() && CheckBC.isSelected() && !CheckCR.isSelected()
                && !CheckSW.isSelected() && !CheckPT.isSelected()){
                //String reg = null;
                String[] tamp = new String[inputan.size()];
                tamp = inputan.toArray(tamp);
                result = iobchunk.Iob(inputan.get(i));
                String reg = regbio.RegBio(result);
                AreaSW.append(i + 1 + "." + inputan.get(i));
                AreaSW.append("\n");
                AreaSW.append("Hasil :" + result);
                AreaSW.append("\n");
                AreaSW.append("Hasil Regex :" + reg);
                AreaSW.append("\n");
//                String Bio;
//                try {
//                    Bio = bio.Chunker(lemanotag);
//                    AreaSW.append(i + 1 + "." + inputan.get(i));
//                    AreaSW.append("\n");
//                    AreaSW.append("Hasil :" + Bio);
//                    AreaSW.append("\n");
//                } catch (IOException ex) {
//                    Logger.getLogger(Interface_TA.class.getName()).log(Level.SEVERE, null, ex);
//                }
                

            }
            
            kalimatPre.add(result);
            
            //
            //            if(CheckCR.isSelected()){
                //
                ////                String coref = cr.Coref(inputan.get(i));
                ////                AreaSW.append(i + 1 + "." + coref);
                ////                 AreaSW.append("\n");
                //            }
            //

        }
    }//GEN-LAST:event_ButtonPreprocessingActionPerformed

    private void CheckPTActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CheckPTActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_CheckPTActionPerformed

    private void CheckSWActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CheckSWActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_CheckSWActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        AreaDataset.setText(" ");
        inputan.clear();
    }//GEN-LAST:event_jButton1ActionPerformed

    private void ComboDatasetActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ComboDatasetActionPerformed
        String value=ComboDataset.getSelectedItem().toString();
        
        inputan.clear();
        dataFitPre.clear();
        corpus.clear();
        noDobelDataFit.clear();
        inputanFull.clear();
        dataFit.clear();
        opPos.clear();
        opNeg.clear();
        corpuspre.clear();
        
        // Input File
        corpus=input.corpus("resources/dataset/"+value+".txt");
        corpuspre = corpus;
        //noDobelDataFit = corpuspre;
        //noDobelDataFit=input.dataSetNoDBL("customer review data/"+value+".txt");
        inputan=input.inp("resources/dataset/"+value+".txt");
        inputanFull=input.inpFull("resources/dataset/"+value+".txt");
        dataFit=input.fiturpro("resources/dataset/"+value+".txt");
        dataFitPre = dataFit;
        data();
    }//GEN-LAST:event_ComboDatasetActionPerformed

    private void jComboBoxRule1a4jComboBoxRule1aActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBoxRule1a4jComboBoxRule1aActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jComboBoxRule1a4jComboBoxRule1aActionPerformed

    private void jComboBoxRule1b4jComboBoxRule1bActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBoxRule1b4jComboBoxRule1bActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jComboBoxRule1b4jComboBoxRule1bActionPerformed

    private void jComboBoxRule2a4jComboBoxRule2aActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBoxRule2a4jComboBoxRule2aActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jComboBoxRule2a4jComboBoxRule2aActionPerformed

    private void jComboBoxRule2b4jComboBoxRule2bActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBoxRule2b4jComboBoxRule2bActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jComboBoxRule2b4jComboBoxRule2bActionPerformed

    private void jComboBoxRule3a4jComboBoxRule3aActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBoxRule3a4jComboBoxRule3aActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jComboBoxRule3a4jComboBoxRule3aActionPerformed

    private void jComboBoxRule3b4jComboBoxRule3bActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBoxRule3b4jComboBoxRule3bActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jComboBoxRule3b4jComboBoxRule3bActionPerformed

    private void jComboBoxRule4a4jComboBoxRule4aActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBoxRule4a4jComboBoxRule4aActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jComboBoxRule4a4jComboBoxRule4aActionPerformed

    private void jComboBoxRule4b4jComboBoxRule4bActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBoxRule4b4jComboBoxRule4bActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jComboBoxRule4b4jComboBoxRule4bActionPerformed

    private void jComboBoxRule6a4jComboBoxRule6aActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBoxRule6a4jComboBoxRule6aActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jComboBoxRule6a4jComboBoxRule6aActionPerformed

    private void jComboBoxRule6b4jComboBoxRule6bActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBoxRule6b4jComboBoxRule6bActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jComboBoxRule6b4jComboBoxRule6bActionPerformed

    private void jComboBoxRule7a4jComboBoxRule7aActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBoxRule7a4jComboBoxRule7aActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jComboBoxRule7a4jComboBoxRule7aActionPerformed

    private void jComboBoxRule7b4jComboBoxRule7bActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBoxRule7b4jComboBoxRule7bActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jComboBoxRule7b4jComboBoxRule7bActionPerformed

    private void jComboBoxRule1C4jComboBoxRule1CActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBoxRule1C4jComboBoxRule1CActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jComboBoxRule1C4jComboBoxRule1CActionPerformed

    private void jComboBoxRule2c4jComboBoxRule2cActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBoxRule2c4jComboBoxRule2cActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jComboBoxRule2c4jComboBoxRule2cActionPerformed

    private void jComboBoxRule3c4jComboBoxRule3cActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBoxRule3c4jComboBoxRule3cActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jComboBoxRule3c4jComboBoxRule3cActionPerformed

    private void jComboBoxRule4c4jComboBoxRule4cActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBoxRule4c4jComboBoxRule4cActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jComboBoxRule4c4jComboBoxRule4cActionPerformed

    private void jComboBoxRule5a4jComboBoxRule5aActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBoxRule5a4jComboBoxRule5aActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jComboBoxRule5a4jComboBoxRule5aActionPerformed

    private void jComboBoxRule6c4jComboBoxRule6cActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBoxRule6c4jComboBoxRule6cActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jComboBoxRule6c4jComboBoxRule6cActionPerformed

    private void jComboBoxRule7c4jComboBoxRule7cActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBoxRule7c4jComboBoxRule7cActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jComboBoxRule7c4jComboBoxRule7cActionPerformed

    private void jComboBoxRule5b4jComboBoxRule5bActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBoxRule5b4jComboBoxRule5bActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jComboBoxRule5b4jComboBoxRule5bActionPerformed

    private void jComboBoxRule5c4jComboBoxRule5cActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBoxRule5c4jComboBoxRule5cActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jComboBoxRule5c4jComboBoxRule5cActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        AreaExtraksi.setText(" ");
    }//GEN-LAST:event_jButton4ActionPerformed

    public void data(){
    String value = ComboDataset.getSelectedItem().toString();
    inputan = call.Inputan("resources/dataset/"+value+".txt");
        for(int i = 0; i < inputan.size(); i++){
            AreaDataset.append(i + 1 + "." + inputan.get(i));
            AreaDataset.append(inputan.get(i));
            AreaDataset.append("\n");
        }
    }
    
    
    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Interface_TA.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Interface_TA.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Interface_TA.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Interface_TA.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Interface_TA().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextArea AreaDataset;
    private javax.swing.JTextArea AreaExtraksi;
    public static javax.swing.JTextArea AreaSW;
    private javax.swing.JButton ButtonPreprocessing;
    private javax.swing.JCheckBox CheckBC;
    private javax.swing.JCheckBox CheckCR;
    private javax.swing.JCheckBox CheckLemma;
    private javax.swing.JCheckBox CheckPT;
    private javax.swing.JCheckBox CheckRule;
    private javax.swing.JCheckBox CheckSW;
    private javax.swing.JComboBox<String> ComboDataset;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JCheckBox jCheckBox4;
    private javax.swing.JCheckBox jCheckBoxNpParser;
    private javax.swing.JCheckBox jCheckBoxTypeDepedency;
    private javax.swing.JComboBox<String> jComboBoxRule10a4;
    private javax.swing.JComboBox<String> jComboBoxRule10b4;
    private javax.swing.JComboBox<String> jComboBoxRule10c4;
    private javax.swing.JComboBox<String> jComboBoxRule11a4;
    private javax.swing.JComboBox<String> jComboBoxRule11b4;
    private javax.swing.JComboBox<String> jComboBoxRule11c4;
    private javax.swing.JComboBox<String> jComboBoxRule12a4;
    private javax.swing.JComboBox<String> jComboBoxRule12b4;
    private javax.swing.JComboBox<String> jComboBoxRule12c4;
    private javax.swing.JComboBox<String> jComboBoxRule13a4;
    private javax.swing.JComboBox<String> jComboBoxRule13b4;
    private javax.swing.JComboBox<String> jComboBoxRule13c4;
    private javax.swing.JComboBox<String> jComboBoxRule14a4;
    private javax.swing.JComboBox<String> jComboBoxRule14b4;
    private javax.swing.JComboBox<String> jComboBoxRule14c4;
    private javax.swing.JComboBox<String> jComboBoxRule15a4;
    private javax.swing.JComboBox<String> jComboBoxRule15b4;
    private javax.swing.JComboBox<String> jComboBoxRule15c4;
    private javax.swing.JComboBox<String> jComboBoxRule16a4;
    private javax.swing.JComboBox<String> jComboBoxRule16b4;
    private javax.swing.JComboBox<String> jComboBoxRule16c4;
    private javax.swing.JComboBox<String> jComboBoxRule17a4;
    private javax.swing.JComboBox<String> jComboBoxRule17b4;
    private javax.swing.JComboBox<String> jComboBoxRule17c4;
    private javax.swing.JComboBox<String> jComboBoxRule18a4;
    private javax.swing.JComboBox<String> jComboBoxRule18b4;
    private javax.swing.JComboBox<String> jComboBoxRule18c4;
    private javax.swing.JComboBox<String> jComboBoxRule1C4;
    private javax.swing.JComboBox<String> jComboBoxRule1a4;
    private javax.swing.JComboBox<String> jComboBoxRule1b4;
    private javax.swing.JComboBox<String> jComboBoxRule2a4;
    private javax.swing.JComboBox<String> jComboBoxRule2b4;
    private javax.swing.JComboBox<String> jComboBoxRule2c4;
    private javax.swing.JComboBox<String> jComboBoxRule3a4;
    private javax.swing.JComboBox<String> jComboBoxRule3b4;
    private javax.swing.JComboBox<String> jComboBoxRule3c4;
    private javax.swing.JComboBox<String> jComboBoxRule4a4;
    private javax.swing.JComboBox<String> jComboBoxRule4b4;
    private javax.swing.JComboBox<String> jComboBoxRule4c4;
    private javax.swing.JComboBox<String> jComboBoxRule5a4;
    private javax.swing.JComboBox<String> jComboBoxRule5b4;
    private javax.swing.JComboBox<String> jComboBoxRule5c4;
    private javax.swing.JComboBox<String> jComboBoxRule6a4;
    private javax.swing.JComboBox<String> jComboBoxRule6b4;
    private javax.swing.JComboBox<String> jComboBoxRule6c4;
    private javax.swing.JComboBox<String> jComboBoxRule7a4;
    private javax.swing.JComboBox<String> jComboBoxRule7b4;
    private javax.swing.JComboBox<String> jComboBoxRule7c4;
    private javax.swing.JComboBox<String> jComboBoxRule8a4;
    private javax.swing.JComboBox<String> jComboBoxRule8b4;
    private javax.swing.JComboBox<String> jComboBoxRule8c4;
    private javax.swing.JComboBox<String> jComboBoxRule9a4;
    private javax.swing.JComboBox<String> jComboBoxRule9b4;
    private javax.swing.JComboBox<String> jComboBoxRule9c4;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel77;
    private javax.swing.JLabel jLabel78;
    private javax.swing.JLabel jLabel79;
    private javax.swing.JLabel jLabel80;
    private javax.swing.JLabel jLabel81;
    private javax.swing.JLabel jLabel82;
    private javax.swing.JLabel jLabel83;
    private javax.swing.JLabel jLabel84;
    private javax.swing.JLabel jLabel85;
    private javax.swing.JLabel jLabel86;
    private javax.swing.JLabel jLabel87;
    private javax.swing.JLabel jLabel88;
    private javax.swing.JLabel jLabel89;
    private javax.swing.JLabel jLabel90;
    private javax.swing.JLabel jLabel91;
    private javax.swing.JLabel jLabel92;
    private javax.swing.JLabel jLabel93;
    private javax.swing.JLabel jLabel94;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel10;
    private javax.swing.JPanel jPanel11;
    private javax.swing.JPanel jPanel12;
    private javax.swing.JPanel jPanel14;
    private javax.swing.JPanel jPanel16;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel20;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JPanel jPanel8;
    private javax.swing.JPanel jPanel9;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JScrollPane jScrollPane5;
    private javax.swing.JTabbedPane jTabbedPane1;
    private javax.swing.JTabbedPane jTabbedPane2;
    private javax.swing.JTabbedPane jTabbedPane3;
    private javax.swing.JTextArea jTextArea2;
    // End of variables declaration//GEN-END:variables
}
