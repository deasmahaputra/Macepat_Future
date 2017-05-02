/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Taxonomy;

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
public class OntologyTranverserAPI extends Object{
    
    public static ArrayList<String> listkalimat = new ArrayList<>();
    //public static List<String> kalimat = new ArrayList<>();
     static final String inputFileName = "resources/ontology/Handphone_Taxonomy.owl";
    static String camNS = "http://www.semanticweb.org/deas/ontologies/2017/3/untitled-ontology-21#";
    public static String tamp[] = {"Memory", "camera"};
    
        
    public static void main (String args[]) {

	// Create an empty in-memory ontology model 
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
    OntClass camera = m.getOntClass( camNS + "Entertainment" );
	for (ExtendedIterator i = camera.listSubClasses(); i.hasNext(); ) {
  		OntClass c = (OntClass) i.next();
  		System.out.println( "Subclass : " + c.getLocalName());
                listkalimat.add(c.getLocalName());
                for(int j = 0 ; j < listkalimat.size(); j++ ){
                    for (int k = 0; k < tamp.length; k++){
                if(listkalimat.get(j).equalsIgnoreCase(tamp[k])){
                    //System.out.println("Ibunya adalah "+c.getSuperClass());
                    String hasil = c.getSuperClass().toString();
                    String tampungan = hasil.replaceAll("http://www.semanticweb.org/deas/ontologies/2017/3/untitled-ontology-21#"," ");
                    System.out.println("Hasilnya adalah : " + tampungan);
                }else{
                    //System.out.println("Tidak ada COCOK");
                }
                    }
                }
	}
    }  
}
