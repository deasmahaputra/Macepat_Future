/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Taxonomy;

/**
 *
 * @author DEAS
 */
public class SingletonFileOntology {
    
    private static SingletonFileOntology singletonontology = new SingletonFileOntology();
    
    private String urlfile;
    
    private SingletonFileOntology(){}
    
    public static SingletonFileOntology getInstance(){
        return singletonontology;
    }

    public String getUrlfile() {
        return urlfile;
    }

    public void setUrlfile(String urlfile) {
        this.urlfile = urlfile;
    }
    
    
}
