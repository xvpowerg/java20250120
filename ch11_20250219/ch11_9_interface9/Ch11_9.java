/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ch11_20250219.ch11_9_interface9;
import java.util.function.Function;
public class Ch11_9 {

   public static int toNumber(String s,Function<String,Integer> f){
       
       return f.apply(s);
   }
    
    public static void main(String[] args) {
       
       int len =  toNumber("ABCD",new MyFuncLen());
        System.out.println(len);
       int number1 =  toNumber("567",new MyFuncToInteger());
         System.out.println(number1);
    }
    
}
