/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Taxonomy;

import static Taxonomy.OntologyTranverserAPI2.inputFileName;
import static Taxonomy.OntologyTranverserAPI2.kalimat;
import java.io.InputStream;
import java.util.ArrayList;
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
public class TaxnoClean {
    
    public static ArrayList<String> listkalimat = new ArrayList<>();
    public static ArrayList<String> wordsList = new ArrayList<String>();
    public static List<String> kalimat = new ArrayList<>();
     static final String inputFileName = "resources/ontology/tax_deas.owl";
    static String camNS = "http://www.semanticweb.org/deas/ontologies/2017/4/untitled-ontology-48#";
    
    public static String TaxoNoTag (String kalim){
    
        kalim=kalim.trim().replaceAll("\\s+", " ");
        String tampungan = " ";
        String tampungan2 = " ";
        String tampungan3 = " ";
        String tampungan4 = " ";
        String tampungan5 = " ";
        String tampungan6 = " ";
        String tampungan7 = " ";
        String tampungan8 = " ";
        String tampungan9 = " ";
        String tampungan10 = " ";
        String tampungan11 = " ";
        String tampungan12 = " ";
        String tampungan13 = " ";
        String tampungan14 = " ";
        String tampungan15 = " ";
        String tampungan16 = " ";
        String tampungan17 = " ";
        String tampungan18 = " ";
        String tampungan19 = " ";
        String tampungan20 = " ";
        String tampungan21 = " ";
        String tampungan22 = " ";
        String tampungan23 = " ";
        String tampungan24 = "";
        String kirim = " ";
        String kirim2 = " ";
        String fitur = " ";
        kalimat.add(kalim);
        
        System.out.println("ISI ARRAY SEBELUM TAXONOMY" + kalimat);
        String[] kalimatsplit = kalim.split(" ");
        //System.out.println("ISI ARRAY SEBELUM TAXONOMY" + kalimat);
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
    OntClass camera = m.getOntClass( camNS + "camera" );
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
                    String getHasil = hasil.replaceAll("http://www.semanticweb.org/deas/ontologies/2017/4/untitled-ontology-48#"," ");
                    System.out.println("Hasilnya adalah : " + tampungan);
                    String anak = localnamesplt[0];
                    tampungan = getHasil + " " + anak;
                    System.out.println("INI ISINYA GAN : " + kirim);
                }else{
                    //tampungan = "kosong 1 ";
                }
                    }
                }
	}
    OntClass general = m.getOntClass(camNS + "flash");
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
                    String hasil = c.getSuperClass().toString();
                    String getHasil = hasil.replaceAll("http://www.semanticweb.org/deas/ontologies/2017/4/untitled-ontology-48#"," ");
                    System.out.println("Hasilnya adalah : " + tampungan);
                    String anak = localnamesplt[0];
                    tampungan2 = getHasil + " " + anak;
                    System.out.println("INI ISINYA GAN : " + kirim);
                }else{
                    //tampungan2 = " kosong 2";
                }
                    }
                }
	}
        OntClass canon = m.getOntClass(camNS + "accecories");
        for (ExtendedIterator i = canon.listSubClasses(); i.hasNext(); ) {
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
                    String hasil = c.getSuperClass().toString();
                    String getHasil = hasil.replaceAll("http://www.semanticweb.org/deas/ontologies/2017/4/untitled-ontology-48#"," ");
                    System.out.println("Hasilnya adalah : " + tampungan);
                    String anak = localnamesplt[0];
                    tampungan3 = getHasil + " " + anak;
                    System.out.println("INI ISINYA GAN : " + kirim);
                }else{
                    //tampungan2 = " kosong 2";
                }
                    }
                }
	}
        
        OntClass software = m.getOntClass(camNS + "software");
        for (ExtendedIterator i = software.listSubClasses(); i.hasNext(); ) {
  		OntClass c = (OntClass) i.next();
  		System.out.println( "Subclass : " + c.getLocalName());
                listkalimat.add(c.getLocalName());
                String localname = c.getLocalName();
                String[] localnamesplt = localname.split(" ");
                for(int j = 0 ; j < localnamesplt.length; j++ ){
                    for (int k = 0; k < kalimatsplit.length; k++){
                  //if(listkalimat != null){
                if(kalimatsplit[k].equalsIgnoreCase(localnamesplt[j])){
                    String hasil = c.getSuperClass().toString();
                    String getHasil = hasil.replaceAll("http://www.semanticweb.org/deas/ontologies/2017/4/untitled-ontology-48#"," ");
                    System.out.println("Hasilnya adalah : " + tampungan);
                    String anak = localnamesplt[0];
                    tampungan4 = getHasil + " " + anak;
                    System.out.println("INI ISINYA GAN : " + kirim);
                }else{
                    //tampungan2 = " kosong 2";
                }
                    }
                }
	}
        
        OntClass media = m.getOntClass(camNS + "format");
        for (ExtendedIterator i = media.listSubClasses(); i.hasNext(); ) {
  		OntClass c = (OntClass) i.next();
  		System.out.println( "Subclass : " + c.getLocalName());
                listkalimat.add(c.getLocalName());
                String localname = c.getLocalName();
                String[] localnamesplt = localname.split(" ");
                for(int j = 0 ; j < localnamesplt.length; j++ ){
                    for (int k = 0; k < kalimatsplit.length; k++){
                  //if(listkalimat != null){
                if(kalimatsplit[k].equalsIgnoreCase(localnamesplt[j])){
                    String hasil = c.getSuperClass().toString();
                    String getHasil = hasil.replaceAll("http://www.semanticweb.org/deas/ontologies/2017/4/untitled-ontology-48#"," ");
                    System.out.println("Hasilnya adalah : " + tampungan);
                    String anak = localnamesplt[0];
                    tampungan5 = getHasil + " " + anak;
                    System.out.println("INI ISINYA GAN : " + kirim);
                }else{
                    //tampungan2 = " kosong 2";
                }
                    }
                }
	}
        
        OntClass type = m.getOntClass(camNS + "resolution");
        for (ExtendedIterator i = type.listSubClasses(); i.hasNext(); ) {
  		OntClass c = (OntClass) i.next();
  		System.out.println( "Subclass : " + c.getLocalName());
                listkalimat.add(c.getLocalName());
                String localname = c.getLocalName();
                String[] localnamesplt = localname.split(" ");
                for(int j = 0 ; j < localnamesplt.length; j++ ){
                    for (int k = 0; k < kalimatsplit.length; k++){
                  //if(listkalimat != null){
                if(kalimatsplit[k].equalsIgnoreCase(localnamesplt[j])){
                    String hasil = c.getSuperClass().toString();
                    String getHasil = hasil.replaceAll("http://www.semanticweb.org/deas/ontologies/2017/4/untitled-ontology-48#"," ");
                    System.out.println("Hasilnya adalah : " + tampungan);
                    String anak = localnamesplt[0];
                    tampungan6 = getHasil + " " + anak;
                    System.out.println("INI ISINYA GAN : " + kirim);
                }else{
                    //tampungan2 = " kosong 2";
                }
                    }
                }
	}
        
        OntClass accessories = m.getOntClass(camNS + "screen");
        for (ExtendedIterator i = accessories.listSubClasses(); i.hasNext(); ) {
  		OntClass c = (OntClass) i.next();
  		System.out.println( "Subclass : " + c.getLocalName());
                listkalimat.add(c.getLocalName());
                String localname = c.getLocalName();
                String[] localnamesplt = localname.split(" ");
                for(int j = 0 ; j < localnamesplt.length; j++ ){
                    for (int k = 0; k < kalimatsplit.length; k++){
                  //if(listkalimat != null){
                if(kalimatsplit[k].equalsIgnoreCase(localnamesplt[j])){
                    String hasil = c.getSuperClass().toString();
                    String getHasil = hasil.replaceAll("http://www.semanticweb.org/deas/ontologies/2017/4/untitled-ontology-48#"," ");
                    System.out.println("Hasilnya adalah : " + tampungan);
                    String anak = localnamesplt[0];
                    tampungan7 = getHasil + " " + anak;
                    System.out.println("INI ISINYA GAN : " + kirim);
                }else{
                    //tampungan2 = " kosong 2";
                }
                    }
                }
	}
        
        OntClass massages = m.getOntClass(camNS + "photo");
        for (ExtendedIterator i = massages.listSubClasses(); i.hasNext(); ) {
  		OntClass c = (OntClass) i.next();
  		System.out.println( "Subclass : " + c.getLocalName());
                listkalimat.add(c.getLocalName());
                String localname = c.getLocalName();
                String[] localnamesplt = localname.split(" ");
                for(int j = 0 ; j < localnamesplt.length; j++ ){
                    for (int k = 0; k < kalimatsplit.length; k++){
                  //if(listkalimat != null){
                if(kalimatsplit[k].equalsIgnoreCase(localnamesplt[j])){
                    String hasil = c.getSuperClass().toString();
                    String getHasil = hasil.replaceAll("http://www.semanticweb.org/deas/ontologies/2017/4/untitled-ontology-48#"," ");
                    System.out.println("Hasilnya adalah : " + tampungan);
                    String anak = localnamesplt[0];
                    tampungan8 = getHasil + " " + anak;
                    System.out.println("INI ISINYA GAN : " + kirim);                }else{
                    //tampungan2 = " kosong 2";
                }
                    }
                }
	}
        
         OntClass connectify = m.getOntClass(camNS + "merk");
        for (ExtendedIterator i = connectify.listSubClasses(); i.hasNext(); ) {
  		OntClass c = (OntClass) i.next();
  		System.out.println( "Subclass : " + c.getLocalName());
                listkalimat.add(c.getLocalName());
                String localname = c.getLocalName();
                String[] localnamesplt = localname.split(" ");
                for(int j = 0 ; j < localnamesplt.length; j++ ){
                    for (int k = 0; k < kalimatsplit.length; k++){
                  //if(listkalimat != null){
                if(kalimatsplit[k].equalsIgnoreCase(localnamesplt[j])){
                    String hasil = c.getSuperClass().toString();
                    String getHasil = hasil.replaceAll("http://www.semanticweb.org/deas/ontologies/2017/4/untitled-ontology-48#"," ");
                    System.out.println("Hasilnya adalah : " + tampungan);
                    String anak = localnamesplt[0];
                    tampungan9 = getHasil + " " + anak;
                    System.out.println("INI ISINYA GAN : " + kirim);
                }else{
                    //tampungan2 = " kosong 2";
                }
                    }
                }
	}
        
        OntClass band = m.getOntClass(camNS + "canon");
        for (ExtendedIterator i = band.listSubClasses(); i.hasNext(); ) {
  		OntClass c = (OntClass) i.next();
  		System.out.println( "Subclass : " + c.getLocalName());
                listkalimat.add(c.getLocalName());
                String localname = c.getLocalName();
                String[] localnamesplt = localname.split(" ");
                for(int j = 0 ; j < localnamesplt.length; j++ ){
                    for (int k = 0; k < kalimatsplit.length; k++){
                  //if(listkalimat != null){
                if(kalimatsplit[k].equalsIgnoreCase(localnamesplt[j])){
                    String hasil = c.getSuperClass().toString();
                    String getHasil = hasil.replaceAll("http://www.semanticweb.org/deas/ontologies/2017/4/untitled-ontology-48#"," ");
                    System.out.println("Hasilnya adalah : " + tampungan);
                    String anak = localnamesplt[0];
                    tampungan10 = getHasil + " " + anak;
                    System.out.println("INI ISINYA GAN : " + kirim);
                }else{
                    //tampungan2 = " kosong 2";
                }
                    }
                }
	}
        
        OntClass entertainment = m.getOntClass(camNS + "af");
        for (ExtendedIterator i = entertainment.listSubClasses(); i.hasNext(); ) {
  		OntClass c = (OntClass) i.next();
  		System.out.println( "Subclass : " + c.getLocalName());
                listkalimat.add(c.getLocalName());
                String localname = c.getLocalName();
                String[] localnamesplt = localname.split(" ");
                for(int j = 0 ; j < localnamesplt.length; j++ ){
                    for (int k = 0; k < kalimatsplit.length; k++){
                  //if(listkalimat != null){
                if(kalimatsplit[k].equalsIgnoreCase(localnamesplt[j])){
                    String hasil = c.getSuperClass().toString();
                    String getHasil = hasil.replaceAll("http://www.semanticweb.org/deas/ontologies/2017/4/untitled-ontology-48#"," ");
                    System.out.println("Hasilnya adalah : " + tampungan);
                    String anak = localnamesplt[0];
                    tampungan11 = getHasil + " " + anak;
                    System.out.println("INI ISINYA GAN : " + kirim);
                }else{
                    //tampungan2 = " kosong 2";
                }
                    }
                }
	}
        
        OntClass angel = m.getOntClass(camNS + "angel");
        for (ExtendedIterator i = angel.listSubClasses(); i.hasNext(); ) {
  		OntClass c = (OntClass) i.next();
  		System.out.println( "Subclass : " + c.getLocalName());
                listkalimat.add(c.getLocalName());
                String localname = c.getLocalName();
                String[] localnamesplt = localname.split(" ");
                for(int j = 0 ; j < localnamesplt.length; j++ ){
                    for (int k = 0; k < kalimatsplit.length; k++){
                  //if(listkalimat != null){
                if(kalimatsplit[k].equalsIgnoreCase(localnamesplt[j])){
                    String hasil = c.getSuperClass().toString();
                    String getHasil = hasil.replaceAll("http://www.semanticweb.org/deas/ontologies/2017/4/untitled-ontology-48#"," ");
                    System.out.println("Hasilnya adalah : " + tampungan);
                    String anak = localnamesplt[0];
                    tampungan12 = getHasil + " " + anak;
                    System.out.println("INI ISINYA GAN : " + kirim);
                }else{
                    //tampungan2 = " kosong 2";
                }
                    }
                }
	}
        
        OntClass screen = m.getOntClass(camNS + "battery");
        for (ExtendedIterator i = screen.listSubClasses(); i.hasNext(); ) {
  		OntClass c = (OntClass) i.next();
  		System.out.println( "Subclass : " + c.getLocalName());
                listkalimat.add(c.getLocalName());
                String localname = c.getLocalName();
                String[] localnamesplt = localname.split(" ");
                for(int j = 0 ; j < localnamesplt.length; j++ ){
                    for (int k = 0; k < kalimatsplit.length; k++){
                  //if(listkalimat != null){
                if(kalimatsplit[k].equalsIgnoreCase(localnamesplt[j])){
                    String hasil = c.getSuperClass().toString();
                    String getHasil = hasil.replaceAll("http://www.semanticweb.org/deas/ontologies/2017/4/untitled-ontology-48#"," ");
                    System.out.println("Hasilnya adalah : " + tampungan);
                    String anak = localnamesplt[0];
                    tampungan13 = getHasil + " " + anak;
                    System.out.println("INI ISINYA GAN : " + kirim);
                }else{
                    //tampungan2 = " kosong 2";
                }
                    }
                }
	}
        
        OntClass size = m.getOntClass(camNS + "body");
        for (ExtendedIterator i = size.listSubClasses(); i.hasNext(); ) {
  		OntClass c = (OntClass) i.next();
  		System.out.println( "Subclass : " + c.getLocalName());
                listkalimat.add(c.getLocalName());
                String localname = c.getLocalName();
                String[] localnamesplt = localname.split(" ");
                for(int j = 0 ; j < localnamesplt.length; j++ ){
                    for (int k = 0; k < kalimatsplit.length; k++){
                  //if(listkalimat != null){
                if(kalimatsplit[k].equalsIgnoreCase(localnamesplt[j])){
                    String hasil = c.getSuperClass().toString();
                    String getHasil = hasil.replaceAll("http://www.semanticweb.org/deas/ontologies/2017/4/untitled-ontology-48#"," ");
                    System.out.println("Hasilnya adalah : " + tampungan);
                    String anak = localnamesplt[0];
                    tampungan14 = getHasil + " " + anak;
                    System.out.println("INI ISINYA GAN : " + kirim);
                }else{
                    //tampungan2 = " kosong 2";
                }
                    }
                }
	}
        
        OntClass keypad = m.getOntClass(camNS + "control");
        for (ExtendedIterator i = keypad.listSubClasses(); i.hasNext(); ) {
  		OntClass c = (OntClass) i.next();
  		System.out.println( "Subclass : " + c.getLocalName());
                listkalimat.add(c.getLocalName());
                String localname = c.getLocalName();
                String[] localnamesplt = localname.split(" ");
                for(int j = 0 ; j < localnamesplt.length; j++ ){
                    for (int k = 0; k < kalimatsplit.length; k++){
                  //if(listkalimat != null){
                if(kalimatsplit[k].equalsIgnoreCase(localnamesplt[j])){
                    String hasil = c.getSuperClass().toString();
                    String getHasil = hasil.replaceAll("http://www.semanticweb.org/deas/ontologies/2017/4/untitled-ontology-48#"," ");
                    System.out.println("Hasilnya adalah : " + tampungan);
                    String anak = localnamesplt[0];
                    tampungan15 = getHasil + " " + anak;
                    System.out.println("INI ISINYA GAN : " + kirim);
                }else{
                    //tampungan2 = " kosong 2";
                }
                    }
                }
	}
        
        OntClass voice = m.getOntClass(camNS + "color");
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
                    String hasil = c.getSuperClass().toString();
                    String getHasil = hasil.replaceAll("http://www.semanticweb.org/deas/ontologies/2017/4/untitled-ontology-48#"," ");
                    System.out.println("Hasilnya adalah : " + tampungan);
                    String anak = localnamesplt[0];
                    tampungan16 = getHasil + " " + anak;
                    System.out.println("INI ISINYA GAN : " + kirim);
                }else{
                    //tampungan2 = " kosong 2";
                }
                    }
                }
	}
        
        OntClass dimensions = m.getOntClass(camNS + "feature");
        for (ExtendedIterator i = dimensions.listSubClasses(); i.hasNext(); ) {
  		OntClass c = (OntClass) i.next();
  		System.out.println( "Subclass : " + c.getLocalName());
                listkalimat.add(c.getLocalName());
                String localname = c.getLocalName();
                String[] localnamesplt = localname.split(" ");
                for(int j = 0 ; j < localnamesplt.length; j++ ){
                    for (int k = 0; k < kalimatsplit.length; k++){
                  //if(listkalimat != null){
                if(kalimatsplit[k].equalsIgnoreCase(localnamesplt[j])){
                    String hasil = c.getSuperClass().toString();
                    String getHasil = hasil.replaceAll("http://www.semanticweb.org/deas/ontologies/2017/4/untitled-ontology-48#"," ");
                    System.out.println("Hasilnya adalah : " + tampungan);
                    String anak = localnamesplt[0];
                    tampungan17 = getHasil + " " + anak;
                    System.out.println("INI ISINYA GAN : " + kirim);
                }else{
                    //tampungan2 = " kosong 2";
                }
                    }
                }
	}
        
        OntClass function = m.getOntClass(camNS + "function");
        for (ExtendedIterator i = function.listSubClasses(); i.hasNext(); ) {
  		OntClass c = (OntClass) i.next();
  		System.out.println( "Subclass : " + c.getLocalName());
                listkalimat.add(c.getLocalName());
                String localname = c.getLocalName();
                String[] localnamesplt = localname.split(" ");
                for(int j = 0 ; j < localnamesplt.length; j++ ){
                    for (int k = 0; k < kalimatsplit.length; k++){
                  //if(listkalimat != null){
                if(kalimatsplit[k].equalsIgnoreCase(localnamesplt[j])){
                    String hasil = c.getSuperClass().toString();
                    String getHasil = hasil.replaceAll("http://www.semanticweb.org/deas/ontologies/2017/4/untitled-ontology-48#"," ");
                    System.out.println("Hasilnya adalah : " + tampungan);
                    String anak = localnamesplt[0];
                    tampungan18 = getHasil + " " + anak;
                    System.out.println("INI ISINYA GAN : " + kirim);
                }else{
                    //tampungan2 = " kosong 2";
                }
                    }
                }
	}
        
        OntClass lens = m.getOntClass(camNS + "lens");
        for (ExtendedIterator i = lens.listSubClasses(); i.hasNext(); ) {
  		OntClass c = (OntClass) i.next();
  		System.out.println( "Subclass : " + c.getLocalName());
                listkalimat.add(c.getLocalName());
                String localname = c.getLocalName();
                String[] localnamesplt = localname.split(" ");
                for(int j = 0 ; j < localnamesplt.length; j++ ){
                    for (int k = 0; k < kalimatsplit.length; k++){
                  //if(listkalimat != null){
                if(kalimatsplit[k].equalsIgnoreCase(localnamesplt[j])){
                    String hasil = c.getSuperClass().toString();
                    String getHasil = hasil.replaceAll("http://www.semanticweb.org/deas/ontologies/2017/4/untitled-ontology-48#"," ");
                    System.out.println("Hasilnya adalah : " + tampungan);
                    String anak = localnamesplt[0];
                    tampungan19 = getHasil + " " + anak;
                    System.out.println("INI ISINYA GAN : " + kirim);
                }else{
                    //tampungan2 = " kosong 2";
                }
                    }
                }
	}
        
        OntClass looking = m.getOntClass(camNS + "looking");
        for (ExtendedIterator i = looking.listSubClasses(); i.hasNext(); ) {
  		OntClass c = (OntClass) i.next();
  		System.out.println( "Subclass : " + c.getLocalName());
                listkalimat.add(c.getLocalName());
                String localname = c.getLocalName();
                String[] localnamesplt = localname.split(" ");
                for(int j = 0 ; j < localnamesplt.length; j++ ){
                    for (int k = 0; k < kalimatsplit.length; k++){
                  //if(listkalimat != null){
                if(kalimatsplit[k].equalsIgnoreCase(localnamesplt[j])){
                    String hasil = c.getSuperClass().toString();
                    String getHasil = hasil.replaceAll("http://www.semanticweb.org/deas/ontologies/2017/4/untitled-ontology-48#"," ");
                    System.out.println("Hasilnya adalah : " + tampungan);
                    String anak = localnamesplt[0];
                    tampungan20 = getHasil + " " + anak;
                    System.out.println("INI ISINYA GAN : " + kirim);
                }else{
                    //tampungan2 = " kosong 2";
                }
                    }
                }
	}
        
        OntClass memory = m.getOntClass(camNS + "memory");
        for (ExtendedIterator i = memory.listSubClasses(); i.hasNext(); ) {
  		OntClass c = (OntClass) i.next();
  		System.out.println( "Subclass : " + c.getLocalName());
                listkalimat.add(c.getLocalName());
                String localname = c.getLocalName();
                String[] localnamesplt = localname.split(" ");
                for(int j = 0 ; j < localnamesplt.length; j++ ){
                    for (int k = 0; k < kalimatsplit.length; k++){
                  //if(listkalimat != null){
                if(kalimatsplit[k].equalsIgnoreCase(localnamesplt[j])){
                    String hasil = c.getSuperClass().toString();
                    String getHasil = hasil.replaceAll("http://www.semanticweb.org/deas/ontologies/2017/4/untitled-ontology-48#"," ");
                    System.out.println("Hasilnya adalah : " + tampungan);
                    String anak = localnamesplt[0];
                    tampungan21 = getHasil + " " + anak;
                    System.out.println("INI ISINYA GAN : " + kirim);
                }else{
                    //tampungan2 = " kosong 2";
                }
                    }
                }
	}
        
        OntClass mode = m.getOntClass(camNS + "mode");
        for (ExtendedIterator i = mode.listSubClasses(); i.hasNext(); ) {
  		OntClass c = (OntClass) i.next();
  		System.out.println( "Subclass : " + c.getLocalName());
                listkalimat.add(c.getLocalName());
                String localname = c.getLocalName();
                String[] localnamesplt = localname.split(" ");
                for(int j = 0 ; j < localnamesplt.length; j++ ){
                    for (int k = 0; k < kalimatsplit.length; k++){
                  //if(listkalimat != null){
                if(kalimatsplit[k].equalsIgnoreCase(localnamesplt[j])){
                    String hasil = c.getSuperClass().toString();
                    String getHasil = hasil.replaceAll("http://www.semanticweb.org/deas/ontologies/2017/4/untitled-ontology-48#"," ");
                    System.out.println("Hasilnya adalah : " + tampungan);
                    String anak = localnamesplt[0];
                    tampungan22 = getHasil + " " + anak;
                    System.out.println("INI ISINYA GAN : " + kirim);
                }else{
                    //tampungan2 = " kosong 2";
                }
                    }
                }
	}
        OntClass weight = m.getOntClass(camNS + "weight");
        for (ExtendedIterator i = weight.listSubClasses(); i.hasNext(); ) {
  		OntClass c = (OntClass) i.next();
  		System.out.println( "Subclass : " + c.getLocalName());
                listkalimat.add(c.getLocalName());
                String localname = c.getLocalName();
                String[] localnamesplt = localname.split(" ");
                for(int j = 0 ; j < localnamesplt.length; j++ ){
                    for (int k = 0; k < kalimatsplit.length; k++){
                  //if(listkalimat != null){
                if(kalimatsplit[k].equalsIgnoreCase(localnamesplt[j])){
                    String hasil = c.getSuperClass().toString();
                    String getHasil = hasil.replaceAll("http://www.semanticweb.org/deas/ontologies/2017/4/untitled-ontology-48#"," ");
                    System.out.println("Hasilnya adalah : " + tampungan);
                    String anak = localnamesplt[0];
                    tampungan23 = getHasil + " " + anak;
                    System.out.println("INI ISINYA GAN : " + kirim);
                }else{
                    //tampungan2 = " kosong 2";
                }
                    }
                }
	}
        OntClass cg3 = m.getOntClass(camNS + "CameraG3");
        for (ExtendedIterator i = cg3.listSubClasses(); i.hasNext(); ) {
  		OntClass c = (OntClass) i.next();
  		System.out.println( "Subclass : " + c.getLocalName());
                listkalimat.add(c.getLocalName());
                String localname = c.getLocalName();
                String[] localnamesplt = localname.split(" ");
                for(int j = 0 ; j < localnamesplt.length; j++ ){
                    for (int k = 0; k < kalimatsplit.length; k++){
                  //if(listkalimat != null){
                if(kalimatsplit[k].equalsIgnoreCase(localnamesplt[j])){
                    String hasil = c.getSuperClass().toString();
                    String getHasil = hasil.replaceAll("http://www.semanticweb.org/deas/ontologies/2017/4/untitled-ontology-48#"," ");
                    System.out.println("Hasilnya adalah : " + tampungan);
                    String anak = localnamesplt[0];
                    tampungan24 = getHasil + " " + anak;
                    System.out.println("INI ISINYA GAN : " + kirim);
                }else{
                    //tampungan2 = " kosong 2";
                }
                    }
                }
	}
        //fitur = tampungan + " " + tampungan2 + " " + tampungan3;
        fitur = tampungan + "" + tampungan2 + "" + tampungan3 + "" + tampungan4 + "" +
                tampungan5 + "" + tampungan6 + "" + tampungan7 + "" +tampungan8 + "" +
                tampungan9 + "" + tampungan10 + "" + tampungan11 + "" + tampungan12 + "" +
                tampungan13 + "" + tampungan14 + "" + tampungan15 + "" +tampungan16 + "" +
                tampungan17 + "" + tampungan18 + "" + tampungan19 + "" + tampungan20 + "" +
                tampungan21 + "" + tampungan22 + "" + tampungan23 + "" + tampungan24;
        //System.out.println("ISI TAMPUNGAN HASIL TAXONOMY : " + tampungan);
        System.out.println("ISI TAMPUNGAN : " + tampungan);
        
        
        return fitur;

        //return kalim;
    
    
    
    }
    
}
