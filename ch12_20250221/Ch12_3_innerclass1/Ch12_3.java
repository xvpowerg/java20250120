/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ch12_20250221.Ch12_3_innerclass1;

/**
 *
 * @author xvpow
 */
public class Ch12_3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
      TestClass1 tc1 = new TestClass1("A",80);
      TestClass1.TestPrice tp1 = new TestClass1.TestPrice(100);
      System.out.println(tc1);
      System.out.println(tp1);
      tc1.testPrice(tp1);
      TestClass1 tc2 = new TestClass1("B",950);
      tc2.testPrice(tp1);
    }
    
}
