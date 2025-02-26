/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ch14_20250226.Ch14_2_lambda2;
import java.util.function.UnaryOperator;
/**
 *
 * @author xvpow
 */
public class Ch14_2 {

    static String stToSr(String str,UnaryOperator<String> op){
        return op.apply(str);
    }
    
    static String toUpCase(String str){
        return str.toUpperCase();
    }
    
    public static void main(String[] args) {
        // TODO code application logic here
        String st1 = "abcd";
        String v1 = stToSr(st1,Ch14_2::toUpCase);
        System.out.println(v1);
        
        
        String v2 = stToSr(st1,String::toUpperCase);  
        System.out.println(v2);
        
    }
    
}
