    /*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package PatternKnowladge;

import java.io.*;
import java.util.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

//pengecekan dengan IF =======================================================================================================================================
public class Rule {
   public static ArrayList<String> listinput = new ArrayList<String>();
   
   public static String rules(String input){
      String Str = new String(input);
      String opini = null;
              
      for (String retval: Str.split(" ")){
          listinput.add(retval);
      }
       
      if(listinput.size()==2){
        String kata1=listinput.get(0);
        String kata2=listinput.get(1);
        
        if(kata1.endsWith("_JJ")||kata1.endsWith("_JJR")||kata1.endsWith("_JJS")){//tambahan jjr dan jjs
            if(kata2.endsWith("_NN")||kata2.endsWith("_NNS")){
                //System.out.println(kata1+" "+kata2);
                opini=kata1+" "+kata2;
            }
        }
        else if(kata1.endsWith("_RB")||kata1.endsWith("_RBR")||kata1.endsWith("_RBS")){
            if(kata2.endsWith("_JJ")||kata2.endsWith("_JJR")||kata2.endsWith("_JJS")||kata2.endsWith("_VBN")||kata2.endsWith("_VBD")){//tambahan jjr dan jjs
                //System.out.println(kata1+" "+kata2);
                opini=kata1+" "+kata2;
            }
        }
        else if(kata1.endsWith("_VBN")||kata1.endsWith("_VBD")){
            if(kata2.endsWith("_NN")||kata2.endsWith("_NNS")||kata2.endsWith("_RB")||kata2.endsWith("_RBR")||kata2.endsWith("_RBS")){
                //System.out.println(kata1+" "+kata2);
                opini=kata1+" "+kata2;
            }
        }
        //rule baru
        else if(kata1.endsWith("_NN")||kata1.endsWith("_NNS")){
            if(kata2.endsWith("_JJ")||kata2.endsWith("_JJR")||kata2.endsWith("_JJS")){//tambahan jjr dan jjs
                //System.out.println(kata1+" "+kata2);
                opini=kata1+" "+kata2;
            }
        }
      }
      
      else{
        String kata1=listinput.get(0);
        String kata2=listinput.get(1);
        String kata3=listinput.get(2);
        
        if(kata1.endsWith("_JJ")||kata1.endsWith("_JJR")||kata1.endsWith("_JJS")){//tambahan jjr dan jjs
            if(kata2.endsWith("_NN")||kata2.endsWith("_NNS")){
                if(kata3.endsWith("_NN")||kata3.endsWith("_NNS")){
                    //System.out.println(kata1+" "+kata2+" "+kata3);
                    opini=kata1+" "+kata2+" "+kata3;
                }
            }
        }
        else if(kata1.endsWith("_RB")||kata1.endsWith("_RBR")||kata1.endsWith("_RBS")){
            if(kata2.endsWith("_JJ")||kata2.endsWith("_JJR")||kata2.endsWith("_JJS")||kata2.endsWith("_RB")||kata2.endsWith("_RBR")||kata2.endsWith("_RBS")){//tambahan jjr dan jjs
                if(kata3.endsWith("_NN")||kata3.endsWith("_NNS")){
                    //System.out.println(kata1+" "+kata2+" "+kata3);
                    opini=kata1+" "+kata2+" "+kata3;
                }
            }
        }
        else if(kata1.endsWith("_RB")||kata1.endsWith("_RBR")||kata1.endsWith("_RBS")){
            if(kata2.endsWith("_RB")||kata2.endsWith("_RBR")||kata2.endsWith("_RBS")){
                if(kata3.endsWith("_JJ")||kata3.endsWith("_JJR")||kata3.endsWith("_JJS")){//tambahan jjr dan jjs
                    //System.out.println(kata1+" "+kata2+" "+kata3);
                    opini=kata1+" "+kata2+" "+kata3;
                }
            }
        }
      }
      listinput.clear();
      return opini;
   }
   //==============================================================================================================================================================================
   
   
   //pengecekan dengan regex =========================================================================================================================
   public static String Reg(String input){
       String Str = new String(input);      
       String hasilRule = null;
       
       for (String retval: Str.split(" ")){
           listinput.add(retval);
       }
       
       String rule1="\\S*_JJ+\\S* (\\S*_NN+\\S*|\\S*_NNS+\\S*)";
       String rule2="\\S*_JJ+\\S* (\\S*_NN+\\S*|\\S*_NNS+\\S*) (\\S*_NN+\\S*|\\S*_NNS+\\S*)";
       String rule3="(\\S*_RB+\\S*|\\S*_RBR+\\S*|\\S*_RBS+\\S*) \\S*_JJ+\\S*";
       String rule4="(\\S*_RB+\\S*|\\S*_RBR+\\S*|\\S*_RBS+\\S*) (\\S*_JJ+\\S*|\\S*_RB+\\S*|\\S*_RBR+\\S*|\\S*_RBS+\\S*) (\\S*_NN+\\S*|\\S*_NNS+\\S*)";
       String rule5="(\\S*_RB+\\S*|\\S*_RBR+\\S*|\\S*_RBS+\\S*) (\\S*_VBN+\\S*|\\S*_VBD+\\S*)";
       String rule6="(\\S*_RB+\\S*|\\S*_RBR+\\S*|\\S*_RBS+\\S*) (\\S*_RB+\\S*|\\S*_RBR+\\S*|\\S*_RBS+\\S*) \\S*_JJ+\\S*";
       String rule7="(\\S*_VBN+\\S*|\\S*_VBD+\\S*) (\\S*_NN+\\S*|\\S*_NNS+\\S*)";
       String rule8="(\\S*_VBN+\\S*|\\S*_VBD+\\S*) (\\S*_RB+\\S*|\\S*_RBR+\\S*|\\S*_RBS+\\S*)";
       String rule9="(\\S*_NN+\\S*|\\S*_NNS+\\S*) \\S*_JJ+\\S*";
       //tambahan
       String rule10="\\S*_NN+\\S*";
       String rule11="\\S*_VB+\\S*";
       String rule12="\\S*_VB+\\S* \\S*_RP+\\S*";
       String rule13="\\S*_DT+\\S* \\S*_NN+\\S*";
       String rule14="\\S*_NN+\\S* \\S*_NN+\\S*";
       String rule15="\\S*_JJ+\\S* \\S*_VB+\\S* \\S*_NN+\\S*";
       String rule16="\\S*_NN+\\S* \\S*_VB+\\S* \\S*_NN+\\S*";
       String rule17="\\S*_NN+\\S* \\S*_IN+\\S* \\S*_NN+\\S*";
       String rule18="\\S*_NN+\\S* \\S*_NN+\\S* \\S*_NN+\\S*";
       //String rule19="\\S*_NN+\\S* \\S*_IN+\\S* \\S*_DT+\\S* \\S*_NN+\\S*";
       //String rule20="\\S*_NN+\\S* \\S*_TO+\\S* \\S*_NN+\\S* \\S*_NN+\\S*";
       //
       
       if(listinput.size()==2){
           Pattern p = Pattern.compile(rule1+"|"+rule3+"|"+rule5+"|"+rule7+"|"+rule8+"|"+rule9+"|"+rule12+"|"+rule13+"|"+rule14);
           Matcher m = p.matcher(input);
           while (m.find()) {
                   hasilRule= m.group();
           }
       }
       else if(listinput.size()==1){
           Pattern p = Pattern.compile(rule10+"|"+rule11);
           Matcher m = p.matcher(input);
           while (m.find()) {
                   hasilRule= m.group();
           }
       }
       else{
           Pattern p = Pattern.compile(rule2+"|"+rule4+"|"+rule6+"|"+rule15+"|"+rule16+"|"+rule17+"|"+rule18);
           Matcher m = p.matcher(input);
           while (m.find()) {
                   hasilRule= m.group();
           }
       }
       
       listinput.clear();
       return hasilRule;
   }
   //==================================================================================================================================================
}
