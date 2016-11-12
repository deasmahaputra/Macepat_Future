/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ta_deas;

import java.io.*;
import java.util.ArrayList;

/**
 *
 * @author DEAS
 */
public class CallFile {
    public static ArrayList<String> listString= new ArrayList<String>();
    
    public static ArrayList<String> Inputan (String Input){
        try {
            File file = new File(Input);
            FileReader fileReader = new FileReader(file);
            BufferedReader br = new BufferedReader(fileReader);
            //StringBuffer sb = new StringBuffer();
            String line;
            while((line = br.readLine()) != null){
            String read = line.toString();
                if(read.contains("##")){
                    read = read.replaceAll(".*##", " ");
                    listString.add(read.trim().replaceAll("\\s+"," "));
                }
            }
            fileReader.close();
            
        } catch (Exception e) {
            e.printStackTrace();
        }
      return listString;
    }
    
}
