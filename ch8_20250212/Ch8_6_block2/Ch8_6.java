/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ch8_20250212.Ch8_6_block2;

/**
 *
 * @author xvpow
 */
public class Ch8_6 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
     TestStatic t1 = new TestStatic();
     TestStatic t2 = new TestStatic();
     
     TestStatic.company = "Java";
     t1.name = "Ken";
     TestStatic.company = "Python";
     t2.name = "Vivin";
     System.out.println(t1);
     System.out.println(t2);
     
    }
    
}
