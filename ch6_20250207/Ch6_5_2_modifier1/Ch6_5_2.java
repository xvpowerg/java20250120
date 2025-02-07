/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ch6_20250207.Ch6_5_2_modifier1;
import ch6_20250207.Ch6_5_modifier1.TestClass1;
/**
 *
 * @author xvpow
 */
public class Ch6_5_2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       TestClass1 tc1 = new TestClass1();
       System.out.println(tc1.publicTest);
       TestClass2 tc2 = new TestClass2();
       tc2.testValue();
    }
    
}
