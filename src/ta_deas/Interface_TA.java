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
    GetRule ruleget = new GetRule();
    RegIob regbio = new RegIob();
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
        jPanel15 = new javax.swing.JPanel();
        jComboBoxRule1a = new javax.swing.JComboBox<>();
        jComboBoxRule1b = new javax.swing.JComboBox<>();
        jLabel13 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jComboBoxRule2a = new javax.swing.JComboBox<>();
        jComboBoxRule2b = new javax.swing.JComboBox<>();
        jLabel15 = new javax.swing.JLabel();
        jComboBoxRule3a = new javax.swing.JComboBox<>();
        jComboBoxRule3b = new javax.swing.JComboBox<>();
        jLabel16 = new javax.swing.JLabel();
        jComboBoxRule4a = new javax.swing.JComboBox<>();
        jComboBoxRule4b = new javax.swing.JComboBox<>();
        jLabel17 = new javax.swing.JLabel();
        jLabel18 = new javax.swing.JLabel();
        jComboBoxRule6a = new javax.swing.JComboBox<>();
        jComboBoxRule6b = new javax.swing.JComboBox<>();
        jLabel4 = new javax.swing.JLabel();
        jComboBoxRule7a = new javax.swing.JComboBox<>();
        jComboBoxRule7b = new javax.swing.JComboBox<>();
        jComboBoxRule1C = new javax.swing.JComboBox<>();
        jComboBoxRule2c = new javax.swing.JComboBox<>();
        jComboBoxRule3c = new javax.swing.JComboBox<>();
        jComboBoxRule4c = new javax.swing.JComboBox<>();
        jComboBoxRule5a = new javax.swing.JComboBox<>();
        jComboBoxRule6c = new javax.swing.JComboBox<>();
        jComboBoxRule7c = new javax.swing.JComboBox<>();
        jComboBoxRule5b = new javax.swing.JComboBox<>();
        jComboBoxRule5c = new javax.swing.JComboBox<>();
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
            .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 383, Short.MAX_VALUE)
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
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 369, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 34, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(21, 21, 21)
                        .addComponent(jPanel8, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(52, 52, 52)
                        .addComponent(jPanel7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(109, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap(31, Short.MAX_VALUE)
                .addComponent(jPanel7, javax.swing.GroupLayout.PREFERRED_SIZE, 77, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel8, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
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

        javax.swing.GroupLayout jPanel10Layout = new javax.swing.GroupLayout(jPanel10);
        jPanel10.setLayout(jPanel10Layout);
        jPanel10Layout.setHorizontalGroup(
            jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel10Layout.createSequentialGroup()
                .addGap(62, 62, 62)
                .addGroup(jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jCheckBoxNpParser)
                    .addGroup(jPanel10Layout.createSequentialGroup()
                        .addGroup(jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel10Layout.createSequentialGroup()
                                .addGroup(jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel2)
                                    .addComponent(CheckRule))
                                .addGap(88, 88, 88)
                                .addGroup(jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel3)
                                    .addComponent(jCheckBox4)))
                            .addComponent(jCheckBoxTypeDepedency))
                        .addGap(72, 72, 72)
                        .addGroup(jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jButton4, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(369, Short.MAX_VALUE))
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
                    .addComponent(jCheckBox4)
                    .addComponent(jButton3))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jCheckBoxTypeDepedency)
                    .addComponent(jButton4))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jCheckBoxNpParser)
                .addContainerGap(11, Short.MAX_VALUE))
        );

        AreaExtraksi.setColumns(20);
        AreaExtraksi.setRows(5);
        jScrollPane3.setViewportView(AreaExtraksi);

        jPanel14.setBackground(new java.awt.Color(255, 255, 255));

        jPanel15.setBackground(new java.awt.Color(255, 255, 255));

        jComboBoxRule1a.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Rule 1A", "_JJ", "_NN", "_RB", "_VBN", " " }));
        jComboBoxRule1a.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBoxRule1aActionPerformed(evt);
            }
        });

        jComboBoxRule1b.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Rule 1B", "_JJ", "_NN", "_RB", "_VBN", " " }));
        jComboBoxRule1b.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBoxRule1bActionPerformed(evt);
            }
        });

        jLabel13.setText("Rule 1");

        jLabel14.setText("Rule 2");

        jComboBoxRule2a.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Rule 2A", "_JJ", "_NN", "_RB", "_VBN", " " }));
        jComboBoxRule2a.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBoxRule2aActionPerformed(evt);
            }
        });

        jComboBoxRule2b.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Rule 2A", "_JJ", "_NN", "_RB", "_VBN", " " }));
        jComboBoxRule2b.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBoxRule2bActionPerformed(evt);
            }
        });

        jLabel15.setText("Rule 3");

        jComboBoxRule3a.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Rule 3A", "_JJ", "_NN", "_RB", "_VBN", " " }));
        jComboBoxRule3a.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBoxRule3aActionPerformed(evt);
            }
        });

        jComboBoxRule3b.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Rule 3B", "_JJ", "_NN", "_RB", "_VBN", " " }));
        jComboBoxRule3b.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBoxRule3bActionPerformed(evt);
            }
        });

        jLabel16.setText("Rule 4");

        jComboBoxRule4a.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Rule 4A", "_JJ", "_NN", "_RB", "_VBN" }));
        jComboBoxRule4a.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBoxRule4aActionPerformed(evt);
            }
        });

        jComboBoxRule4b.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Rule 4B", "_JJ", "_NN", "_RB", "_VBN" }));
        jComboBoxRule4b.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBoxRule4bActionPerformed(evt);
            }
        });

        jLabel17.setText("Rule 5");

        jLabel18.setText("Rule 6");

        jComboBoxRule6a.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Rule 6A", "_JJ", "_NN", "_RB", "_VBN", " " }));
        jComboBoxRule6a.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBoxRule6aActionPerformed(evt);
            }
        });

        jComboBoxRule6b.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Rule 6B", "_JJ", "_NN", "_RB", "_VBN" }));
        jComboBoxRule6b.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBoxRule6bActionPerformed(evt);
            }
        });

        jLabel4.setText("Rule 7");

        jComboBoxRule7a.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Rule 7A", "_JJ", "_NN", "_RB", "_VBN", " " }));
        jComboBoxRule7a.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBoxRule7aActionPerformed(evt);
            }
        });

        jComboBoxRule7b.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Rule 7B", "_JJ", "_NN", "_RB", "_VBN" }));
        jComboBoxRule7b.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBoxRule7bActionPerformed(evt);
            }
        });

        jComboBoxRule1C.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Rule 1C", " ", "_JJ", "_NN", "_RB", "_VBN", " " }));
        jComboBoxRule1C.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBoxRule1CActionPerformed(evt);
            }
        });

        jComboBoxRule2c.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Rule 2C", "_JJ", "_NN", "_RB", "_VBN", " " }));
        jComboBoxRule2c.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBoxRule2cActionPerformed(evt);
            }
        });

        jComboBoxRule3c.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Rule 3C", " ", "_JJ", "_NN", "_RB", "_VBN" }));
        jComboBoxRule3c.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBoxRule3cActionPerformed(evt);
            }
        });

        jComboBoxRule4c.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Rule 4C", " ", "_JJ", "_NN", "_RB", "_VBN" }));
        jComboBoxRule4c.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBoxRule4cActionPerformed(evt);
            }
        });

        jComboBoxRule5a.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Rule 5A", "_JJ", "_NN", "_RB", "_VBN" }));
        jComboBoxRule5a.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBoxRule5aActionPerformed(evt);
            }
        });

        jComboBoxRule6c.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Rule 6C", " ", "_JJ", "_NN", "_RB", "_VBN" }));
        jComboBoxRule6c.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBoxRule6cActionPerformed(evt);
            }
        });

        jComboBoxRule7c.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Rule 7C", " ", "_JJ", "_NN", "_RB", "_VBN" }));
        jComboBoxRule7c.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBoxRule7cActionPerformed(evt);
            }
        });

        jComboBoxRule5b.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Rule 5B", "_JJ", "_NN", "_RB", "_VBN" }));
        jComboBoxRule5b.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBoxRule5bActionPerformed(evt);
            }
        });

        jComboBoxRule5c.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Rule 5C", " ", "_JJ", "_NN", "_RB", "_VBN" }));
        jComboBoxRule5c.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBoxRule5cActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel15Layout = new javax.swing.GroupLayout(jPanel15);
        jPanel15.setLayout(jPanel15Layout);
        jPanel15Layout.setHorizontalGroup(
            jPanel15Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel15Layout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addGroup(jPanel15Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel15Layout.createSequentialGroup()
                        .addComponent(jLabel4)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jComboBoxRule7a, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(5, 5, 5)
                        .addComponent(jComboBoxRule7b, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel15Layout.createSequentialGroup()
                        .addGroup(jPanel15Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel13)
                            .addComponent(jLabel14)
                            .addComponent(jLabel15)
                            .addComponent(jLabel16)
                            .addComponent(jLabel17, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel18))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel15Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addGroup(jPanel15Layout.createSequentialGroup()
                                .addComponent(jComboBoxRule4a, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jComboBoxRule4b, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jComboBoxRule4c, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addGroup(jPanel15Layout.createSequentialGroup()
                                .addComponent(jComboBoxRule3a, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jComboBoxRule3b, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jComboBoxRule3c, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel15Layout.createSequentialGroup()
                                .addGroup(jPanel15Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addComponent(jComboBoxRule2a, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jComboBoxRule1a, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPanel15Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addGroup(jPanel15Layout.createSequentialGroup()
                                        .addComponent(jComboBoxRule1b, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(jComboBoxRule1C, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(jPanel15Layout.createSequentialGroup()
                                        .addComponent(jComboBoxRule2b, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(jComboBoxRule2c, 0, 1, Short.MAX_VALUE))))
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel15Layout.createSequentialGroup()
                                .addGroup(jPanel15Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addComponent(jComboBoxRule5a, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jComboBoxRule6a, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addGroup(jPanel15Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel15Layout.createSequentialGroup()
                                        .addGap(5, 5, 5)
                                        .addComponent(jComboBoxRule6b, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addGroup(jPanel15Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jComboBoxRule7c, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                            .addComponent(jComboBoxRule6c, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                                    .addGroup(jPanel15Layout.createSequentialGroup()
                                        .addGap(7, 7, 7)
                                        .addComponent(jComboBoxRule5b, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(jComboBoxRule5c, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(0, 0, Short.MAX_VALUE)))))))
                .addContainerGap(22, Short.MAX_VALUE))
        );
        jPanel15Layout.setVerticalGroup(
            jPanel15Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel15Layout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addGroup(jPanel15Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jComboBoxRule1a, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jComboBoxRule1b, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel13)
                    .addComponent(jComboBoxRule1C, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel15Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel14)
                    .addComponent(jComboBoxRule2a, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jComboBoxRule2b, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jComboBoxRule2c, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel15Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel15)
                    .addComponent(jComboBoxRule3a, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jComboBoxRule3b, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jComboBoxRule3c, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel15Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel16)
                    .addComponent(jComboBoxRule4a, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jComboBoxRule4b, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jComboBoxRule4c, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel15Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel17)
                    .addComponent(jComboBoxRule5a, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jComboBoxRule5b, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jComboBoxRule5c, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(14, 14, 14)
                .addGroup(jPanel15Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel18)
                    .addGroup(jPanel15Layout.createSequentialGroup()
                        .addGroup(jPanel15Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jComboBoxRule6b, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jComboBoxRule6a, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jComboBoxRule6c, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel15Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jComboBoxRule7a, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jComboBoxRule7b, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel4)
                            .addComponent(jComboBoxRule7c, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(85, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jPanel14Layout = new javax.swing.GroupLayout(jPanel14);
        jPanel14.setLayout(jPanel14Layout);
        jPanel14Layout.setHorizontalGroup(
            jPanel14Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel14Layout.createSequentialGroup()
                .addComponent(jPanel15, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 41, Short.MAX_VALUE))
        );
        jPanel14Layout.setVerticalGroup(
            jPanel14Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel15, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
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
                .addContainerGap(279, Short.MAX_VALUE))
        );
        jPanel16Layout.setVerticalGroup(
            jPanel16Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel16Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel7)
                .addContainerGap(293, Short.MAX_VALUE))
        );

        jTabbedPane3.addTab("NP Parser", jPanel16);

        javax.swing.GroupLayout jPanel6Layout = new javax.swing.GroupLayout(jPanel6);
        jPanel6.setLayout(jPanel6Layout);
        jPanel6Layout.setHorizontalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel6Layout.createSequentialGroup()
                        .addContainerGap(141, Short.MAX_VALUE)
                        .addComponent(jPanel10, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel6Layout.createSequentialGroup()
                        .addComponent(jTabbedPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 328, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jScrollPane3)))
                .addGap(48, 48, 48))
        );
        jPanel6Layout.setVerticalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addComponent(jPanel10, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane3)
                    .addComponent(jTabbedPane3))
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
            .addComponent(jScrollPane4, javax.swing.GroupLayout.DEFAULT_SIZE, 916, Short.MAX_VALUE)
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
                .addContainerGap(125, Short.MAX_VALUE))
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
            .addGap(0, 551, Short.MAX_VALUE)
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
        
//        String rulesatua = jComboBoxRule1A.getSelectedItem().toString();
//        String rulesatub = jComboBoxRule1b.getSelectedItem().toString();
//        String rulesatuc = jComboBoxRule1C.getSelectedItem().toString();
//        String[] temp;
//        String delimiter = " ";
//
//        temp = rulesatua.split(delimiter);   
//        String a = temp[0];   
//        String b = temp[1];
//        String c = temp[2];
//        
//        System.out.println("Isi a : "+ a + "Isi b : " +b +" Isi c : "+ c);
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

                ArrayList<String> fiturdanopini = new ArrayList<>();
                AreaExtraksi.append(i+1+". Hasil Rule :");
                AreaExtraksi.append("\n");
                output.tulis("Hasil Rule : ");
                String fiturkalimat = "";
                String fituropinikalimat = "";
                //2-gram ==========================================================
                for (int j = 0; j < ngram.size(); j++) {
                    String opi=Rl.Reg(ngram.get(j));
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
                    String opi2=Rl.Reg(ngram2.get(j));
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

//=========================================IOB COBA =========================================================
             if(!CheckLemma.isSelected() && !CheckBC.isSelected() && CheckCR.isSelected()
                && !CheckSW.isSelected() && !CheckPT.isSelected()){
//                 StringBuilder sb = new StringBuilder();
//                 sb.append(inputan.get(i));
//                getData data = new getData();
//                data.setDataIob(sb.toString());
                String[] tamp = new String[inputan.size()];
                tamp = inputan.toArray(tamp);
                result = iobchunk.Iob(inputan.get(i));
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
                               
                                FileWriter writer; 
                        try {
                          writer = new FileWriter("output/output.txt");
                           for(String str: inputan) {
                                   String tamp = str;
                                  writer.write(tagging);
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
                        out.println(result);
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
                    AreaSW.append(i + 1 + "." + inputan.get(i));
                    AreaSW.append("\n");
                    AreaSW.append("Hasil POS Tagging : " + tagging);
                    AreaSW.append("\n");
                    AreaSW.append("Hasil IOB" + Bio);
                    AreaSW.append("\n");
                    AreaSW.append("Hasil Stopwords : " + stpt);
                    AreaSW.append("\n");
                    AreaSW.append("Hasil Lemmatization : " + lemmas);
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

    private void jComboBoxRule6aActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBoxRule6aActionPerformed
        String r6a = jComboBoxRule6a.getSelectedItem().toString();
        ruleget.setRule6a(r6a);
    }//GEN-LAST:event_jComboBoxRule6aActionPerformed

    private void jComboBoxRule1aActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBoxRule1aActionPerformed
        String r1a = jComboBoxRule1a.getSelectedItem().toString();
        ruleget.setRule1a(r1a);
    }//GEN-LAST:event_jComboBoxRule1aActionPerformed

    private void jComboBoxRule1bActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBoxRule1bActionPerformed
        String r1b = jComboBoxRule1b.getSelectedItem().toString();
        ruleget.setRule1b(r1b);
    }//GEN-LAST:event_jComboBoxRule1bActionPerformed

    private void jComboBoxRule1CActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBoxRule1CActionPerformed
       String r1c = jComboBoxRule1C.getSelectedItem().toString();
       ruleget.setRule1c(r1c);
    }//GEN-LAST:event_jComboBoxRule1CActionPerformed

    private void jComboBoxRule2aActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBoxRule2aActionPerformed
        String r2a = jComboBoxRule2a.getSelectedItem().toString();
        ruleget.setRule2a(r2a);
    }//GEN-LAST:event_jComboBoxRule2aActionPerformed

    private void jComboBoxRule2bActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBoxRule2bActionPerformed
        String r2b = jComboBoxRule2b.getSelectedItem().toString();
        ruleget.setRule2b(r2b);
    }//GEN-LAST:event_jComboBoxRule2bActionPerformed

    private void jComboBoxRule2cActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBoxRule2cActionPerformed
        String r2c = jComboBoxRule2c.getSelectedItem().toString();
        ruleget.setRule2c(r2c);
    }//GEN-LAST:event_jComboBoxRule2cActionPerformed

    private void jComboBoxRule3aActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBoxRule3aActionPerformed
        String r3a = jComboBoxRule3a.getSelectedItem().toString();
        ruleget.setRule3a(r3a);
    }//GEN-LAST:event_jComboBoxRule3aActionPerformed

    private void jComboBoxRule3bActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBoxRule3bActionPerformed
        String r3b = jComboBoxRule3b.getSelectedItem().toString();
        ruleget.setRule3b(r3b);
    }//GEN-LAST:event_jComboBoxRule3bActionPerformed

    private void jComboBoxRule3cActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBoxRule3cActionPerformed
        String r3c = jComboBoxRule3c.getSelectedItem().toString();
        ruleget.setRule3c(r3c);
    }//GEN-LAST:event_jComboBoxRule3cActionPerformed

    private void jComboBoxRule4aActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBoxRule4aActionPerformed
        String r4a = jComboBoxRule4a.getSelectedItem().toString();
        ruleget.setRule4a(r4a);
    }//GEN-LAST:event_jComboBoxRule4aActionPerformed

    private void jComboBoxRule4bActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBoxRule4bActionPerformed
        String r4b = jComboBoxRule4b.getSelectedItem().toString();
        ruleget.setRule4b(r4b);
    }//GEN-LAST:event_jComboBoxRule4bActionPerformed

    private void jComboBoxRule4cActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBoxRule4cActionPerformed
        String r4c = jComboBoxRule4c.getSelectedItem().toString();
        ruleget.setRule4c(r4c);
    }//GEN-LAST:event_jComboBoxRule4cActionPerformed

    private void jComboBoxRule5aActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBoxRule5aActionPerformed
        String r5a = jComboBoxRule5a.getSelectedItem().toString();
        ruleget.setRule5a(r5a);
    }//GEN-LAST:event_jComboBoxRule5aActionPerformed

    private void jComboBoxRule5bActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBoxRule5bActionPerformed
        String r5b = jComboBoxRule5b.getSelectedItem().toString();
        ruleget.setRule5b(r5b);
    }//GEN-LAST:event_jComboBoxRule5bActionPerformed

    private void jComboBoxRule5cActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBoxRule5cActionPerformed
        String r5c = jComboBoxRule5c.getSelectedItem().toString();
        ruleget.setRule5c(r5c);
    }//GEN-LAST:event_jComboBoxRule5cActionPerformed

    private void jComboBoxRule6bActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBoxRule6bActionPerformed
        String r6b = jComboBoxRule6b.getSelectedItem().toString();
        ruleget.setRule6b(r6b);
    }//GEN-LAST:event_jComboBoxRule6bActionPerformed

    private void jComboBoxRule6cActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBoxRule6cActionPerformed
        String r6c = jComboBoxRule6c.getSelectedItem().toString();
        ruleget.setRule6c(r6c);
    }//GEN-LAST:event_jComboBoxRule6cActionPerformed

    private void jComboBoxRule7aActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBoxRule7aActionPerformed
       String r7a = jComboBoxRule7a.getSelectedItem().toString();
        ruleget.setRule7a(r7a);
    }//GEN-LAST:event_jComboBoxRule7aActionPerformed

    private void jComboBoxRule7bActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBoxRule7bActionPerformed
       String r7b = jComboBoxRule7b.getSelectedItem().toString();
        ruleget.setRule7b(r7b);
    }//GEN-LAST:event_jComboBoxRule7bActionPerformed

    private void jComboBoxRule7cActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBoxRule7cActionPerformed
        String r7c = jComboBoxRule7c.getSelectedItem().toString();
        ruleget.setRule7c(r7c);
    }//GEN-LAST:event_jComboBoxRule7cActionPerformed

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
    private javax.swing.JTextArea AreaSW;
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
    private javax.swing.JComboBox<String> jComboBoxRule1C;
    private javax.swing.JComboBox<String> jComboBoxRule1a;
    private javax.swing.JComboBox<String> jComboBoxRule1b;
    private javax.swing.JComboBox<String> jComboBoxRule2a;
    private javax.swing.JComboBox<String> jComboBoxRule2b;
    private javax.swing.JComboBox<String> jComboBoxRule2c;
    private javax.swing.JComboBox<String> jComboBoxRule3a;
    private javax.swing.JComboBox<String> jComboBoxRule3b;
    private javax.swing.JComboBox<String> jComboBoxRule3c;
    private javax.swing.JComboBox<String> jComboBoxRule4a;
    private javax.swing.JComboBox<String> jComboBoxRule4b;
    private javax.swing.JComboBox<String> jComboBoxRule4c;
    private javax.swing.JComboBox<String> jComboBoxRule5a;
    private javax.swing.JComboBox<String> jComboBoxRule5b;
    private javax.swing.JComboBox<String> jComboBoxRule5c;
    private javax.swing.JComboBox<String> jComboBoxRule6a;
    private javax.swing.JComboBox<String> jComboBoxRule6b;
    private javax.swing.JComboBox<String> jComboBoxRule6c;
    private javax.swing.JComboBox<String> jComboBoxRule7a;
    private javax.swing.JComboBox<String> jComboBoxRule7b;
    private javax.swing.JComboBox<String> jComboBoxRule7c;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel10;
    private javax.swing.JPanel jPanel11;
    private javax.swing.JPanel jPanel12;
    private javax.swing.JPanel jPanel14;
    private javax.swing.JPanel jPanel15;
    private javax.swing.JPanel jPanel16;
    private javax.swing.JPanel jPanel2;
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
    private javax.swing.JTabbedPane jTabbedPane1;
    private javax.swing.JTabbedPane jTabbedPane2;
    private javax.swing.JTabbedPane jTabbedPane3;
    private javax.swing.JTextArea jTextArea2;
    // End of variables declaration//GEN-END:variables
}
