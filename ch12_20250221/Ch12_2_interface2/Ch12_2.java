/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ch12_20250221.Ch12_2_interface2;
import java.util.function.Predicate;
/**
 *
 * @author xvpow
 */
public class Ch12_2 {

    static void testString(String msg,Predicate<String> p){
        if (p.test(msg)){
            System.out.println(msg);
        }else{
            System.out.println("Error!");
        }
    }
    public static void main(String[] args) {
        // TODO code application logic here
        String msg1 = "ABC";
        TestClass t1 = new TestClass();
       testString(msg1,t1); 
        Test2Class t2 = new Test2Class();
       testString(msg1,t2);
    }
    
}
