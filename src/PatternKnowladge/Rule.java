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
      GetRule ruleget = new GetRule();
      String getRule1a = ruleget.getRule1a();
      String getRule1b = ruleget.getRule1b();
      String getRule1c = ruleget.getRule1c();
      String getRule2a = ruleget.getRule2a();
      String getRule2b = ruleget.getRule2b();
      String getRule2c = ruleget.getRule2c();
      String getRule3a = ruleget.getRule3a();
      String getRule3b = ruleget.getRule3b();
      String getRule3c = ruleget.getRule3c();
      String getRule4a = ruleget.getRule4a();
      String getRule4b = ruleget.getRule4b();
      String getRule4c = ruleget.getRule4c();
      String getRule5a = ruleget.getRule5a();
      String getRule5b = ruleget.getRule5b();
      String getRule5c = ruleget.getRule5c();
      String getRule6a = ruleget.getRule6a();
      String getRule6b = ruleget.getRule6b();
      String getRule6c = ruleget.getRule6c();
      String getRule7a = ruleget.getRule7a();
      String getRule7b = ruleget.getRule7b();
      String getRule7c = ruleget.getRule7c();
              
      for (String retval: Str.split(" ")){
          listinput.add(retval);
      }
       
      if(listinput.size()==2){
        String kata1=listinput.get(0);
        String kata2=listinput.get(1);
        
        if(getRule1a == "_JJ" && getRule1b == "_NN" && getRule1c == null ){
            if(kata1.endsWith("_JJ")||kata1.endsWith("_JJR")||kata1.endsWith("_JJS")){//tambahan jjr dan jjs
                if(kata2.endsWith("_NN")||kata2.endsWith("_NNS")){
                    //System.out.println(kata1+" "+kata2);
                    opini=kata1+" "+kata2;
                }
            }
        }
        else if(getRule2a == "_RB" && getRule2b == "_JJ" && getRule2c == null){
            if(kata1.endsWith("_RB")||kata1.endsWith("_RBR")||kata1.endsWith("_RBS")){
                if(kata2.endsWith("_JJ")||kata2.endsWith("_JJR")||kata2.endsWith("_JJS")||kata2.endsWith("_VBN")||kata2.endsWith("_VBD")){//tambahan jjr dan jjs
                //System.out.println(kata1+" "+kata2);
                opini=kata1+" "+kata2;
                }
            }
        }
        
        else if(getRule3a == "_VBN" && getRule3b == "_NN" && getRule3c == null){
            if(kata1.endsWith("_VBN")||kata1.endsWith("_VBD")){
                if(kata2.endsWith("_NN")||kata2.endsWith("_NNS")||kata2.endsWith("_RB")||kata2.endsWith("_RBR")||kata2.endsWith("_RBS")){
                    //System.out.println(kata1+" "+kata2);
                    opini=kata1+" "+kata2;
                }
            }
        }
        //rule baru
        else if(getRule4a == "_NN" && getRule4b == "_JJ" && getRule4c == null){
            if(kata1.endsWith("_NN")||kata1.endsWith("_NNS")){
                if(kata2.endsWith("_JJ")||kata2.endsWith("_JJR")||kata2.endsWith("_JJS")){//tambahan jjr dan jjs
                    //System.out.println(kata1+" "+kata2);
                    opini=kata1+" "+kata2;
                }
            }
        }
      }
      
      else{
        String kata1=listinput.get(0);
        String kata2=listinput.get(1);
        String kata3=listinput.get(2);
        
        if(getRule5a == "_JJ" && getRule5b == "_NN" && getRule5c == "_NN"){
            if(kata1.endsWith("_JJ")||kata1.endsWith("_JJR")||kata1.endsWith("_JJS")){//tambahan jjr dan jjs
                if(kata2.endsWith("_NN")||kata2.endsWith("_NNS")){
                    if(kata3.endsWith("_NN")||kata3.endsWith("_NNS")){
                        //System.out.println(kata1+" "+kata2+" "+kata3);
                        opini=kata1+" "+kata2+" "+kata3;
                    }
                }
            }
        }
        else if(getRule6a == "_RB" && getRule6b == "_JJ" && getRule6c == "_NN"){
            if(kata1.endsWith("_RB")||kata1.endsWith("_RBR")||kata1.endsWith("_RBS")){
                if(kata2.endsWith("_JJ")||kata2.endsWith("_JJR")||kata2.endsWith("_JJS")||kata2.endsWith("_RB")||kata2.endsWith("_RBR")||kata2.endsWith("_RBS")){//tambahan jjr dan jjs
                    if(kata3.endsWith("_NN")||kata3.endsWith("_NNS")){
                        //System.out.println(kata1+" "+kata2+" "+kata3);
                        opini=kata1+" "+kata2+" "+kata3;
                    }
                }
            }
        }
        else if(getRule7a == "_RB" && getRule7b == "_RB" && getRule7c == "_JJ"){
            if(kata1.endsWith("_RB")||kata1.endsWith("_RBR")||kata1.endsWith("_RBS")){
                if(kata2.endsWith("_RB")||kata2.endsWith("_RBR")||kata2.endsWith("_RBS")){
                    if(kata3.endsWith("_JJ")||kata3.endsWith("_JJR")||kata3.endsWith("_JJS")){//tambahan jjr dan jjs
                        //System.out.println(kata1+" "+kata2+" "+kata3);
                        opini=kata1+" "+kata2+" "+kata3;
                    }
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
       
       GetRule ruleget = new GetRule();
      String getRule1a = ruleget.getRule1a();
      String getRule1b = ruleget.getRule1b();
      String getRule1c = ruleget.getRule1c();
      String getRule2a = ruleget.getRule2a();
      String getRule2b = ruleget.getRule2b();
      String getRule2c = ruleget.getRule2c();
      String getRule3a = ruleget.getRule3a();
      String getRule3b = ruleget.getRule3b();
      String getRule3c = ruleget.getRule3c();
      String getRule4a = ruleget.getRule4a();
      String getRule4b = ruleget.getRule4b();
      String getRule4c = ruleget.getRule4c();
      String getRule5a = ruleget.getRule5a();
      String getRule5b = ruleget.getRule5b();
      String getRule5c = ruleget.getRule5c();
      String getRule6a = ruleget.getRule6a();
      String getRule6b = ruleget.getRule6b();
      String getRule6c = ruleget.getRule6c();
      String getRule7a = ruleget.getRule7a();
      String getRule7b = ruleget.getRule7b();
      String getRule7c = ruleget.getRule7c();
       
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

//        if(listinput.size()==2){
//           Pattern p = Pattern.compile(rule1+"|"+rule3+"|"+rule5+"|"+rule7+"|"+rule8+"|"+rule9);
//           Matcher m = p.matcher(input);
//           while (m.find()) {
//                   hasilRule= m.group();
//           }
//       }
//       else if(listinput.size()==1){
//           Pattern p = Pattern.compile(rule10+"|"+rule11);
//           Matcher m = p.matcher(input);
//           while (m.find()) {
//                   hasilRule= m.group();
//           }
//       }
//       else{
//           Pattern p = Pattern.compile(rule2+"|"+rule4+"|"+rule6);
//           Matcher m = p.matcher(input);
//           while (m.find()) {
//                   hasilRule= m.group();
//           }
//       }
       
       listinput.clear();
       return hasilRule;
   }
   //==================================================================================================================================================
}
