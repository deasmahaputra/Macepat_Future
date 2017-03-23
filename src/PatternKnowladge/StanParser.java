package PatternKnowladge;

import edu.stanford.nlp.ling.CoreLabel;
import edu.stanford.nlp.parser.lexparser.*;
import edu.stanford.nlp.process.*;
import edu.stanford.nlp.trees.*;
import java.io.StringReader;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author cahyadi
 */
public class StanParser {
    public static String[] tag = {
        "_CC","_CD","_DT","_EX","_FW","_IN","_JJ","_JJR","_JJS","_LS","_MD","_NN","_NNS","_NNP","_NNPS","_PDT","_POS","_PRP","_PRP$","_RB","_RBR","_RBS","_RP","_SYM","_TO","_UH","_VB","_VBD","_VBG","_VBN","_VBP","_VBZ","_WDT","_WP","_WP$","_WRB","_#","_$","_.","_,","_:","_(","_)","_`","_'"
    };
    Tree subtree;
    public static ArrayList<String> wordsList = new ArrayList<String>();
    public static ArrayList<String> fituropini = new ArrayList<String>();
    public static List<String> phraseList=new ArrayList<String>();
    public static List<CoreLabel> tokens= new ArrayList<CoreLabel>();

    
    private final static String PCG_MODEL = "edu/stanford/nlp/models/lexparser/englishPCFG.ser.gz";        

    private final TokenizerFactory<CoreLabel> tokenizerFactory = PTBTokenizer.factory(new CoreLabelTokenFactory(), "invertible=true");

    private final LexicalizedParser parser = LexicalizedParser.loadModel(PCG_MODEL);
    
    //mendapatkan tree
    public Tree parse(String str) {
        tokens=null;
        wordsList.clear();
        
        Tree tree=null;
        String s=str;
        String kalimat="";
        s=s.trim().replaceAll("\\s+", " ");
        String[] words = s.split(" ");
        
        for (String word : words) {
            wordsList.add(word);
        }
        //menghilangkan tag pada input
        for (int i = 0; i < wordsList.size(); i++) {
            String sList=wordsList.get(i);
            for (int j = 0; j < tag.length; j++) {
                String sTag=tag[j];
                if (wordsList.get(i).endsWith(sTag)) {
                    kalimat=kalimat+sList.replace(sTag,"")+" ";
                }
            }
        }
        //
        tokens = tokenize(kalimat);
        tree = parser.apply(tokens);
        return tree;
    }

    private List<CoreLabel> tokenize(String str) {
        Tokenizer<CoreLabel> tokenizer =
            tokenizerFactory.getTokenizer(
                new StringReader(str));    
        return tokenizer.tokenize();
    }
    
    //mendapatkan NP dgn maks 3 kata
    public static List<String> GetNounPhrases(Tree parse)
    {
        phraseList.clear();
        for (Tree subtree: parse)
        {
          String np = "";
          //ambil yg memiliki tag NP dan maks 3 kata
          if(subtree.label().value().equals("NP"))
          {
            if(subtree.getLeaves().size()<=3){
                //menggabungkan kata yg ada pada subtree NP
                for(int it=0; it<subtree.getLeaves().size(); it++){
                    np=np+subtree.getLeaves().get(it).toString()+" ";
                }
                //
                //System.out.println("NP : "+subtree.getChildrenAsList());
                np=np.trim().replaceAll("\\s+", " ");
                //System.out.println("Hasil loop np : "+np);
                //phraseList.add(subtree.getLeaves().toString());
                phraseList.add(np);
            }
          }
          //
        }
        
          return phraseList;

    }
    
    public String tes = "";
    public ArrayList<String> typeDP(String kalimat){
        //type dependencies
        List<TypedDependency> typed;
        fituropini.clear();
        
        TreebankLanguagePack tlp = new PennTreebankLanguagePack();
        GrammaticalStructureFactory gsf = tlp.grammaticalStructureFactory();
        List wordList = tokenizerFactory.getTokenizer(new StringReader(kalimat)).tokenize();
        Tree tree = parser.apply(wordList);
        GrammaticalStructure gs = gsf.newGrammaticalStructure(tree);
        Collection tdl = gs.typedDependenciesCCprocessed(true);
        typed = gs.typedDependenciesCCprocessed(true);
        //System.out.println(typed);
        tes = typed.toString();
        for(TypedDependency td : typed) {
            if(td.reln().equals(EnglishGrammaticalRelations.ADJECTIVAL_MODIFIER)) {
                if(td.gov().toString().endsWith("/NN") && td.dep().toString().endsWith("/JJ")){
                    //System.out.println("amod :");
                    //System.out.println(td.gov()); //depan
                    //System.out.println(td.dep()); //belakang
                    
                    //menghilangkan tag
                    String fit=td.gov().toString().replace("/NN","");
                    String opi=td.dep().toString().replace("/JJ","");
                    
                    fituropini.add(fit+" "+opi);
                    //System.out.println("=========================================");
                }
            }
            else if(td.reln().equals(EnglishGrammaticalRelations.NOMINAL_SUBJECT)) {
                if(td.gov().toString().endsWith("/NN") && td.dep().toString().endsWith("/JJ")){
                    
                    //menghilangkan tag
                    String fit=td.gov().toString().replace("/NN","");
                    String opi=td.dep().toString().replace("/JJ","");
                    
                    fituropini.add(fit+" "+opi);
                    //System.out.println("=========================================");
                }
            }
            else if(td.reln().equals(EnglishGrammaticalRelations.ADVERBIAL_MODIFIER)) {
                if(td.gov().toString().endsWith("/VB") && td.dep().toString().endsWith("/RB")){
                    
                    //menghilangkan tag
                    String fit=td.gov().toString().replace("/VB","");
                    String opi=td.dep().toString().replace("/RB","");
                    
                    fituropini.add(fit+" "+opi);
                    //System.out.println("=========================================");
                }
            }
        }
        
        for(int i=0;i<typed.size()-1;i++){
            if(typed.get(i).reln().equals(EnglishGrammaticalRelations.NOMINAL_SUBJECT) && typed.get(i+1).reln().equals(EnglishGrammaticalRelations.DIRECT_OBJECT)) {
                if(typed.get(i).gov().toString().endsWith("/NN") && typed.get(i).dep().toString().endsWith("/VB") && typed.get(i+1).gov().toString().endsWith("/VB") && typed.get(i+1).dep().toString().endsWith("/NN")){
                    
                    //menghilangkan tag
                    String opi=typed.get(i+1).dep().toString().replace("/NN","");
                    String fit=typed.get(i).gov().toString().replace("/NN","");
                    
                    fituropini.add(fit+" "+opi);
                    //System.out.println("=========================================");
                }
            }
        }
        return fituropini;
    }
    
    public List<TypedDependency> typeDPTree(String kalimat){
        //type dependencies
        List<TypedDependency> typed;
        fituropini.clear();
        
        TreebankLanguagePack tlp = new PennTreebankLanguagePack();
        GrammaticalStructureFactory gsf = tlp.grammaticalStructureFactory();
        List wordList = tokenizerFactory.getTokenizer(new StringReader(kalimat)).tokenize();
        Tree tree = parser.apply(wordList);
        GrammaticalStructure gs = gsf.newGrammaticalStructure(tree);
        Collection tdl = gs.typedDependenciesCCprocessed(true);
        typed = gs.typedDependenciesCCprocessed(true);
        
        return typed;
    }
}