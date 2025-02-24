/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ch13_20250224.ch13_10_lambda10;
import java.util.function.Function;
import java.util.Random;
/**
 *
 * @author xvpow
 */
public class Ch13_10 {

   static String lenToString(Integer len){
        Random ran = new Random();
 
                 String st1 = "";
                 for (int i =1; i <= len; i++){
                     int c =  ran.nextInt(26)+'A';
                     st1 += (char)c;
                 }
                  return st1;
   }
    public static void main(String[] args) {
        Function<Integer,String> f1 =  (len)->{
            Random ran = new Random();
 
                 String st1 = "";
                 for (int i =1; i <= len; i++){
                     int c =  ran.nextInt(26)+'A';
                     st1 += (char)c;
                 }
                  return st1;
        };
        
        Function<Integer,String> f2 = Ch13_10::lenToString;
        
        System.out.println(f1.apply(5));
        System.out.println(f2.apply(10));
    }
    
}
