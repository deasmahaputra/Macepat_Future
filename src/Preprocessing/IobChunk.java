/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Preprocessing;

import edu.illinois.cs.cogcomp.chunker.main.lbjava.Chunker;
import edu.illinois.cs.cogcomp.lbjava.nlp.SentenceSplitter;
import edu.illinois.cs.cogcomp.lbjava.nlp.Word;
import edu.illinois.cs.cogcomp.lbjava.nlp.WordSplitter;
import edu.illinois.cs.cogcomp.lbjava.nlp.seg.PlainToTokenParser;
import edu.illinois.cs.cogcomp.lbjava.parse.Parser;

/**
 *
 * @author DEAS
 */
public class IobChunk {
    
    public static String Iob(String[] inputan){
        System.out.println("ini masuknya :" + inputan);
        String tamp = " ";
        Chunker chunker = new Chunker();
        Parser parser = new PlainToTokenParser(new WordSplitter(new SentenceSplitter(inputan)));
        String previous = " ";
        StringBuilder sb = new StringBuilder();
        for (Word w = (Word) parser.next(); w != null; w = (Word) parser.next()) {
            String prediction = chunker.discreteValue(w);
            sb.append(w.form + "_" + prediction + " ");
            tamp = sb.toString();
            if(w.next == null){
                System.out.println("null bro");
            }
            previous = prediction;
            System.out.println(tamp);
        }
        return tamp;
    }
}
