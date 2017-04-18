/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package PatternKnowladge;

/**
 *
 * @author DEAS
 */
public class parseRule {
    
    private static parseRule parserule = new parseRule();
    
    private String data;
    
    private parseRule(){}
    
    public static parseRule getInstance(){
        return parserule;
    }
    

    public String getData() {
        return data;
    }

    public void setData(String data) {
        this.data = data;
    }
    
    
    
}
