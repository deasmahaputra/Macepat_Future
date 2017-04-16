/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Preprocessing.Corref;

/**
 *
 * @author DEAS
 */
public class GetCorref {
    private static GetCorref getcorref = new GetCorref();
    
    public static String Mention ;
    public static String Result;
    public static String inputan;

    private GetCorref(){}
    
    public static GetCorref getInstance(){
     return getcorref;
    }
    
    public static GetCorref getGetcorref() {
        return getcorref;
    }

    public static void setGetcorref(GetCorref getcorref) {
        GetCorref.getcorref = getcorref;
    }

    public static String getMention() {
        return Mention;
    }

    public static void setMention(String Mention) {
        GetCorref.Mention = Mention;
    }

    public static String getResult() {
        return Result;
    }

    public static void setResult(String Result) {
        GetCorref.Result = Result;
    }

    public static String getInputan() {
        return inputan;
    }

    public static void setInputan(String inputan) {
        GetCorref.inputan = inputan;
    }
    
    
    

    
    
    
    
}
