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
public class MyResult {
    
    private String mention;
    private String result;
    private String data;
    
    public MyResult(String mention, String result){
        this.mention = mention;
        this.result = result;
    }
    public String getMention(){
        return mention;
    }
    public String getResult(){
        return result;
    }
    public void setData(String data){
        this.data = data;
    }
    
}
