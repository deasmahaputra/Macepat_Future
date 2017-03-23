/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Preprocessing;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;

import opennlp.tools.chunker.ChunkerME; 
import opennlp.tools.chunker.ChunkerModel; 
import opennlp.tools.cmdline.postag.POSModelLoader; 
import opennlp.tools.postag.POSModel; 
import opennlp.tools.postag.POSTaggerME; 
import opennlp.tools.tokenize.WhitespaceTokenizer; 

/**
 *
 * @author DEAS
 */
public class BioChunking {
    
    public String Chunker(String text) throws FileNotFoundException, IOException{
        
        String s = null;
        s="";
      //Tokenizing the sentence 
      //String[] sentence = {"Hi welcome to Tutorialspoint", "Cannon 6d the best camera"};       
      //String sentence = "Hi welcome to Tutorialspoint";
      WhitespaceTokenizer whitespaceTokenizer= WhitespaceTokenizer.INSTANCE; 
      String[] tokens = whitespaceTokenizer.tokenize(text); 
     
      //Generating the POS tags 
      //Load the parts of speech model 
      File file = new File("E:/DEAS_MP/PERKULIAHAN/EKSTENSI S1/SEMESTER III/TA/Library/chunk/en-pos-maxent.bin"); 
      POSModel model = new POSModelLoader().load(file);     
      
      //Constructing the tagger 
      POSTaggerME tagger = new POSTaggerME(model);        
      
      //Generating tags from the tokens 
      String[] tags = tagger.tag(tokens);    
    
      //Loading the chunker model 
      InputStream inputStream = new 
      FileInputStream("E:/DEAS_MP/PERKULIAHAN/EKSTENSI S1/SEMESTER III/TA/Library/chunk/en-chunker.bin"); 
      ChunkerModel chunkerModel = new ChunkerModel(inputStream);  
      ChunkerME chunkerME = new ChunkerME(chunkerModel);
      String result[] = chunkerME.chunk(tokens, tags);
      for (String tamp : result){
          s = s + tamp;
       }
    return s;
    }
    
}
