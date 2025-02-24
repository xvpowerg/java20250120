/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ch13_20250224.ch13_3_lambda3;

/**
 *
 * @author xvpow
 */
public class Ch13_3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       TestIF2 tif2_1 = (int v)->{
           System.out.println(v);
       };
       
       TestIF2 tif2_2 = v->{
           System.out.println(v);
       };
       TestIF2 tif2_3 = v->System.out.println(v);
       
       tif2_1.testFunc(50);
       tif2_2.testFunc(21);
       tif2_3.testFunc(16);
    }
    
}
