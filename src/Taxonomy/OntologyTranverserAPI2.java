/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Taxonomy;

import static PatternKnowladge.StanParser.tag;
import static PatternKnowladge.StanParser.wordsList;
import static Taxonomy.OntologyTranverserAPI.inputFileName;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import org.apache.jena.ontology.OntClass;
import org.apache.jena.ontology.OntDocumentManager;
import org.apache.jena.ontology.OntModel;
import org.apache.jena.ontology.OntModelSpec;
import org.apache.jena.rdf.model.ModelFactory;
import org.apache.jena.util.FileManager;
import org.apache.jena.util.iterator.ExtendedIterator;

/**
 *
 * @author DEAS
 */
public class OntologyTranverserAPI2 {
    
    public static String[] tag = {
        "_CC","_CD","_DT","_EX","_FW","_IN","_JJ","_JJR","_JJS","_LS","_MD","_NN","_NNS","_NNP","_NNPS","_PDT","_POS","_PRP","_PRP$","_RB","_RBR","_RBS","_RP","_SYM","_TO","_UH","_VB","_VBD","_VBG","_VBN","_VBP","_VBZ","_WDT","_WP","_WP$","_WRB","_#","_$","_.","_,","_:","_(","_)","_`","_'"
    };
    
    public static ArrayList<String> listkalimat = new ArrayList<>();
    public static ArrayList<String> wordsList = new ArrayList<String>();
    public static List<String> kalimat = new ArrayList<>();
     static final String inputFileName = "resources/ontology/Handphone_Tax.owl";
    static String camNS = "http://www.semanticweb.org/deas/ontologies/2017/3/untitled-ontology-21#";
    //public static String tamp[] = {"Memory", "Camera"};
    
    public static String cleaningTag(String hasilextraksi){
        
        System.out.println("Isi Masukan sudah isi tag : " + hasilextraksi);
        String tamp = " ";
        //inputan += hasilextraksi;
        //tamp += hasilextraksi.trim().replaceAll("\\S+"," ");
        String words[] = hasilextraksi.split(" ");
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
                }
            }
        }
        System.out.println("ISI KALIMAT SEBELUM DI FOREACH : " + kalimat);
//        for(String has : kalimat){
//            kalim += has;
//        }
        kalim=kalim.trim().replaceAll("\\s+", " ");
        String tampungan = " ";
        String tampungan2 = " ";
        String tampungan3 = " ";
        String fitur = " ";
        kalimat.add(kalim);
        String[] kalimatsplit = kalim.split(" ");
        System.out.println("ISI ARRAY SEBELUM TAXONOMY" + kalimat);
        OntDocumentManager mgr = new OntDocumentManager();
	OntModelSpec s = new OntModelSpec( OntModelSpec.OWL_MEM );
	s.setDocumentManager( mgr );
	OntModel m = ModelFactory.createOntologyModel( s, null );
        
        // use the FileManager to open the ontology from the filesystem
    	InputStream in = FileManager.get().open(inputFileName);
    	if (in == null) {
       throw new IllegalArgumentException( "File: " + inputFileName + " not found");
        }
        
    // read the ontology file
    m.read( in, "" );
        
    // list the subclass of class Camera
    OntClass camera = m.getOntClass( camNS + "General" );
	for (ExtendedIterator i = camera.listSubClasses(); i.hasNext(); ) {
  		OntClass c = (OntClass) i.next();
  		System.out.println( "Subclass : " + c.getLocalName());
                listkalimat.add(c.getLocalName());
                String localname = c.getLocalName();
                String[] localnamesplt = localname.split(" ");
                for(int j = 0 ; j < localnamesplt.length; j++ ){
                    for (int k = 0; k < kalimatsplit.length; k++){
                  //if(listkalimat != null){
                if(kalimatsplit[k].equalsIgnoreCase(localnamesplt[j])){
                    //System.out.println("Ibunya adalah "+c.getSuperClass());
                    //kalimat.removeAll(listkalimat);
                    String hasil = c.getSuperClass().toString();
                    tampungan = hasil.replaceAll("http://www.semanticweb.org/deas/ontologies/2017/3/untitled-ontology-21#"," ");
                    System.out.println("Hasilnya adalah : " + tampungan);
                }else{
                    //tampungan = "kosong 1 ";
                }
                    }
                }
	}
    OntClass general = m.getOntClass(camNS + "Enterteinment");
        for (ExtendedIterator i = general.listSubClasses(); i.hasNext(); ) {
  		OntClass c = (OntClass) i.next();
  		System.out.println( "Subclass : " + c.getLocalName());
                listkalimat.add(c.getLocalName());
                String localname = c.getLocalName();
                String[] localnamesplt = localname.split(" ");
                for(int j = 0 ; j < localnamesplt.length; j++ ){
                    for (int k = 0; k < kalimatsplit.length; k++){
                  //if(listkalimat != null){
                if(kalimatsplit[k].equalsIgnoreCase(localnamesplt[j])){
                    //System.out.println("Ibunya adalah "+c.getSuperClass());
                    //kalimat.removeAll(listkalimat);
                    String hasil = c.getSuperClass().toString();
                    tampungan2 = hasil.replaceAll("http://www.semanticweb.org/deas/ontologies/2017/3/untitled-ontology-21#"," ");
                    System.out.println("Hasilnya adalah : " + tampungan);
                }else{
                    //tampungan2 = " kosong 2";
                }
                    }
                }
	}
        OntClass voice = m.getOntClass(camNS + "Voice_Quality");
        for (ExtendedIterator i = voice.listSubClasses(); i.hasNext(); ) {
  		OntClass c = (OntClass) i.next();
  		System.out.println( "Subclass : " + c.getLocalName());
                listkalimat.add(c.getLocalName());
                String localname = c.getLocalName();
                String[] localnamesplt = localname.split(" ");
                for(int j = 0 ; j < localnamesplt.length; j++ ){
                    for (int k = 0; k < kalimatsplit.length; k++){
                  //if(listkalimat != null){
                if(kalimatsplit[k].equalsIgnoreCase(localnamesplt[j])){
                    //System.out.println("Ibunya adalah "+c.getSuperClass());
                    //kalimat.removeAll(listkalimat);
                    String hasil = c.getSuperClass().toString();
                    tampungan3 = hasil.replaceAll("http://www.semanticweb.org/deas/ontologies/2017/3/untitled-ontology-21#"," ");
                    System.out.println("Hasilnya adalah : " + tampungan);
                }else{
                    //tampungan2 = " kosong 2";
                }
                    }
                }
	}
        fitur = tampungan + " " + tampungan2 + " " + tampungan3;
        //System.out.println("ISI TAMPUNGAN HASIL TAXONOMY : " + tampungan);
        System.out.println("ISI TAMPUNGAN : " + tampungan);
        
        
        return fitur;

        //return kalim;
    } 
}
    
//    public static String OntologyApi (String hasiltagger){
//        
//        
//        String tampungan = " ";
//        kalimat.add(hasiltagger);
//        System.out.println("ISI ARRAY SEBELUM TAXONOMY" + kalimat);
//        OntDocumentManager mgr = new OntDocumentManager();
//	OntModelSpec s = new OntModelSpec( OntModelSpec.OWL_MEM );
//	s.setDocumentManager( mgr );
//	OntModel m = ModelFactory.createOntologyModel( s, null );
//        
//        // use the FileManager to open the ontology from the filesystem
//    	InputStream in = FileManager.get().open(inputFileName);
//    	if (in == null) {
//       throw new IllegalArgumentException( "File: " + inputFileName + " not found");
//        }
//        
//    // read the ontology file
//    m.read( in, "" );
//        
//    // list the subclass of class Camera
//    OntClass camera = m.getOntClass( camNS + "Enterteinment" );
//	for (ExtendedIterator i = camera.listSubClasses(); i.hasNext(); ) {
//  		OntClass c = (OntClass) i.next();
//  		System.out.println( "Subclass : " + c.getLocalName());
//                listkalimat.add(c.getLocalName());
//                for(int j = 0 ; j < listkalimat.size(); j++ ){
//                    for (int k = 0; k < kalimat.size(); k++){
//                if(listkalimat.get(j).equalsIgnoreCase(kalimat.get(k))){
//                    //System.out.println("Ibunya adalah "+c.getSuperClass());
//                    String hasil = c.getSuperClass().toString();
//                    tampungan = hasil.replaceAll("http://www.semanticweb.org/deas/ontologies/2017/3/untitled-ontology-21#"," ");
//                    System.out.println("Hasilnya adalah : " + tampungan);
//                }else{
//                    //System.out.println("Tidak ada");
//                }
//                    }
//                }
//	}
//        System.out.println("ISI TAMPUNGAN HASIL TAXONOMY : " + tampungan);
//        return tampungan;
//    }
    
//}
