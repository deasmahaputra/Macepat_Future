/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package PatternKnowladge;

import static PatternKnowladge.Rule.listinput;
import java.util.ArrayList;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 *
 * @author DEAS
 */
public class Rule2 {
    
    public static ArrayList<String> listinput = new ArrayList<String>();
   
   public static String rules(String input){
      String satu = " ";
      String satua = " ";
      String satub = " ";
      String satuc = " ";
      String dua = " ";
      String duaa = " ";
      String duab = " ";
      String duac = " ";
      String tiga = " ";
      String tigaa = " ";
      String tigab = " ";
      String tigac = " ";
      String empat = " ";
      String empata = " ";
      String empatb = " ";
      String empatc = " ";
      String lima = " ";
      String limaa = " ";
      String limab = " ";
      String limac = " ";
      String enam = " ";
      String enama = " ";
      String enamb = " ";
      String enamc = " ";
      String tujuh = " ";
      String tujuha = " ";
      String tujuhb = " ";
      String tujuhc = " ";
      String delapan = " ";
      String delapana = " ";
      String delapanb = " ";
      String delapanc = " ";
      String sembilan = " ";
      String sembilana = " ";
      String sembilanb = " ";
      String sembilanc = " ";
      String sepuluh = " ";
      String sepuluha = " ";
      String sepuluhb = " ";
      String sepuluhc = " ";
      String sebelas = " ";
      String sebelasa = " ";
      String sebelasb = " ";
      String sebelasc = " ";
      String duabelas = " ";
      String duabelasa = " ";
      String duabelasb = " ";
      String duabelasc = " ";
      String tigabelas = " ";
      String tigabelasa = " ";
      String tigabelasb = " ";
      String tigabelasc = " ";
      String empatbelas = " ";
      String empatbelasa = " ";
      String empatbelasb = " ";
      String empatbelasc = " ";
      String limabelas = " ";
      String limabelasa = " ";
      String limabelasb = " ";
      String limabelasc = " ";
      String enambelas = " ";
      String enambelasa = " ";
      String enambelasb = " ";
      String enambelasc = " ";
      String tujuhbelas = " ";
      String tujuhbelasa = " ";
      String tujuhbelasb = " ";
      String tujuhbelasc = " ";
      String delapanbelas = " ";
      String delapanbelasa = " ";
      String delapanbelasb = " ";
      String delapanbelasc = " ";
      
//=======================================================Mengisi Rule ==========================================================
      
      String satu1a = " ";
      String satu1b = " ";
      String satu1c = " ";
      String satu2a = " ";
      String satu2b = " ";
      String satu2c = " ";
      String satu3a = " ";
      String satu3b = " ";
      String satu3c = " ";
      
      String dua1a = " ";
      String dua1b = " ";
      String dua1c = " ";
      String dua2a = " ";
      String dua2b = " ";
      String dua2c = " ";
      String dua3a = " ";
      String dua3b = " ";
      String dua3c = " ";
      
      String tiga1a = " ";
      String tiga1b = " ";
      String tiga1c = " ";
      String tiga2a = " ";
      String tiga2b = " ";
      String tiga2c = " ";
      String tiga3a = " ";
      String tiga3b = " ";
      String tiga3c = " ";
      
      String empat1a = " ";
      String empat1b = " ";
      String empat1c = " ";
      String empat2a = " ";
      String empat2b = " ";
      String empat2c = " ";
      String empat3a = " ";
      String empat3b = " ";
      String empat3c = " ";
      
      String lima1a = " ";
      String lima1b = " ";
      String lima1c = " ";
      String lima2a = " ";
      String lima2b = " ";
      String lima2c = " ";
      String lima3a = " ";
      String lima3b = " ";
      String lima3c = " ";
      
      String enam1a = " ";
      String enam1b = " ";
      String enam1c = " ";
      String enam2a = " ";
      String enam2b = " ";
      String enam2c = " ";
      String enam3a = " ";
      String enam3b = " ";
      String enam3c = " ";
      
      String tujuh1a = " ";
      String tujuh1b = " ";
      String tujuh1c = " ";
      String tujuh2a = " ";
      String tujuh2b = " ";
      String tujuh2c = " ";
      String tujuh3a = " ";
      String tujuh3b = " ";
      String tujuh3c = " ";
      
      String delapan1a = " ";
      String delapan1b = " ";
      String delapan1c = " ";
      String delapan2a = " ";
      String delapan2b = " ";
      String delapan2c = " ";
      String delapan3a = " ";
      String delapan3b = " ";
      String delapan3c = " ";
      
      String sembilan1a = " ";
      String sembilan1b = " ";
      String sembilan1c = " ";
      String sembilan2a = " ";
      String sembilan2b = " ";
      String sembilan2c = " ";
      String sembilan3a = " ";
      String sembilan3b = " ";
      String sembilan3c = " ";
      
      String sepuluh1a = " ";
      String sepuluh1b = " ";
      String sepuluh1c = " ";
      String sepuluh2a = " ";
      String sepuluh2b = " ";
      String sepuluh2c = " ";
      String sepuluh3a = " ";
      String sepuluh3b = " ";
      String sepuluh3c = " ";
      
      String sebelas1a = " ";
      String sebelas1b = " ";
      String sebelas1c = " ";
      String sebelas2a = " ";
      String sebelas2b = " ";
      String sebelas2c = " ";
      String sebelas3a = " ";
      String sebelas3b = " ";
      String sebelas3c = " ";
      
      String duabelas1a = " ";
      String duabelas1b = " ";
      String duabelas1c = " ";
      String duabelas2a = " ";
      String duabelas2b = " ";
      String duabelas2c = " ";
      String duabelas3a = " ";
      String duabelas3b = " ";
      String duabelas3c = " ";
      
      String tigabelas1a = " ";
      String tigabelas1b = " ";
      String tigabelas1c = " ";
      String tigabelas2a = " ";
      String tigabelas2b = " ";
      String tigabelas2c = " ";
      String tigabelas3a = " ";
      String tigabelas3b = " ";
      String tigabelas3c = " ";
      
      String empatbelas1a = " ";
      String empatbelas1b = " ";
      String empatbelas1c = " ";
      String empatbelas2a = " ";
      String empatbelas2b = " ";
      String empatbelas2c = " ";
      String empatbelas3a = " ";
      String empatbelas3b = " ";
      String empatbelas3c = " ";
      
      String limabelas1a = " ";
      String limabelas1b = " ";
      String limabelas1c = " ";
      String limabelas2a = " ";
      String limabelas2b = " ";
      String limabelas2c = " ";
      String limabelas3a = " ";
      String limabelas3b = " ";
      String limabelas3c = " ";
      
      String enambelas1a = " ";
      String enambelas1b = " ";
      String enambelas1c = " ";
      String enambelas2a = " ";
      String enambelas2b = " ";
      String enambelas2c = " ";
      String enambelas3a = " ";
      String enambelas3b = " ";
      String enambelas3c = " ";
      
      String tujuhbelas1a = " ";
      String tujuhbelas1b = " ";
      String tujuhbelas1c = " ";
      String tujuhbelas2a = " ";
      String tujuhbelas2b = " ";
      String tujuhbelas2c = " ";
      String tujuhbelas3a = " ";
      String tujuhbelas3b = " ";
      String tujuhbelas3c = " ";
      
      String delapanbelas1a = " ";
      String delapanbelas1b = " ";
      String delapanbelas1c = " ";
      String delapanbelas2a = " ";
      String delapanbelas2b = " ";
      String delapanbelas2c = " ";
      String delapanbelas3a = " ";
      String delapanbelas3b = " ";
      String delapanbelas3c = " ";
     
       
      parseRule parserule = parseRule.getInstance();
      
      String tamp = parserule.getData();
      
      String[] tampsplit = tamp.split("\n");
       //System.out.println("Isi tamp : "+tamp);
      if(tampsplit != null){
          if(tampsplit.length == 1){
              satu = tampsplit[0];
              String[] satusplit = satu.split(" ");
              String[] duasplit = dua.split(" ");
              if(satusplit.length == 1){
                  satua = satusplit[0];
              }else if(satusplit.length == 2){
                  satua = satusplit[0];
                  satub = satusplit[1];
              }else{
                  satua = satusplit[0];
                  satub = satusplit[1];
                  satuc = satusplit[2];
              }
              
              
          }else if(tampsplit.length == 2){
              satu = tampsplit[0];
              dua = tampsplit[1];
              String[] satusplit = satu.split(" ");
              String[] duasplit = dua.split(" ");
              if(satusplit.length == 1){
                  satua = satusplit[0];
              }else if(satusplit.length == 2){
                  satua = satusplit[0];
                  satub = satusplit[1];
              }else{
                  satua = satusplit[0];
                  satub = satusplit[1];
                  satuc = satusplit[2];
              }
              if(duasplit.length == 1){
                  duaa = duasplit[0];
              }else if(duasplit.length == 2){
                  duaa = duasplit[0];
                  duab = duasplit[1];
              }else{
                  duaa = duasplit[0];
                  duab = duasplit[1];
                  duac = duasplit[2];
              }
              
              
          }else if(tampsplit.length == 3){
              satu = tampsplit[0];
              dua = tampsplit[1];
              tiga = tampsplit[2];
              String[] satusplit = satu.split(" ");
              String[] duasplit = dua.split(" ");
              String[] tigasplit = tiga.split(" ");
              if(satusplit.length == 1){
                  satua = satusplit[0];
              }else if(satusplit.length == 2){
                  satua = satusplit[0];
                  satub = satusplit[1];
              }else{
                  satua = satusplit[0];
                  satub = satusplit[1];
                  satuc = satusplit[2];
              }
              if(duasplit.length == 1){
                  duaa = duasplit[0];
              }else if(duasplit.length == 2){
                  duaa = duasplit[0];
                  duab = duasplit[1];
              }else{
                  duaa = duasplit[0];
                  duab = duasplit[1];
                  duac = duasplit[2];
              }
              if(tigasplit.length == 1){
                  tigaa = tigasplit[0];
              }else if(tigasplit.length == 2){
                  tigaa = tigasplit[0];
                  tigab = tigasplit[1];
              }else{
                  tigaa = tigasplit[0];
                  tigab = tigasplit[1];
                  tigac = tigasplit[2];
              
              }
          }else if(tampsplit.length == 4){
              satu = tampsplit[0];
              dua = tampsplit[1];
              tiga = tampsplit[2];
              empat = tampsplit[3];
              String[] satusplit = satu.split(" ");
              String[] duasplit = dua.split(" ");
              String[] tigasplit = tiga.split(" ");
              String[] empatsplit = empat.split(" ");
              if(satusplit.length == 1){
                  satua = satusplit[0];
              }else if(satusplit.length == 2){
                  satua = satusplit[0];
                  satub = satusplit[1];
              }else{
                  satua = satusplit[0];
                  satub = satusplit[1];
                  satuc = satusplit[2];
              }
              if(duasplit.length == 1){
                  duaa = duasplit[0];
              }else if(duasplit.length == 2){
                  duaa = duasplit[0];
                  duab = duasplit[1];
              }else{
                  duaa = duasplit[0];
                  duab = duasplit[1];
                  duac = duasplit[2];
              }
              if(tigasplit.length == 1){
                  tigaa = tigasplit[0];
              }else if(tigasplit.length == 2){
                  tigaa = tigasplit[0];
                  tigab = tigasplit[1];
              }else{
                  tigaa = tigasplit[0];
                  tigab = tigasplit[1];
                  tigac = tigasplit[2];
              
              }
              if(empatsplit.length == 1){
                  empata = empatsplit[0];
              }else if(empatsplit.length == 2){
                  empata = empatsplit[0];
                  empatb = empatsplit[1];
              }else{
                  empata = empatsplit[0];
                  empatb = empatsplit[1];
                  empatc = empatsplit[2];
              }
          }
          
          else if(tampsplit.length == 5){
              satu = tampsplit[0];
              dua = tampsplit[1];
              tiga = tampsplit[2];
              empat = tampsplit[3];
              lima = tampsplit[4];
              String[] satusplit = satu.split(" ");
              String[] duasplit = dua.split(" ");
              String[] tigasplit = tiga.split(" ");
              String[] empatsplit = empat.split(" ");
              String[] limasplit = lima.split(" ");
              if(satusplit.length == 1){
                  satua = satusplit[0];
              }else if(satusplit.length == 2){
                  satua = satusplit[0];
                  satub = satusplit[1];
              }else{
                  satua = satusplit[0];
                  satub = satusplit[1];
                  satuc = satusplit[2];
              }
              if(duasplit.length == 1){
                  duaa = duasplit[0];
              }else if(duasplit.length == 2){
                  duaa = duasplit[0];
                  duab = duasplit[1];
              }else{
                  duaa = duasplit[0];
                  duab = duasplit[1];
                  duac = duasplit[2];
              }
              if(tigasplit.length == 1){
                  tigaa = tigasplit[0];
              }else if(tigasplit.length == 2){
                  tigaa = tigasplit[0];
                  tigab = tigasplit[1];
              }else{
                  tigaa = tigasplit[0];
                  tigab = tigasplit[1];
                  tigac = tigasplit[2];
              
              }
              if(empatsplit.length == 1){
                  empata = empatsplit[0];
              }else if(empatsplit.length == 2){
                  empata = empatsplit[0];
                  empatb = empatsplit[1];
              }else{
                  empata = empatsplit[0];
                  empatb = empatsplit[1];
                  empatc = empatsplit[2];
              }
              if(limasplit.length == 1){
                  limaa = limasplit[0];
              }else if(limasplit.length == 2){
                  limaa = limasplit[0];
                  limab = limasplit[1];
              }else{
                  limaa = limasplit[0];
                  limab = limasplit[1];
                  limac = limasplit[2];
              }
          }
          
          else if(tampsplit.length == 5){
              satu = tampsplit[0];
              dua = tampsplit[1];
              tiga = tampsplit[2];
              empat = tampsplit[3];
              lima = tampsplit[4];
              
              String[] satusplit = satu.split(" ");
              String[] duasplit = dua.split(" ");
              String[] tigasplit = tiga.split(" ");
              String[] empatsplit = empat.split(" ");
              String[] limasplit = lima.split(" ");
              if(satusplit.length == 1){
                  satua = satusplit[0];
              }else if(satusplit.length == 2){
                  satua = satusplit[0];
                  satub = satusplit[1];
              }else{
                  satua = satusplit[0];
                  satub = satusplit[1];
                  satuc = satusplit[2];
              }
              if(duasplit.length == 1){
                  duaa = duasplit[0];
              }else if(duasplit.length == 2){
                  duaa = duasplit[0];
                  duab = duasplit[1];
              }else{
                  duaa = duasplit[0];
                  duab = duasplit[1];
                  duac = duasplit[2];
              }
              if(tigasplit.length == 1){
                  tigaa = tigasplit[0];
              }else if(tigasplit.length == 2){
                  tigaa = tigasplit[0];
                  tigab = tigasplit[1];
              }else{
                  tigaa = tigasplit[0];
                  tigab = tigasplit[1];
                  tigac = tigasplit[2];
              
              }
              if(empatsplit.length == 1){
                  empata = empatsplit[0];
              }else if(empatsplit.length == 2){
                  empata = empatsplit[0];
                  empatb = empatsplit[1];
              }else{
                  empata = empatsplit[0];
                  empatb = empatsplit[1];
                  empatc = empatsplit[2];
              }
              if(limasplit.length == 1){
                  limaa = limasplit[0];
              }else if(limasplit.length == 2){
                  limaa = limasplit[0];
                  limab = limasplit[1];
              }else{
                  limaa = limasplit[0];
                  limab = limasplit[1];
                  limac = limasplit[2];
              }
          }
          
          else if(tampsplit.length == 6){
              satu = tampsplit[0];
              dua = tampsplit[1];
              tiga = tampsplit[2];
              empat = tampsplit[3];
              lima = tampsplit[4];
              enam = tampsplit[5];
              String[] satusplit = satu.split(" ");
              String[] duasplit = dua.split(" ");
              String[] tigasplit = tiga.split(" ");
              String[] empatsplit = empat.split(" ");
              String[] limasplit = lima.split(" ");
              String[] enamsplit = enam.split(" ");
              if(satusplit.length == 1){
                  satua = satusplit[0];
              }else if(satusplit.length == 2){
                  satua = satusplit[0];
                  satub = satusplit[1];
              }else{
                  satua = satusplit[0];
                  satub = satusplit[1];
                  satuc = satusplit[2];
              }
              if(duasplit.length == 1){
                  duaa = duasplit[0];
              }else if(duasplit.length == 2){
                  duaa = duasplit[0];
                  duab = duasplit[1];
              }else{
                  duaa = duasplit[0];
                  duab = duasplit[1];
                  duac = duasplit[2];
              }
              if(tigasplit.length == 1){
                  tigaa = tigasplit[0];
              }else if(tigasplit.length == 2){
                  tigaa = tigasplit[0];
                  tigab = tigasplit[1];
              }else{
                  tigaa = tigasplit[0];
                  tigab = tigasplit[1];
                  tigac = tigasplit[2];
              
              }
              if(empatsplit.length == 1){
                  empata = empatsplit[0];
              }else if(empatsplit.length == 2){
                  empata = empatsplit[0];
                  empatb = empatsplit[1];
              }else{
                  empata = empatsplit[0];
                  empatb = empatsplit[1];
                  empatc = empatsplit[2];
              }
              if(limasplit.length == 1){
                  limaa = limasplit[0];
              }else if(limasplit.length == 2){
                  limaa = limasplit[0];
                  limab = limasplit[1];
              }else{
                  limaa = limasplit[0];
                  limab = limasplit[1];
                  limac = limasplit[2];
              }
              if(enamsplit.length == 1){
                  enama = enamsplit[0];
              }else if(enamsplit.length == 2){
                  enama = enamsplit[0];
                  enamb = enamsplit[1];
              }else{
                  enama = enamsplit[0];
                  enamb = enamsplit[1];
                  enamc = enamsplit[2];
              }
              
          }
          
          else if(tampsplit.length == 7){
              satu = tampsplit[0];
              dua = tampsplit[1];
              tiga = tampsplit[2];
              empat = tampsplit[3];
              lima = tampsplit[4];
              enam = tampsplit[5];
              tujuh = tampsplit[6];
              String[] satusplit = satu.split(" ");
              String[] duasplit = dua.split(" ");
              String[] tigasplit = tiga.split(" ");
              String[] empatsplit = empat.split(" ");
              String[] limasplit = lima.split(" ");
              String[] enamsplit = enam.split(" ");
              String[] tujuhsplit = tujuh.split(" ");
              if(satusplit.length == 1){
                  satua = satusplit[0];
              }else if(satusplit.length == 2){
                  satua = satusplit[0];
                  satub = satusplit[1];
              }else{
                  satua = satusplit[0];
                  satub = satusplit[1];
                  satuc = satusplit[2];
              }
              if(duasplit.length == 1){
                  duaa = duasplit[0];
              }else if(duasplit.length == 2){
                  duaa = duasplit[0];
                  duab = duasplit[1];
              }else{
                  duaa = duasplit[0];
                  duab = duasplit[1];
                  duac = duasplit[2];
              }
              if(tigasplit.length == 1){
                  tigaa = tigasplit[0];
              }else if(tigasplit.length == 2){
                  tigaa = tigasplit[0];
                  tigab = tigasplit[1];
              }else{
                  tigaa = tigasplit[0];
                  tigab = tigasplit[1];
                  tigac = tigasplit[2];
              
              }
              if(empatsplit.length == 1){
                  empata = empatsplit[0];
              }else if(empatsplit.length == 2){
                  empata = empatsplit[0];
                  empatb = empatsplit[1];
              }else{
                  empata = empatsplit[0];
                  empatb = empatsplit[1];
                  empatc = empatsplit[2];
              }
              if(limasplit.length == 1){
                  limaa = limasplit[0];
              }else if(limasplit.length == 2){
                  limaa = limasplit[0];
                  limab = limasplit[1];
              }else{
                  limaa = limasplit[0];
                  limab = limasplit[1];
                  limac = limasplit[2];
              }
              if(enamsplit.length == 1){
                  enama = enamsplit[0];
              }else if(enamsplit.length == 2){
                  enama = enamsplit[0];
                  enamb = enamsplit[1];
              }else{
                  enama = enamsplit[0];
                  enamb = enamsplit[1];
                  enamc = enamsplit[2];
              }
              if(tujuhsplit.length == 1){
                  tujuha = tujuhsplit[0];
              }else if(tujuhsplit.length == 2){
                  tujuha = tujuhsplit[0];
                  tujuhb = tujuhsplit[1];
              }else{
                  tujuha = tujuhsplit[0];
                  tujuhb = tujuhsplit[1];
                  tujuhc = tujuhsplit[2];
              }
              
          }
          
          else if(tampsplit.length == 8){
              satu = tampsplit[0];
              dua = tampsplit[1];
              tiga = tampsplit[2];
              empat = tampsplit[3];
              lima = tampsplit[4];
              enam = tampsplit[5];
              tujuh = tampsplit[6];
              delapan = tampsplit[7];
              String[] satusplit = satu.split(" ");
              String[] duasplit = dua.split(" ");
              String[] tigasplit = tiga.split(" ");
              String[] empatsplit = empat.split(" ");
              String[] limasplit = lima.split(" ");
              String[] enamsplit = enam.split(" ");
              String[] tujuhsplit = tujuh.split(" ");
              String[] delapansplit = delapan.split(" ");
              if(satusplit.length == 1){
                  satua = satusplit[0];
              }else if(satusplit.length == 2){
                  satua = satusplit[0];
                  satub = satusplit[1];
              }else{
                  satua = satusplit[0];
                  satub = satusplit[1];
                  satuc = satusplit[2];
              }
              if(duasplit.length == 1){
                  duaa = duasplit[0];
              }else if(duasplit.length == 2){
                  duaa = duasplit[0];
                  duab = duasplit[1];
              }else{
                  duaa = duasplit[0];
                  duab = duasplit[1];
                  duac = duasplit[2];
              }
              if(tigasplit.length == 1){
                  tigaa = tigasplit[0];
              }else if(tigasplit.length == 2){
                  tigaa = tigasplit[0];
                  tigab = tigasplit[1];
              }else{
                  tigaa = tigasplit[0];
                  tigab = tigasplit[1];
                  tigac = tigasplit[2];
              
              }
              if(empatsplit.length == 1){
                  empata = empatsplit[0];
              }else if(empatsplit.length == 2){
                  empata = empatsplit[0];
                  empatb = empatsplit[1];
              }else{
                  empata = empatsplit[0];
                  empatb = empatsplit[1];
                  empatc = empatsplit[2];
              }
              if(limasplit.length == 1){
                  limaa = limasplit[0];
              }else if(limasplit.length == 2){
                  limaa = limasplit[0];
                  limab = limasplit[1];
              }else{
                  limaa = limasplit[0];
                  limab = limasplit[1];
                  limac = limasplit[2];
              }
              if(enamsplit.length == 1){
                  enama = enamsplit[0];
              }else if(enamsplit.length == 2){
                  enama = enamsplit[0];
                  enamb = enamsplit[1];
              }else{
                  enama = enamsplit[0];
                  enamb = enamsplit[1];
                  enamc = enamsplit[2];
              }
              if(tujuhsplit.length == 1){
                  tujuha = tujuhsplit[0];
              }else if(tujuhsplit.length == 2){
                  tujuha = tujuhsplit[0];
                  tujuhb = tujuhsplit[1];
              }else{
                  tujuha = tujuhsplit[0];
                  tujuhb = tujuhsplit[1];
                  tujuhc = tujuhsplit[2];
              }
              if(delapansplit.length == 1){
                  delapana = delapansplit[0];
              }else if(delapansplit.length == 2){
                  delapana = delapansplit[0];
                  delapanb = delapansplit[1];
              }else{
                  delapana = delapansplit[0];
                  delapanb = delapansplit[1];
                  delapanc = delapansplit[2];
              }
              
          }
          
          else if(tampsplit.length == 9){
              satu = tampsplit[0];
              dua = tampsplit[1];
              tiga = tampsplit[2];
              empat = tampsplit[3];
              lima = tampsplit[4];
              enam = tampsplit[5];
              tujuh = tampsplit[6];
              delapan = tampsplit[7];
              sembilan = tampsplit[8];
              String[] satusplit = satu.split(" ");
              String[] duasplit = dua.split(" ");
              String[] tigasplit = tiga.split(" ");
              String[] empatsplit = empat.split(" ");
              String[] limasplit = lima.split(" ");
              String[] enamsplit = enam.split(" ");
              String[] tujuhsplit = tujuh.split(" ");
              String[] delapansplit = delapan.split(" ");
              String[] sembilansplit = sembilan.split(" ");
              if(satusplit.length == 1){
                  satua = satusplit[0];
              }else if(satusplit.length == 2){
                  satua = satusplit[0];
                  satub = satusplit[1];
              }else{
                  satua = satusplit[0];
                  satub = satusplit[1];
                  satuc = satusplit[2];
              }
              if(duasplit.length == 1){
                  duaa = duasplit[0];
              }else if(duasplit.length == 2){
                  duaa = duasplit[0];
                  duab = duasplit[1];
              }else{
                  duaa = duasplit[0];
                  duab = duasplit[1];
                  duac = duasplit[2];
              }
              if(tigasplit.length == 1){
                  tigaa = tigasplit[0];
              }else if(tigasplit.length == 2){
                  tigaa = tigasplit[0];
                  tigab = tigasplit[1];
              }else{
                  tigaa = tigasplit[0];
                  tigab = tigasplit[1];
                  tigac = tigasplit[2];
              
              }
              if(empatsplit.length == 1){
                  empata = empatsplit[0];
              }else if(empatsplit.length == 2){
                  empata = empatsplit[0];
                  empatb = empatsplit[1];
              }else{
                  empata = empatsplit[0];
                  empatb = empatsplit[1];
                  empatc = empatsplit[2];
              }
              if(limasplit.length == 1){
                  limaa = limasplit[0];
              }else if(limasplit.length == 2){
                  limaa = limasplit[0];
                  limab = limasplit[1];
              }else{
                  limaa = limasplit[0];
                  limab = limasplit[1];
                  limac = limasplit[2];
              }
              if(enamsplit.length == 1){
                  enama = enamsplit[0];
              }else if(enamsplit.length == 2){
                  enama = enamsplit[0];
                  enamb = enamsplit[1];
              }else{
                  enama = enamsplit[0];
                  enamb = enamsplit[1];
                  enamc = enamsplit[2];
              }
              if(tujuhsplit.length == 1){
                  tujuha = tujuhsplit[0];
              }else if(tujuhsplit.length == 2){
                  tujuha = tujuhsplit[0];
                  tujuhb = tujuhsplit[1];
              }else{
                  tujuha = tujuhsplit[0];
                  tujuhb = tujuhsplit[1];
                  tujuhc = tujuhsplit[2];
              }
              if(delapansplit.length == 1){
                  delapana = delapansplit[0];
              }else if(delapansplit.length == 2){
                  delapana = delapansplit[0];
                  delapanb = delapansplit[1];
              }else{
                  delapana = delapansplit[0];
                  delapanb = delapansplit[1];
                  delapanc = delapansplit[2];
              }
              if(sembilansplit.length == 1){
                  sembilana = sembilansplit[0];
              }else if(sembilansplit.length == 2){
                  sembilana = sembilansplit[0];
                  sembilanb = sembilansplit[1];
              }else{
                  sembilana = sembilansplit[0];
                  sembilanb = sembilansplit[1];
                  sembilanc = sembilansplit[2];
              }
              
          }
          
          else if(tampsplit.length == 10){
              satu = tampsplit[0];
              dua = tampsplit[1];
              tiga = tampsplit[2];
              empat = tampsplit[3];
              lima = tampsplit[4];
              enam = tampsplit[5];
              tujuh = tampsplit[6];
              delapan = tampsplit[7];
              sembilan = tampsplit[8];
              sepuluh = tampsplit[9];
              String[] satusplit = satu.split(" ");
              String[] duasplit = dua.split(" ");
              String[] tigasplit = tiga.split(" ");
              String[] empatsplit = empat.split(" ");
              String[] limasplit = lima.split(" ");
              String[] enamsplit = enam.split(" ");
              String[] tujuhsplit = tujuh.split(" ");
              String[] delapansplit = delapan.split(" ");
              String[] sembilansplit = sembilan.split(" ");
              String[] sepuluhsplit = sepuluh.split(" ");
              if(satusplit.length == 1){
                  satua = satusplit[0];
              }else if(satusplit.length == 2){
                  satua = satusplit[0];
                  satub = satusplit[1];
              }else{
                  satua = satusplit[0];
                  satub = satusplit[1];
                  satuc = satusplit[2];
              }
              if(duasplit.length == 1){
                  duaa = duasplit[0];
              }else if(duasplit.length == 2){
                  duaa = duasplit[0];
                  duab = duasplit[1];
              }else{
                  duaa = duasplit[0];
                  duab = duasplit[1];
                  duac = duasplit[2];
              }
              if(tigasplit.length == 1){
                  tigaa = tigasplit[0];
              }else if(tigasplit.length == 2){
                  tigaa = tigasplit[0];
                  tigab = tigasplit[1];
              }else{
                  tigaa = tigasplit[0];
                  tigab = tigasplit[1];
                  tigac = tigasplit[2];
              
              }
              if(empatsplit.length == 1){
                  empata = empatsplit[0];
              }else if(empatsplit.length == 2){
                  empata = empatsplit[0];
                  empatb = empatsplit[1];
              }else{
                  empata = empatsplit[0];
                  empatb = empatsplit[1];
                  empatc = empatsplit[2];
              }
              if(limasplit.length == 1){
                  limaa = limasplit[0];
              }else if(limasplit.length == 2){
                  limaa = limasplit[0];
                  limab = limasplit[1];
              }else{
                  limaa = limasplit[0];
                  limab = limasplit[1];
                  limac = limasplit[2];
              }
              if(enamsplit.length == 1){
                  enama = enamsplit[0];
              }else if(enamsplit.length == 2){
                  enama = enamsplit[0];
                  enamb = enamsplit[1];
              }else{
                  enama = enamsplit[0];
                  enamb = enamsplit[1];
                  enamc = enamsplit[2];
              }
              if(tujuhsplit.length == 1){
                  tujuha = tujuhsplit[0];
              }else if(tujuhsplit.length == 2){
                  tujuha = tujuhsplit[0];
                  tujuhb = tujuhsplit[1];
              }else{
                  tujuha = tujuhsplit[0];
                  tujuhb = tujuhsplit[1];
                  tujuhc = tujuhsplit[2];
              }
              if(delapansplit.length == 1){
                  delapana = delapansplit[0];
              }else if(delapansplit.length == 2){
                  delapana = delapansplit[0];
                  delapanb = delapansplit[1];
              }else{
                  delapana = delapansplit[0];
                  delapanb = delapansplit[1];
                  delapanc = delapansplit[2];
              }
              if(sembilansplit.length == 1){
                  sembilana = sembilansplit[0];
              }else if(sembilansplit.length == 2){
                  sembilana = sembilansplit[0];
                  sembilanb = sembilansplit[1];
              }else{
                  sembilana = sembilansplit[0];
                  sembilanb = sembilansplit[1];
                  sembilanc = sembilansplit[2];
              }
              if(sepuluhsplit.length == 1){
                  sepuluha = sepuluhsplit[0];
              }else if(sepuluhsplit.length == 2){
                  sepuluha = sepuluhsplit[0];
                  sepuluhb = sepuluhsplit[1];
              }else{
                  sepuluha = sepuluhsplit[0];
                  sepuluhb = sepuluhsplit[1];
                  sepuluhc = sepuluhsplit[2];
              }
              
          }
          
           else if(tampsplit.length == 11){
              satu = tampsplit[0];
              dua = tampsplit[1];
              tiga = tampsplit[2];
              empat = tampsplit[3];
              lima = tampsplit[4];
              enam = tampsplit[5];
              tujuh = tampsplit[6];
              delapan = tampsplit[7];
              sembilan = tampsplit[8];
              sepuluh = tampsplit[9];
              sebelas = tampsplit[10];
              String[] satusplit = satu.split(" ");
              String[] duasplit = dua.split(" ");
              String[] tigasplit = tiga.split(" ");
              String[] empatsplit = empat.split(" ");
              String[] limasplit = lima.split(" ");
              String[] enamsplit = enam.split(" ");
              String[] tujuhsplit = tujuh.split(" ");
              String[] delapansplit = delapan.split(" ");
              String[] sembilansplit = sembilan.split(" ");
              String[] sepuluhsplit = sepuluh.split(" ");
              String[] sebelassplit = sebelas.split(" ");
              if(satusplit.length == 1){
                  satua = satusplit[0];
              }else if(satusplit.length == 2){
                  satua = satusplit[0];
                  satub = satusplit[1];
              }else{
                  satua = satusplit[0];
                  satub = satusplit[1];
                  satuc = satusplit[2];
              }
              if(duasplit.length == 1){
                  duaa = duasplit[0];
              }else if(duasplit.length == 2){
                  duaa = duasplit[0];
                  duab = duasplit[1];
              }else{
                  duaa = duasplit[0];
                  duab = duasplit[1];
                  duac = duasplit[2];
              }
              if(tigasplit.length == 1){
                  tigaa = tigasplit[0];
              }else if(tigasplit.length == 2){
                  tigaa = tigasplit[0];
                  tigab = tigasplit[1];
              }else{
                  tigaa = tigasplit[0];
                  tigab = tigasplit[1];
                  tigac = tigasplit[2];
              
              }
              if(empatsplit.length == 1){
                  empata = empatsplit[0];
              }else if(empatsplit.length == 2){
                  empata = empatsplit[0];
                  empatb = empatsplit[1];
              }else{
                  empata = empatsplit[0];
                  empatb = empatsplit[1];
                  empatc = empatsplit[2];
              }
              if(limasplit.length == 1){
                  limaa = limasplit[0];
              }else if(limasplit.length == 2){
                  limaa = limasplit[0];
                  limab = limasplit[1];
              }else{
                  limaa = limasplit[0];
                  limab = limasplit[1];
                  limac = limasplit[2];
              }
              if(enamsplit.length == 1){
                  enama = enamsplit[0];
              }else if(enamsplit.length == 2){
                  enama = enamsplit[0];
                  enamb = enamsplit[1];
              }else{
                  enama = enamsplit[0];
                  enamb = enamsplit[1];
                  enamc = enamsplit[2];
              }
              if(tujuhsplit.length == 1){
                  tujuha = tujuhsplit[0];
              }else if(tujuhsplit.length == 2){
                  tujuha = tujuhsplit[0];
                  tujuhb = tujuhsplit[1];
              }else{
                  tujuha = tujuhsplit[0];
                  tujuhb = tujuhsplit[1];
                  tujuhc = tujuhsplit[2];
              }
              if(delapansplit.length == 1){
                  delapana = delapansplit[0];
              }else if(delapansplit.length == 2){
                  delapana = delapansplit[0];
                  delapanb = delapansplit[1];
              }else{
                  delapana = delapansplit[0];
                  delapanb = delapansplit[1];
                  delapanc = delapansplit[2];
              }
              if(sembilansplit.length == 1){
                  sembilana = sembilansplit[0];
              }else if(sembilansplit.length == 2){
                  sembilana = sembilansplit[0];
                  sembilanb = sembilansplit[1];
              }else{
                  sembilana = sembilansplit[0];
                  sembilanb = sembilansplit[1];
                  sembilanc = sembilansplit[2];
              }
              if(sepuluhsplit.length == 1){
                  sepuluha = sepuluhsplit[0];
              }else if(sepuluhsplit.length == 2){
                  sepuluha = sepuluhsplit[0];
                  sepuluhb = sepuluhsplit[1];
              }else{
                  sepuluha = sepuluhsplit[0];
                  sepuluhb = sepuluhsplit[1];
                  sepuluhc = sepuluhsplit[2];
              }
              if(sebelassplit.length == 1){
                  sebelasa = sebelassplit[0];
              }else if(sebelassplit.length == 2){
                  sebelasa = sebelassplit[0];
                  sebelasb = sebelassplit[1];
              }else{
                  sebelasa = sebelassplit[0];
                  sebelasb = sebelassplit[1];
                  sebelasc = sebelassplit[2];
              }
              
          }
          else if(tampsplit.length == 12){
              satu = tampsplit[0];
              dua = tampsplit[1];
              tiga = tampsplit[2];
              empat = tampsplit[3];
              lima = tampsplit[4];
              enam = tampsplit[5];
              tujuh = tampsplit[6];
              delapan = tampsplit[7];
              sembilan = tampsplit[8];
              sepuluh = tampsplit[9];
              sebelas = tampsplit[10];
              duabelas = tampsplit[11];
              String[] satusplit = satu.split(" ");
              String[] duasplit = dua.split(" ");
              String[] tigasplit = tiga.split(" ");
              String[] empatsplit = empat.split(" ");
              String[] limasplit = lima.split(" ");
              String[] enamsplit = enam.split(" ");
              String[] tujuhsplit = tujuh.split(" ");
              String[] delapansplit = delapan.split(" ");
              String[] sembilansplit = sembilan.split(" ");
              String[] sepuluhsplit = sepuluh.split(" ");
              String[] sebelassplit = sebelas.split(" ");
              String[] duabelassplit = duabelas.split(" ");
              if(satusplit.length == 1){
                  satua = satusplit[0];
              }else if(satusplit.length == 2){
                  satua = satusplit[0];
                  satub = satusplit[1];
              }else{
                  satua = satusplit[0];
                  satub = satusplit[1];
                  satuc = satusplit[2];
              }
              if(duasplit.length == 1){
                  duaa = duasplit[0];
              }else if(duasplit.length == 2){
                  duaa = duasplit[0];
                  duab = duasplit[1];
              }else{
                  duaa = duasplit[0];
                  duab = duasplit[1];
                  duac = duasplit[2];
              }
              if(tigasplit.length == 1){
                  tigaa = tigasplit[0];
              }else if(tigasplit.length == 2){
                  tigaa = tigasplit[0];
                  tigab = tigasplit[1];
              }else{
                  tigaa = tigasplit[0];
                  tigab = tigasplit[1];
                  tigac = tigasplit[2];
              
              }
              if(empatsplit.length == 1){
                  empata = empatsplit[0];
              }else if(empatsplit.length == 2){
                  empata = empatsplit[0];
                  empatb = empatsplit[1];
              }else{
                  empata = empatsplit[0];
                  empatb = empatsplit[1];
                  empatc = empatsplit[2];
              }
              if(limasplit.length == 1){
                  limaa = limasplit[0];
              }else if(limasplit.length == 2){
                  limaa = limasplit[0];
                  limab = limasplit[1];
              }else{
                  limaa = limasplit[0];
                  limab = limasplit[1];
                  limac = limasplit[2];
              }
              if(enamsplit.length == 1){
                  enama = enamsplit[0];
              }else if(enamsplit.length == 2){
                  enama = enamsplit[0];
                  enamb = enamsplit[1];
              }else{
                  enama = enamsplit[0];
                  enamb = enamsplit[1];
                  enamc = enamsplit[2];
              }
              if(tujuhsplit.length == 1){
                  tujuha = tujuhsplit[0];
              }else if(tujuhsplit.length == 2){
                  tujuha = tujuhsplit[0];
                  tujuhb = tujuhsplit[1];
              }else{
                  tujuha = tujuhsplit[0];
                  tujuhb = tujuhsplit[1];
                  tujuhc = tujuhsplit[2];
              }
              if(delapansplit.length == 1){
                  delapana = delapansplit[0];
              }else if(delapansplit.length == 2){
                  delapana = delapansplit[0];
                  delapanb = delapansplit[1];
              }else{
                  delapana = delapansplit[0];
                  delapanb = delapansplit[1];
                  delapanc = delapansplit[2];
              }
              if(sembilansplit.length == 1){
                  sembilana = sembilansplit[0];
              }else if(sembilansplit.length == 2){
                  sembilana = sembilansplit[0];
                  sembilanb = sembilansplit[1];
              }else{
                  sembilana = sembilansplit[0];
                  sembilanb = sembilansplit[1];
                  sembilanc = sembilansplit[2];
              }
              if(sepuluhsplit.length == 1){
                  sepuluha = sepuluhsplit[0];
              }else if(sepuluhsplit.length == 2){
                  sepuluha = sepuluhsplit[0];
                  sepuluhb = sepuluhsplit[1];
              }else{
                  sepuluha = sepuluhsplit[0];
                  sepuluhb = sepuluhsplit[1];
                  sepuluhc = sepuluhsplit[2];
              }
              if(sebelassplit.length == 1){
                  sebelasa = sebelassplit[0];
              }else if(sebelassplit.length == 2){
                  sebelasa = sebelassplit[0];
                  sebelasb = sebelassplit[1];
              }else{
                  sebelasa = sebelassplit[0];
                  sebelasb = sebelassplit[1];
                  sebelasc = sebelassplit[2];
              }
              if(duabelassplit.length == 1){
                  duabelasa = duabelassplit[0];
              }else if(duabelassplit.length == 2){
                  duabelasa = duabelassplit[0];
                  duabelasb = duabelassplit[1];
              }else{
                  duabelasa = duabelassplit[0];
                  duabelasb = duabelassplit[1];
                  duabelasc = duabelassplit[2];
              }
              
          }
          
          else if(tampsplit.length == 13){
              satu = tampsplit[0];
              dua = tampsplit[1];
              tiga = tampsplit[2];
              empat = tampsplit[3];
              lima = tampsplit[4];
              enam = tampsplit[5];
              tujuh = tampsplit[6];
              delapan = tampsplit[7];
              sembilan = tampsplit[8];
              sepuluh = tampsplit[9];
              sebelas = tampsplit[10];
              duabelas = tampsplit[11];
              tigabelas = tampsplit[12];
              String[] satusplit = satu.split(" ");
              String[] duasplit = dua.split(" ");
              String[] tigasplit = tiga.split(" ");
              String[] empatsplit = empat.split(" ");
              String[] limasplit = lima.split(" ");
              String[] enamsplit = enam.split(" ");
              String[] tujuhsplit = tujuh.split(" ");
              String[] delapansplit = delapan.split(" ");
              String[] sembilansplit = sembilan.split(" ");
              String[] sepuluhsplit = sepuluh.split(" ");
              String[] sebelassplit = sebelas.split(" ");
              String[] duabelassplit = duabelas.split(" ");
              String[] tigabelassplit = tigabelas.split(" ");
              if(satusplit.length == 1){
                  satua = satusplit[0];
              }else if(satusplit.length == 2){
                  satua = satusplit[0];
                  satub = satusplit[1];
              }else{
                  satua = satusplit[0];
                  satub = satusplit[1];
                  satuc = satusplit[2];
              }
              if(duasplit.length == 1){
                  duaa = duasplit[0];
              }else if(duasplit.length == 2){
                  duaa = duasplit[0];
                  duab = duasplit[1];
              }else{
                  duaa = duasplit[0];
                  duab = duasplit[1];
                  duac = duasplit[2];
              }
              if(tigasplit.length == 1){
                  tigaa = tigasplit[0];
              }else if(tigasplit.length == 2){
                  tigaa = tigasplit[0];
                  tigab = tigasplit[1];
              }else{
                  tigaa = tigasplit[0];
                  tigab = tigasplit[1];
                  tigac = tigasplit[2];
              
              }
              if(empatsplit.length == 1){
                  empata = empatsplit[0];
              }else if(empatsplit.length == 2){
                  empata = empatsplit[0];
                  empatb = empatsplit[1];
              }else{
                  empata = empatsplit[0];
                  empatb = empatsplit[1];
                  empatc = empatsplit[2];
              }
              if(limasplit.length == 1){
                  limaa = limasplit[0];
              }else if(limasplit.length == 2){
                  limaa = limasplit[0];
                  limab = limasplit[1];
              }else{
                  limaa = limasplit[0];
                  limab = limasplit[1];
                  limac = limasplit[2];
              }
              if(enamsplit.length == 1){
                  enama = enamsplit[0];
              }else if(enamsplit.length == 2){
                  enama = enamsplit[0];
                  enamb = enamsplit[1];
              }else{
                  enama = enamsplit[0];
                  enamb = enamsplit[1];
                  enamc = enamsplit[2];
              }
              if(tujuhsplit.length == 1){
                  tujuha = tujuhsplit[0];
              }else if(tujuhsplit.length == 2){
                  tujuha = tujuhsplit[0];
                  tujuhb = tujuhsplit[1];
              }else{
                  tujuha = tujuhsplit[0];
                  tujuhb = tujuhsplit[1];
                  tujuhc = tujuhsplit[2];
              }
              if(delapansplit.length == 1){
                  delapana = delapansplit[0];
              }else if(delapansplit.length == 2){
                  delapana = delapansplit[0];
                  delapanb = delapansplit[1];
              }else{
                  delapana = delapansplit[0];
                  delapanb = delapansplit[1];
                  delapanc = delapansplit[2];
              }
              if(sembilansplit.length == 1){
                  sembilana = sembilansplit[0];
              }else if(sembilansplit.length == 2){
                  sembilana = sembilansplit[0];
                  sembilanb = sembilansplit[1];
              }else{
                  sembilana = sembilansplit[0];
                  sembilanb = sembilansplit[1];
                  sembilanc = sembilansplit[2];
              }
              if(sepuluhsplit.length == 1){
                  sepuluha = sepuluhsplit[0];
              }else if(sepuluhsplit.length == 2){
                  sepuluha = sepuluhsplit[0];
                  sepuluhb = sepuluhsplit[1];
              }else{
                  sepuluha = sepuluhsplit[0];
                  sepuluhb = sepuluhsplit[1];
                  sepuluhc = sepuluhsplit[2];
              }
              if(sebelassplit.length == 1){
                  sebelasa = sebelassplit[0];
              }else if(sebelassplit.length == 2){
                  sebelasa = sebelassplit[0];
                  sebelasb = sebelassplit[1];
              }else{
                  sebelasa = sebelassplit[0];
                  sebelasb = sebelassplit[1];
                  sebelasc = sebelassplit[2];
              }
              if(duabelassplit.length == 1){
                  duabelasa = duabelassplit[0];
              }else if(duabelassplit.length == 2){
                  duabelasa = duabelassplit[0];
                  duabelasb = duabelassplit[1];
              }else{
                  duabelasa = duabelassplit[0];
                  duabelasb = duabelassplit[1];
                  duabelasc = duabelassplit[2];
              }
              if(tigabelassplit.length == 1){
                  tigabelasa = tigabelassplit[0];
              }else if(tigabelassplit.length == 2){
                  tigabelasa = tigabelassplit[0];
                  tigabelasb = tigabelassplit[1];
              }else{
                  tigabelasa = tigabelassplit[0];
                  tigabelasb = tigabelassplit[1];
                  tigabelasc = tigabelassplit[2];
              }
              
          }
          
          else if(tampsplit.length == 14){
              satu = tampsplit[0];
              dua = tampsplit[1];
              tiga = tampsplit[2];
              empat = tampsplit[3];
              lima = tampsplit[4];
              enam = tampsplit[5];
              tujuh = tampsplit[6];
              delapan = tampsplit[7];
              sembilan = tampsplit[8];
              sepuluh = tampsplit[9];
              sebelas = tampsplit[10];
              duabelas = tampsplit[11];
              tigabelas = tampsplit[12];
              empatbelas = tampsplit[13];
              String[] satusplit = satu.split(" ");
              String[] duasplit = dua.split(" ");
              String[] tigasplit = tiga.split(" ");
              String[] empatsplit = empat.split(" ");
              String[] limasplit = lima.split(" ");
              String[] enamsplit = enam.split(" ");
              String[] tujuhsplit = tujuh.split(" ");
              String[] delapansplit = delapan.split(" ");
              String[] sembilansplit = sembilan.split(" ");
              String[] sepuluhsplit = sepuluh.split(" ");
              String[] sebelassplit = sebelas.split(" ");
              String[] duabelassplit = duabelas.split(" ");
              String[] tigabelassplit = tigabelas.split(" ");
              String[] empatbelassplit = empatbelas.split(" ");
              if(satusplit.length == 1){
                  satua = satusplit[0];
              }else if(satusplit.length == 2){
                  satua = satusplit[0];
                  satub = satusplit[1];
              }else{
                  satua = satusplit[0];
                  satub = satusplit[1];
                  satuc = satusplit[2];
              }
              if(duasplit.length == 1){
                  duaa = duasplit[0];
              }else if(duasplit.length == 2){
                  duaa = duasplit[0];
                  duab = duasplit[1];
              }else{
                  duaa = duasplit[0];
                  duab = duasplit[1];
                  duac = duasplit[2];
              }
              if(tigasplit.length == 1){
                  tigaa = tigasplit[0];
              }else if(tigasplit.length == 2){
                  tigaa = tigasplit[0];
                  tigab = tigasplit[1];
              }else{
                  tigaa = tigasplit[0];
                  tigab = tigasplit[1];
                  tigac = tigasplit[2];
              
              }
              if(empatsplit.length == 1){
                  empata = empatsplit[0];
              }else if(empatsplit.length == 2){
                  empata = empatsplit[0];
                  empatb = empatsplit[1];
              }else{
                  empata = empatsplit[0];
                  empatb = empatsplit[1];
                  empatc = empatsplit[2];
              }
              if(limasplit.length == 1){
                  limaa = limasplit[0];
              }else if(limasplit.length == 2){
                  limaa = limasplit[0];
                  limab = limasplit[1];
              }else{
                  limaa = limasplit[0];
                  limab = limasplit[1];
                  limac = limasplit[2];
              }
              if(enamsplit.length == 1){
                  enama = enamsplit[0];
              }else if(enamsplit.length == 2){
                  enama = enamsplit[0];
                  enamb = enamsplit[1];
              }else{
                  enama = enamsplit[0];
                  enamb = enamsplit[1];
                  enamc = enamsplit[2];
              }
              if(tujuhsplit.length == 1){
                  tujuha = tujuhsplit[0];
              }else if(tujuhsplit.length == 2){
                  tujuha = tujuhsplit[0];
                  tujuhb = tujuhsplit[1];
              }else{
                  tujuha = tujuhsplit[0];
                  tujuhb = tujuhsplit[1];
                  tujuhc = tujuhsplit[2];
              }
              if(delapansplit.length == 1){
                  delapana = delapansplit[0];
              }else if(delapansplit.length == 2){
                  delapana = delapansplit[0];
                  delapanb = delapansplit[1];
              }else{
                  delapana = delapansplit[0];
                  delapanb = delapansplit[1];
                  delapanc = delapansplit[2];
              }
              if(sembilansplit.length == 1){
                  sembilana = sembilansplit[0];
              }else if(sembilansplit.length == 2){
                  sembilana = sembilansplit[0];
                  sembilanb = sembilansplit[1];
              }else{
                  sembilana = sembilansplit[0];
                  sembilanb = sembilansplit[1];
                  sembilanc = sembilansplit[2];
              }
              if(sepuluhsplit.length == 1){
                  sepuluha = sepuluhsplit[0];
              }else if(sepuluhsplit.length == 2){
                  sepuluha = sepuluhsplit[0];
                  sepuluhb = sepuluhsplit[1];
              }else{
                  sepuluha = sepuluhsplit[0];
                  sepuluhb = sepuluhsplit[1];
                  sepuluhc = sepuluhsplit[2];
              }
              if(sebelassplit.length == 1){
                  sebelasa = sebelassplit[0];
              }else if(sebelassplit.length == 2){
                  sebelasa = sebelassplit[0];
                  sebelasb = sebelassplit[1];
              }else{
                  sebelasa = sebelassplit[0];
                  sebelasb = sebelassplit[1];
                  sebelasc = sebelassplit[2];
              }
              if(duabelassplit.length == 1){
                  duabelasa = duabelassplit[0];
              }else if(duabelassplit.length == 2){
                  duabelasa = duabelassplit[0];
                  duabelasb = duabelassplit[1];
              }else{
                  duabelasa = duabelassplit[0];
                  duabelasb = duabelassplit[1];
                  duabelasc = duabelassplit[2];
              }
              if(tigabelassplit.length == 1){
                  tigabelasa = tigabelassplit[0];
              }else if(tigabelassplit.length == 2){
                  tigabelasa = tigabelassplit[0];
                  tigabelasb = tigabelassplit[1];
              }else{
                  tigabelasa = tigabelassplit[0];
                  tigabelasb = tigabelassplit[1];
                  tigabelasc = tigabelassplit[2];
              }
              if(empatbelassplit.length == 1){
                  empatbelasa = empatbelassplit[0];
              }else if(empatbelassplit.length == 2){
                  empatbelasa = empatbelassplit[0];
                  empatbelasb = empatbelassplit[1];
              }else{
                  empatbelasa = empatbelassplit[0];
                  empatbelasb = empatbelassplit[1];
                  empatbelasc = empatbelassplit[2];
              }
              
          }
          else if(tampsplit.length == 15){
              satu = tampsplit[0];
              dua = tampsplit[1];
              tiga = tampsplit[2];
              empat = tampsplit[3];
              lima = tampsplit[4];
              enam = tampsplit[5];
              tujuh = tampsplit[6];
              delapan = tampsplit[7];
              sembilan = tampsplit[8];
              sepuluh = tampsplit[9];
              sebelas = tampsplit[10];
              duabelas = tampsplit[11];
              tigabelas = tampsplit[12];
              empatbelas = tampsplit[13];
              limabelas = tampsplit[14];
              String[] satusplit = satu.split(" ");
              String[] duasplit = dua.split(" ");
              String[] tigasplit = tiga.split(" ");
              String[] empatsplit = empat.split(" ");
              String[] limasplit = lima.split(" ");
              String[] enamsplit = enam.split(" ");
              String[] tujuhsplit = tujuh.split(" ");
              String[] delapansplit = delapan.split(" ");
              String[] sembilansplit = sembilan.split(" ");
              String[] sepuluhsplit = sepuluh.split(" ");
              String[] sebelassplit = sebelas.split(" ");
              String[] duabelassplit = duabelas.split(" ");
              String[] tigabelassplit = tigabelas.split(" ");
              String[] empatbelassplit = empatbelas.split(" ");
              String[] limabelassplit = limabelas.split(" ");
              if(satusplit.length == 1){
                  satua = satusplit[0];
              }else if(satusplit.length == 2){
                  satua = satusplit[0];
                  satub = satusplit[1];
              }else{
                  satua = satusplit[0];
                  satub = satusplit[1];
                  satuc = satusplit[2];
              }
              if(duasplit.length == 1){
                  duaa = duasplit[0];
              }else if(duasplit.length == 2){
                  duaa = duasplit[0];
                  duab = duasplit[1];
              }else{
                  duaa = duasplit[0];
                  duab = duasplit[1];
                  duac = duasplit[2];
              }
              if(tigasplit.length == 1){
                  tigaa = tigasplit[0];
              }else if(tigasplit.length == 2){
                  tigaa = tigasplit[0];
                  tigab = tigasplit[1];
              }else{
                  tigaa = tigasplit[0];
                  tigab = tigasplit[1];
                  tigac = tigasplit[2];
              
              }
              if(empatsplit.length == 1){
                  empata = empatsplit[0];
              }else if(empatsplit.length == 2){
                  empata = empatsplit[0];
                  empatb = empatsplit[1];
              }else{
                  empata = empatsplit[0];
                  empatb = empatsplit[1];
                  empatc = empatsplit[2];
              }
              if(limasplit.length == 1){
                  limaa = limasplit[0];
              }else if(limasplit.length == 2){
                  limaa = limasplit[0];
                  limab = limasplit[1];
              }else{
                  limaa = limasplit[0];
                  limab = limasplit[1];
                  limac = limasplit[2];
              }
              if(enamsplit.length == 1){
                  enama = enamsplit[0];
              }else if(enamsplit.length == 2){
                  enama = enamsplit[0];
                  enamb = enamsplit[1];
              }else{
                  enama = enamsplit[0];
                  enamb = enamsplit[1];
                  enamc = enamsplit[2];
              }
              if(tujuhsplit.length == 1){
                  tujuha = tujuhsplit[0];
              }else if(tujuhsplit.length == 2){
                  tujuha = tujuhsplit[0];
                  tujuhb = tujuhsplit[1];
              }else{
                  tujuha = tujuhsplit[0];
                  tujuhb = tujuhsplit[1];
                  tujuhc = tujuhsplit[2];
              }
              if(delapansplit.length == 1){
                  delapana = delapansplit[0];
              }else if(delapansplit.length == 2){
                  delapana = delapansplit[0];
                  delapanb = delapansplit[1];
              }else{
                  delapana = delapansplit[0];
                  delapanb = delapansplit[1];
                  delapanc = delapansplit[2];
              }
              if(sembilansplit.length == 1){
                  sembilana = sembilansplit[0];
              }else if(sembilansplit.length == 2){
                  sembilana = sembilansplit[0];
                  sembilanb = sembilansplit[1];
              }else{
                  sembilana = sembilansplit[0];
                  sembilanb = sembilansplit[1];
                  sembilanc = sembilansplit[2];
              }
              if(sepuluhsplit.length == 1){
                  sepuluha = sepuluhsplit[0];
              }else if(sepuluhsplit.length == 2){
                  sepuluha = sepuluhsplit[0];
                  sepuluhb = sepuluhsplit[1];
              }else{
                  sepuluha = sepuluhsplit[0];
                  sepuluhb = sepuluhsplit[1];
                  sepuluhc = sepuluhsplit[2];
              }
              if(sebelassplit.length == 1){
                  sebelasa = sebelassplit[0];
              }else if(sebelassplit.length == 2){
                  sebelasa = sebelassplit[0];
                  sebelasb = sebelassplit[1];
              }else{
                  sebelasa = sebelassplit[0];
                  sebelasb = sebelassplit[1];
                  sebelasc = sebelassplit[2];
              }
              if(duabelassplit.length == 1){
                  duabelasa = duabelassplit[0];
              }else if(duabelassplit.length == 2){
                  duabelasa = duabelassplit[0];
                  duabelasb = duabelassplit[1];
              }else{
                  duabelasa = duabelassplit[0];
                  duabelasb = duabelassplit[1];
                  duabelasc = duabelassplit[2];
              }
              if(tigabelassplit.length == 1){
                  tigabelasa = tigabelassplit[0];
              }else if(tigabelassplit.length == 2){
                  tigabelasa = tigabelassplit[0];
                  tigabelasb = tigabelassplit[1];
              }else{
                  tigabelasa = tigabelassplit[0];
                  tigabelasb = tigabelassplit[1];
                  tigabelasc = tigabelassplit[2];
              }
              if(empatbelassplit.length == 1){
                  empatbelasa = empatbelassplit[0];
              }else if(empatbelassplit.length == 2){
                  empatbelasa = empatbelassplit[0];
                  empatbelasb = empatbelassplit[1];
              }else{
                  empatbelasa = empatbelassplit[0];
                  empatbelasb = empatbelassplit[1];
                  empatbelasc = empatbelassplit[2];
              }
              if(limabelassplit.length == 1){
                  limabelasa = limabelassplit[0];
              }else if(limabelassplit.length == 2){
                  limabelasa = limabelassplit[0];
                  limabelasb = limabelassplit[1];
              }else{
                  limabelasa = limabelassplit[0];
                  limabelasb = limabelassplit[1];
                  limabelasc = limabelassplit[2];
              }
              
          }
          
          else if(tampsplit.length == 16){
              satu = tampsplit[0];
              dua = tampsplit[1];
              tiga = tampsplit[2];
              empat = tampsplit[3];
              lima = tampsplit[4];
              enam = tampsplit[5];
              tujuh = tampsplit[6];
              delapan = tampsplit[7];
              sembilan = tampsplit[8];
              sepuluh = tampsplit[9];
              sebelas = tampsplit[10];
              duabelas = tampsplit[11];
              tigabelas = tampsplit[12];
              empatbelas = tampsplit[13];
              limabelas = tampsplit[14];
              enambelas = tampsplit[15];
              String[] satusplit = satu.split(" ");
              String[] duasplit = dua.split(" ");
              String[] tigasplit = tiga.split(" ");
              String[] empatsplit = empat.split(" ");
              String[] limasplit = lima.split(" ");
              String[] enamsplit = enam.split(" ");
              String[] tujuhsplit = tujuh.split(" ");
              String[] delapansplit = delapan.split(" ");
              String[] sembilansplit = sembilan.split(" ");
              String[] sepuluhsplit = sepuluh.split(" ");
              String[] sebelassplit = sebelas.split(" ");
              String[] duabelassplit = duabelas.split(" ");
              String[] tigabelassplit = tigabelas.split(" ");
              String[] empatbelassplit = empatbelas.split(" ");
              String[] limabelassplit = limabelas.split(" ");
              String[] enambelassplit = enambelas.split(" ");
              if(satusplit.length == 1){
                  satua = satusplit[0];
              }else if(satusplit.length == 2){
                  satua = satusplit[0];
                  satub = satusplit[1];
              }else{
                  satua = satusplit[0];
                  satub = satusplit[1];
                  satuc = satusplit[2];
              }
              if(duasplit.length == 1){
                  duaa = duasplit[0];
              }else if(duasplit.length == 2){
                  duaa = duasplit[0];
                  duab = duasplit[1];
              }else{
                  duaa = duasplit[0];
                  duab = duasplit[1];
                  duac = duasplit[2];
              }
              if(tigasplit.length == 1){
                  tigaa = tigasplit[0];
              }else if(tigasplit.length == 2){
                  tigaa = tigasplit[0];
                  tigab = tigasplit[1];
              }else{
                  tigaa = tigasplit[0];
                  tigab = tigasplit[1];
                  tigac = tigasplit[2];
              
              }
              if(empatsplit.length == 1){
                  empata = empatsplit[0];
              }else if(empatsplit.length == 2){
                  empata = empatsplit[0];
                  empatb = empatsplit[1];
              }else{
                  empata = empatsplit[0];
                  empatb = empatsplit[1];
                  empatc = empatsplit[2];
              }
              if(limasplit.length == 1){
                  limaa = limasplit[0];
              }else if(limasplit.length == 2){
                  limaa = limasplit[0];
                  limab = limasplit[1];
              }else{
                  limaa = limasplit[0];
                  limab = limasplit[1];
                  limac = limasplit[2];
              }
              if(enamsplit.length == 1){
                  enama = enamsplit[0];
              }else if(enamsplit.length == 2){
                  enama = enamsplit[0];
                  enamb = enamsplit[1];
              }else{
                  enama = enamsplit[0];
                  enamb = enamsplit[1];
                  enamc = enamsplit[2];
              }
              if(tujuhsplit.length == 1){
                  tujuha = tujuhsplit[0];
              }else if(tujuhsplit.length == 2){
                  tujuha = tujuhsplit[0];
                  tujuhb = tujuhsplit[1];
              }else{
                  tujuha = tujuhsplit[0];
                  tujuhb = tujuhsplit[1];
                  tujuhc = tujuhsplit[2];
              }
              if(delapansplit.length == 1){
                  delapana = delapansplit[0];
              }else if(delapansplit.length == 2){
                  delapana = delapansplit[0];
                  delapanb = delapansplit[1];
              }else{
                  delapana = delapansplit[0];
                  delapanb = delapansplit[1];
                  delapanc = delapansplit[2];
              }
              if(sembilansplit.length == 1){
                  sembilana = sembilansplit[0];
              }else if(sembilansplit.length == 2){
                  sembilana = sembilansplit[0];
                  sembilanb = sembilansplit[1];
              }else{
                  sembilana = sembilansplit[0];
                  sembilanb = sembilansplit[1];
                  sembilanc = sembilansplit[2];
              }
              if(sepuluhsplit.length == 1){
                  sepuluha = sepuluhsplit[0];
              }else if(sepuluhsplit.length == 2){
                  sepuluha = sepuluhsplit[0];
                  sepuluhb = sepuluhsplit[1];
              }else{
                  sepuluha = sepuluhsplit[0];
                  sepuluhb = sepuluhsplit[1];
                  sepuluhc = sepuluhsplit[2];
              }
              if(sebelassplit.length == 1){
                  sebelasa = sebelassplit[0];
              }else if(sebelassplit.length == 2){
                  sebelasa = sebelassplit[0];
                  sebelasb = sebelassplit[1];
              }else{
                  sebelasa = sebelassplit[0];
                  sebelasb = sebelassplit[1];
                  sebelasc = sebelassplit[2];
              }
              if(duabelassplit.length == 1){
                  duabelasa = duabelassplit[0];
              }else if(duabelassplit.length == 2){
                  duabelasa = duabelassplit[0];
                  duabelasb = duabelassplit[1];
              }else{
                  duabelasa = duabelassplit[0];
                  duabelasb = duabelassplit[1];
                  duabelasc = duabelassplit[2];
              }
              if(tigabelassplit.length == 1){
                  tigabelasa = tigabelassplit[0];
              }else if(tigabelassplit.length == 2){
                  tigabelasa = tigabelassplit[0];
                  tigabelasb = tigabelassplit[1];
              }else{
                  tigabelasa = tigabelassplit[0];
                  tigabelasb = tigabelassplit[1];
                  tigabelasc = tigabelassplit[2];
              }
              if(empatbelassplit.length == 1){
                  empatbelasa = empatbelassplit[0];
              }else if(empatbelassplit.length == 2){
                  empatbelasa = empatbelassplit[0];
                  empatbelasb = empatbelassplit[1];
              }else{
                  empatbelasa = empatbelassplit[0];
                  empatbelasb = empatbelassplit[1];
                  empatbelasc = empatbelassplit[2];
              }
              if(limabelassplit.length == 1){
                  limabelasa = limabelassplit[0];
              }else if(limabelassplit.length == 2){
                  limabelasa = limabelassplit[0];
                  limabelasb = limabelassplit[1];
              }else{
                  limabelasa = limabelassplit[0];
                  limabelasb = limabelassplit[1];
                  limabelasc = limabelassplit[2];
              }
              if(enambelassplit.length == 1){
                  enambelasa = enambelassplit[0];
              }else if(enambelassplit.length == 2){
                  enambelasa = enambelassplit[0];
                  enambelasb = enambelassplit[1];
              }else{
                  enambelasa = enambelassplit[0];
                  enambelasb = enambelassplit[1];
                  enambelasc = enambelassplit[2];
              }
              
          }
          
          else if(tampsplit.length == 17){
              satu = tampsplit[0];
              dua = tampsplit[1];
              tiga = tampsplit[2];
              empat = tampsplit[3];
              lima = tampsplit[4];
              enam = tampsplit[5];
              tujuh = tampsplit[6];
              delapan = tampsplit[7];
              sembilan = tampsplit[8];
              sepuluh = tampsplit[9];
              sebelas = tampsplit[10];
              duabelas = tampsplit[11];
              tigabelas = tampsplit[12];
              empatbelas = tampsplit[13];
              limabelas = tampsplit[14];
              enambelas = tampsplit[15];
              tujuhbelas = tampsplit[16];
              String[] satusplit = satu.split(" ");
              String[] duasplit = dua.split(" ");
              String[] tigasplit = tiga.split(" ");
              String[] empatsplit = empat.split(" ");
              String[] limasplit = lima.split(" ");
              String[] enamsplit = enam.split(" ");
              String[] tujuhsplit = tujuh.split(" ");
              String[] delapansplit = delapan.split(" ");
              String[] sembilansplit = sembilan.split(" ");
              String[] sepuluhsplit = sepuluh.split(" ");
              String[] sebelassplit = sebelas.split(" ");
              String[] duabelassplit = duabelas.split(" ");
              String[] tigabelassplit = tigabelas.split(" ");
              String[] empatbelassplit = empatbelas.split(" ");
              String[] limabelassplit = limabelas.split(" ");
              String[] enambelassplit = enambelas.split(" ");
              String[] tujuhbelassplit = tujuhbelas.split(" ");
              if(satusplit.length == 1){
                  satua = satusplit[0];
              }else if(satusplit.length == 2){
                  satua = satusplit[0];
                  satub = satusplit[1];
              }else{
                  satua = satusplit[0];
                  satub = satusplit[1];
                  satuc = satusplit[2];
              }
              if(duasplit.length == 1){
                  duaa = duasplit[0];
              }else if(duasplit.length == 2){
                  duaa = duasplit[0];
                  duab = duasplit[1];
              }else{
                  duaa = duasplit[0];
                  duab = duasplit[1];
                  duac = duasplit[2];
              }
              if(tigasplit.length == 1){
                  tigaa = tigasplit[0];
              }else if(tigasplit.length == 2){
                  tigaa = tigasplit[0];
                  tigab = tigasplit[1];
              }else{
                  tigaa = tigasplit[0];
                  tigab = tigasplit[1];
                  tigac = tigasplit[2];
              
              }
              if(empatsplit.length == 1){
                  empata = empatsplit[0];
              }else if(empatsplit.length == 2){
                  empata = empatsplit[0];
                  empatb = empatsplit[1];
              }else{
                  empata = empatsplit[0];
                  empatb = empatsplit[1];
                  empatc = empatsplit[2];
              }
              if(limasplit.length == 1){
                  limaa = limasplit[0];
              }else if(limasplit.length == 2){
                  limaa = limasplit[0];
                  limab = limasplit[1];
              }else{
                  limaa = limasplit[0];
                  limab = limasplit[1];
                  limac = limasplit[2];
              }
              if(enamsplit.length == 1){
                  enama = enamsplit[0];
              }else if(enamsplit.length == 2){
                  enama = enamsplit[0];
                  enamb = enamsplit[1];
              }else{
                  enama = enamsplit[0];
                  enamb = enamsplit[1];
                  enamc = enamsplit[2];
              }
              if(tujuhsplit.length == 1){
                  tujuha = tujuhsplit[0];
              }else if(tujuhsplit.length == 2){
                  tujuha = tujuhsplit[0];
                  tujuhb = tujuhsplit[1];
              }else{
                  tujuha = tujuhsplit[0];
                  tujuhb = tujuhsplit[1];
                  tujuhc = tujuhsplit[2];
              }
              if(delapansplit.length == 1){
                  delapana = delapansplit[0];
              }else if(delapansplit.length == 2){
                  delapana = delapansplit[0];
                  delapanb = delapansplit[1];
              }else{
                  delapana = delapansplit[0];
                  delapanb = delapansplit[1];
                  delapanc = delapansplit[2];
              }
              if(sembilansplit.length == 1){
                  sembilana = sembilansplit[0];
              }else if(sembilansplit.length == 2){
                  sembilana = sembilansplit[0];
                  sembilanb = sembilansplit[1];
              }else{
                  sembilana = sembilansplit[0];
                  sembilanb = sembilansplit[1];
                  sembilanc = sembilansplit[2];
              }
              if(sepuluhsplit.length == 1){
                  sepuluha = sepuluhsplit[0];
              }else if(sepuluhsplit.length == 2){
                  sepuluha = sepuluhsplit[0];
                  sepuluhb = sepuluhsplit[1];
              }else{
                  sepuluha = sepuluhsplit[0];
                  sepuluhb = sepuluhsplit[1];
                  sepuluhc = sepuluhsplit[2];
              }
              if(sebelassplit.length == 1){
                  sebelasa = sebelassplit[0];
              }else if(sebelassplit.length == 2){
                  sebelasa = sebelassplit[0];
                  sebelasb = sebelassplit[1];
              }else{
                  sebelasa = sebelassplit[0];
                  sebelasb = sebelassplit[1];
                  sebelasc = sebelassplit[2];
              }
              if(duabelassplit.length == 1){
                  duabelasa = duabelassplit[0];
              }else if(duabelassplit.length == 2){
                  duabelasa = duabelassplit[0];
                  duabelasb = duabelassplit[1];
              }else{
                  duabelasa = duabelassplit[0];
                  duabelasb = duabelassplit[1];
                  duabelasc = duabelassplit[2];
              }
              if(tigabelassplit.length == 1){
                  tigabelasa = tigabelassplit[0];
              }else if(tigabelassplit.length == 2){
                  tigabelasa = tigabelassplit[0];
                  tigabelasb = tigabelassplit[1];
              }else{
                  tigabelasa = tigabelassplit[0];
                  tigabelasb = tigabelassplit[1];
                  tigabelasc = tigabelassplit[2];
              }
              if(empatbelassplit.length == 1){
                  empatbelasa = empatbelassplit[0];
              }else if(empatbelassplit.length == 2){
                  empatbelasa = empatbelassplit[0];
                  empatbelasb = empatbelassplit[1];
              }else{
                  empatbelasa = empatbelassplit[0];
                  empatbelasb = empatbelassplit[1];
                  empatbelasc = empatbelassplit[2];
              }
              if(limabelassplit.length == 1){
                  limabelasa = limabelassplit[0];
              }else if(limabelassplit.length == 2){
                  limabelasa = limabelassplit[0];
                  limabelasb = limabelassplit[1];
              }else{
                  limabelasa = limabelassplit[0];
                  limabelasb = limabelassplit[1];
                  limabelasc = limabelassplit[2];
              }
              if(enambelassplit.length == 1){
                  enambelasa = enambelassplit[0];
              }else if(enambelassplit.length == 2){
                  enambelasa = enambelassplit[0];
                  enambelasb = enambelassplit[1];
              }else{
                  enambelasa = enambelassplit[0];
                  enambelasb = enambelassplit[1];
                  enambelasc = enambelassplit[2];
              }
              if(tujuhbelassplit.length == 1){
                  tujuhbelasa = tujuhbelassplit[0];
              }else if(tujuhbelassplit.length == 2){
                  tujuhbelasa = tujuhbelassplit[0];
                  tujuhbelasb = tujuhbelassplit[1];
              }else{
                  tujuhbelasa = tujuhbelassplit[0];
                  tujuhbelasb = tujuhbelassplit[1];
                  tujuhbelasc = tujuhbelassplit[2];
              }
              
          }
          
          else if(tampsplit.length == 18){
              satu = tampsplit[0];
              dua = tampsplit[1];
              tiga = tampsplit[2];
              empat = tampsplit[3];
              lima = tampsplit[4];
              enam = tampsplit[5];
              tujuh = tampsplit[6];
              delapan = tampsplit[7];
              sembilan = tampsplit[8];
              sepuluh = tampsplit[9];
              sebelas = tampsplit[10];
              duabelas = tampsplit[11];
              tigabelas = tampsplit[12];
              empatbelas = tampsplit[13];
              limabelas = tampsplit[14];
              enambelas = tampsplit[15];
              tujuhbelas = tampsplit[16];
              delapanbelas = tampsplit[17];
              String[] satusplit = satu.split(" ");
              String[] duasplit = dua.split(" ");
              String[] tigasplit = tiga.split(" ");
              String[] empatsplit = empat.split(" ");
              String[] limasplit = lima.split(" ");
              String[] enamsplit = enam.split(" ");
              String[] tujuhsplit = tujuh.split(" ");
              String[] delapansplit = delapan.split(" ");
              String[] sembilansplit = sembilan.split(" ");
              String[] sepuluhsplit = sepuluh.split(" ");
              String[] sebelassplit = sebelas.split(" ");
              String[] duabelassplit = duabelas.split(" ");
              String[] tigabelassplit = tigabelas.split(" ");
              String[] empatbelassplit = empatbelas.split(" ");
              String[] limabelassplit = limabelas.split(" ");
              String[] enambelassplit = enambelas.split(" ");
              String[] tujuhbelassplit = tujuhbelas.split(" ");
              String[] delapanbelassplit = delapanbelas.split(" ");
              if(satusplit.length == 1){
                  satua = satusplit[0];
              }else if(satusplit.length == 2){
                  satua = satusplit[0];
                  satub = satusplit[1];
              }else{
                  satua = satusplit[0];
                  satub = satusplit[1];
                  satuc = satusplit[2];
              }
              if(duasplit.length == 1){
                  duaa = duasplit[0];
              }else if(duasplit.length == 2){
                  duaa = duasplit[0];
                  duab = duasplit[1];
              }else{
                  duaa = duasplit[0];
                  duab = duasplit[1];
                  duac = duasplit[2];
              }
              if(tigasplit.length == 1){
                  tigaa = tigasplit[0];
              }else if(tigasplit.length == 2){
                  tigaa = tigasplit[0];
                  tigab = tigasplit[1];
              }else{
                  tigaa = tigasplit[0];
                  tigab = tigasplit[1];
                  tigac = tigasplit[2];
              
              }
              if(empatsplit.length == 1){
                  empata = empatsplit[0];
              }else if(empatsplit.length == 2){
                  empata = empatsplit[0];
                  empatb = empatsplit[1];
              }else{
                  empata = empatsplit[0];
                  empatb = empatsplit[1];
                  empatc = empatsplit[2];
              }
              if(limasplit.length == 1){
                  limaa = limasplit[0];
              }else if(limasplit.length == 2){
                  limaa = limasplit[0];
                  limab = limasplit[1];
              }else{
                  limaa = limasplit[0];
                  limab = limasplit[1];
                  limac = limasplit[2];
              }
              if(enamsplit.length == 1){
                  enama = enamsplit[0];
              }else if(enamsplit.length == 2){
                  enama = enamsplit[0];
                  enamb = enamsplit[1];
              }else{
                  enama = enamsplit[0];
                  enamb = enamsplit[1];
                  enamc = enamsplit[2];
              }
              if(tujuhsplit.length == 1){
                  tujuha = tujuhsplit[0];
              }else if(tujuhsplit.length == 2){
                  tujuha = tujuhsplit[0];
                  tujuhb = tujuhsplit[1];
              }else{
                  tujuha = tujuhsplit[0];
                  tujuhb = tujuhsplit[1];
                  tujuhc = tujuhsplit[2];
              }
              if(delapansplit.length == 1){
                  delapana = delapansplit[0];
              }else if(delapansplit.length == 2){
                  delapana = delapansplit[0];
                  delapanb = delapansplit[1];
              }else{
                  delapana = delapansplit[0];
                  delapanb = delapansplit[1];
                  delapanc = delapansplit[2];
              }
              if(sembilansplit.length == 1){
                  sembilana = sembilansplit[0];
              }else if(sembilansplit.length == 2){
                  sembilana = sembilansplit[0];
                  sembilanb = sembilansplit[1];
              }else{
                  sembilana = sembilansplit[0];
                  sembilanb = sembilansplit[1];
                  sembilanc = sembilansplit[2];
              }
              if(sepuluhsplit.length == 1){
                  sepuluha = sepuluhsplit[0];
              }else if(sepuluhsplit.length == 2){
                  sepuluha = sepuluhsplit[0];
                  sepuluhb = sepuluhsplit[1];
              }else{
                  sepuluha = sepuluhsplit[0];
                  sepuluhb = sepuluhsplit[1];
                  sepuluhc = sepuluhsplit[2];
              }
              if(sebelassplit.length == 1){
                  sebelasa = sebelassplit[0];
              }else if(sebelassplit.length == 2){
                  sebelasa = sebelassplit[0];
                  sebelasb = sebelassplit[1];
              }else{
                  sebelasa = sebelassplit[0];
                  sebelasb = sebelassplit[1];
                  sebelasc = sebelassplit[2];
              }
              if(duabelassplit.length == 1){
                  duabelasa = duabelassplit[0];
              }else if(duabelassplit.length == 2){
                  duabelasa = duabelassplit[0];
                  duabelasb = duabelassplit[1];
              }else{
                  duabelasa = duabelassplit[0];
                  duabelasb = duabelassplit[1];
                  duabelasc = duabelassplit[2];
              }
              if(tigabelassplit.length == 1){
                  tigabelasa = tigabelassplit[0];
              }else if(tigabelassplit.length == 2){
                  tigabelasa = tigabelassplit[0];
                  tigabelasb = tigabelassplit[1];
              }else{
                  tigabelasa = tigabelassplit[0];
                  tigabelasb = tigabelassplit[1];
                  tigabelasc = tigabelassplit[2];
              }
              if(empatbelassplit.length == 1){
                  empatbelasa = empatbelassplit[0];
              }else if(empatbelassplit.length == 2){
                  empatbelasa = empatbelassplit[0];
                  empatbelasb = empatbelassplit[1];
              }else{
                  empatbelasa = empatbelassplit[0];
                  empatbelasb = empatbelassplit[1];
                  empatbelasc = empatbelassplit[2];
              }
              if(limabelassplit.length == 1){
                  limabelasa = limabelassplit[0];
              }else if(limabelassplit.length == 2){
                  limabelasa = limabelassplit[0];
                  limabelasb = limabelassplit[1];
              }else{
                  limabelasa = limabelassplit[0];
                  limabelasb = limabelassplit[1];
                  limabelasc = limabelassplit[2];
              }
              if(enambelassplit.length == 1){
                  enambelasa = enambelassplit[0];
              }else if(enambelassplit.length == 2){
                  enambelasa = enambelassplit[0];
                  enambelasb = enambelassplit[1];
              }else{
                  enambelasa = enambelassplit[0];
                  enambelasb = enambelassplit[1];
                  enambelasc = enambelassplit[2];
              }
              if(tujuhbelassplit.length == 1){
                  tujuhbelasa = tujuhbelassplit[0];
              }else if(tujuhbelassplit.length == 2){
                  tujuhbelasa = tujuhbelassplit[0];
                  tujuhbelasb = tujuhbelassplit[1];
              }else{
                  tujuhbelasa = tujuhbelassplit[0];
                  tujuhbelasb = tujuhbelassplit[1];
                  tujuhbelasc = tujuhbelassplit[2];
              }
              if(delapanbelassplit.length == 1){
                  delapanbelasa = delapanbelassplit[0];
              }else if(delapanbelassplit.length == 2){
                  delapanbelasa = delapanbelassplit[0];
                  delapanbelasb = delapanbelassplit[1];
              }else{
                  delapanbelasa = delapanbelassplit[0];
                  delapanbelasb = delapanbelassplit[1];
                  delapanbelasc = delapanbelassplit[2];
              }
              
          }
          
          
//          System.out.println("Isi satu a : "+satua + " b : " + satub + " c : " + satuc);
//          System.out.println("Isi dua a : "+duaa + " b : " + duab + " c : " + duac);
      }
      
      if(satua.equals("_JJ")){
         satu1a = "_JJ";
         satu1b = "_JJS";
         satu1c = "_JJR";
      }else if(satua.equals("_NN")){
         satu1a = "_NN";
         satu1b = "_NNS";
         satu1c = " ";  
      }else if(satua.equals("_RB")){
         satu1a = "_RB";
         satu1b = "_RBS";
         satu1c = "_RBR";   
      }else if(satua.equals("_VBN")){
         satu1a = "_VBN";
         satu1b = "_VBD";
         satu1c = " ";  
      }else if(satua.equals("_VB")){
          satu1a = "_VB";
          satu1b = "_VB";
          satu1c = " ";  
      }else if(satua.equals("_RP")){
          satu1a = "_RP";
          satu1b = "_RP";
          satu1c = " ";  
      }else if(satua.equals("_DT")){
          satu1a = "_DT";
          satu1b = "_DT";
          satu1c = " ";  
      }else if(satua.equals("_IN")){
          satu1a = "_IN";
          satu1b = "_IN";
          satu1c = " ";  
      }
      else{
         satu1a = " ";
         satu1b = " ";
         satu1c = " ";  
      }
      
      if(satub.equals("_JJ")){
         satu2a = "_JJ";
         satu2b = "_JJS";
         satu2c = "_JJR";
      }else if(satub.equals("_NN")){
         satu2a = "_NN";
         satu2b = "_NNS";
         satu2c = " ";  
      }else if(satub.equals("_RB")){
         satu2a = "_RB";
         satu2b = "_RBS";
         satu2c = "_RBR";   
      }else if(satub.equals("_VBN")){
         satu2a = "_VBN";
         satu2b = "_VBD";
         satu2c = " "; 
      }else if(satua.equals("_VB")){
          satu1a = "_VB";
          satu1b = "";
          satu1c = " ";  
      }else if(satua.equals("_RP")){
          satu1a = "_RP";
          satu1b = "";
          satu1c = " ";  
      }else if(satua.equals("_DT")){
          satu1a = "_DT";
          satu1b = "";
          satu1c = " ";  
      }else if(satua.equals("_IN")){
          satu1a = "_IN";
          satu1b = "";
          satu1c = " ";  
      }else{
         satu2a = " ";
         satu2b = " ";
         satu2c = " ";  
      }
      
      if(satuc.equals("_JJ")){
         satu3a = "_JJ";
         satu3b = "_JJS";
         satu3c = "_JJR";
      }else if(satuc.equals("_NN")){
         satu3a = "_NN";
         satu3b = "_NNS";
         satu3c = " ";  
      }else if(satuc.equals("_RB")){
         satu3a = "_RB";
         satu3b = "_RBS";
         satu3c = "_RBR";   
      }else if(satuc.equals("_VBN")){
         satu3a = "_VBN";
         satu3b = "_VBD";
         satu3c = " "; 
      }else if(satub.equals("_VB")){
          satu1a = "_VB";
          satu1b = "";
          satu1c = " ";
      }else if(satua.equals("_VB")){
          satu1a = "_VB";
          satu1b = "";
          satu1c = " ";  
      }else if(satua.equals("_RP")){
          satu1a = "_RP";
          satu1b = "";
          satu1c = " ";  
      }else if(satua.equals("_DT")){
          satu1a = "_DT";
          satu1b = "";
          satu1c = " ";  
      }else if(satua.equals("_IN")){
          satu1a = "_IN";
          satu1b = "";
          satu1c = " ";  
      }else{
         satu3a = " ";
         satu3b = " ";
         satu3c = " ";  
      }
      
//======================================================== baris ke 2 ================================================

    if(duaa.equals("_JJ")){
         dua1a = "_JJ";
         dua1b = "_JJS";
         dua1c = "_JJR";
      }else if(duaa.equals("_NN")){
         dua1a = "_NN";
         dua1b = "_NNS";
         dua1c = " ";  
      }else if(duaa.equals("_RB")){
         dua1a = "_RB";
         dua1b = "_RBS";
         dua1c = "_RBR";   
      }else if(duaa.equals("_VBN")){
         dua1a = "_VBN";
         dua1b = "_VBD";
         dua1c = " ";  
      }else if(satua.equals("_VB")){
          satu1a = "_VB";
          satu1b = "";
          satu1c = " ";  
      }else if(satua.equals("_RP")){
          satu1a = "_RP";
          satu1b = "";
          satu1c = " ";  
      }else if(satua.equals("_DT")){
          satu1a = "_DT";
          satu1b = "";
          satu1c = " ";  
      }else if(satua.equals("_IN")){
          satu1a = "_IN";
          satu1b = "";
          satu1c = " ";  
      }else{
         dua1a = " ";
         dua1b = " ";
         dua1c = " ";  
      }
      
      if(duab.equals("_JJ")){
         dua2a = "_JJ";
         dua2b = "_JJS";
         dua2c = "_JJR";
      }else if(duab.equals("_NN")){
         dua2a = "_NN";
         dua2b = "_NNS";
         dua2c = " ";  
      }else if(duab.equals("_RB")){
         dua2a = "_RB";
         dua2b = "_RBS";
         dua2c = "_RBR";   
      }else if(duab.equals("_VBN")){
         dua2a = "_VBN";
         dua2b = "_VBD";
         dua2c = " ";  
      }else if(satua.equals("_VB")){
          satu1a = "_VB";
          satu1b = "";
          satu1c = " ";  
      }else if(satua.equals("_RP")){
          satu1a = "_RP";
          satu1b = "";
          satu1c = " ";  
      }else if(satua.equals("_DT")){
          satu1a = "_DT";
          satu1b = "";
          satu1c = " ";  
      }else if(satua.equals("_IN")){
          satu1a = "_IN";
          satu1b = "";
          satu1c = " ";  
      }else{
         dua2a = " ";
         dua2b = " ";
         dua2c = " ";  
      }
      
      if(duac.equals("_JJ")){
         dua3a = "_JJ";
         dua3b = "_JJS";
         dua3c = "_JJR";
      }else if(duac.equals("_NN")){
         dua3a = "_NN";
         dua3b = "_NNS";
         dua3c = " ";  
      }else if(duac.equals("_RB")){
         dua3a = "_RB";
         dua3b = "_RBS";
         dua3c = "_RBR";   
      }else if(duac.equals("_VBN")){
         dua3a = "_VBN";
         dua3b = "_VBD";
         dua3c = " ";  
      }else if(satua.equals("_VB")){
          satu1a = "_VB";
          satu1b = " ";
          satu1c = " ";  
      }else if(satua.equals("_RP")){
          satu1a = "_RP";
          satu1b = " ";
          satu1c = " ";  
      }else if(satua.equals("_DT")){
          satu1a = "_DT";
          satu1b = " ";
          satu1c = " ";  
      }else if(satua.equals("_IN")){
          satu1a = "_IN";
          satu1b = " ";
          satu1c = " ";  
      }else{
         dua3a = " ";
         dua3b = " ";
         dua3c = " ";  
      }
      
      
//=====================================================Rule ke 3 ===================================================================

      if(tigaa.equals("_JJ")){
         tiga1a = "_JJ";
         tiga1b = "_JJS";
         tiga1c = "_JJR";
      }else if(tigaa.equals("_NN")){
         tiga1a = "_NN";
         tiga1b = "_NNS";
         tiga1c = " ";  
      }else if(tigaa.equals("_RB")){
         tiga1a = "_RB";
         tiga1b = "_RBS";
         tiga1c = "_RBR";   
      }else if(tigaa.equals("_VBN")){
         tiga1a = "_VBN";
         tiga1b = "_VBD";
         tiga1c = " ";  
      }else{
         tiga1a = " ";
         tiga1b = " ";
         tiga1c = " ";  
      }
      
      if(tigab.equals("_JJ")){
         tiga2a = "_JJ";
         tiga2b = "_JJS";
         tiga2c = "_JJR";
      }else if(tigab.equals("_NN")){
         tiga2a = "_NN";
         tiga2b = "_NNS";
         tiga2c = " ";  
      }else if(tigab.equals("_RB")){
         tiga2a = "_RB";
         tiga2b = "_RBS";
         tiga2c = "_RBR";   
      }else if(tigab.equals("_VBN")){
         tiga2a = "_VBN";
         tiga2b = "_VBD";
         tiga2c = " ";  
      }else{
         tiga2a = " ";
         tiga2b = " ";
         tiga2c = " ";  
      }
      
      if(tigac.equals("_JJ")){
         tiga3a = "_JJ";
         tiga3b = "_JJS";
         tiga3c = "_JJR";
      }else if(tigac.equals("_NN")){
         tiga3a = "_NN";
         tiga3b = "_NNS";
         tiga3c = " ";  
      }else if(tigac.equals("_RB")){
         tiga3a = "_RB";
         tiga3b = "_RBS";
         tiga3c = "_RBR";   
      }else if(tigac.equals("_VBN")){
         tiga3a = "_VBN";
         tiga3b = "_VBD";
         tiga3c = " ";  
      }else{
         tiga3a = " ";
         tiga3b = " ";
         tiga3c = " ";  
      }
      
//========================================================= Rule ke 4 =====================================================================
       
        if(empata.equals("_JJ")){
         empat1a = "_JJ";
         empat1b = "_JJS";
         empat1c = "_JJR";
      }else if(empata.equals("_NN")){
         empat1a = "_NN";
         empat1b = "_NNS";
         empat1c = " ";  
      }else if(empata.equals("_RB")){
         empat1a = "_RB";
         empat1b = "_RBS";
         empat1c = "_RBR";   
      }else if(empata.equals("_VBN")){
         empat1a = "_VBN";
         empat1b = "_VBD";
         empat1c = " ";  
      }else{
         empat1a = " ";
         empat1b = " ";
         empat1c = " ";  
      }
      
      if(empatb.equals("_JJ")){
         empat2a = "_JJ";
         empat2b = "_JJS";
         empat2c = "_JJR";
      }else if(empatb.equals("_NN")){
         empat2a = "_NN";
         empat2b = "_NNS";
         empat2c = " ";  
      }else if(empatb.equals("_RB")){
         empat2a = "_RB";
         empat2b = "_RBS";
         empat2c = "_RBR";   
      }else if(empatb.equals("_VBN")){
         empat2a = "_VBN";
         empat2b = "_VBD";
         empat2c = " ";  
      }else{
         empat2a = " ";
         empat2b = " ";
         empat2c = " ";  
      }
      
      if(empatc.equals("_JJ")){
         empat3a = "_JJ";
         empat3b = "_JJS";
         empat3c = "_JJR";
      }else if(empatc.equals("_NN")){
         empat3a = "_NN";
         empat3b = "_NNS";
         empat3c = " ";  
      }else if(empatc.equals("_RB")){
         empat3a = "_RB";
         empat3b = "_RBS";
         empat3c = "_RBR";   
      }else if(empatc.equals("_VBN")){
         empat3a = "_VBN";
         empat3b = "_VBD";
         empat3c = " ";  
      }else{
         empat3a = " ";
         empat3b = " ";
         empat3c = " ";  
      }
     
     
//===============================================================Rule ke 5==============================================================

     if(limaa.equals("_JJ")){
         lima1a = "_JJ";
         lima1b = "_JJS";
         lima1c = "_JJR";
      }else if(limaa.equals("_NN")){
         lima1a = "_NN";
         lima1b = "_NNS";
         lima1c = " ";  
      }else if(limaa.equals("_RB")){
         lima1a = "_RB";
         lima1b = "_RBS";
         lima1c = "_RBR";   
      }else if(limaa.equals("_VBN")){
         lima1a = "_VBN";
         lima1b = "_VBD";
         lima1c = " ";  
      }else{
         lima1a = " ";
         lima1b = " ";
         lima1c = " ";  
      }
      
      if(limab.equals("_JJ")){
         lima2a = "_JJ";
         lima2b = "_JJS";
         lima2c = "_JJR";
      }else if(limab.equals("_NN")){
         lima2a = "_NN";
         lima2b = "_NNS";
         lima2c = " ";  
      }else if(limab.equals("_RB")){
         lima2a = "_RB";
         lima2b = "_RBS";
         lima2c = "_RBR";   
      }else if(limab.equals("_VBN")){
         lima2a = "_VBN";
         lima2b = "_VBD";
         lima2c = " ";  
      }else{
         lima2a = " ";
         lima2b = " ";
         lima2c = " ";  
      }
      
      if(limac.equals("_JJ")){
         lima3a = "_JJ";
         lima3b = "_JJS";
         lima3c = "_JJR";
      }else if(limac.equals("_NN")){
         lima3a = "_NN";
         lima3b = "_NNS";
         lima3c = " ";  
      }else if(limac.equals("_RB")){
         lima3a = "_RB";
         lima3b = "_RBS";
         lima3c = "_RBR";   
      }else if(limac.equals("_VBN")){
         lima3a = "_VBN";
         lima3b = "_VBD";
         lima3c = " ";  
      }else{
         lima3a = " ";
         lima3b = " ";
         lima3c = " ";  
      }
      
//======================================================Rule ke 6 ===============================================================
    
     if(enama.equals("_JJ")){
         enam1a = "_JJ";
         enam1b = "_JJS";
         enam1c = "_JJR";
      }else if(enama.equals("_NN")){
         enam1a = "_NN";
         enam1b = "_NNS";
         enam1c = " ";  
      }else if(enama.equals("_RB")){
         enam1a = "_RB";
         enam1b = "_RBS";
         enam1c = "_RBR";   
      }else if(enama.equals("_VBN")){
         enam1a = "_VBN";
         enam1b = "_VBD";
         enam1c = " ";  
      }else{
         enam1a = " ";
         enam1b = " ";
         enam1c = " ";  
      }
      
      if(enamb.equals("_JJ")){
         enam2a = "_JJ";
         enam2b = "_JJS";
         enam2c = "_JJR";
      }else if(enamb.equals("_NN")){
         enam2a = "_NN";
         enam2b = "_NNS";
         enam2c = " ";  
      }else if(enamb.equals("_RB")){
         enam2a = "_RB";
         enam2b = "_RBS";
         enam2c = "_RBR";   
      }else if(enamb.equals("_VBN")){
         enam2a = "_VBN";
         enam2b = "_VBD";
         enam2c = " ";  
      }else{
         enam2a = " ";
         enam2b = " ";
         enam2c = " ";  
      }
      
      if(enamc.equals("_JJ")){
         enam3a = "_JJ";
         enam3b = "_JJS";
         enam3c = "_JJR";
      }else if(enamc.equals("_NN")){
         enam3a = "_NN";
         enam3b = "_NNS";
         enam3c = " ";  
      }else if(enamc.equals("_RB")){
         enam3a = "_RB";
         enam3b = "_RBS";
         enam3c = "_RBR";   
      }else if(enamc.equals("_VBN")){
         enam3a = "_VBN";
         enam3b = "_VBD";
         enam3c = " ";  
      }else{
         enam3a = " ";
         enam3b = " ";
         enam3c = " ";  
      }
      
//=================================================================Rule ke 7========================================================
    
     if(tujuha.equals("_JJ")){
         tujuh1a = "_JJ";
         tujuh1b = "_JJS";
         tujuh1c = "_JJR";
      }else if(tujuha.equals("_NN")){
         tujuh1a = "_NN";
         tujuh1b = "_NNS";
         tujuh1c = " ";  
      }else if(tujuha.equals("_RB")){
         tujuh1a = "_RB";
         tujuh1b = "_RBS";
         tujuh1c = "_RBR";   
      }else if(tujuha.equals("_VBN")){
         tujuh1a = "_VBN";
         tujuh1b = "_VBD";
         tujuh1c = " ";  
      }else{
         tujuh1a = " ";
         tujuh1b = " ";
         tujuh1c = " ";  
      }
      
      if(tujuhb.equals("_JJ")){
         tujuh2a = "_JJ";
         tujuh2b = "_JJS";
         tujuh2c = "_JJR";
      }else if(tujuhb.equals("_NN")){
         tujuh2a = "_NN";
         tujuh2b = "_NNS";
         tujuh2c = " ";  
      }else if(tujuhb.equals("_RB")){
         tujuh2a = "_RB";
         tujuh2b = "_RBS";
         tujuh2c = "_RBR";   
      }else if(tujuhb.equals("_VBN")){
         tujuh2a = "_VBN";
         tujuh2b = "_VBD";
         tujuh2c = " ";  
      }else{
         tujuh2a = " ";
         tujuh2b = " ";
         tujuh2c = " ";  
      }
      
      if(tujuhc.equals("_JJ")){
         tujuh3a = "_JJ";
         tujuh3b = "_JJS";
         tujuh3c = "_JJR";
      }else if(tujuhc.equals("_NN")){
         tujuh3a = "_NN";
         tujuh3b = "_NNS";
         tujuh3c = " ";  
      }else if(tujuhc.equals("_RB")){
         tujuh3a = "_RB";
         tujuh3b = "_RBS";
         tujuh3c = "_RBR";   
      }else if(tujuhc.equals("_VBN")){
         tujuh3a = "_VBN";
         tujuh3b = "_VBD";
         tujuh3c = " ";  
      }else{
         tujuh3a = " ";
         tujuh3b = " ";
         tujuh3c = " ";  
      }

//=======================================================Rule ke 8 =============================================================

     if(delapana.equals("_JJ")){
         delapan1a = "_JJ";
         delapan1b = "_JJS";
         delapan1c = "_JJR";
      }else if(delapana.equals("_NN")){
         delapan1a = "_NN";
         delapan1b = "_NNS";
         delapan1c = " ";  
      }else if(delapana.equals("_RB")){
         delapan1a = "_RB";
         delapan1b = "_RBS";
         delapan1c = "_RBR";   
      }else if(delapana.equals("_VBN")){
         delapan1a = "_VBN";
         delapan1b = "_VBD";
         delapan1c = " ";  
      }else{
         delapan1a = " ";
         delapan1b = " ";
         delapan1c = " ";  
      }
      
      if(delapanb.equals("_JJ")){
         delapan2a = "_JJ";
         delapan2b = "_JJS";
         delapan2c = "_JJR";
      }else if(delapanb.equals("_NN")){
         delapan2a = "_NN";
         delapan2b = "_NNS";
         delapan2c = " ";  
      }else if(delapanb.equals("_RB")){
         delapan2a = "_RB";
         delapan2b = "_RBS";
         delapan2c = "_RBR";   
      }else if(delapanb.equals("_VBN")){
         delapan2a = "_VBN";
         delapan2b = "_VBD";
         delapan2c = " ";  
      }else{
         delapan2a = " ";
         delapan2b = " ";
         delapan2c = " ";  
      }
      
      if(delapanc.equals("_JJ")){
         delapan3a = "_JJ";
         delapan3b = "_JJS";
         delapan3c = "_JJR";
      }else if(delapanc.equals("_NN")){
         delapan3a = "_NN";
         delapan3b = "_NNS";
         delapan3c = " ";  
      }else if(delapanc.equals("_RB")){
         delapan3a = "_RB";
         delapan3b = "_RBS";
         delapan3c = "_RBR";   
      }else if(delapanc.equals("_VBN")){
         delapan3a = "_VBN";
         delapan3b = "_VBD";
         delapan3c = " ";  
      }else{
         delapan3a = " ";
         delapan3b = " ";
         delapan3c = " ";  
      }
      
//==========================================================Rule ke 9==================================================================

     if(sembilana.equals("_JJ")){
         sembilan1a = "_JJ";
         sembilan1b = "_JJS";
         sembilan1c = "_JJR";
      }else if(sembilana.equals("_NN")){
         sembilan1a = "_NN";
         sembilan1b = "_NNS";
         sembilan1c = " ";  
      }else if(sembilana.equals("_RB")){
         sembilan1a = "_RB";
         sembilan1b = "_RBS";
         sembilan1c = "_RBR";   
      }else if(sembilana.equals("_VBN")){
         sembilan1a = "_VBN";
         sembilan1b = "_VBD";
         sembilan1c = " ";  
      }else{
         sembilan1a = " ";
         sembilan1b = " ";
         sembilan1c = " ";  
      }
      
      if(sembilanb.equals("_JJ")){
         sembilan2a = "_JJ";
         sembilan2b = "_JJS";
         sembilan2c = "_JJR";
      }else if(sembilanb.equals("_NN")){
         sembilan2a = "_NN";
         sembilan2b = "_NNS";
         sembilan2c = " ";  
      }else if(sembilanb.equals("_RB")){
         sembilan2a = "_RB";
         sembilan2b = "_RBS";
         sembilan2c = "_RBR";   
      }else if(sembilanb.equals("_VBN")){
         sembilan2a = "_VBN";
         sembilan2b = "_VBD";
         sembilan2c = " ";  
      }else{
         sembilan2a = " ";
         sembilan2b = " ";
         sembilan2c = " ";  
      }
      
      if(sembilanc.equals("_JJ")){
         sembilan3a = "_JJ";
         sembilan3b = "_JJS";
         sembilan3c = "_JJR";
      }else if(sembilanc.equals("_NN")){
         sembilan3a = "_NN";
         sembilan3b = "_NNS";
         sembilan3c = " ";  
      }else if(sembilanc.equals("_RB")){
         sembilan3a = "_RB";
         sembilan3b = "_RBS";
         sembilan3c = "_RBR";   
      }else if(sembilanc.equals("_VBN")){
         sembilan3a = "_VBN";
         sembilan3b = "_VBD";
         sembilan3c = " ";  
      }else{
         sembilan3a = " ";
         sembilan3b = " ";
         sembilan3c = " ";  
      }
      
//=================================================================Rule ke 10=============================================
    
     if(sepuluha.equals("_JJ")){
         sepuluh1a = "_JJ";
         sepuluh1b = "_JJS";
         sepuluh1c = "_JJR";
      }else if(sepuluha.equals("_NN")){
         sepuluh1a = "_NN";
         sepuluh1b = "_NNS";
         sepuluh1c = " ";  
      }else if(sepuluha.equals("_RB")){
         sepuluh1a = "_RB";
         sepuluh1b = "_RBS";
         sepuluh1c = "_RBR";   
      }else if(sepuluha.equals("_VBN")){
         sepuluh1a = "_VBN";
         sepuluh1b = "_VBD";
         sepuluh1c = " ";  
      }else{
         sepuluh1a = " ";
         sepuluh1b = " ";
         sepuluh1c = " ";  
      }
      
      if(sepuluhb.equals("_JJ")){
         sepuluh2a = "_JJ";
         sepuluh2b = "_JJS";
         sepuluh2c = "_JJR";
      }else if(sepuluhb.equals("_NN")){
         sepuluh2a = "_NN";
         sepuluh2b = "_NNS";
         sepuluh2c = " ";  
      }else if(sepuluhb.equals("_RB")){
         sepuluh2a = "_RB";
         sepuluh2b = "_RBS";
         sepuluh2c = "_RBR";   
      }else if(sepuluhb.equals("_VBN")){
         sepuluh2a = "_VBN";
         sepuluh2b = "_VBD";
         sepuluh2c = " ";  
      }else{
         sepuluh2a = " ";
         sepuluh2b = " ";
         sepuluh2c = " ";  
      }
      
      if(sepuluhc.equals("_JJ")){
         sepuluh3a = "_JJ";
         sepuluh3b = "_JJS";
         sepuluh3c = "_JJR";
      }else if(sepuluhc.equals("_NN")){
         sepuluh3a = "_NN";
         sepuluh3b = "_NNS";
         sepuluh3c = " ";  
      }else if(sepuluhc.equals("_RB")){
         sepuluh3a = "_RB";
         sepuluh3b = "_RBS";
         sepuluh3c = "_RBR";   
      }else if(sepuluhc.equals("_VBN")){
         sepuluh3a = "_VBN";
         sepuluh3b = "_VBD";
         sepuluh3c = " ";  
      }else{
         sepuluh3a = " ";
         sepuluh3b = " ";
         sepuluh3c = " ";  
      }
      
//======================================================Rule ke 11================================================================
    
     if(sebelasa.equals("_JJ")){
         sebelas1a = "_JJ";
         sebelas1b = "_JJS";
         sebelas1c = "_JJR";
      }else if(sebelasa.equals("_NN")){
         sebelas1a = "_NN";
         sebelas1b = "_NNS";
         sebelas1c = " ";  
      }else if(sebelasa.equals("_RB")){
         sebelas1a = "_RB";
         sebelas1b = "_RBS";
         sebelas1c = "_RBR";   
      }else if(sebelasa.equals("_VBN")){
         sebelas1a = "_VBN";
         sebelas1b = "_VBD";
         sebelas1c = " ";  
      }else{
         sebelas1a = " ";
         sebelas1b = " ";
         sebelas1c = " ";  
      }
      
      if(sebelasb.equals("_JJ")){
         sebelas2a = "_JJ";
         sebelas2b = "_JJS";
         sebelas2c = "_JJR";
      }else if(sebelasb.equals("_NN")){
         sebelas2a = "_NN";
         sebelas2b = "_NNS";
         sebelas2c = " ";  
      }else if(sebelasb.equals("_RB")){
         sebelas2a = "_RB";
         sebelas2b = "_RBS";
         sebelas2c = "_RBR";   
      }else if(sebelasb.equals("_VBN")){
         sebelas2a = "_VBN";
         sebelas2b = "_VBD";
         sebelas2c = " ";  
      }else{
         sebelas2a = " ";
         sebelas2b = " ";
         sebelas2c = " ";  
      }
      
      if(sebelasc.equals("_JJ")){
         sebelas3a = "_JJ";
         sebelas3b = "_JJS";
         sebelas3c = "_JJR";
      }else if(sebelasc.equals("_NN")){
         sebelas3a = "_NN";
         sebelas3b = "_NNS";
         sebelas3c = " ";  
      }else if(sebelasc.equals("_RB")){
         sebelas3a = "_RB";
         sebelas3b = "_RBS";
         sebelas3c = "_RBR";   
      }else if(sebelasc.equals("_VBN")){
         sebelas3a = "_VBN";
         sebelas3b = "_VBD";
         sebelas3c = " ";  
      }else{
         sebelas3a = " ";
         sebelas3b = " ";
         sebelas3c = " ";  
      }
      
//=======================================================Rule ke 12=============================================================
    
     if(duabelasa.equals("_JJ")){
         duabelas1a = "_JJ";
         duabelas1b = "_JJS";
         duabelas1c = "_JJR";
      }else if(duabelasa.equals("_NN")){
         duabelas1a = "_NN";
         duabelas1b = "_NNS";
         duabelas1c = " ";  
      }else if(duabelasa.equals("_RB")){
         duabelas1a = "_RB";
         duabelas1b = "_RBS";
         duabelas1c = "_RBR";   
      }else if(duabelasa.equals("_VBN")){
         duabelas1a = "_VBN";
         duabelas1b = "_VBD";
         duabelas1c = " ";  
      }else{
         duabelas1a = " ";
         duabelas1b = " ";
         duabelas1c = " ";  
      }
      
      if(duabelasb.equals("_JJ")){
         duabelas2a = "_JJ";
         duabelas2b = "_JJS";
         duabelas2c = "_JJR";
      }else if(duabelasb.equals("_NN")){
         duabelas2a = "_NN";
         duabelas2b = "_NNS";
         duabelas2c = " ";  
      }else if(duabelasb.equals("_RB")){
         duabelas2a = "_RB";
         duabelas2b = "_RBS";
         duabelas2c = "_RBR";   
      }else if(duabelasb.equals("_VBN")){
         duabelas2a = "_VBN";
         duabelas2b = "_VBD";
         duabelas2c = " ";  
      }else{
         duabelas2a = " ";
         duabelas2b = " ";
         duabelas2c = " ";  
      }
      
      if(duabelasc.equals("_JJ")){
         duabelas3a = "_JJ";
         duabelas3b = "_JJS";
         duabelas3c = "_JJR";
      }else if(duabelasc.equals("_NN")){
         duabelas3a = "_NN";
         duabelas3b = "_NNS";
         duabelas3c = " ";  
      }else if(duabelasc.equals("_RB")){
         duabelas3a = "_RB";
         duabelas3b = "_RBS";
         duabelas3c = "_RBR";   
      }else if(duabelasc.equals("_VBN")){
         duabelas3a = "_VBN";
         duabelas3b = "_VBD";
         duabelas3c = " ";  
      }else{
         duabelas3a = " ";
         duabelas3b = " ";
         duabelas3c = " ";  
      }
      
//===========================================================Rule ke 13===========================================================

     if(tigabelasa.equals("_JJ")){
         tigabelas1a = "_JJ";
         tigabelas1b = "_JJS";
         tigabelas1c = "_JJR";
      }else if(tigabelasa.equals("_NN")){
         tigabelas1a = "_NN";
         tigabelas1b = "_NNS";
         tigabelas1c = " ";  
      }else if(tigabelasa.equals("_RB")){
         tigabelas1a = "_RB";
         tigabelas1b = "_RBS";
         tigabelas1c = "_RBR";   
      }else if(tigabelasa.equals("_VBN")){
         tigabelas1a = "_VBN";
         tigabelas1b = "_VBD";
         tigabelas1c = " ";  
      }else{
         tigabelas1a = " ";
         tigabelas1b = " ";
         tigabelas1c = " ";  
      }
      
      if(tigabelasb.equals("_JJ")){
         tigabelas2a = "_JJ";
         tigabelas2b = "_JJS";
         tigabelas2c = "_JJR";
      }else if(tigabelasb.equals("_NN")){
         tigabelas2a = "_NN";
         tigabelas2b = "_NNS";
         tigabelas2c = " ";  
      }else if(tigabelasb.equals("_RB")){
         tigabelas2a = "_RB";
         tigabelas2b = "_RBS";
         tigabelas2c = "_RBR";   
      }else if(tigabelasb.equals("_VBN")){
         tigabelas2a = "_VBN";
         tigabelas2b = "_VBD";
         tigabelas2c = " ";  
      }else{
         tigabelas2a = " ";
         tigabelas2b = " ";
         tigabelas2c = " ";  
      }
      
      if(tigabelasc.equals("_JJ")){
         tigabelas3a = "_JJ";
         tigabelas3b = "_JJS";
         tigabelas3c = "_JJR";
      }else if(tigabelasc.equals("_NN")){
         tigabelas3a = "_NN";
         tigabelas3b = "_NNS";
         tigabelas3c = " ";  
      }else if(tigabelasc.equals("_RB")){
         tigabelas3a = "_RB";
         tigabelas3b = "_RBS";
         tigabelas3c = "_RBR";   
      }else if(tigabelasc.equals("_VBN")){
         tigabelas3a = "_VBN";
         tigabelas3b = "_VBD";
         tigabelas3c = " ";  
      }else{
         tigabelas3a = " ";
         tigabelas3b = " ";
         tigabelas3c = " ";  
      }
      
//=====================================================Rule ke 14================================================================

     if(empatbelasa.equals("_JJ")){
         empatbelas1a = "_JJ";
         empatbelas1b = "_JJS";
         empatbelas1c = "_JJR";
      }else if(empatbelasa.equals("_NN")){
         empatbelas1a = "_NN";
         empatbelas1b = "_NNS";
         empatbelas1c = " ";  
      }else if(empatbelasa.equals("_RB")){
         empatbelas1a = "_RB";
         empatbelas1b = "_RBS";
         empatbelas1c = "_RBR";   
      }else if(empatbelasa.equals("_VBN")){
         empatbelas1a = "_VBN";
         empatbelas1b = "_VBD";
         empatbelas1c = " ";  
      }else{
         empatbelas1a = " ";
         empatbelas1b = " ";
         empatbelas1c = " ";  
      }
      
      if(empatbelasb.equals("_JJ")){
         empatbelas2a = "_JJ";
         empatbelas2b = "_JJS";
         empatbelas2c = "_JJR";
      }else if(empatbelasb.equals("_NN")){
         empatbelas2a = "_NN";
         empatbelas2b = "_NNS";
         empatbelas2c = " ";  
      }else if(empatbelasb.equals("_RB")){
         empatbelas2a = "_RB";
         empatbelas2b = "_RBS";
         empatbelas2c = "_RBR";   
      }else if(empatbelasb.equals("_VBN")){
         empatbelas2a = "_VBN";
         empatbelas2b = "_VBD";
         empatbelas2c = " ";  
      }else{
         empatbelas2a = " ";
         empatbelas2b = " ";
         empatbelas2c = " ";  
      }
      
      if(empatbelasc.equals("_JJ")){
         empatbelas3a = "_JJ";
         empatbelas3b = "_JJS";
         empatbelas3c = "_JJR";
      }else if(empatbelasc.equals("_NN")){
         empatbelas3a = "_NN";
         empatbelas3b = "_NNS";
         empatbelas3c = " ";  
      }else if(empatbelasc.equals("_RB")){
         empatbelas3a = "_RB";
         empatbelas3b = "_RBS";
         empatbelas3c = "_RBR";   
      }else if(empatbelasc.equals("_VBN")){
         empatbelas3a = "_VBN";
         empatbelas3b = "_VBD";
         empatbelas3c = " ";  
      }else{
         empatbelas3a = " ";
         empatbelas3b = " ";
         empatbelas3c = " ";  
      }
      
//============================================================Rule ke 15=======================================================

     if(limabelasa.equals("_JJ")){
         limabelas1a = "_JJ";
         limabelas1b = "_JJS";
         limabelas1c = "_JJR";
      }else if(limabelasa.equals("_NN")){
         limabelas1a = "_NN";
         limabelas1b = "_NNS";
         limabelas1c = " ";  
      }else if(limabelasa.equals("_RB")){
         limabelas1a = "_RB";
         limabelas1b = "_RBS";
         limabelas1c = "_RBR";   
      }else if(limabelasa.equals("_VBN")){
         limabelas1a = "_VBN";
         limabelas1b = "_VBD";
         limabelas1c = " ";  
      }else{
         limabelas1a = " ";
         limabelas1b = " ";
         limabelas1c = " ";  
      }
      
      if(limabelasb.equals("_JJ")){
         limabelas2a = "_JJ";
         limabelas2b = "_JJS";
         limabelas2c = "_JJR";
      }else if(limabelasb.equals("_NN")){
         limabelas2a = "_NN";
         limabelas2b = "_NNS";
         limabelas2c = " ";  
      }else if(limabelasb.equals("_RB")){
         limabelas2a = "_RB";
         limabelas2b = "_RBS";
         limabelas2c = "_RBR";   
      }else if(limabelasb.equals("_VBN")){
         limabelas2a = "_VBN";
         limabelas2b = "_VBD";
         limabelas2c = " ";  
      }else{
         limabelas2a = " ";
         limabelas2b = " ";
         limabelas2c = " ";  
      }
      
      if(limabelasc.equals("_JJ")){
         limabelas3a = "_JJ";
         limabelas3b = "_JJS";
         limabelas3c = "_JJR";
      }else if(limabelasc.equals("_NN")){
         limabelas3a = "_NN";
         limabelas3b = "_NNS";
         limabelas3c = " ";  
      }else if(limabelasc.equals("_RB")){
         limabelas3a = "_RB";
         limabelas3b = "_RBS";
         limabelas3c = "_RBR";   
      }else if(limabelasc.equals("_VBN")){
         limabelas3a = "_VBN";
         limabelas3b = "_VBD";
         limabelas3c = " ";  
      }else{
         limabelas3a = " ";
         limabelas3b = " ";
         limabelas3c = " ";  
      }
      
//==========================================================Rule ke 16======================================================
      
     if(enambelasa.equals("_JJ")){
         enambelas1a = "_JJ";
         enambelas1b = "_JJS";
         enambelas1c = "_JJR";
      }else if(enambelasa.equals("_NN")){
         enambelas1a = "_NN";
         enambelas1b = "_NNS";
         enambelas1c = " ";  
      }else if(enambelasa.equals("_RB")){
         enambelas1a = "_RB";
         enambelas1b = "_RBS";
         enambelas1c = "_RBR";   
      }else if(enambelasa.equals("_VBN")){
         enambelas1a = "_VBN";
         enambelas1b = "_VBD";
         enambelas1c = " ";  
      }else{
         enambelas1a = " ";
         enambelas1b = " ";
         enambelas1c = " ";  
      }
      
      if(enambelasb.equals("_JJ")){
         enambelas2a = "_JJ";
         enambelas2b = "_JJS";
         enambelas2c = "_JJR";
      }else if(enambelasb.equals("_NN")){
         enambelas2a = "_NN";
         enambelas2b = "_NNS";
         enambelas2c = " ";  
      }else if(enambelasb.equals("_RB")){
         enambelas2a = "_RB";
         enambelas2b = "_RBS";
         enambelas2c = "_RBR";   
      }else if(enambelasb.equals("_VBN")){
         enambelas2a = "_VBN";
         enambelas2b = "_VBD";
         enambelas2c = " ";  
      }else{
         enambelas2a = " ";
         enambelas2b = " ";
         enambelas2c = " ";  
      }
      
      if(enambelasc.equals("_JJ")){
         enambelas3a = "_JJ";
         enambelas3b = "_JJS";
         enambelas3c = "_JJR";
      }else if(enambelasc.equals("_NN")){
         enambelas3a = "_NN";
         enambelas3b = "_NNS";
         enambelas3c = " ";  
      }else if(enambelasc.equals("_RB")){
         enambelas3a = "_RB";
         enambelas3b = "_RBS";
         enambelas3c = "_RBR";   
      }else if(enambelasc.equals("_VBN")){
         enambelas3a = "_VBN";
         enambelas3b = "_VBD";
         enambelas3c = " ";  
      }else{
         enambelas3a = " ";
         enambelas3b = " ";
         enambelas3c = " ";  
      }
      
//==========================================================Rule ke 17==========================================================
    
     if(tujuhbelasa.equals("_JJ")){
         tujuhbelas1a = "_JJ";
         tujuhbelas1b = "_JJS";
         tujuhbelas1c = "_JJR";
      }else if(tujuhbelasa.equals("_NN")){
         tujuhbelas1a = "_NN";
         tujuhbelas1b = "_NNS";
         tujuhbelas1c = " ";  
      }else if(tujuhbelasa.equals("_RB")){
         tujuhbelas1a = "_RB";
         tujuhbelas1b = "_RBS";
         tujuhbelas1c = "_RBR";   
      }else if(tujuhbelasa.equals("_VBN")){
         tujuhbelas1a = "_VBN";
         tujuhbelas1b = "_VBD";
         tujuhbelas1c = " ";  
      }else{
         tujuhbelas1a = " ";
         tujuhbelas1b = " ";
         tujuhbelas1c = " ";  
      }
      
      if(tujuhbelasb.equals("_JJ")){
         tujuhbelas2a = "_JJ";
         tujuhbelas2b = "_JJS";
         tujuhbelas2c = "_JJR";
      }else if(tujuhbelasb.equals("_NN")){
         tujuhbelas2a = "_NN";
         tujuhbelas2b = "_NNS";
         tujuhbelas2c = " ";  
      }else if(tujuhbelasb.equals("_RB")){
         tujuhbelas2a = "_RB";
         tujuhbelas2b = "_RBS";
         tujuhbelas2c = "_RBR";   
      }else if(tujuhbelasb.equals("_VBN")){
         tujuhbelas2a = "_VBN";
         tujuhbelas2b = "_VBD";
         tujuhbelas2c = " ";  
      }else{
         tujuhbelas2a = " ";
         tujuhbelas2b = " ";
         tujuhbelas2c = " ";  
      }
      
      if(tujuhbelasc.equals("_JJ")){
         tujuhbelas3a = "_JJ";
         tujuhbelas3b = "_JJS";
         tujuhbelas3c = "_JJR";
      }else if(tujuhbelasc.equals("_NN")){
         tujuhbelas3a = "_NN";
         tujuhbelas3b = "_NNS";
         tujuhbelas3c = " ";  
      }else if(tujuhbelasc.equals("_RB")){
         tujuhbelas3a = "_RB";
         tujuhbelas3b = "_RBS";
         tujuhbelas3c = "_RBR";   
      }else if(tujuhbelasc.equals("_VBN")){
         tujuhbelas3a = "_VBN";
         tujuhbelas3b = "_VBD";
         tujuhbelas3c = " ";  
      }else{
         tujuhbelas3a = " ";
         tujuhbelas3b = " ";
         tujuhbelas3c = " ";  
      }
      
//================================================================Rule ke 18==============================================

     if(delapanbelasa.equals("_JJ")){
         delapanbelas1a = "_JJ";
         delapanbelas1b = "_JJS";
         delapanbelas1c = "_JJR";
      }else if(delapanbelasa.equals("_NN")){
         delapanbelas1a = "_NN";
         delapanbelas1b = "_NNS";
         delapanbelas1c = " ";  
      }else if(delapanbelasa.equals("_RB")){
         delapanbelas1a = "_RB";
         delapanbelas1b = "_RBS";
         delapanbelas1c = "_RBR";   
      }else if(delapanbelasa.equals("_VBN")){
         delapanbelas1a = "_VBN";
         delapanbelas1b = "_VBD";
         delapanbelas1c = " ";  
      }else{
         delapanbelas1a = " ";
         delapanbelas1b = " ";
         delapanbelas1c = " ";  
      }
      
      if(delapanbelasb.equals("_JJ")){
         delapanbelas2a = "_JJ";
         delapanbelas2b = "_JJS";
         delapanbelas2c = "_JJR";
      }else if(delapanbelasb.equals("_NN")){
         delapanbelas2a = "_NN";
         delapanbelas2b = "_NNS";
         delapanbelas2c = " ";  
      }else if(delapanbelasb.equals("_RB")){
         delapanbelas2a = "_RB";
         delapanbelas2b = "_RBS";
         delapanbelas2c = "_RBR";   
      }else if(delapanbelasb.equals("_VBN")){
         delapanbelas2a = "_VBN";
         delapanbelas2b = "_VBD";
         delapanbelas2c = " ";  
      }else{
         delapanbelas2a = " ";
         delapanbelas2b = " ";
         delapanbelas2c = " ";  
      }
      
      if(delapanbelasc.equals("_JJ")){
         delapanbelas3a = "_JJ";
         delapanbelas3b = "_JJS";
         delapanbelas3c = "_JJR";
      }else if(delapanbelasc.equals("_NN")){
         delapanbelas3a = "_NN";
         delapanbelas3b = "_NNS";
         delapanbelas3c = " ";  
      }else if(delapanbelasc.equals("_RB")){
         delapanbelas3a = "_RB";
         delapanbelas3b = "_RBS";
         delapanbelas3c = "_RBR";   
      }else if(delapanbelasc.equals("_VBN")){
         delapanbelas3a = "_VBN";
         delapanbelas3b = "_VBD";
         delapanbelas3c = " ";  
      }else{
         delapanbelas3a = " ";
         delapanbelas3b = " ";
         delapanbelas3c = " ";  
      }
    
//       System.out.println("Isinya sebelum rule : " + duaa);
//       System.out.println("Isinya rule deas : " + dua1a + dua1b + dua1c);
       
      String Str = new String(input);
      String opini = null;
              
      for (String retval: Str.split(" ")){
          listinput.add(retval);
      }
       
      if(listinput.size() == 3){
        String kata1=listinput.get(0);
        String kata2=listinput.get(1);
        String kata3=listinput.get(2);
        String tampkata2 = " ";
        String tampkata3 = " ";
          
          
        
        if(kata1.endsWith(satu1a)||kata1.endsWith(satu1b)||kata1.endsWith(satu1c)){//tambahan jjr dan jjs
            if(satu2a != " "){
                if(kata2.endsWith(satu2a)||kata2.endsWith(satu2b)||kata2.endsWith(satu2c)){
                    //System.out.println(kata1+" "+kata2);
                    tampkata2 += kata2;
                }
                if(satu3a != " "){
                    if(kata3.endsWith(satu3a)||kata3.endsWith(satu3b)||kata3.endsWith(satu3c)){
                        tampkata3 += kata3;
                    }
                }
                    
                }
            opini = kata1+" "+tampkata2+" "+tampkata3;
            }
        
        else if(kata1.endsWith(dua1a)||kata1.endsWith(dua1b)||kata1.endsWith(dua1c)){
               if(dua2a != " "){
                    if(kata2.endsWith(dua2a)||kata2.endsWith(dua2b)||kata2.endsWith(dua2c)){//tambahan jjr dan jjs
                        //System.out.println(kata1+" "+kata2);
                        tampkata2 += kata2;
                    }
                if(dua3a != " "){
                    if(kata3.endsWith(dua3a)||kata3.endsWith(dua3b)||kata3.endsWith(dua3c)){
                        tampkata3 += kata3;
                    }
                }
                    
                }
               opini=kata1+" "+tampkata2+" "+tampkata3;
            }
        else if(kata1.endsWith(tiga1a)||kata1.endsWith(tiga1b)||kata1.endsWith(tiga1c)){
               if(tiga2a != " "){
                    if(kata2.endsWith(tiga2a)||kata2.endsWith(tiga2b)||kata2.endsWith(tiga2c)){//tambahan jjr dan jjs
                        //System.out.println(kata1+" "+kata2);
                        tampkata2 += kata2;
                    }
                if(tiga3a != " "){
                    if(kata3.endsWith(tiga3a)||kata3.endsWith(tiga3b)||kata3.endsWith(tiga3c)){
                        tampkata3 += kata3;
                    }
                }
                    
                }
               opini=kata1+" "+tampkata2+" "+tampkata3;
            }
        else if(kata1.endsWith(empat1a)||kata1.endsWith(empat1b)||kata1.endsWith(empat1c)){
               if(empat2a != " "){
                    if(kata2.endsWith(empat2a)||kata2.endsWith(empat2b)||kata2.endsWith(empat2c)){//tambahan jjr dan jjs
                        //System.out.println(kata1+" "+kata2);
                        tampkata2 += kata2;
                    }
                if(empat3a != " "){
                    if(kata3.endsWith(empat3a)||kata3.endsWith(empat3b)||kata3.endsWith(empat3c)){
                        tampkata3 += kata3;
                    }
                }
                    
                }
               opini=kata1+" "+tampkata2+" "+tampkata3;
            
        }
        else if(kata1.endsWith(lima1a)||kata1.endsWith(lima1b)||kata1.endsWith(lima1c)){
               if(lima2a != " "){
                    if(kata2.endsWith(lima2a)||kata2.endsWith(lima2b)||kata2.endsWith(lima2c)){//tambahan jjr dan jjs
                        //System.out.println(kata1+" "+kata2);
                        tampkata2 += kata2;
                    }
                if(lima3a != " "){
                    if(kata3.endsWith(lima3a)||kata3.endsWith(lima3b)||kata3.endsWith(lima3c)){
                        tampkata3 += kata3;
                    }
                }
                    
                }
               opini=kata1+" "+tampkata2+" "+tampkata3;
            }
        else if(kata1.endsWith(enam1a)||kata1.endsWith(enam1b)||kata1.endsWith(enam1c)){
               if(enam2a != " "){
                    if(kata2.endsWith(enam2a)||kata2.endsWith(enam2b)||kata2.endsWith(enam2c)){//tambahan jjr dan jjs
                        //System.out.println(kata1+" "+kata2);
                        tampkata2 += kata2;
                    }
                if(enam3a != " "){
                    if(kata3.endsWith(enam3a)||kata3.endsWith(enam3b)||kata3.endsWith(enam3c)){
                        tampkata3 += kata3;
                    }
                }
                    
                }
               opini=kata1+" "+tampkata2+" "+tampkata3;
            }
      else if(kata1.endsWith(tujuh1a)||kata1.endsWith(tujuh1b)||kata1.endsWith(tujuh1c)){
               if(tujuh2a != " "){
                    if(kata2.endsWith(tujuh2a)||kata2.endsWith(tujuh2b)||kata2.endsWith(tujuh2c)){//tambahan jjr dan jjs
                        //System.out.println(kata1+" "+kata2);
                        tampkata2 += kata2;
                    }
                if(tujuh3a != " "){
                    if(kata3.endsWith(tujuh3a)||kata3.endsWith(tujuh3b)||kata3.endsWith(tujuh3c)){
                        tampkata3 += kata3;
                    }
                }
                    
                }
               opini=kata1+" "+tampkata2+" "+tampkata3;
            }
      else if(kata1.endsWith(delapan1a)||kata1.endsWith(delapan1b)||kata1.endsWith(delapan1c)){
               if(delapan2a != " "){
                    if(kata2.endsWith(delapan2a)||kata2.endsWith(delapan2b)||kata2.endsWith(delapan2c)){//tambahan jjr dan jjs
                        //System.out.println(kata1+" "+kata2);
                        tampkata2 += kata2;
                    }
                if(delapan3a != " "){
                    if(kata3.endsWith(delapan3a)||kata3.endsWith(delapan3b)||kata3.endsWith(delapan3c)){
                        tampkata3 += kata3;
                    }
                }
                    
                }
               opini=kata1+" "+tampkata2+" "+tampkata3;
            }
      else if(kata1.endsWith(sembilan1a)||kata1.endsWith(sembilan1b)||kata1.endsWith(sembilan1c)){
               if(sembilan2a != " "){
                    if(kata2.endsWith(sembilan2a)||kata2.endsWith(sembilan2b)||kata2.endsWith(sembilan2c)){//tambahan jjr dan jjs
                        //System.out.println(kata1+" "+kata2);
                        tampkata2 += kata2;
                    }
                if(sembilan3a != " "){
                    if(kata3.endsWith(sembilan3a)||kata3.endsWith(sembilan3b)||kata3.endsWith(sembilan3c)){
                        tampkata3 += kata3;
                    }
                }
                    
                }
               opini=kata1+" "+tampkata2+" "+tampkata3;
            }
        else if(kata1.endsWith(sepuluh1a)||kata1.endsWith(sepuluh1b)||kata1.endsWith(sepuluh1c)){
               if(sepuluh2a != " "){
                    if(kata2.endsWith(sepuluh2a)||kata2.endsWith(sepuluh2b)||kata2.endsWith(sepuluh2c)){//tambahan jjr dan jjs
                        //System.out.println(kata1+" "+kata2);
                        tampkata2 += kata2;
                    }
                if(sepuluh3a != " "){
                    if(kata3.endsWith(sepuluh3a)||kata3.endsWith(sepuluh3b)||kata3.endsWith(sepuluh3c)){
                        tampkata3 += kata3;
                    }
                }
                    
                }
               opini=kata1+" "+tampkata2+" "+tampkata3;
            }
      else if(kata1.endsWith(sebelas1a)||kata1.endsWith(sebelas1b)||kata1.endsWith(sebelas1c)){
               if(sebelas2a != " "){
                    if(kata2.endsWith(sebelas2a)||kata2.endsWith(sebelas2b)||kata2.endsWith(sebelas2c)){//tambahan jjr dan jjs
                        //System.out.println(kata1+" "+kata2);
                        tampkata2 += kata2;
                    }
                if(sebelas3a != " "){
                    if(kata3.endsWith(sebelas3a)||kata3.endsWith(sebelas3b)||kata3.endsWith(sebelas3c)){
                        tampkata3 += kata3;
                    }
                }
                    
                }
               opini=kata1+" "+tampkata2+" "+tampkata3;
            }
      else if(kata1.endsWith(duabelas1a)||kata1.endsWith(duabelas1b)||kata1.endsWith(duabelas1c)){
               if(duabelas2a != " "){
                    if(kata2.endsWith(duabelas2a)||kata2.endsWith(duabelas2b)||kata2.endsWith(duabelas2c)){//tambahan jjr dan jjs
                        //System.out.println(kata1+" "+kata2);
                        tampkata2 += kata2;
                    }
                if(duabelas3a != " "){
                    if(kata3.endsWith(duabelas3a)||kata3.endsWith(duabelas3b)||kata3.endsWith(duabelas3c)){
                        tampkata3 += kata3;
                    }
                }
                    
                }
               opini=kata1+" "+tampkata2+" "+tampkata3;
            }
      else if(kata1.endsWith(tigabelas1a)||kata1.endsWith(tigabelas1b)||kata1.endsWith(tigabelas1c)){
               if(tigabelas2a != " "){
                    if(kata2.endsWith(tigabelas2a)||kata2.endsWith(tigabelas2b)||kata2.endsWith(tigabelas2c)){//tambahan jjr dan jjs
                        //System.out.println(kata1+" "+kata2);
                        tampkata2 += kata2;
                    }
                if(tigabelas3a != " "){
                    if(kata3.endsWith(tigabelas3a)||kata3.endsWith(tigabelas3b)||kata3.endsWith(tigabelas3c)){
                        tampkata3 += kata3;
                    }
                }
                    
                }
               opini=kata1+" "+tampkata2+" "+tampkata3;
            }
      else if(kata1.endsWith(empatbelas1a)||kata1.endsWith(empatbelas1b)||kata1.endsWith(empatbelas1c)){
               if(empatbelas2a != " "){
                    if(kata2.endsWith(empatbelas2a)||kata2.endsWith(empatbelas2b)||kata2.endsWith(empatbelas2c)){//tambahan jjr dan jjs
                        //System.out.println(kata1+" "+kata2);
                        tampkata2 += kata2;
                    }
                if(empatbelas3a != " "){
                    if(kata3.endsWith(empatbelas3a)||kata3.endsWith(empatbelas3b)||kata3.endsWith(empatbelas3c)){
                        tampkata3 += kata3;
                    }
                }
                    
                }
               opini=kata1+" "+tampkata2+" "+tampkata3;
            }
      else if(kata1.endsWith(limabelas1a)||kata1.endsWith(limabelas1b)||kata1.endsWith(limabelas1c)){
               if(limabelas2a != " "){
                    if(kata2.endsWith(limabelas2a)||kata2.endsWith(limabelas2b)||kata2.endsWith(limabelas2c)){//tambahan jjr dan jjs
                        //System.out.println(kata1+" "+kata2);
                        tampkata2 += kata2;
                    }
                if(limabelas3a != " "){
                    if(kata3.endsWith(limabelas3a)||kata3.endsWith(limabelas3b)||kata3.endsWith(limabelas3c)){
                        tampkata3 += kata3;
                    }
                }
                    
                }
               opini=kata1+" "+tampkata2+" "+tampkata3;
            }
      else if(kata1.endsWith(enambelas1a)||kata1.endsWith(enambelas1b)||kata1.endsWith(enambelas1c)){
               if(enambelas2a != " "){
                    if(kata2.endsWith(enambelas2a)||kata2.endsWith(enambelas2b)||kata2.endsWith(enambelas2c)){//tambahan jjr dan jjs
                        //System.out.println(kata1+" "+kata2);
                        tampkata2 += kata2;
                    }
                if(enambelas3a != " "){
                    if(kata3.endsWith(enambelas3a)||kata3.endsWith(enambelas3b)||kata3.endsWith(enambelas3c)){
                        tampkata3 += kata3;
                    }
                }
                    
                }
               opini=kata1+" "+tampkata2+" "+tampkata3;
            }
      else if(kata1.endsWith(tujuhbelas1a)||kata1.endsWith(tujuhbelas1b)||kata1.endsWith(tujuhbelas1c)){
               if(tujuhbelas2a != " "){
                    if(kata2.endsWith(tujuhbelas2a)||kata2.endsWith(tujuhbelas2b)||kata2.endsWith(tujuhbelas2c)){//tambahan jjr dan jjs
                        //System.out.println(kata1+" "+kata2);
                        tampkata2 += kata2;
                    }
                if(tujuhbelas3a != " "){
                    if(kata3.endsWith(tujuhbelas3a)||kata3.endsWith(tujuhbelas3b)||kata3.endsWith(tujuhbelas3c)){
                        tampkata3 += kata3;
                    }
                }
                    
                }
               opini=kata1+" "+tampkata2+" "+tampkata3;
            }
      else if(kata1.endsWith(delapanbelas1a)||kata1.endsWith(delapanbelas1b)||kata1.endsWith(delapanbelas1c)){
               if(delapanbelas2a != " "){
                    if(kata2.endsWith(delapanbelas2a)||kata2.endsWith(delapanbelas2b)||kata2.endsWith(delapanbelas2c)){//tambahan jjr dan jjs
                        //System.out.println(kata1+" "+kata2);
                        tampkata2 += kata2;
                    }
                if(delapanbelas3a != " "){
                    if(kata3.endsWith(delapanbelas3a)||kata3.endsWith(delapanbelas3b)||kata3.endsWith(delapanbelas3c)){
                        tampkata3 += kata3;
                    }
                }
                    
                }
               opini=kata1+" "+tampkata2+" "+tampkata3;
            }
      
      
      
      }
      
      
       // }else if(getRule2a == "_RB" && getRule2b == "_JJ" && getRule2c == " "){
            
        //}else if(getRule4a == "_NN" && getRule4b == "_JJ" && getRule4c == " "){
        //rule baru
            
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
//       for (String retval: Str.split(" ")){
//           listinput.add(retval);
//       }
//       String isi = "_JJ";
//       
//       String rule1="\\S*"+isi+"+\\S* (\\S*_NN+\\S*|\\S*_NNS+\\S*)";
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
//       listinput.clear();
//       return hasilRule;
//   }
    
   }

