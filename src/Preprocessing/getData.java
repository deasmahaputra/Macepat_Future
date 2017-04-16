/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Preprocessing;

/**
 *
 * @author DEAS
 */
public class getData {
    
    private static getData getdata = new getData();
    
    private String dataIob;
    
    private getData(){}
    
    private static getData getInstance(){
    return getdata;
    }

    public String getDataIob() {
        return dataIob;
    }

    public void setDataIob(String dataIob) {
        this.dataIob = dataIob;
    }
    
    
    
}
