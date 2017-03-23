/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package PatternKnowladge;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Set;
import java.util.Vector;

public class SWN3 {
    private String pathToSWN = "lib/SentiWordNet_3.0.0.txt";
    private HashMap<String, Double> _dict;

    public SWN3(){

        _dict = new HashMap<String, Double>();
        HashMap<String, Vector<Double>> _temp = new HashMap<String, Vector<Double>>();
        try{
            BufferedReader csv =  new BufferedReader(new FileReader(pathToSWN));
            String line = "";           
            while((line = csv.readLine()) != null)
            {//System.out.println(line);
                String[] data = line.split("\t");
                Double score = Double.parseDouble(data[2])-Double.parseDouble(data[3]);
                String[] words = data[4].split(" ");
                for(String w:words)
                {
                    String[] w_n = w.split("#");
                    w_n[0] += "#"+data[0];
                    int index = Integer.parseInt(w_n[1])-1;
                    if(_temp.containsKey(w_n[0]))
                    {
                        Vector<Double> v = _temp.get(w_n[0]);
                        if(index>v.size())
                            for(int i = v.size();i<index; i++)
                                v.add(0.0);
                        v.add(index, score);
                        _temp.put(w_n[0], v);
                    }
                    else
                    {
                        Vector<Double> v = new Vector<Double>();
                        for(int i = 0;i<index; i++)
                            v.add(0.0);
                        v.add(index, score);
                        _temp.put(w_n[0], v);
                    }
                }
            }
            Set<String> temp = _temp.keySet();
            for (Iterator<String> iterator = temp.iterator(); iterator.hasNext();) {
                String word = (String) iterator.next();
                Vector<Double> v = _temp.get(word);
                double score = 0.0;
                double sum = 0.0;
                //System.out.println("ukuran "+word+" = "+v.size());
                //System.out.println("ini temp = "+iterator.toString());
                for(int i = 0; i < v.size(); i++){
                    //System.out.println("isi v = "+v.get(i));
                    score += ((double)1/(double)(i+1))*v.get(i);}
                for(int i = 1; i<=v.size(); i++)
                    sum += (double)1/(double)i;
                score /= sum;
                String sent = "";               
                if(score>=0.75)
                    sent = "strong_positive";
                else
                if(score > 0.25 && score<=0.5)
                    sent = "positive";
                else
                if(score > 0 && score>=0.25)
                    sent = "weak_positive";
                else
                if(score < 0 && score>=-0.25)
                    sent = "weak_negative";
                else
                if(score < -0.25 && score>=-0.5)
                    sent = "negative";
                else
                if(score<=-0.75)
                    sent = "strong_negative";
                _dict.put(word, score);
            }
        }
        catch(Exception e){e.printStackTrace();}        
    }

public Double extract(String word)
{
Double total = new Double(0);
if(_dict.get(word+"#n") != null){
        //System.out.println(word+"#n");
     total = _dict.get(word+"#n") + total;
        //System.out.println(_dict.get(word+"#n"));
}
if(_dict.get(word+"#a") != null){
    //System.out.println(word+"#a");
    total = _dict.get(word+"#a") + total;
//System.out.println(_dict.get(word+"#a"));
}
if(_dict.get(word+"#r") != null){
    //System.out.println(word+"#r");
    total = _dict.get(word+"#r") + total;
//System.out.println(_dict.get(word+"#r"));
}
if(_dict.get(word+"#v") != null){
    //System.out.println(word+"#v");
    total = _dict.get(word+"#v") + total;
//System.out.println(_dict.get(word+"#v"));
}
return total;
}

/*public static void main(String[] args) {
SWN3 test = new SWN3();
String sentence="Hello have a Super awesome great day caxasd";
String[] words = sentence.split("\\s+"); 
double totalScore = 0;
for(String word : words) {
    word = word.replaceAll("([^a-zA-Z\\s])", "");
    if (test.extract(word) == null)
        continue;
    System.out.println(test.extract(word));
    totalScore += test.extract(word);
}
    System.out.println(sentence);
System.out.println(totalScore);
}*/

}
