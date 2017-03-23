/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ta_deas;

import Preprocessing.CorreferenceResolution;

/**
 *
 * @author DEAS
 */
public class MainClass {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
//        Interface_TA gui = new Interface_TA();
//        gui.setVisible(true);
          String[] text = {
                "The atom is a basic unit of matter, it consists of a dense central nucleus surrounded by a cloud of negatively charged electrons.", 
                "Barack Obama was born in Hawaii.  He is the president. Obama was elected in 2008.",
                "Cannon 6D the best camera 2016. it has 16 MP Resolution"
        }; 
          for(String cr : text){
          CorreferenceResolution coref = new CorreferenceResolution();
          String temp = coref.Corref(cr);
          
              System.out.println("Ini hasilnya deas" + temp);
          }
    }
    
}
