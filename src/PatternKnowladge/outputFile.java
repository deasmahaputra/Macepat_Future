package PatternKnowladge;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author cahyadi
 */
import java.io.*;

public class outputFile {
    public static void ouf() throws IOException{
        File f = new File("output.txt");
        f.createNewFile();
    }
    
    public static void oud() throws IOException{
        File f = new File("output.txt");
        f.delete();
    }
    
    public static void tulis(String isi){
         try {
            PrintWriter out = new PrintWriter(new BufferedWriter(new FileWriter("output.txt", true)));
            out.println(isi);
            out.close();
        } catch (IOException e) {
            System.out.println("Gagal menulis");
            e.printStackTrace();
        }
    }
    
    public static void tulisNL(String isi){
         try {
            PrintWriter out = new PrintWriter(new BufferedWriter(new FileWriter("output.txt", true)));
            out.print(isi);
            out.close();
        } catch (IOException e) {
            System.out.println("Gagal menulis");
            e.printStackTrace();
        }
    }
}
