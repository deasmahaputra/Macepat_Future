/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package PatternKnowladge;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author DEAS
 */
public class ngram {
    
    public static ArrayList<String> Lngrams = new ArrayList<String>();
    public static ArrayList<String> Lngrams2 = new ArrayList<String>();
    
    public static List<String> ngrams(int n, String str) {
        List<String> ngrams = new ArrayList<String>();
        String[] words = str.split(" ");
        for (int i = 0; i < words.length - n + 1; i++)
            ngrams.add(concat(words, i, i+n));
        return ngrams;
    }

    public static String concat(String[] words, int start, int end) {
        StringBuilder sb = new StringBuilder();
        for (int i = start; i < end; i++)
            sb.append((i > start ? " " : "") + words[i]);
        return sb.toString();
    }

    public static ArrayList<String> PNgrams(String input) {
        Lngrams.clear();
        for (String ngram : ngrams(2, input)){
            Lngrams.add(ngram);
        }
        return Lngrams;
    }
    
    public static ArrayList<String> PNgrams2(String input) {
        Lngrams2.clear();
        for (String ngram2 : ngrams(3, input)){
            Lngrams2.add(ngram2);
        }
        return Lngrams2;
    }
    
}
