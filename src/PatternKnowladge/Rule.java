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
import javax.swing.JFrame;

//pengecekan dengan IF =======================================================================================================================================
public class Rule{
   public static ArrayList<String> listinput = new ArrayList<String>();
   
   
   public static String rules(String input){
      String Str = new String(input);
      String opini = null;
//      GetRule ruleget = new GetRule();
//      String getRule1a = ruleget.getRule1a();
//      String getRule1b = ruleget.getRule1b();
//      String getRule1c = ruleget.getRule1c();
//      String getRule2a = ruleget.getRule2a();
//      String getRule2b = ruleget.getRule2b();
//      String getRule2c = ruleget.getRule2c();
//      String getRule3a = ruleget.getRule3a();
//      String getRule3b = ruleget.getRule3b();
//      String getRule3c = ruleget.getRule3c();
//      String getRule4a = ruleget.getRule4a();
//      String getRule4b = ruleget.getRule4b();
//      String getRule4c = ruleget.getRule4c();
//      String getRule5a = ruleget.getRule5a();
//      String getRule5b = ruleget.getRule5b();
//      String getRule5c = ruleget.getRule5c();
//      String getRule6a = ruleget.getRule6a();
//      String getRule6b = ruleget.getRule6b();
//      String getRule6c = ruleget.getRule6c();
//      String getRule7a = ruleget.getRule7a();
//      String getRule7b = ruleget.getRule7b();
//      String getRule7c = ruleget.getRule7c();
//      
//       System.out.println("Isinya :" + getRule1a + getRule1b + getRule1c);
//              

      GetDataRule getdatarule = GetDataRule.getInstance();
       //System.out.println("ISI 1A : " + getdatarule.getRule1A1()+ " " + "ISI 1B :" + getdatarule.getRule1A2()+" "+ "ISI 1C : "+getdatarule.getRule1a3());

      GetRule getRule = GetRule.getInstance();
      String getRule1a = getRule.getRule1a();
      String getRule1b = getRule.getRule1b();
      String getRule1c = getRule.getRule1c();
      String getRule2a = getRule.getRule2a();
      String getRule2b = getRule.getRule2b();
      String getRule2c = getRule.getRule2c();
      String getRule3a = getRule.getRule3a();
      String getRule3b = getRule.getRule3b();
      String getRule3c = getRule.getRule3c();
      String getRule4a = getRule.getRule4a();
      String getRule4b = getRule.getRule4b();
      String getRule4c = getRule.getRule4c();
      String getRule5a = getRule.getRule5a();
      String getRule5b = getRule.getRule5b();
      String getRule5c = getRule.getRule5c();
      String getRule6a = getRule.getRule6a();
      String getRule6b = getRule.getRule6b();
      String getRule6c = getRule.getRule6c();
      String getRule7a = getRule.getRule7a();
      String getRule7b = getRule.getRule7b();
      String getRule7c = getRule.getRule7c();      
//      System.out.println("A : " + getRule1a + getRule1b + getRule1c);
//      System.out.println("B : " + getRule2a + getRule2b + getRule2c);
//      System.out.println("C : " + getRule3a + getRule3b + getRule3c);
//      System.out.println("D : " + getRule4a + getRule4b + getRule4c);
//      System.out.println("E : " + getRule5a + getRule5b + getRule5c);
//      System.out.println("F : " + getRule6a + getRule6b + getRule6c);
//      System.out.println("G : " + getRule7a + getRule7b + getRule7c);
      for (String retval: Str.split(" ")){
          listinput.add(retval);
      }
       
//      if(listinput.size()==2){
//        String kata1=listinput.get(0);
//        String kata2=listinput.get(1);
//        
//        //if(getRule1a == "_JJ" && getRule1b == "_NN" && getRule1c == " "){
//            if(kata1.endsWith(getdatarule.getRule1A1())||kata1.endsWith(getdatarule.getRule1A2())||kata1.endsWith(getdatarule.getRule1a3())){//tambahan jjr dan jjs
//                if(kata2.endsWith(getdatarule.getRule1B1())||kata2.endsWith(getdatarule.getRule1B3())||kata2.endsWith(getdatarule.getRule1B3())){
//                    //System.out.println(kata1+" "+kata2);
//                    opini=kata1+" "+kata2;
//                }
//            }
//       // }else if(getRule2a == "_RB" && getRule2b == "_JJ" && getRule2c == " "){
//            else if(kata1.endsWith(getdatarule.getRule2A1())||kata1.endsWith(getdatarule.getRule2A2())||kata1.endsWith(getdatarule.getRule2a3())){
//                if(kata2.endsWith(getdatarule.getRule2B1())||kata2.endsWith(getdatarule.getRule2B2())||kata2.endsWith(getdatarule.getRule2B3()) ||kata2.endsWith("_VBN")||kata2.endsWith("_VBD")){//tambahan jjr dan jjs
//                    //System.out.println(kata1+" "+kata2);
//                    opini=kata1+" "+kata2;
//                }
//            }
//            else if(kata1.endsWith(getdatarule.getRule3A1())||kata1.endsWith(getdatarule.getRule3A2())||kata1.endsWith(getdatarule.getRule3a3())){
//                if(kata2.endsWith(getdatarule.getRule3B1())||kata2.endsWith(getdatarule.getRule3B2())||kata2.endsWith(getdatarule.getRule3B3())){//tambahan jjr dan jjs
//                    //System.out.println(kata1+" "+kata2);
//                    opini=kata1+" "+kata2;
//                }
//            }
//        //}else if(getRule3a == "_VBN" && getRule3b == "_NN" && getRule3c == " "){
//           else if(kata1.endsWith(getdatarule.getRule4A1())||kata1.endsWith(getdatarule.getRule4A2()) || kata1.endsWith(getdatarule.getRule4a3())){
//                if(kata2.endsWith(getdatarule.getRule4B2())||kata2.endsWith(getdatarule.getRule4B2())||kata2.endsWith(getdatarule.getRule4B3())||kata2.endsWith("_RBR")||kata2.endsWith("_RBS")){
//                    //System.out.println(kata1+" "+kata2);
//                    opini=kata1+" "+kata2;
//                }
//            }
//        //}else if(getRule4a == "_NN" && getRule4b == "_JJ" && getRule4c == " "){
//        //rule baru
//            else if(kata1.endsWith(getdatarule.getRule5A1())||kata1.endsWith(getdatarule.getRule5A2())|| kata1.endsWith(getdatarule.getRule5a3())){
//                if(kata2.endsWith(getdatarule.getRule5B1())||kata2.endsWith(getdatarule.getRule5B2())||kata2.endsWith(getdatarule.getRule5B3())){//tambahan jjr dan jjs
//                    //System.out.println(kata1+" "+kata2);
//                    opini=kata1+" "+kata2;
//                }
//            }
//        }
     // }
      
      if(listinput.size() == 3){
        String kata1=listinput.get(0);
        String kata2=listinput.get(1);
        String kata3=listinput.get(2);
        String tampkata2 = " ";
        String tampkata3 = " ";
        
        if(kata1.endsWith(getdatarule.getRule1A1())||kata1.endsWith(getdatarule.getRule1A2())||kata1.endsWith(getdatarule.getRule1a3())){//tambahan jjr dan jjs
            if(getdatarule.getRule1B1() != " "){
                if(kata2.endsWith(getdatarule.getRule1B1())||kata2.endsWith(getdatarule.getRule1B3())||kata2.endsWith(getdatarule.getRule1B3())){
                    //System.out.println(kata1+" "+kata2);
                    tampkata2 += kata2;
                }
                if(getdatarule.getRule1C1() != " "){
                    if(kata3.endsWith(getdatarule.getRule1C1())||kata3.endsWith(getdatarule.getRule1C2())||kata3.endsWith(getdatarule.getRule1C3())){
                        tampkata3 += kata3;
                    }
                }
                    
                }
            opini = kata1+" "+tampkata2+" "+tampkata3;
            }
       // }else if(getRule2a == "_RB" && getRule2b == "_JJ" && getRule2c == " "){
            else if(kata1.endsWith(getdatarule.getRule2A1())||kata1.endsWith(getdatarule.getRule2A2())||kata1.endsWith(getdatarule.getRule2a3())){
               if(getdatarule.getRule2B1() != " "){
                    if(kata2.endsWith(getdatarule.getRule2B1())||kata2.endsWith(getdatarule.getRule2B2())||kata2.endsWith(getdatarule.getRule2B3())){//tambahan jjr dan jjs
                        //System.out.println(kata1+" "+kata2);
                        tampkata2 += kata2;
                    }
                if(getdatarule.getRule2C1() != " "){
                    if(kata3.endsWith(getdatarule.getRule2C1())||kata3.endsWith(getdatarule.getRule2C2())||kata3.endsWith(getdatarule.getRule2C3())){
                        tampkata3 += kata3;
                    }
                }
                    
                }
               opini=kata1+" "+tampkata2+" "+tampkata3;
            }
            else if(kata1.endsWith(getdatarule.getRule3A1())||kata1.endsWith(getdatarule.getRule3A2())||kata1.endsWith(getdatarule.getRule3a3())){
                if(getdatarule.getRule3B1() != " "){
                    if(kata2.endsWith(getdatarule.getRule3B1())||kata2.endsWith(getdatarule.getRule3B2())||kata2.endsWith(getdatarule.getRule3B3())){//tambahan jjr dan jjs
                    //System.out.println(kata1+" "+kata2);
                    tampkata2 += kata2;
                    }
                    if(getdatarule.getRule3C1() != " "){
                        if(kata3.endsWith(getdatarule.getRule3C1())||kata3.endsWith(getdatarule.getRule3C2())||kata3.endsWith(getdatarule.getRule3C3())){
                            tampkata3 += kata3;
                        }
                    }
                    
                }
                opini = kata1+" "+tampkata2+" "+tampkata3;
            }
        //}else if(getRule3a == "_VBN" && getRule3b == "_NN" && getRule3c == " "){
           else if(kata1.endsWith(getdatarule.getRule4A1())||kata1.endsWith(getdatarule.getRule4A2()) || kata1.endsWith(getdatarule.getRule4a3())){
               if(getdatarule.getRule4B1() != " "){ 
                    if(kata2.endsWith(getdatarule.getRule4B2())||kata2.endsWith(getdatarule.getRule4B2())||kata2.endsWith(getdatarule.getRule4B3())){
                   //System.out.println(kata1+" "+kata2);
                    tampkata2 += kata2;
                    }
                if(getdatarule.getRule4C1() != " "){
                    if(kata3.endsWith(getdatarule.getRule4C1())||kata3.endsWith(getdatarule.getRule4C2())||kata3.endsWith(getdatarule.getRule4C3())){
                        tampkata3 += kata3;
                    }
                }
                    
                }
               opini = kata1 + " " + tampkata2 + " " + tampkata3;
            }
        //}else if(getRule4a == "_NN" && getRule4b == "_JJ" && getRule4c == " "){
        //rule baru
            else if(kata1.endsWith(getdatarule.getRule5A1())||kata1.endsWith(getdatarule.getRule5A2())|| kata1.endsWith(getdatarule.getRule5a3())){
                if(getdatarule.getRule5B1() != " "){ 
                    if(kata2.endsWith(getdatarule.getRule5B1())||kata2.endsWith(getdatarule.getRule5B2())||kata2.endsWith(getdatarule.getRule5B3())){//tambahan jjr dan jjs
                    //System.out.println(kata1+" "+kata2);
                    tampkata2 += kata2;
                    }
                if(getdatarule.getRule5B1() != " "){  
                    if(kata3.endsWith(getdatarule.getRule4C1())||kata3.endsWith(getdatarule.getRule4C2())||kata3.endsWith(getdatarule.getRule4C3())){
                      tampkata3 += kata3;
                    }  
                }
                }
                opini = kata1 + " " + tampkata2 + " " + tampkata3;
            }
          
        //if(getRule5a == "_JJ" && getRule5b == "_NN" && getRule5c == "_NN"){
            else if(kata1.endsWith(getdatarule.getRule6A1())||kata1.endsWith(getdatarule.getRule6A2())||kata1.endsWith(getdatarule.getRule6a3())){//tambahan jjr dan jjs
                if(getdatarule.getRule6B1() != " "){
                    if(kata2.endsWith(getdatarule.getRule6B1())||kata2.endsWith(getdatarule.getRule6B2())||kata2.endsWith(getdatarule.getRule6B3())){
                        tampkata2 += kata2;
                    }
                if(getdatarule.getRule6C1() != " "){
                    if(kata3.endsWith(getdatarule.getRule6C1())||kata3.endsWith(getdatarule.getRule6C2())||kata3.endsWith(getdatarule.getRule6C3())){
                        //System.out.println(kata1+" "+kata2+" "+kata3);
                       tampkata3 += kata3;
                    }
                }   
            }
                opini=kata1+" "+tampkata2+" "+tampkata3;
       }
       // else if(getRule6a == "_RB" && getRule6b == "_JJ" && getRule6c == "_NN"){
            else if(kata1.endsWith(getdatarule.getRule7A1())||kata1.endsWith(getdatarule.getRule7A2())||kata1.endsWith(getdatarule.getRule7a3())){
                if(getdatarule.getRule7B1() != " "){
                    if(kata2.endsWith(getdatarule.getRule7B1())||kata2.endsWith(getdatarule.getRule7B2())||kata2.endsWith(getdatarule.getRule7B3())||kata2.endsWith("_RB")||kata2.endsWith("_RBR")||kata2.endsWith("_RBS")){//tambahan jjr dan jjs
                        tampkata2+= kata2;
                    }
                 if(getdatarule.getRule7C1() != " "){
                    if(kata3.endsWith(getdatarule.getRule7C1())||kata3.endsWith(getdatarule.getRule7C2())||kata3.endsWith(getdatarule.getRule7C3())){
                        //System.out.println(kata1+" "+kata2+" "+kata3);                      
                         tampkata3 += kata3;
                    }     
                    }
                }
                opini=kata1+" "+tampkata2+" "+tampkata3;
            }
       // }
       // else if(getRule7a == "_RB" && getRule7b == "_RB" && getRule7c == "_JJ"){
            else if(kata1.endsWith(getdatarule.getRule8A1())||kata1.endsWith(getdatarule.getRule8A2())||kata1.endsWith(getdatarule.getRule8a3())){
                if(getdatarule.getRule8B1() != " "){
                    if(kata2.endsWith(getdatarule.getRule8B1())||kata2.endsWith(getdatarule.getRule8B2())||kata2.endsWith(getdatarule.getRule8B3())){
                        tampkata2 += kata2;
                    }
                 if(getdatarule.getRule8C1() != " "){
                        if(kata3.endsWith(getdatarule.getRule8C1())||kata3.endsWith(getdatarule.getRule8C2())||kata3.endsWith(getdatarule.getRule8C3())){//tambahan jjr dan jjs
                            //System.out.println(kata1+" "+kata2+" "+kata3);
                         tampkata3 += kata3;
                        }
                        }
                    }
                opini=kata1+" "+tampkata2+" "+tampkata3;
            }
            
            else if(kata1.endsWith(getdatarule.getRule9A1())||kata1.endsWith(getdatarule.getRule9A2())||kata1.endsWith(getdatarule.getRule9a3())){
                if(getdatarule.getRule9B1() != " "){
                    if(kata2.endsWith(getdatarule.getRule9B1())||kata2.endsWith(getdatarule.getRule9B2())||kata2.endsWith(getdatarule.getRule9B3())){
                        tampkata2 += kata2;
                    }
                 if(getdatarule.getRule9C1() != " "){
                        if(kata3.endsWith(getdatarule.getRule9C1())||kata3.endsWith(getdatarule.getRule9C2())||kata3.endsWith(getdatarule.getRule9C3())){//tambahan jjr dan jjs
                            //System.out.println(kata1+" "+kata2+" "+kata3);
                        tampkata3 += kata3;
                        }   
                        }
                    }
                opini=kata1+" "+kata2+" "+kata3;
            }
            
            else if(kata1.endsWith(getdatarule.getRule10A1())||kata1.endsWith(getdatarule.getRule10A2())||kata1.endsWith(getdatarule.getRule10a3())){
                if(getdatarule.getRule10B1() != " "){
                    if(kata2.endsWith(getdatarule.getRule10B1())||kata2.endsWith(getdatarule.getRule10B2())||kata2.endsWith(getdatarule.getRule10B3())){
                    tampkata2 += kata2;
                    }
                    if(getdatarule.getRule10C1() != " "){
                        if(kata3.endsWith(getdatarule.getRule10C1())||kata3.endsWith(getdatarule.getRule10C2())||kata3.endsWith(getdatarule.getRule10C3())){//tambahan jjr dan jjs
                        //System.out.println(kata1+" "+kata2+" "+kata3);
                        tampkata3 += kata3;
                        }
                        
                    }
                }
                opini=kata1+" "+tampkata2+" "+tampkata3;
            }
            
            else if(kata1.endsWith(getdatarule.getRule11A1())||kata1.endsWith(getdatarule.getRule11A2())||kata1.endsWith(getdatarule.getRule11a3())){
                if(getdatarule.getRule11B1() != " "){
                    if(kata2.endsWith(getdatarule.getRule11B1())||kata2.endsWith(getdatarule.getRule11B2())||kata2.endsWith(getdatarule.getRule11B3())){
                        tampkata2 += kata2;
                    }
                    if(getdatarule.getRule11C1() != " "){
                        if(kata3.endsWith(getdatarule.getRule11C1())||kata3.endsWith(getdatarule.getRule11C2())||kata3.endsWith(getdatarule.getRule11C3())){//tambahan jjr dan jjs
                        //System.out.println(kata1+" "+kata2+" "+kata3);
                        tampkata3 += kata3;
                        }
                    }
                }
                  opini=kata1+" "+tampkata2+" "+tampkata3;
            }
            
            else if(kata1.endsWith(getdatarule.getRule12A1())||kata1.endsWith(getdatarule.getRule12A2())||kata1.endsWith(getdatarule.getRule12a3())){
                if(getdatarule.getRule12B1() != " "){
                    if(kata2.endsWith(getdatarule.getRule12B1())||kata2.endsWith(getdatarule.getRule12B2())||kata2.endsWith(getdatarule.getRule12B3())){
                        tampkata2 += kata2;
                    }
                 if(getdatarule.getRule12C1() != " "){
                        if(kata3.endsWith(getdatarule.getRule12C1())||kata3.endsWith(getdatarule.getRule12C2())||kata3.endsWith(getdatarule.getRule12C3())){//tambahan jjr dan jjs
                        //System.out.println(kata1+" "+kata2+" "+kata3);
                        tampkata3 += kata3;
                        
                        }
                    }
                }
                opini=kata1+" "+tampkata2+" "+tampkata3;
            }
            
            else if(kata1.endsWith(getdatarule.getRule13A1())||kata1.endsWith(getdatarule.getRule13A2())||kata1.endsWith(getdatarule.getRule13a3())){
                if(getdatarule.getRule12C1() != " "){
                    if(kata2.endsWith(getdatarule.getRule13B1())||kata2.endsWith(getdatarule.getRule13B2())||kata2.endsWith(getdatarule.getRule13B3())){
                    tampkata2 += kata2;
                    }
                    if(getdatarule.getRule12C1() != " "){
                        if(kata3.endsWith(getdatarule.getRule13C1())||kata3.endsWith(getdatarule.getRule13C2())||kata3.endsWith(getdatarule.getRule13C3())){//tambahan jjr dan jjs
                        //System.out.println(kata1+" "+kata2+" "+kata3);
                        tampkata3 += kata3;
                        }
                        
                    }
                }
                opini=kata1+" "+tampkata2+" "+tampkata3;
            }
            
            else if(kata1.endsWith(getdatarule.getRule14A1())||kata1.endsWith(getdatarule.getRule14A2())||kata1.endsWith(getdatarule.getRule14a3())){
                if(getdatarule.getRule14B1() != " "){
                    if(kata2.endsWith(getdatarule.getRule14B1())||kata2.endsWith(getdatarule.getRule14B2())||kata2.endsWith(getdatarule.getRule14B3())){
                    tampkata2 += tampkata2;
                    }
                    if(getdatarule.getRule14C1() != " "){
                        if(kata3.endsWith(getdatarule.getRule14C1())||kata3.endsWith(getdatarule.getRule14C2())||kata3.endsWith(getdatarule.getRule14C3())){//tambahan jjr dan jjs
                        //System.out.println(kata1+" "+kata2+" "+kata3);
                        tampkata3 += kata3;
                        }
                       
                    }
                }
                 opini=kata1+" "+tampkata2+" "+tampkata3;
            }
            
            else if(kata1.endsWith(getdatarule.getRule15A1())||kata1.endsWith(getdatarule.getRule15A2())||kata1.endsWith(getdatarule.getRule15a3())){
                if(getdatarule.getRule15B1() != " "){
                    if(kata2.endsWith(getdatarule.getRule15B1())||kata2.endsWith(getdatarule.getRule15B2())||kata2.endsWith(getdatarule.getRule15B3())){
                    tampkata2 += kata2;
                    }
                    if(getdatarule.getRule15C1() != " "){
                        if(kata3.endsWith(getdatarule.getRule15C1())||kata3.endsWith(getdatarule.getRule15C2())||kata3.endsWith(getdatarule.getRule15C3())){//tambahan jjr dan jjs
                        //System.out.println(kata1+" "+kata2+" "+kata3);
                        tampkata3 += kata3;
                        }
                        
                    }
                }
                opini=kata1+" "+tampkata2+" "+tampkata3;
            }
            
            else if(kata1.endsWith(getdatarule.getRule16A1())||kata1.endsWith(getdatarule.getRule16A2())||kata1.endsWith(getdatarule.getRule16a3())){
                if(getdatarule.getRule16B1() != " "){
                    if(kata2.endsWith(getdatarule.getRule16B1())||kata2.endsWith(getdatarule.getRule16B2())||kata2.endsWith(getdatarule.getRule16B3())){
                        tampkata2 += kata2;
                    }
                    if(getdatarule.getRule16C1() != " "){
                        if(kata3.endsWith(getdatarule.getRule16C1())||kata3.endsWith(getdatarule.getRule16C2())||kata3.endsWith(getdatarule.getRule16C3())){//tambahan jjr dan jjs
                        //System.out.println(kata1+" "+kata2+" "+kata3);
                        tampkata3 += kata3;
                        }
                        
                    }
                }
                opini=kata1+" "+tampkata2+" "+tampkata3;
            }
            
            else if(kata1.endsWith(getdatarule.getRule17A1())||kata1.endsWith(getdatarule.getRule17A2())||kata1.endsWith(getdatarule.getRule17a3())){
                if(getdatarule.getRule17B1() != " "){
                    if(kata2.endsWith(getdatarule.getRule17B1())||kata2.endsWith(getdatarule.getRule17B2())||kata2.endsWith(getdatarule.getRule17B3())){
                    tampkata2 += kata2;
                    }
                     if(getdatarule.getRule17C1() != " "){
                        if(kata3.endsWith(getdatarule.getRule17C1())||kata3.endsWith(getdatarule.getRule17C2())||kata3.endsWith(getdatarule.getRule17C3())){//tambahan jjr dan jjs
                        //System.out.println(kata1+" "+kata2+" "+kata3);
                        tampkata3 += kata3;
                        }
                        
                    }
                }
                opini=kata1+" "+tampkata2+" "+tampkata3;
            }
            
            else if(kata1.endsWith(getdatarule.getRule18A1())||kata1.endsWith(getdatarule.getRule18A2())||kata1.endsWith(getdatarule.getRule18a3())){
               if(getdatarule.getRule18B1() != " "){
                if(kata2.endsWith(getdatarule.getRule18B1())||kata2.endsWith(getdatarule.getRule18B2())||kata2.endsWith(getdatarule.getRule18B3())){
                    tampkata2 += kata2;
                }
                if(getdatarule.getRule18C1() != " "){
                if(kata3.endsWith(getdatarule.getRule18C1())||kata3.endsWith(getdatarule.getRule18C2())||kata3.endsWith(getdatarule.getRule18C3())){//tambahan jjr dan jjs
                        //System.out.println(kata1+" "+kata2+" "+kata3);
                        
                        tampkata3 += kata3;
                    }
                    }
                }
               opini=kata1+" "+tampkata2+" "+tampkata3;
            }
        }
      //}
      
      listinput.clear();
      return opini;
   }
   //==============================================================================================================================================================================
   
   
   //pengecekan dengan regex =========================================================================================================================
//   public static String Reg(String input){
//       String Str = new String(input);      
//       String hasilRule = null;
//       
//       GetRule ruleget = new GetRule();
//      String getRule1a = ruleget.getRule1a();
//      String getRule1b = ruleget.getRule1b();
//      String getRule1c = ruleget.getRule1c();
//      String getRule2a = ruleget.getRule2a();
//      String getRule2b = ruleget.getRule2b();
//      String getRule2c = ruleget.getRule2c();
//      String getRule3a = ruleget.getRule3a();
//      String getRule3b = ruleget.getRule3b();
//      String getRule3c = ruleget.getRule3c();
//      String getRule4a = ruleget.getRule4a();
//      String getRule4b = ruleget.getRule4b();
//      String getRule4c = ruleget.getRule4c();
//      String getRule5a = ruleget.getRule5a();
//      String getRule5b = ruleget.getRule5b();
//      String getRule5c = ruleget.getRule5c();
//      String getRule6a = ruleget.getRule6a();
//      String getRule6b = ruleget.getRule6b();
//      String getRule6c = ruleget.getRule6c();
//      String getRule7a = ruleget.getRule7a();
//      String getRule7b = ruleget.getRule7b();
//      String getRule7c = ruleget.getRule7c();
//       
//       for (String retval: Str.split(" ")){
//           listinput.add(retval);
//       }
//       
//       String rule1="\\S*_JJ+\\S* (\\S*_NN+\\S*|\\S*_NNS+\\S*)";
//       String rule2="\\S*_JJ+\\S* (\\S*_NN+\\S*|\\S*_NNS+\\S*) (\\S*_NN+\\S*|\\S*_NNS+\\S*)";
//       String rule3="(\\S*_RB+\\S*|\\S*_RBR+\\S*|\\S*_RBS+\\S*) \\S*_JJ+\\S*";
//       String rule4="(\\S*_RB+\\S*|\\S*_RBR+\\S*|\\S*_RBS+\\S*) (\\S*_JJ+\\S*|\\S*_RB+\\S*|\\S*_RBR+\\S*|\\S*_RBS+\\S*) (\\S*_NN+\\S*|\\S*_NNS+\\S*)";
//       String rule5="(\\S*_RB+\\S*|\\S*_RBR+\\S*|\\S*_RBS+\\S*) (\\S*_VBN+\\S*|\\S*_VBD+\\S*)";
//       String rule6="(\\S*_RB+\\S*|\\S*_RBR+\\S*|\\S*_RBS+\\S*) (\\S*_RB+\\S*|\\S*_RBR+\\S*|\\S*_RBS+\\S*) \\S*_JJ+\\S*";
//       String rule7="(\\S*_VBN+\\S*|\\S*_VBD+\\S*) (\\S*_NN+\\S*|\\S*_NNS+\\S*)";
//       String rule8="(\\S*_VBN+\\S*|\\S*_VBD+\\S*) (\\S*_RB+\\S*|\\S*_RBR+\\S*|\\S*_RBS+\\S*)";
//       String rule9="(\\S*_NN+\\S*|\\S*_NNS+\\S*) \\S*_JJ+\\S*";
//       //tambahan
//       String rule10="\\S*_NN+\\S*";
//       String rule11="\\S*_VB+\\S*";
//       String rule12="\\S*_VB+\\S* \\S*_RP+\\S*";
//       String rule13="\\S*_DT+\\S* \\S*_NN+\\S*";
//       String rule14="\\S*_NN+\\S* \\S*_NN+\\S*";
//       String rule15="\\S*_JJ+\\S* \\S*_VB+\\S* \\S*_NN+\\S*";
//       String rule16="\\S*_NN+\\S* \\S*_VB+\\S* \\S*_NN+\\S*";
//       String rule17="\\S*_NN+\\S* \\S*_IN+\\S* \\S*_NN+\\S*";
//       String rule18="\\S*_NN+\\S* \\S*_NN+\\S* \\S*_NN+\\S*";
//       //String rule19="\\S*_NN+\\S* \\S*_IN+\\S* \\S*_DT+\\S* \\S*_NN+\\S*";
//       //String rule20="\\S*_NN+\\S* \\S*_TO+\\S* \\S*_NN+\\S* \\S*_NN+\\S*";
//       //
//       
//       if(listinput.size()==2){
//           Pattern p = Pattern.compile(rule1+"|"+rule3+"|"+rule5+"|"+rule7+"|"+rule8+"|"+rule9+"|"+rule12+"|"+rule13+"|"+rule14);
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
//           Pattern p = Pattern.compile(rule2+"|"+rule4+"|"+rule6+"|"+rule15+"|"+rule16+"|"+rule17+"|"+rule18);
//           Matcher m = p.matcher(input);
//           while (m.find()) {
//                   hasilRule= m.group();
//           }
//       }
//
////        if(listinput.size()==2){
////           Pattern p = Pattern.compile(rule1+"|"+rule3+"|"+rule5+"|"+rule7+"|"+rule8+"|"+rule9);
////           Matcher m = p.matcher(input);
////           while (m.find()) {
////                   hasilRule= m.group();
////           }
////       }
////       else if(listinput.size()==1){
////           Pattern p = Pattern.compile(rule10+"|"+rule11);
////           Matcher m = p.matcher(input);
////           while (m.find()) {
////                   hasilRule= m.group();
////           }
////       }
////       else{
////           Pattern p = Pattern.compile(rule2+"|"+rule4+"|"+rule6);
////           Matcher m = p.matcher(input);
////           while (m.find()) {
////                   hasilRule= m.group();
////           }
////       }
//       
//       listinput.clear();
//       return hasilRule;
   }
   //==================================================================================================================================================
   
