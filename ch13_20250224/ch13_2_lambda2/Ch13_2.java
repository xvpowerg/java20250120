/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ch13_20250224.ch13_2_lambda2;

/**
 *
 * @author xvpow
 */
public class Ch13_2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        TestIF1 tif1 = ()->{
            System.out.println("Test1!!");
        };
        tif1.testFunc();
        TestIF1 tif2 = ()->System.out.println("Test2");
        tif2.testFunc();
    }
    
}
