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
import PatternKnowladge.FiturNpParser;
import PatternKnowladge.GetDataRule;
import PatternKnowladge.GetRule;
import PatternKnowladge.NpPherase;
import PatternKnowladge.Opini;
import PatternKnowladge.Rule;
import PatternKnowladge.Rule2;
import PatternKnowladge.StanParser;
import PatternKnowladge.akurasi;
import PatternKnowladge.grouping;
import PatternKnowladge.ngram;
import PatternKnowladge.parseRule;
import PatternKnowladge.polaritas;
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
import Taxonomy.CleaningFitur;
import Taxonomy.FiturTaxonomy;
import Taxonomy.Ontology;
import Taxonomy.OntologyNoTag;
import Taxonomy.OntologyTranverserAPI;
import Taxonomy.OntologyTranverserAPI2;
import Taxonomy.SingletonFileOntology;
import Taxonomy.TaxnoClean;
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
    public static List<String> TypeParser = new ArrayList<String>();
    public static ArrayList<String> corpus = new ArrayList<String>();
    public static ArrayList<String> corpuspre = new ArrayList<String>();
    public static ArrayList<String> dataFit = new ArrayList<String>();
    public static ArrayList<String> dataFitPre = new ArrayList<String>();
    public static ArrayList<String> noDobelDataFit = new ArrayList<String>();
    public static ArrayList<String> opPos = new ArrayList<String>();
    public static ArrayList<String> opNeg = new ArrayList<String>();
    public static ArrayList<String> inpOpini = new ArrayList<String>();
    public static ArrayList<String> kalimatPre = new ArrayList<String>();
    public static ArrayList<String> kalimatIob = new ArrayList<String>();
    public static ArrayList<String> ngram = new ArrayList<String>();
    public static ArrayList<String> ngram2 = new ArrayList<String>();
    public static ArrayList<String> ngramIob = new ArrayList<String>();
    public static ArrayList<String> ngramIob2 = new ArrayList<String>();
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
    public static String regIOB = "";

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
    Rule2 R2 = new Rule2();
    Opini Op = new Opini();
    Fitur Fit = new Fitur();
    PorterStem Ps = new PorterStem();
    StanParser Parser = new StanParser();
    inputFile input = new inputFile();
    IobChunk iobchunk = new IobChunk();
    OntologyTranverserAPI2 ontolog = new OntologyTranverserAPI2();
    OntologyTranverserAPI ontolog2 = new OntologyTranverserAPI();
//    GetRule ruleget = new GetRule();
    RegIob regbio = new RegIob();
    akurasi akrs= new akurasi();
    polaritas polar = new polaritas();
    grouping group = new grouping();
    CleaningFitur clnfit = new CleaningFitur();
    FiturTaxonomy fitTax = new FiturTaxonomy();
    NpPherase npParser = new NpPherase();
    FiturNpParser fiturnpphrase = new FiturNpParser();
    TaxnoClean taxnoclean = new TaxnoClean();
    Ontology ontology = new Ontology();
    OntologyNoTag ontologynotag = new OntologyNoTag();
    
    

        
    //}
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

        buttonGroup1 = new javax.swing.ButtonGroup();
        jPanel1 = new javax.swing.JPanel();
        Grouping = new javax.swing.JTabbedPane();
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
        jCheckBoxTaxonomy = new javax.swing.JCheckBox();
        jButton3 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        jCheckBoxnounPherase = new javax.swing.JCheckBox();
        jComboBoxOntologyFile = new javax.swing.JComboBox<>();
        jScrollPane3 = new javax.swing.JScrollPane();
        AreaExtraksi = new javax.swing.JTextArea();
        jTabbedPane3 = new javax.swing.JTabbedPane();
        jPanel14 = new javax.swing.JPanel();
        jPanel17 = new javax.swing.JPanel();
        jScrollPane8 = new javax.swing.JScrollPane();
        jTextAreaRule = new javax.swing.JTextArea();
        jPanel9 = new javax.swing.JPanel();
        jPanel11 = new javax.swing.JPanel();
        jScrollPane4 = new javax.swing.JScrollPane();
        jAreaHasilExtraksi = new javax.swing.JTextArea();
        jPanel12 = new javax.swing.JPanel();
        jPanel13 = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jmlFiturDataset = new javax.swing.JLabel();
        jmlFiturTerekstrek = new javax.swing.JLabel();
        jmlbenar1 = new javax.swing.JLabel();
        precisionFitur = new javax.swing.JLabel();
        recallFitur = new javax.swing.JLabel();
        f1scoreFitur = new javax.swing.JLabel();
        precissionPrediksi = new javax.swing.JLabel();
        f1scorePrediksi = new javax.swing.JLabel();
        jPanel15 = new javax.swing.JPanel();
        jLabel21 = new javax.swing.JLabel();
        jLabel22 = new javax.swing.JLabel();
        jLabel23 = new javax.swing.JLabel();
        jLabel24 = new javax.swing.JLabel();
        jLabel25 = new javax.swing.JLabel();
        jLabel26 = new javax.swing.JLabel();
        jmlFiturPolaritasTerekstak = new javax.swing.JLabel();
        jmlbenar2 = new javax.swing.JLabel();
        precisionPolaritas = new javax.swing.JLabel();
        recallPolaritas = new javax.swing.JLabel();
        f1scorePolaritas = new javax.swing.JLabel();
        recallPrediksi = new javax.swing.JLabel();
        jArea = new javax.swing.JPanel();
        jScrollPane7 = new javax.swing.JScrollPane();
        jAreaAkurasi = new javax.swing.JTextArea();
        jPanel16 = new javax.swing.JPanel();
        jPanel18 = new javax.swing.JPanel();
        jComboBoxGrouping = new javax.swing.JComboBox<>();
        jLabel7 = new javax.swing.JLabel();
        jPanel19 = new javax.swing.JPanel();
        jScrollPane5 = new javax.swing.JScrollPane();
        jTextAreaHasilGrouping = new javax.swing.JTextArea();

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
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel5Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 1106, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 530, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(441, 441, 441))
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(96, 96, 96)
                .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(95, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(20, Short.MAX_VALUE))
        );

        Grouping.addTab("Dataset", jPanel2);

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
                .addGap(101, 101, 101)
                .addComponent(CheckSW)
                .addGap(71, 71, 71)
                .addComponent(CheckLemma)
                .addGap(55, 55, 55)
                .addComponent(CheckPT)
                .addGap(49, 49, 49)
                .addComponent(CheckBC)
                .addGap(84, 84, 84)
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
                .addContainerGap(321, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(43, 43, 43)
                .addComponent(jPanel7, javax.swing.GroupLayout.PREFERRED_SIZE, 77, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(28, 28, 28)
                .addComponent(jPanel8, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        Grouping.addTab("Preprocessing", jPanel3);

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

        jCheckBoxTaxonomy.setText("Automatic Taxonomy");

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

        jCheckBoxnounPherase.setText("Noun Phrase");

        jComboBoxOntologyFile.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "CanonG3_Taxonomy", "Nokia6610_Taxonomy", "ApexDVDPlayer_Taxonomy", "CreativeLab_Taxonomy" }));
        jComboBoxOntologyFile.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBoxOntologyFileActionPerformed(evt);
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
                    .addComponent(jCheckBoxTypeDepedency))
                .addGap(72, 72, 72)
                .addGroup(jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel3)
                    .addGroup(jPanel10Layout.createSequentialGroup()
                        .addComponent(jCheckBoxTaxonomy)
                        .addGap(53, 53, 53)
                        .addGroup(jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel10Layout.createSequentialGroup()
                                .addComponent(jCheckBoxnounPherase, javax.swing.GroupLayout.PREFERRED_SIZE, 114, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(65, 65, 65)
                                .addComponent(jButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jButton4, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 46, Short.MAX_VALUE))
                            .addGroup(jPanel10Layout.createSequentialGroup()
                                .addComponent(jCheckBoxNpParser)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jComboBoxOntologyFile, javax.swing.GroupLayout.PREFERRED_SIZE, 258, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addGap(49, 49, 49))
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
                    .addComponent(jCheckBoxTaxonomy)
                    .addComponent(jCheckBoxNpParser)
                    .addComponent(jComboBoxOntologyFile, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel10Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jCheckBoxTypeDepedency)
                            .addComponent(jCheckBoxnounPherase)))
                    .addGroup(jPanel10Layout.createSequentialGroup()
                        .addGap(25, 25, 25)
                        .addGroup(jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jButton3)
                            .addComponent(jButton4))))
                .addContainerGap(21, Short.MAX_VALUE))
        );

        AreaExtraksi.setColumns(20);
        AreaExtraksi.setRows(5);
        jScrollPane3.setViewportView(AreaExtraksi);

        jPanel14.setBackground(new java.awt.Color(255, 255, 255));

        jTextAreaRule.setColumns(20);
        jTextAreaRule.setRows(5);
        jScrollPane8.setViewportView(jTextAreaRule);

        javax.swing.GroupLayout jPanel17Layout = new javax.swing.GroupLayout(jPanel17);
        jPanel17.setLayout(jPanel17Layout);
        jPanel17Layout.setHorizontalGroup(
            jPanel17Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel17Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane8, javax.swing.GroupLayout.PREFERRED_SIZE, 345, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(12, Short.MAX_VALUE))
        );
        jPanel17Layout.setVerticalGroup(
            jPanel17Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel17Layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(jScrollPane8, javax.swing.GroupLayout.DEFAULT_SIZE, 574, Short.MAX_VALUE)
                .addContainerGap())
        );

        javax.swing.GroupLayout jPanel14Layout = new javax.swing.GroupLayout(jPanel14);
        jPanel14.setLayout(jPanel14Layout);
        jPanel14Layout.setHorizontalGroup(
            jPanel14Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel14Layout.createSequentialGroup()
                .addComponent(jPanel17, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel14Layout.setVerticalGroup(
            jPanel14Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel14Layout.createSequentialGroup()
                .addComponent(jPanel17, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 22, Short.MAX_VALUE))
        );

        jTabbedPane3.addTab("Rule", jPanel14);

        javax.swing.GroupLayout jPanel6Layout = new javax.swing.GroupLayout(jPanel6);
        jPanel6.setLayout(jPanel6Layout);
        jPanel6Layout.setHorizontalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jTabbedPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 382, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 26, Short.MAX_VALUE)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jPanel10, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
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
                        .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 423, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel6Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jTabbedPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 655, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(41, Short.MAX_VALUE))
        );

        Grouping.addTab("Extraction", jPanel6);

        jPanel11.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "HASIL EKSTRAKSI", javax.swing.border.TitledBorder.CENTER, javax.swing.border.TitledBorder.TOP, new java.awt.Font("Tahoma", 1, 14))); // NOI18N

        jAreaHasilExtraksi.setColumns(20);
        jAreaHasilExtraksi.setRows(5);
        jScrollPane4.setViewportView(jAreaHasilExtraksi);

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
                .addContainerGap(277, Short.MAX_VALUE))
        );
        jPanel9Layout.setVerticalGroup(
            jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel9Layout.createSequentialGroup()
                .addGap(28, 28, 28)
                .addComponent(jPanel11, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        Grouping.addTab("Feature & Opinion", jPanel9);

        jPanel13.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Akurasi", javax.swing.border.TitledBorder.CENTER, javax.swing.border.TitledBorder.TOP));

        jLabel4.setText("Jumlah Fitur Dataset          :");

        jLabel5.setText("Jumlah Fitur Terekstrak     :");

        jLabel6.setText("Jumlah Benar                     :");

        jLabel8.setText("Precision Fitur                    :");

        jLabel9.setText("Recall Fitur                         :");

        jLabel10.setText("F1-score Fitur                    :");

        jLabel11.setText("Precission Prediksi              :");

        jLabel12.setText("F1-Score Prediksi               :");

        jmlFiturDataset.setText("0");

        jmlFiturTerekstrek.setText("0");

        jmlbenar1.setText("0");

        precisionFitur.setText("0");

        recallFitur.setText("0");

        f1scoreFitur.setText("0");

        precissionPrediksi.setText("0");

        f1scorePrediksi.setText("0");

        jPanel15.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Polaritas", javax.swing.border.TitledBorder.CENTER, javax.swing.border.TitledBorder.DEFAULT_POSITION));

        jLabel21.setText("Jumlah Fitur Polaritas Terekstrak                  : ");

        jLabel22.setText("Jumlah Benar                                                   :");

        jLabel23.setText("Precision Polaritas                                          :");

        jLabel24.setText("Recall Polaritas                                                :");

        jLabel25.setText("F1-score Polaritas                                           :");

        jLabel26.setText("Recall Prediksi                                                 :");

        jmlFiturPolaritasTerekstak.setText("0");

        jmlbenar2.setText("0");

        precisionPolaritas.setText("0");

        recallPolaritas.setText("0");

        f1scorePolaritas.setText("0");

        recallPrediksi.setText("0");

        javax.swing.GroupLayout jPanel15Layout = new javax.swing.GroupLayout(jPanel15);
        jPanel15.setLayout(jPanel15Layout);
        jPanel15Layout.setHorizontalGroup(
            jPanel15Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel15Layout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addGroup(jPanel15Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel15Layout.createSequentialGroup()
                        .addComponent(jLabel26)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(recallPrediksi))
                    .addGroup(jPanel15Layout.createSequentialGroup()
                        .addComponent(jLabel25)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(f1scorePolaritas))
                    .addGroup(jPanel15Layout.createSequentialGroup()
                        .addComponent(jLabel24)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(recallPolaritas))
                    .addGroup(jPanel15Layout.createSequentialGroup()
                        .addComponent(jLabel23)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(precisionPolaritas))
                    .addGroup(jPanel15Layout.createSequentialGroup()
                        .addComponent(jLabel22)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jmlbenar2))
                    .addGroup(jPanel15Layout.createSequentialGroup()
                        .addComponent(jLabel21)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jmlFiturPolaritasTerekstak)))
                .addContainerGap(218, Short.MAX_VALUE))
        );
        jPanel15Layout.setVerticalGroup(
            jPanel15Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel15Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel15Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel21)
                    .addComponent(jmlFiturPolaritasTerekstak))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel15Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel22)
                    .addComponent(jmlbenar2))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel15Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel23)
                    .addComponent(precisionPolaritas))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel15Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel24)
                    .addComponent(recallPolaritas))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel15Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel25)
                    .addComponent(f1scorePolaritas))
                .addGap(43, 43, 43)
                .addGroup(jPanel15Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel26)
                    .addComponent(recallPrediksi))
                .addContainerGap(28, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jPanel13Layout = new javax.swing.GroupLayout(jPanel13);
        jPanel13.setLayout(jPanel13Layout);
        jPanel13Layout.setHorizontalGroup(
            jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel13Layout.createSequentialGroup()
                .addGroup(jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel13Layout.createSequentialGroup()
                        .addGap(30, 30, 30)
                        .addGroup(jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel10)
                            .addComponent(jLabel9)
                            .addComponent(jLabel8)
                            .addComponent(jLabel6)
                            .addComponent(jLabel5)
                            .addComponent(jLabel4))
                        .addGap(19, 19, 19))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel13Layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel12)
                            .addComponent(jLabel11))
                        .addGap(18, 18, 18)))
                .addGroup(jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(f1scorePrediksi, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(precissionPrediksi, javax.swing.GroupLayout.PREFERRED_SIZE, 119, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(jmlFiturTerekstrek, javax.swing.GroupLayout.DEFAULT_SIZE, 45, Short.MAX_VALUE)
                        .addComponent(jmlFiturDataset, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jmlbenar1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(precisionFitur, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(recallFitur, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(f1scoreFitur, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addGap(206, 206, 206)
                .addComponent(jPanel15, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel13Layout.setVerticalGroup(
            jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel13Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel13Layout.createSequentialGroup()
                        .addGroup(jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel4)
                            .addComponent(jmlFiturDataset))
                        .addGap(15, 15, 15)
                        .addGroup(jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel5)
                            .addComponent(jmlFiturTerekstrek))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel6)
                            .addComponent(jmlbenar1))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel8)
                            .addComponent(precisionFitur))
                        .addGap(23, 23, 23)
                        .addGroup(jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel9)
                            .addComponent(recallFitur))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel10)
                            .addComponent(f1scoreFitur))
                        .addGap(28, 28, 28)
                        .addGroup(jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel11)
                            .addComponent(precissionPrediksi))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel12)
                            .addComponent(f1scorePrediksi)))
                    .addComponent(jPanel15, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(23, Short.MAX_VALUE))
        );

        jArea.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Akurasi", javax.swing.border.TitledBorder.CENTER, javax.swing.border.TitledBorder.DEFAULT_POSITION));

        jAreaAkurasi.setColumns(20);
        jAreaAkurasi.setRows(5);
        jScrollPane7.setViewportView(jAreaAkurasi);

        javax.swing.GroupLayout jAreaLayout = new javax.swing.GroupLayout(jArea);
        jArea.setLayout(jAreaLayout);
        jAreaLayout.setHorizontalGroup(
            jAreaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jAreaLayout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addComponent(jScrollPane7, javax.swing.GroupLayout.PREFERRED_SIZE, 1011, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(25, Short.MAX_VALUE))
        );
        jAreaLayout.setVerticalGroup(
            jAreaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jAreaLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jScrollPane7, javax.swing.GroupLayout.PREFERRED_SIZE, 448, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        javax.swing.GroupLayout jPanel12Layout = new javax.swing.GroupLayout(jPanel12);
        jPanel12.setLayout(jPanel12Layout);
        jPanel12Layout.setHorizontalGroup(
            jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel12Layout.createSequentialGroup()
                .addGap(54, 54, 54)
                .addGroup(jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jPanel13, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jArea, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(205, Short.MAX_VALUE))
        );
        jPanel12Layout.setVerticalGroup(
            jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel12Layout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addComponent(jPanel13, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(27, 27, 27)
                .addComponent(jArea, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        Grouping.addTab("Evaluation Result", jPanel12);

        jPanel18.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Grouping", javax.swing.border.TitledBorder.CENTER, javax.swing.border.TitledBorder.TOP));

        jComboBoxGrouping.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBoxGroupingActionPerformed(evt);
            }
        });

        jLabel7.setText("Pilih Fitur :");

        javax.swing.GroupLayout jPanel18Layout = new javax.swing.GroupLayout(jPanel18);
        jPanel18.setLayout(jPanel18Layout);
        jPanel18Layout.setHorizontalGroup(
            jPanel18Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel18Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel7)
                .addGap(27, 27, 27)
                .addComponent(jComboBoxGrouping, javax.swing.GroupLayout.PREFERRED_SIZE, 133, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(501, 501, 501))
        );
        jPanel18Layout.setVerticalGroup(
            jPanel18Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel18Layout.createSequentialGroup()
                .addGap(40, 40, 40)
                .addGroup(jPanel18Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jComboBoxGrouping, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel7))
                .addContainerGap(40, Short.MAX_VALUE))
        );

        jPanel19.setBorder(javax.swing.BorderFactory.createTitledBorder("Hasil Grouping"));

        jTextAreaHasilGrouping.setColumns(20);
        jTextAreaHasilGrouping.setRows(5);
        jScrollPane5.setViewportView(jTextAreaHasilGrouping);

        javax.swing.GroupLayout jPanel19Layout = new javax.swing.GroupLayout(jPanel19);
        jPanel19.setLayout(jPanel19Layout);
        jPanel19Layout.setHorizontalGroup(
            jPanel19Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel19Layout.createSequentialGroup()
                .addGap(34, 34, 34)
                .addComponent(jScrollPane5, javax.swing.GroupLayout.PREFERRED_SIZE, 1075, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(36, Short.MAX_VALUE))
        );
        jPanel19Layout.setVerticalGroup(
            jPanel19Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel19Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane5, javax.swing.GroupLayout.DEFAULT_SIZE, 424, Short.MAX_VALUE)
                .addContainerGap())
        );

        javax.swing.GroupLayout jPanel16Layout = new javax.swing.GroupLayout(jPanel16);
        jPanel16.setLayout(jPanel16Layout);
        jPanel16Layout.setHorizontalGroup(
            jPanel16Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel16Layout.createSequentialGroup()
                .addGap(85, 85, 85)
                .addGroup(jPanel16Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jPanel18, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel19, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(87, Short.MAX_VALUE))
        );
        jPanel16Layout.setVerticalGroup(
            jPanel16Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel16Layout.createSequentialGroup()
                .addGap(44, 44, 44)
                .addComponent(jPanel18, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jPanel19, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(53, Short.MAX_VALUE))
        );

        Grouping.addTab("Grouping", jPanel16);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addComponent(Grouping)
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(21, Short.MAX_VALUE)
                .addComponent(Grouping, javax.swing.GroupLayout.PREFERRED_SIZE, 735, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 6, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        // TODO add your handling code here:
        //FITUR
       

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
        
        String value= jComboBoxOntologyFile.getSelectedItem().toString();
      //String callowlfile =  "resources/ontology/"+value+".owl";
        SingletonFileOntology sengletonontologyfile = SingletonFileOntology.getInstance();
        sengletonontologyfile.setUrlfile(value);
        
        //============================//
        //System.out.println("Isi Kalimat Pre" + kalimatPre);
        for(int i = 0; i<kalimatPre.size(); i++){
            //for(int b = 0; b < kalimatIob.size(); b++){
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
            
//            ngramIob = Ng.PNgrams(kalimatIob.get(i));
//            ngramIob2 = Ng.PNgrams2(kalimatIob.get(i));
            

            if(CheckRule.isSelected()){
                parseRule parserule = parseRule.getInstance();
                String textRule = jTextAreaRule.getText().toString();
                parserule.setData(textRule);
                //String cleaningTagging = ontolog.cleaningTag(kalimatPre.get(i));
                String cleaningTagging = "";
                try {
                    cleaningTagging = ontology.OntologyJena(kalimatPre.get(i));
                } catch (FileNotFoundException ex) {
                    Logger.getLogger(Interface_TA.class.getName()).log(Level.SEVERE, null, ex);
                }
                //getRuleSelected();
                ArrayList<String> fiturdanopini = new ArrayList<>();
                AreaExtraksi.append(i+1+". Hasil Rule :");
                AreaExtraksi.append("\n");
                output.tulis("Hasil Rule : ");
                String fiturkalimat = "";
                String fituropinikalimat = "";
                String hasiltaxonomy = "";
                //String cleaningTagging = " ";
                //2-gram ==========================================================
                for (int j = 0; j < ngram.size(); j++) {
                    String opi=R2.rules(ngram.get(j));
                    if(opi!=null){
                        //hasil rule
                        //output.tulis(opi);

                        AreaExtraksi.append(opi);
                        AreaExtraksi.append("\n");
                        //cleaningTagging = ontolog.cleaningTag(opi);
                        
                        //hasiltaxonomy = ontolog.OntologyApi(cleaningTagging);
                        //ambil opini dari ngram adj/adv
                        tmpOpini = Op.getToken(ngram.get(j));

                        //pilih fitur
                        //if(jRadioButton1.isSelected()){
                            //listFit=Fit.getFitur(opi, corpuspre); //dengan corpus
                            //}
                            //listFit = Fit.getFiturNoCorp(opi);
                            if(jCheckBoxTaxonomy.isSelected()){
                                listFit = fitTax.taxoFitur(cleaningTagging, corpuspre);
                                //listFit=Fit.getFiturParser(cleaningTagging, corpuspre);
                            }else{
                                listFit=Fit.getFitur(opi, corpuspre); //dengan corpus
                            }
                            
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
                    String opi2=R2.rules(ngram2.get(j));
                    if(opi2!=null){
                        //output.tulis(opi2);

                        AreaExtraksi.append(opi2);
                        AreaExtraksi.append("\n");
                        //cleaningTagging = ontolog.cleaningTag(opi2);
                        //hasiltaxonomy = ontolog.OntologyApi(cleaningTagging);
                        //cleaningTagging = clnfit.Clean(opi2);
                        //ambil opini dari ngram adj/adv
                        tmpOpini = Op.getToken(ngram2.get(j));

                        //pilih fitur
                        //if(jRadioButton1.isSelected()){
                            //listFit=Fit.getFitur(opi2, corpuspre); //dengan corpus
                            //}
                            //listFit = fitTax.taxoFitur(cleaningTagging, corpuspre);
                            if(jCheckBoxTaxonomy.isSelected()){
                                listFit = fitTax.taxoFitur(cleaningTagging, corpuspre);
                                //listFit=Fit.getFitur(opi2, corpuspre);
                                //listFit=Fit.getFiturParser(cleaningTagging, corpuspre);
                            }else{
                                listFit=Fit.getFitur(opi2, corpuspre); //dengan corpus
                            }
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
                AreaExtraksi.append("Taxonomy : " + cleaningTagging);
                AreaExtraksi.append("\n");
                AreaExtraksi.append("=============================================");
                AreaExtraksi.append("\n");
                
            }
            
            
//================================================NOUN PHRASE==============================================================
//            if(jCheckBoxnounPherase.isSelected()){
//                ArrayList<String> fiturdanopini = new ArrayList<>();
//                String fiturkalimat = "";
//                String fituropinikalimat = "";
//                
//                AreaExtraksi.append(i+1+". Hasil Noun Pherase :");
//                AreaExtraksi.append("\n");
//                
//                //typeD=Parser.typeDP(Ps.removetag(kalimatPre.get(i)));
                //String hasiliob = npParser.NPPherase(kalimatIob.get(i));
//                //typeD=Parser.typeDP(inputan.get(i));
//                AreaExtraksi.append(kalimatIob.get(i));
//                String taxo = ontolog.cleaningTag(kalimatIob.get(i));
//                
//               //if(jCheckBoxTaxonomy.isSelected()){
//                                
//                                //System.out.println("Hasil taxonomy = " + TypeParser);
//                            //}else{
//                TypeParser = Parser.NPFitur(kalimatIob.get(i));
//                            //}
//                //TypeParser = Parser.NPFitur(kalimatIob.get(i));
//                
//                //TypeParser = clnfit.Clean(kalimatIob.get(i));
//                System.out.println("HASIL PEMBERSIHAN" + TypeParser);
//                AreaExtraksi.append("\n");
//                String tampfitur = " ";
//                //String cleaningTagging = ontolog.cleaningTag(kalimatIob.get(i));
//                //jTextArea15.append(Parser.typeDPTree(inputan.get(i)).toString());
//                //jTextArea15.append("\n");
//                //output.tulis("Fitur dan opini : "+typeD);
//                String tdFitur = "";
//                String tdOpini = "";
//                String tampParser = "";
//                for(int it=0;it<TypeParser.size();it++){
////                    AreaExtraksi.append(typeD.get(it));
////                    AreaExtraksi.append("\n");
//                    tampParser = TypeParser.get(it);
//                    String[] words = TypeParser.get(it).split(" ");
////
//                    tdFitur=words[0].trim().replaceAll("\\s+", " "); //mengambil fitur
//                    tdOpini=words[0].trim().replaceAll("\\s+", " "); //mengambil opini
//                
//                    //System.out.println("TDFITUR : " + tdFitur);
//
//                    //if(jRadioButton1.isSelected()){
//                        //listFit=Fit.getFiturParser(tdFitur, corpuspre); //cek fitur dengan corpus
//                    //tampfitur = TypeParser.get(it);
//                    System.out.println("ISINYA TAMP PARSER :" + tampfitur);
////                         if(jCheckBoxTaxonomy.isSelected()){
////                                listFit = fitTax.taxoFitur(tdFitur, corpuspre);
////                            }else{
////                                listFit=Fit.getFiturParser(tdFitur, corpuspre); //dengan corpus
////                            }
//                    //}
//                    //String tapparser = TypeParser.get(it);
//                    //listFit = fitTax.taxoFitur(TypeParser.get(it), corpuspre);
//                            if(jCheckBoxTaxonomy.isSelected()){
//                                listFit = fitTax.taxoFitur(taxo, corpuspre);
//                            }else{
//                                listFit=Fit.getFiturParser(tampParser, corpuspre); 
//                            }
//                     //listFit=Fit.getFiturParser(TypeParser.get(it), corpuspre); //dengan corpus
//                     //listFit=fiturnpphrase.npFitur(TypeParser.get(it), corpuspre); //dengan corpus
//                    
//                    /*
//                    else if(jRadioButton2.isSelected()){
//                        listFit=Fit.getFiturParserNoCorp(tdFitur); //cek fitur tanpa corpus
//                    }
//                    */
//                
//                    if(!listFit.isEmpty()){
//
//                        //ambil pasangan fitur dan opini nya
//                        //tmpFitOp.clear();
//                        ArrayList<String> tmpFitOp = new ArrayList<String>();
//                        tmpFitOp.add(tdFitur);
//                        tmpFitOp.add(tdOpini);
//                        String fituropini = tdFitur;
//                        System.out.println("Dari FiturOpini : " + fituropini);
//                        if ( (Collections.frequency(fiturdanopini, fituropini)) < 1 ){
//                            fiturdanopini.add(fituropini);
//                            
//                        }
//                        if ( (Collections.frequency(listFitOp, tmpFitOp)) < 1 ){
//                            listFitOp.add(tmpFitOp);
//                        }
//                        
//                    }
//                        for (int l = 0; l < listFit.size(); l++) {
//                            String fitr=listFit.get(l);
//                            
//                            if(fitr!=null){                                
//                                fiturkalimat = fiturkalimat + fitr + ",";
//                                System.out.println("isi fitur kalimat : " + fitr);
//                                if ( (Collections.frequency(temp1, fitr)) < 1 ){
//                                    temp1.add(fitr);
//                                    //temp2.add(fitr);
//                                    //output.tulis("TD = "+fitr);
//                                } 
//                                if ((Collections.frequency(fiturrule, fitr)) < 1 ){
//                                    fiturrule.add(fitr);
//                                    System.out.print("dari rule 3gram = "+fitr);
//                                    System.out.println("ISI RULE" + fiturrule);
//                                }
//                            }
//                        }
//                    }
//                
////                if(fiturkalimat != ""){
////                    fiturkalimat = fiturkalimat.substring(0, fiturkalimat.length()-1);
////                }
////                else{
////                    fiturkalimat = "-";
////                }
//
//                if(!fiturrule.isEmpty()){
//                    
//                    for(int cnt = 0; cnt < fiturrule.size(); cnt++){
//                        fiturkalimat = fiturkalimat + fiturrule.get(cnt) + ",";
//                    }
//                    fiturkalimat = fiturkalimat.substring(0, fiturkalimat.length()-1);
//                }
//                else{
//                    fiturkalimat = "-";
//                }
//
//                
//                if(!fiturdanopini.isEmpty()){
//                    for(int cnt = 0; cnt < fiturdanopini.size(); cnt++){
//                        fituropinikalimat = fituropinikalimat + fiturdanopini.get(cnt) + ",";
//                    }
//                    fituropinikalimat = fituropinikalimat.substring(0, fituropinikalimat.length()-1);
//                }
//                else{
//                    fituropinikalimat = "-";
//                }
//                
//                output.tulis("Hasil Parser : "+fiturkalimat);
//                AreaExtraksi.append("Fitur : "+fiturkalimat);
//                AreaExtraksi.append("\n");
////                AreaExtraksi.append("Fitur - Opini : "+fituropinikalimat);
////                AreaExtraksi.append("\n");
//                AreaExtraksi.append("Taxonomynta : "+ taxo);
//                AreaExtraksi.append("\n");
//                AreaExtraksi.append("=============================================");
//                AreaExtraksi.append("\n");
//            
//            }
            
            

//==============================================NP PARSER==============================================================================
            //NP PARSER CODE..
            if(jCheckBoxNpParser.isSelected()){
             ArrayList<String> fiturdanopini = new ArrayList<>();
             ArrayList<String> fiturkalimat = new ArrayList<>();
                String fiturkalimate = "";
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
                
                String tangkap = "";
                String NounPhrase = "";
                String tangkap2 = tangkap.join(" ", nounPhrases);
                System.out.println("SETELAH TREE : " + tangkap2);
                String tampiob = kalimatIob.get(i);
                String taxonp = "";
                try {
                    taxonp = ontology.OntologyJena(tampiob);
                } catch (FileNotFoundException ex) {
                    Logger.getLogger(Interface_TA.class.getName()).log(Level.SEVERE, null, ex);
                }
                String taxo = "";
                
                String TampungFitur = "";
                //TypeParser = Parser.NPFitur(kalimatIob.get(i));
                String hasiliob = npParser.NPPherase(kalimatIob.get(i));
                System.out.println("HASIL IOOOOOOOBBBB : " + hasiliob);
                //for(int np = 0; np < TypeParser.size(); np++){
                    //NounPhrase = TypeParser.get(np);
                try {
                    taxo = ontologynotag.OntologyJena(hasiliob);
                } catch (FileNotFoundException ex) {
                    Logger.getLogger(Interface_TA.class.getName()).log(Level.SEVERE, null, ex);
                }
                
                for(int it = 0; it < nounPhrases.size(); it++){
                    //for(int itu = 0; itu < TypeParser.size(); itu++){
                    
                    //output.tulis("Hasil NounPhrases : "+nounPhrases.get(it));
                    
                    AreaExtraksi.append(nounPhrases.get(it));
                    AreaExtraksi.append("\n");
                    TampungFitur = nounPhrases.get(it);
                    //if(jRadioButton1.isSelected()){
                        //cek Np dengan corpus
                
                        //System.out.println("TAXOOOO : " + nounPhrases.get(it).replaceAll(",", " "));
                    //}
//                    if(jCheckBoxTaxonomy.isSelected()){
//                        
//                        listFit=fitTax.taxoFitur(taxo, corpuspre); //dengan corpus
//                    }else{
//                        listFit=Fit.getFiturParser2(TypeParser.get(itu), corpuspre); //dengan corpus
//                    }

                    if(jCheckBoxTaxonomy.isSelected()){
                            //String taxo = TaxnoClean.TaxoNoTag(tangkap2);
                            listFit=fitTax.taxoFitur(taxo, corpuspre); 
                        }else if(jCheckBoxnounPherase.isSelected()){
                            //listFit=Fit.getFiturParser2(TypeParser.get(itu), corpuspre); 
                            listFit=Fit.getFiturParserFix(hasiliob, corpuspre); 
                        }else if(jCheckBoxTaxonomy.isSelected() && jCheckBoxnounPherase.isSelected()){
                            listFit = fitTax.taxoFitur(taxonp, corpuspre);
                        }else{
                            listFit=Fit.getFiturParser2(TampungFitur, corpuspre); 
                        }
                
                    /*else if(jRadioButton1.isSelected()){
                        listFit=Fit.getFiturParserNoCorp(nounPhrases.get(it)); //tanpa corpus
                    }*/

                    //hasil fitur dari parser dimasukkan ke list
                    if(!listFit.isEmpty()){
                        for (int l = 0; l < listFit.size(); l++) {
                            //jTextArea16.append("Fitur : ");
                            String fitr=listFit.get(l);
                            if(fitr!=null){
                                //fiturkalimat = fiturkalimat + fitr + ",";
                                fiturkalimat.add(fitr);
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
                            //listFit=Fit.getFiturParser2(nounPhrases.get(it), corpuspre); //dengan corpus
                        //}
                        //listFit=Fit.getFiturParser(taxo, corpuspre);
                        if(jCheckBoxTaxonomy.isSelected()){
                            //String taxo = TaxnoClean.TaxoNoTag(tangkap2);
                            listFit=fitTax.taxoFitur(taxo, corpuspre); //dengan corpus
                        }else if(jCheckBoxnounPherase.isSelected()){
                            //listFit=Fit.getFiturParser2(TypeParser.get(itu), corpuspre); //dengan corpus
                            listFit=Fit.getFiturParser(hasiliob, corpuspre); 
                        }else if(jCheckBoxTaxonomy.isSelected() && jCheckBoxnounPherase.isSelected()){
                            listFit = fitTax.taxoFitur(taxonp, corpuspre);
                        }else{
                            listFit=Fit.getFiturParser2(TampungFitur, corpuspre); //dengan corpus
                       }
                            
                        /*           
                        else if(jRadioButton2.isSelected()){
                            listFit=Fit.getFiturParser2NoCorp(nounPhrases.get(it)); //tanpa corpus
                        }
                        */    
                        
                        for (int l = 0; l < listFit.size(); l++) {
                            String fitr=listFit.get(l);
                            if(fitr!=null){
                                //fiturkalimat = fiturkalimat + fitr + ",";
                                fiturkalimat.add(fitr);
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
                //}
                }
                if(!fiturkalimat.isEmpty()){
                    for(int ft = 0; ft < fiturkalimat.size(); ft++){
                        fiturkalimate = fiturkalimate + fiturkalimat.get(ft) + ",";
                    }
                    fiturkalimate = fiturkalimate.substring(0, fiturkalimate.length()-1);
                }
                else{
                    fiturkalimate = "-";
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
                AreaExtraksi.append("Fitur : "+fiturkalimate);
                AreaExtraksi.append("\n");
                AreaExtraksi.append("Fitur - Opini : "+fituropinikalimat);
                AreaExtraksi.append("\n");
                AreaExtraksi.append("Taxonomy : "+ taxo);
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
                String tampungtaxo = "";
                String taxo = "";
                String tdFitur = "";
                String tdOpini = "";
                for(int it=0;it<typeD.size();it++){
                    AreaExtraksi.append(typeD.get(it));
                    AreaExtraksi.append("\n");
                    String[] words = typeD.get(it).split(" ");
                    //System.out.println("dari type depedency : " + typeD);
                    tdFitur=words[0].trim().replaceAll("\\s+", " "); //mengambil fitur
                    tdOpini=words[1].trim().replaceAll("\\s+", " "); //mengambil opini
                    
                    //System.out.println("TDFITUR : " + tdFitur);
                
                    try {
                        //if(jRadioButton1.isSelected()){
                        //listFit=Fit.getFiturParser(tdFitur, corpuspre); //cek fitur dengan corpus
                        
//
//}
                    taxo = ontologynotag.OntologyJena(tdFitur);
                    } catch (FileNotFoundException ex) {
                        Logger.getLogger(Interface_TA.class.getName()).log(Level.SEVERE, null, ex);
                    }
                     
                     tampungtaxo = taxo;
                    
                     
                     if(jCheckBoxTaxonomy.isSelected()){
                         listFit=fitTax.taxoFitur(taxo, corpuspre); //dengan corpus
                     }else{
                         listFit=Fit.getFiturParser(tdFitur, corpuspre); //dengan corpus
                     }
                    
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
                        System.out.println("PERHITUNGANNYA OP : " + Collections.frequency(listFitOp, tmpFitOp));
                        if ( (Collections.frequency(listFitOp, tmpFitOp)) < 1 ){
                            listFitOp.add(tmpFitOp);
                        }
                        //

                        for (int l = 0; l < listFit.size(); l++) {
                            String fitr=listFit.get(l);
                            
                            if(fitr!=null){                                
                                fiturkalimat = fiturkalimat + fitr + ",";
                                System.out.println("PERHITUNGANNYA : " + Collections.frequency(temp1, fitr));
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
                AreaExtraksi.append("Taxonomy : "+ tampungtaxo);
                AreaExtraksi.append("\n");
                AreaExtraksi.append("=============================================");
                AreaExtraksi.append("\n");
            }
            
            
            
            
//===========================================AKURASI===========================================================================
            
            fixFit=Fit.cekFitur(temp1, temp2);
            //output.tulis("Fix fitur sebelum di cek = "+fixFit.toString());
            output.tulis("Hasil ekstraksi fitur : "+fixFit.toString());
            output.tulis("Pasangan Fitur - Opini : "+listFitOp.toString());
            
            //menuliskan hasil ekstraksi fitur kandidat ke textarea
            //jTextArea3.append(i+1+"."+fixFit.toString());
            //jTextArea3.append("\n");
            
            jAreaHasilExtraksi.append(i+1+".");
            jAreaHasilExtraksi.append("\n");
            jAreaHasilExtraksi.append("Kandidat Fitur : "+fixFit.toString());
            jAreaHasilExtraksi.append("\n");
            jAreaHasilExtraksi.append("Kandidat Fitur dan Opini : "+listFitOp.toString());
            jAreaHasilExtraksi.append("\n");
            
            
            //mendapatkan polaritas=============================================
            //dengan lexicon pos-neg
            //polaritas = polar.getPolarElse(fixFit,listFitOp,opPos,opNeg);
            
            //mendapatkan sesuai format pengecekan fitur dan polar
            //fp = polar.cgForm(polaritas);
            //output.tulis("polaritas dengan Op.Lexicon = "+fp);
            
            //dengan skor dengan swn
            System.out.println("LIST SWN :" + fixFit);
            System.out.println("LIST SWN OP :" + listFitOp);
            polaritas = polar.getPolarSWN(fixFit,listFitOp);
            
            //jTextArea17.append(i+1+"."+polaritas.toString());
            //jTextArea17.append("\n");
            
            jAreaHasilExtraksi.append("Kandidat Fitur dan Polaritas : "+polaritas.toString());
            jAreaHasilExtraksi.append("\n");
            
            //mendapatkan sesuai format pengecekan fitur dan polar
            fp = polar.cgForm(polaritas);
            output.tulis("polaritas dengan SWN = "+fp);
            
            //eliminasi fitur ekstrak yg tidak memiliki opini===============================================================
            for(int j = 0; j<fixFit.size(); j++){
                for(int it = 0; it<fp.size(); it++){
                    if(fp.get(it).get(0)!="-"){
                        if(fp.get(it).get(1).contains("no opini") && fp.get(it).get(0).equalsIgnoreCase(fixFit.get(j))){
                            fixFit.remove(j);
                        }
                    }
                }
            }
            
            //jika setelah di remove ternyata list kosong
            if(fixFit.isEmpty()){
                fixFit.add("-");
            }
            
            polaritas = polar.getPolarSWN(fixFit,listFitOp);
            
           for (int k = 0; k < fixFit.size(); k++) {
                //tambahan
               if(fixFit.get(k) != "-"){
                    if ( (Collections.frequency(noDobel, fixFit.get(k))) < 1 ){
                        noDobel.add(fixFit.get(k));
                    }
               }
                //
            }
            
            fiturkalimattotal.add(fixFit);
            fiturpolaritastotal.add(polaritas);
            
            //System.out.println("fitur kalimat 1 = "+fixFit);
            //System.out.println("fitur kalimat 2 = "+fiturkalimattotal);
            
           for (int k = 0; k < fixFit.size(); k++) {
                //output.tulis("\nFitur : "+ fixFit.get(k) +"\n");

                //==== grouping ====//
                for (int l = 0; l< noDobel.size(); l++){
                    ArrayList<String> Group = group.findGroup(noDobel.get(l), fixFit.get(k), polaritas, inputan.get(i), database);
                    if(!listGroup.contains(Group) && Group.size()!=0){
                        listGroup.add(Group);
                    }
                }
                //==================//
            }
           
            
            for(int tes2 = 0; tes2<fp.size(); tes2++){
                totalfiturfp.add(fp.get(tes2));
            }
            
            String fiturkal ="";
            for(int tes=0; tes<fixFit.size(); tes++){
                fiturkal = fiturkal+fixFit.get(tes)+",";
                totalfitur.add(fixFit.get(tes));
            }
            
            if(fiturkal.endsWith(",")){
                fiturkal = fiturkal.substring(0, fiturkal.length()-1);
            }
            fiturkalimat.add(fiturkal);
            
            output.tulis("Fix fitur : "+fixFit.toString());
            output.tulis("Fitur dataset : "+dataFitPre.get(i));
            
            //menuliskan hasil fitur fix ke textarea
            //jTextArea5.append(i+1+"."+fixFit.toString()+"##"+inputan.get(i));
            //jTextArea5.append("\n");
            
            //mendapatkan total fitur benar,salah==============================
            temp3=Fit.validasiFitur3(fixFit, dataFitPre.get(i));
            
            for (int l = 0; l < jumlah.size(); l++) {
                jumlah.set(l, jumlah.get(l)+Double.parseDouble(temp3.get(l)));
            }
            
            //output.tulis("Fitur dataset : "+dataFitPre.get(i));
            //output.tulis("==================================================");
            output.tulis("P fitur : "+temp3.get(4));
            output.tulis("R fitur: "+temp3.get(5));
            
            //mendapatkan fp kalimat
            String fiturpolaritas = "";
            for(int x = 0; x<fp.size(); x++){
                if(fp.get(x).get(0)!="-"){
                    if(!fp.get(x).get(1).contains("no opini")){
                        fiturpolaritas = fiturpolaritas + fp.get(x).get(0) + "[" + fp.get(x).get(1) + "]" + ",";
                    }
                }
            }
            if(fiturpolaritas != ""){
                fiturpolaritas = fiturpolaritas.substring(0, fiturpolaritas.length()-1);
            }
            
            jAreaHasilExtraksi.append("Hasil Ekstraksi : "+fiturpolaritas+"##"+inputan.get(i));
            jAreaHasilExtraksi.append("\n");
            jAreaHasilExtraksi.append("================================================");
            jAreaHasilExtraksi.append("\n");
            
            jAreaAkurasi.append(i+1+"."+fiturpolaritas+"##"+inputan.get(i));
            jAreaAkurasi.append("\n");
            jAreaAkurasi.append("Fitur dataset : "+dataFitPre.get(i));
            jAreaAkurasi.append("\n");
            jAreaAkurasi.append("P Fitur = "+temp3.get(4));
            jAreaAkurasi.append("\n");
            jAreaAkurasi.append("R Fitur = "+temp3.get(5));
            jAreaAkurasi.append("\n");
            //output.tulis("==================================================");
            
            //mendapatkan total fitur dan polaritas benar,salha================
            temp4=Op.validasiOpini(fitpo, fp);
            //System.out.println("fitpo : "+fitpo);
            //System.out.println("fp : "+fp);
            for (int l = 0; l < jumlah2.size(); l++) {
                jumlah2.set(l, jumlah2.get(l)+Double.parseDouble(temp4.get(l)));
            }
            //total=jumlah.get(3);
            //output.tulis("Fitur Polaritas dataset : "+dataFit.get(j));
            //output.tulis("==================================================");
            //output.tulis("Fitur Polaritas terekstrak : "+temp4.get(3));
            //output.tulis("Fitur Polaritas benar : "+temp4.get(0));
            //output.tulis("Fitur Polaritas salah : "+temp4.get(1));
            output.tulis("P opini : "+temp4.get(4));
            output.tulis("R opini : "+temp4.get(5));
            
            jAreaAkurasi.append("P Fitur Polaritas = "+temp4.get(4));
            jAreaAkurasi.append("\n");
            jAreaAkurasi.append("R Fitur Polaritas = "+temp4.get(5));
            jAreaAkurasi.append("\n");
            //output.tulis("==================================================");
            jAreaAkurasi.append("==================================================");
            jAreaAkurasi.append("\n");
            /*jTextArea8.append("Bener Positif = "+temp4.get(6));
            jTextArea8.append("\n");
            jTextArea8.append("Bener Negatif = "+temp4.get(7));
            jTextArea8.append("\n");
            jTextArea8.append("Fitur datset Positif = "+temp4.get(8));
            jTextArea8.append("\n");
            jTextArea8.append("Fitur datset Negatif = "+temp4.get(9));
            jTextArea8.append("\n");
            jTextArea8.append("Fitur ekstrak Positif = "+temp4.get(10));
            jTextArea8.append("\n");
            jTextArea8.append("Fitur ekstrak Negatif = "+temp4.get(11));
            jTextArea8.append("\n");
            jTextArea8.append("P Fitur Positif = "+temp4.get(12));
            jTextArea8.append("\n");
            jTextArea8.append("R Fitur Positif = "+temp4.get(14));
            jTextArea8.append("\n");
            jTextArea8.append("P Fitur Negatif = "+temp4.get(13));
            jTextArea8.append("\n");
            jTextArea8.append("R Fitur Negatif = "+temp4.get(15));
            jTextArea8.append("\n");
            jTextArea8.append("==================================================");
            jTextArea8.append("\n");*/
            //=================================================================
            
            output.tulis("=====================================================");
            //akhir kalimat
        }
   // }
        
        /*
        for(int ctr =0; ctr < inputan.size(); ctr++){
            for (int k = 0; k < fiturkalimattotal.get(ctr).size(); k++) {
                //output.tulis("\nFitur : "+ fixFit.get(k) +"\n");
                //==== grouping ====//
                for (int l = 0; l< noDobel.size(); l++){
                    ArrayList<String> Group = group.findGroup(noDobel.get(l), fiturkalimattotal.get(ctr).get(k), fiturpolaritastotal.get(ctr), inputan.get(ctr), database);
                    if(!listGroup.contains(Group) && Group.size()!=0){
                        listGroup.add(Group);
                    }
                }
                //==================//
            }
        }
        */
        //output.tulis("Fitur kalimat :");
        int ext = 0;
        int crt = 0;
        int datset = 0;
        for(int count = 0; count < fiturkalimat.size(); count++){
            if(!fiturkalimat.get(count).equalsIgnoreCase("-")){
                ext = ext+1; //jumlah kalimat memili fitur +1
                if(!dataFitPre.get(count).equalsIgnoreCase("-")){
                    //System.out.println(fiturkalimat.get(count)+" dan "+dataFitPre.get(count));
                    crt = crt+1;
                   // for(int deas = 0; deas < dataFitPre.size(); deas++){
                    System.out.println("ISI DATA FIT PRE :" + !dataFitPre.get(count).equalsIgnoreCase("-"));
                   // }
                }
            }
            if(!dataFitPre.get(count).equalsIgnoreCase("-")){
                datset = datset+1;
            }
        }
        //System.out.println("bener:"+crt);
        //System.out.println("ekstrak:"+ext);
        //System.out.println("datset:"+datset);
        
        //akurasi prediksi fitur kalimat
        double precPre = 0;
        double recPre = 0;
        double f1prediksi = 0;
        precPre = akrs.precPrediksi(crt, ext);
        recPre = akrs.recPrediksi(crt, datset);
        precissionPrediksi.setText(precPre+"%");
        recallPrediksi.setText(recPre+"%");
        f1prediksi = (2*precPre*recPre)/(precPre+recPre);
        f1scorePrediksi.setText(f1prediksi+"%");
        //==============================
        
        System.out.println("ISI Jumlah Benar :" + crt);
        System.out.println("Fitur yang Terekstrak :" + ext);
         
        /*output.tulis("Datafit kalimat :");
        for(int count = 0; count < dataFitPre.size(); count++){
            output.tulis(dataFitPre.get(count));
        }*/
        //PERHITUNGAN PRECISION RECALL=========================================
        //FITUR
        //menampilkan jumlah benar salah
        //output.tulis("Jumlah Fitur Benar : "+jumlah.get(0));
        //output.tulis("Jumlah Fitur Salah : "+jumlah.get(1));
        //output.tulis("total Fitur dataset : "+jumlah.get(2));
        jmlFiturDataset.setText(jumlah.get(2).toString());
        //output.tulis("total Fitur ekstrak : "+jumlah.get(3));
        
        jmlbenar1.setText(jumlah.get(0).toString());
        jmlFiturTerekstrek.setText(jumlah.get(3).toString());
        
        //FITUR POLARITAS
         //menampilkan jumlah benar salah
        //output.tulis("Jumlah Fitur Polaritas Benar : "+jumlah2.get(0));
        //output.tulis("Jumlah Fitur Polaritas Salah : "+jumlah2.get(1));
        //output.tulis("total Fitur Polaritas dataset : "+jumlah2.get(2));
        //output.tulis("total Fitur Polaritas ekstrak : "+jumlah2.get(3));
        
        jmlbenar2.setText(jumlah2.get(0).toString());
        jmlFiturPolaritasTerekstak.setText(jumlah2.get(3).toString());
        
        //========================================================================
        
        
        //menghitung precision recall per kalimat
        output.tulis("Total P fitur : "+akrs.precision(jumlah.get(4), inputan.size())+"%");
        precisionFitur.setText(akrs.precision(jumlah.get(4), inputan.size())+"%");
        
        output.tulis("Total R fitur : "+akrs.recall(jumlah.get(5), inputan.size())+"%");
        recallFitur.setText(akrs.recall(jumlah.get(5), inputan.size())+"%");
        
        //f1 score fitur
        double prc = akrs.precision(jumlah.get(4), inputan.size());
        double rec = akrs.recall(jumlah.get(5), inputan.size());
        double f1 = (2*prc*rec)/(prc+rec);
        f1scoreFitur.setText(f1+"%");
        //=======================================================================
        
        //output.tulis("Precision fitur polaritas: "+akrs.precision(jumlah2.get(4), inputan.size())+"%");
        output.tulis("");
        jAreaAkurasi.append("Precision fitur : "+akrs.precision(jumlah.get(4), inputan.size())+"%");
        jAreaAkurasi.append("\n");
        jAreaAkurasi.append("Recall fitur : "+akrs.precision(jumlah.get(5), inputan.size())+"%");
        jAreaAkurasi.append("\n");
        jAreaAkurasi.append("F1 fitur : "+f1+"%");
        jAreaAkurasi.append("\n");
        
        //ubah jika menggunakan perhitungan 1-3 atau 4
        //output.tulis("Recall fitur : "+akrs.recall(jumlah.get/*(2)*/(0), jumlah.get/*(3)*/(2))+"%");
        //output.tulis("Recall fitur : "+akrs.precision(jumlah.get(5), inputan.size())+"%");
        output.tulis("Total P opini : "+akrs.precision(jumlah2.get(4), inputan.size())+"%");
        precisionPolaritas.setText(akrs.precision(jumlah2.get(4), inputan.size())+"%");
        
        output.tulis("Total R opini : "+akrs.recall(jumlah2.get(5), inputan.size())+"%");
        recallPolaritas.setText(akrs.recall(jumlah2.get(5), inputan.size())+"%");
        
        //f1 score polaritas
        double prcPolar = akrs.precision(jumlah2.get(4), inputan.size());
        double recPolar = akrs.recall(jumlah2.get(5), inputan.size());
        double f1Polar = (2*prcPolar*recPolar)/(prcPolar+recPolar);
        f1scorePolaritas.setText(f1Polar+"%");
        //=======================================================================
        
        output.tulis("");
        jAreaAkurasi.append("Precision fitur polaritas: "+akrs.precision(jumlah2.get(4), inputan.size())+"%");
        jAreaAkurasi.append("\n");
        jAreaAkurasi.append("Recall fitur polaritas: "+akrs.precision(jumlah2.get(5), inputan.size())+"%");
        jAreaAkurasi.append("\n");
        jAreaAkurasi.append("F1 polaritas : "+f1Polar+"%");
        jAreaAkurasi.append("\n");
        jAreaAkurasi.append("=====================================================");
        jAreaAkurasi.append("\n");
        /*jTextArea8.append("Precision fitur positif: "+akrs.precision(jumlah2.get(12), inputan.size())+"%");
        jTextArea8.append("\n");
        jTextArea8.append("Recall fitur positif: "+akrs.precision(jumlah2.get(14), inputan.size())+"%");
        jTextArea8.append("\n");
        jTextArea8.append("Precision fitur negatif: "+akrs.precision(jumlah2.get(13), inputan.size())+"%");
        jTextArea8.append("\n");
        jTextArea8.append("Recall fitur negatif: "+akrs.precision(jumlah2.get(15), inputan.size())+"%");
        jTextArea8.append("\n");
        jTextArea8.append("=====================================================");*/
        jAreaAkurasi.append("\n");
        jAreaAkurasi.append("Precision prediksi kalimat: "+precPre+"%");
        jAreaAkurasi.append("\n");
        jAreaAkurasi.append("Recall prediksi kalimat: "+recPre+"%");
        jAreaAkurasi.append("\n");
        jAreaAkurasi.append("F1 prediksi kalimat: "+f1prediksi+"%");
        jAreaAkurasi.append("\n");
        jAreaAkurasi.append("=====================================================");
        jAreaAkurasi.append("\n");
        //mengitung precision recall per dokumen
        //output.tulis("Precision fitur dokumen : "+akrs.precision(jumlah.get(0), jumlah.get(3))+"%");
        //output.tulis("Recall fitur dokumen : "+akrs.precision(jumlah.get(0), jumlah.get(2))+"%");
        //output.tulis("");
//        jTextArea8.append("Precision fitur dokumen : "+akrs.precision(jumlah.get(0), jumlah.get(3))+"%");
//        jTextArea8.append("\n");
//        jTextArea8.append("Recall fitur dokumen : "+akrs.recall(jumlah.get(0), jumlah.get(2))+"%");
//        jTextArea8.append("\n");
//        
//        //output.tulis("Precision fitur polaritas dokumen: "+akrs.precision(jumlah2.get(0), jumlah2.get(3))+"%");
//        //output.tulis("Recall fitur polaritas dokumen: "+akrs.precision(jumlah2.get(0), jumlah2.get(2))+"%");
//        //output.tulis("");
//        jTextArea8.append("Precision fitur polaritas dokumen: "+akrs.precision(jumlah2.get(0), jumlah2.get(3))+"%");
//        jTextArea8.append("\n");
//        jTextArea8.append("Recall fitur polaritas dokumen: "+akrs.recall(jumlah2.get(0), jumlah2.get(2))+"%");
//        jTextArea8.append("\n");
        /*
        jTextArea8.append("Total TP Fitur : "+jumlah.get(0));
        jTextArea8.append("\n");
        jTextArea8.append("Total FP Fitur : "+jumlah.get(1));
        jTextArea8.append("\n");
        Double FN = Double.valueOf(jumlah.get(2))-Double.valueOf(jumlah.get(0));
        jTextArea8.append("Total FN Fitur : "+FN);
        jTextArea8.append("\n");
        jTextArea8.append("Precision : "+String.valueOf(akrs.precisionTP(jumlah.get(0), jumlah.get(1))));
        jTextArea8.append("\n");
        jTextArea8.append("Recall : "+String.valueOf(akrs.precisionTP(jumlah.get(0), FN)));
        jTextArea8.append("\n");
        jTextArea8.append("=====================================================");
        jTextArea8.append("\n");*/
        //=====================================================================
        
        
        
        for(int num = 0; num < noDobel.size() ; num++){
            //output.tulis("isi no dobel : "+noDobel.get(num));
            if ( (Collections.frequency(noDobelDataFit, noDobel.get(num))) > 0 ){
                benar=benar+1;
            }
            else{
                //System.out.println("tdk ada pada data set : "+noDobel.get(num));
            }
        }
        
        /*jTextArea8.append("Akurasi dokumen :");
        jTextArea8.append("\n");
        jTextArea8.append("Benar : "+benar);
        jTextArea8.append("\n");
        jTextArea8.append("total fit dataset : "+noDobelDataFit.size());
        jTextArea8.append("\n");
        jTextArea8.append("total fitur ekstraksi  : "+noDobel.size());
        jTextArea8.append("\n");
        jTextArea8.append("Precision Dokumen : "+akrs.precision(benar, noDobel.size()));
        jTextArea8.append("\n");
        jTextArea8.append("Recall Dokumen : "+akrs.precision(benar, noDobelDataFit.size()));
        jTextArea8.append("\n");
        jTextArea8.append("=====================================================");*/
        //System.out.println("data fit nodobel : "+noDobelDataFit);
        //System.out.println("fit eks nodobel : "+noDobel);
        
        
        
        //grouping
        for(int l = 0; l< noDobel.size(); l++){
            jComboBoxGrouping.addItem(noDobel.get(l));
        }
        
        //grouping
        for (int l = 0; l< noDobel.size(); l++){
            output.tulis("Kelas : "+noDobel.get(l));
            for(int ax=0;ax<listGroup.size();ax++){
                if(noDobel.get(l) == listGroup.get(ax).get(0)){
                    output.tulis(""+listGroup.get(ax).get(1)+"##"+listGroup.get(ax).get(2));
                }
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
            String resultIob = " ";
            String tagging = ST.tagger(inputan.get(i));
            String lemanotag = lemma.lemmatizenotag(inputan.get(i));
            String stop = stopword.stopword(inputan.get(i));
            String reg = " ";
           
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
            if(CheckSW.isSelected() && CheckPT.isSelected() && !CheckBC.isSelected()
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
            if(CheckSW.isSelected() && !CheckPT.isSelected() && !CheckBC.isSelected()){
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
            if(CheckLemma.isSelected() && !CheckBC.isSelected() 
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
             if(!CheckLemma.isSelected() && !CheckBC.isSelected() 
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
                                     && !CheckLemma.isSelected()){
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
                 !CheckPT.isSelected()){
                result = sw.stopword(lemanotag);
                AreaSW.append(i + 1 + "." + inputan.get(i));
                AreaSW.append("Hasil Lemmatization :" + lemanotag);
                AreaSW.append("\n");
                AreaSW.append("Hasil : "+ result);
                AreaSW.append("\n");

            }
            //Post tag dan lemma
            if(CheckPT.isSelected() && CheckLemma.isSelected() && !CheckBC.isSelected()
                && !CheckSW.isSelected()){
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
            if(CheckPT.isSelected() && CheckLemma.isSelected() && CheckSW.isSelected() && !CheckBC.isSelected() ){
                //String st = stopword.stopwordwithTag(tag);
                String lemmas = lemma.lemmatizenotag(inputan.get(i));
                String st = stopword.stopword(lemmas);
//                String pt = ST.tagger(st);
//                String stpt = stopword.stopwordwithTag(tagging);
                //String posstop = stopword.stopwordwithTag(tag);
                result = ST.tagger(st);
                AreaSW.append(i + 1 + "." + inputan.get(i));
                AreaSW.append("\n");
                AreaSW.append("Hasil Lemmatization : " + lemmas);
                AreaSW.append("\n");
                AreaSW.append("Hasil Stopwords : " + st);
                AreaSW.append("\n");
                AreaSW.append("Hasil POS Tagging : " + result);
                AreaSW.append("\n");

            }
            //POS TAG, LEMMA, STOPWORDS, IOB
            if(CheckPT.isSelected() && CheckLemma.isSelected() && CheckSW.isSelected() && CheckBC.isSelected() ){
                //String st = stopword.stopwordwithTag(tag);
                
                try {
                    String Bio = bio.Chunker(stop);
                    
                    
                    //String stpt = stopword.stopwordwithTag(tagging);
                    String lemmas = lemma.lemmatizenotag(inputan.get(i));
                    String st = stopword.stopword(lemmas);
                    String[] tamp = new String[inputan.size()];
                    tamp = inputan.toArray(tamp);
                    result = ST.tagger(st);
                    String iob = iobchunk.Iob(st);
                    regIOB = regbio.RegBio(iob);
                    
                    AreaSW.append(i + 1 + "." + inputan.get(i));
                    AreaSW.append("\n");
                    AreaSW.append("Hasil Lemmatization : " + lemmas);
                    AreaSW.append("\n");
                    AreaSW.append("Hasil Stopwords : " + st);
                    AreaSW.append("\n");
                    AreaSW.append("Hasil POS Tagging : " + result);
                    AreaSW.append("\n");
                    AreaSW.append("Hasil IOB :" + iob);
                    AreaSW.append("\n");
                    AreaSW.append("IOB NP :" + regIOB);
                    AreaSW.append("\n");
                    
                } catch (IOException ex) {
                    Logger.getLogger(Interface_TA.class.getName()).log(Level.SEVERE, null, ex);
                }
                //String posstop = stopword.stopwordwithTag(tag);
                

            }
//=======================================BIO CHUNKING  && POST TAG ========================================================
            if(!CheckLemma.isSelected() && CheckBC.isSelected()
                && !CheckSW.isSelected() && CheckPT.isSelected()){
               
                regIOB = iobchunk.Iob(inputan.get(i));
                result = ST.tagger(inputan.get(i));
                AreaSW.append(i + 1 + "." + inputan.get(i));
                AreaSW.append("\n");
                AreaSW.append("Hasil :" + result);
                AreaSW.append("\n");
                AreaSW.append("Hasil Regex :" + regIOB);
                AreaSW.append("\n");      

            }
            
            kalimatPre.add(result);
            kalimatIob.add(regIOB);
            
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
        try {
            data();
        } catch (IOException ex) {
            Logger.getLogger(Interface_TA.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_ComboDatasetActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        AreaExtraksi.setText(" ");
    }//GEN-LAST:event_jButton4ActionPerformed

    private void jComboBoxGroupingActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBoxGroupingActionPerformed
        jTextAreaHasilGrouping.setText("");
        String value=jComboBoxGrouping.getSelectedItem().toString();
        
        if(value != "-"){
            //grouping
            jTextAreaHasilGrouping.append("Kelas : "+value);
            jTextAreaHasilGrouping.append("\n");
            for(int ax=0;ax<listGroup.size();ax++){
                if(value == listGroup.get(ax).get(0)){
                    jTextAreaHasilGrouping.append(""+listGroup.get(ax).get(1)+"##"+listGroup.get(ax).get(2));
                    jTextAreaHasilGrouping.append("\n");
                }
                //System.out.println(listGroup.get(ax));
            }
        }
    }//GEN-LAST:event_jComboBoxGroupingActionPerformed

    private void jComboBoxOntologyFileActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBoxOntologyFileActionPerformed
        // TODO add your handling code here:
      
    }//GEN-LAST:event_jComboBoxOntologyFileActionPerformed

    public void data() throws IOException{
    String value = ComboDataset.getSelectedItem().toString();
    //inputan = call.Inputan("resources/dataset/"+value+".txt");
     inputan = call.Input("output/"+value+".txt");
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
    private javax.swing.JCheckBox CheckLemma;
    private javax.swing.JCheckBox CheckPT;
    private javax.swing.JCheckBox CheckRule;
    private javax.swing.JCheckBox CheckSW;
    private javax.swing.JComboBox<String> ComboDataset;
    private javax.swing.JTabbedPane Grouping;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JLabel f1scoreFitur;
    private javax.swing.JLabel f1scorePolaritas;
    private javax.swing.JLabel f1scorePrediksi;
    private javax.swing.JPanel jArea;
    private javax.swing.JTextArea jAreaAkurasi;
    private javax.swing.JTextArea jAreaHasilExtraksi;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JCheckBox jCheckBoxNpParser;
    private javax.swing.JCheckBox jCheckBoxTaxonomy;
    private javax.swing.JCheckBox jCheckBoxTypeDepedency;
    private javax.swing.JCheckBox jCheckBoxnounPherase;
    private javax.swing.JComboBox<String> jComboBoxGrouping;
    private javax.swing.JComboBox<String> jComboBoxOntologyFile;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel22;
    private javax.swing.JLabel jLabel23;
    private javax.swing.JLabel jLabel24;
    private javax.swing.JLabel jLabel25;
    private javax.swing.JLabel jLabel26;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel10;
    private javax.swing.JPanel jPanel11;
    private javax.swing.JPanel jPanel12;
    private javax.swing.JPanel jPanel13;
    private javax.swing.JPanel jPanel14;
    private javax.swing.JPanel jPanel15;
    private javax.swing.JPanel jPanel16;
    private javax.swing.JPanel jPanel17;
    private javax.swing.JPanel jPanel18;
    private javax.swing.JPanel jPanel19;
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
    private javax.swing.JScrollPane jScrollPane5;
    private javax.swing.JScrollPane jScrollPane7;
    private javax.swing.JScrollPane jScrollPane8;
    private javax.swing.JTabbedPane jTabbedPane3;
    private javax.swing.JTextArea jTextAreaHasilGrouping;
    private javax.swing.JTextArea jTextAreaRule;
    private javax.swing.JLabel jmlFiturDataset;
    private javax.swing.JLabel jmlFiturPolaritasTerekstak;
    private javax.swing.JLabel jmlFiturTerekstrek;
    private javax.swing.JLabel jmlbenar1;
    private javax.swing.JLabel jmlbenar2;
    private javax.swing.JLabel precisionFitur;
    private javax.swing.JLabel precisionPolaritas;
    private javax.swing.JLabel precissionPrediksi;
    private javax.swing.JLabel recallFitur;
    private javax.swing.JLabel recallPolaritas;
    private javax.swing.JLabel recallPrediksi;
    // End of variables declaration//GEN-END:variables
}
