/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Taxonomy;

import static Taxonomy.OntologyTranverserAPI2.tag;
import static Taxonomy.OntologyTranverserAPI2.wordsList;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import org.apache.jena.ontology.Individual;
import org.apache.jena.ontology.OntClass;
import org.apache.jena.ontology.OntModel;
import org.apache.jena.rdf.model.ModelFactory;
import org.apache.jena.util.iterator.ExtendedIterator;

/**
 *
 * @author DEAS
 */
public class Ontology {
    
    public static String[] tag = {
       "_B-NP","_I-NP","_CC","_CD","_DT","_EX","_FW","_IN","_JJ","_JJR","_JJS","_LS","_MD","_NN","_NNS","_NNP","_NNPS","_PDT","_POS","_PRP","_PRP$","_RB","_RBR","_RBS","_RP","_SYM","_TO","_UH","_VB","_VBD","_VBG","_VBN","_VBP","_VBZ","_WDT","_WP","_WP$","_WRB","_#","_$","_.","_,","_:","_(","_)","_`","_'"
    };
    
    
   // static String ONT_URL = "resources/ontology/"+foo+".owl"; //E:/DEAS_MP/PERKULIAHAN/EKSTENSI S1/SEMESTER III/TA DEAS/APP/
    static HashMap lexiconTableClasses = new HashMap();
    
    public static ArrayList<String> listkalimat = new ArrayList<>();
    public static ArrayList<String> wordsList = new ArrayList<String>();
    public static List<String> kalimat = new ArrayList<>();
    
    
    /**
     * lexiconTableInstances is a HashMap containing all the term with type
     * instance/individual
     */
    static HashMap lexiconTableInstances = new HashMap();
    
    public static OntModel getModel() throws FileNotFoundException {
        SingletonFileOntology singletonfile = SingletonFileOntology.getInstance();
        String tamp = singletonfile.getUrlfile();
        String ONT_URL = "resources/ontology/"+tamp+".owl";
        OntModel model = ModelFactory.createOntologyModel();
        model.read((new FileInputStream(ONT_URL)), null);
        return model;
    }
    
    
    public static String OntologyJena(String hasilextraksi) throws FileNotFoundException{
        String hasilontology = " ";
        String tamp = " ";
        String words[] = hasilextraksi.split(" ");
        String kalim = " ";
        
        wordsList.clear();
        
       
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
        kalim=kalim.trim().replaceAll("\\s+", " ");
        String[] kalimatsplit = kalim.split(" ");
        for(int j = 0; j < kalimatsplit.length; j++){
           
        
    
        HashMap hmClass = new HashMap();
        HashMap hmInstances = new HashMap();

        //read model
        OntModel model = Ontology.getModel();
        

        //iterate the model and put the words to hashmap
        ExtendedIterator classes = model.listClasses();
        while (classes.hasNext()) {
            OntClass thisClass = (OntClass) classes.next();
            System.out.println("KAAALIIIIMaaaaaaatttttt :" + kalimatsplit[j]);
//            System.out.println("Found class: " + thisClass.getLocalName().toString());
//            System.out.println("this is from " + thisClass.getSuperClass().toString());
            hmClass.put(thisClass.getLocalName(), thisClass.getLocalName());
            ExtendedIterator instances = thisClass.listInstances();
            if(thisClass.getLocalName().equalsIgnoreCase(kalimatsplit[j])){
            //while (instances.hasNext()) {
                //Individual thisInstance = (Individual) instances.next();
                //for(int i = 0; i < kalimatsplit.length; i++){
                     
                //if(thisClass.getLocalName().equalsIgnoreCase(kalimatsplit[j])){
                //System.out.println("this is from " + thisClass.getSuperClass().toString());
                //String hasil = thisInstance.getOntClass().toString();
                String hasil2 = thisClass.getSuperClass().toString();
                String getHasil2 = hasil2.replaceAll("http://www.semanticweb.org/deas/ontologies/2017/4/untitled-ontology-48#", "");
                //String getHasil = hasil.replaceAll("http://www.semanticweb.org/ariffinsetya/ontologies/2016/3/happiness#","");
                //System.out.println("this is from " + getHasil);
                //System.out.println("Found instance: " + thisInstance.getLocalName().toString());
                hasilontology = hasilontology+ " " + getHasil2 + " " + thisClass.getLocalName().toString();
                System.out.println("Hasilnya :" + hasilontology);
                
                //}
               // hmInstances.put(thisInstance.getLocalName(), thisInstance.getLocalName());
           // }
                
                //System.out.println("ISINYA :" + thisInstance.getLocalName());
                
                //System.out.println(hmInstances.put(thisInstance.getLocalName(), thisInstance.getLocalName()));
            }
            
        }
        
       }
    
    return hasilontology;
    }
    
}
