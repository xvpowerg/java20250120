/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ch8_20250212.Ch8_1_override1;

/**
 *
 * @author xvpow
 */
public class Ch8_1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       Test1 t2 = new Test2();
       System.out.println(t2.testReturn());
       System.out.println(t2.testReturnObj());
       t2.testValue(t2);
    }
    
}
