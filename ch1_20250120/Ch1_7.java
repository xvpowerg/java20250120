/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ch1_20250120;

/**
 *
 * @author xvpow
 */
public class Ch1_7 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       int x = 0;
       System.out.println("x:"+x);
       x++;
       System.out.println("x:"+x);
       
       int v1 = 10;
       int v2 = 20;
       int v3 = 30;
       x = 0;
       boolean b1 = v1 < v2 && x++ < v3;
       System.out.println("b1:"+b1);
       System.out.println("x:"+x);
       x = 0;
       b1 = v1 > v2 && x++ < v3;//左邊false開始短路
       System.out.println(b1);
       System.out.println("x:"+x);
       x = 0; 
       b1 = v1 > v2 || x++ < v3; 
       System.out.println("b1:"+b1);
       System.out.println("x:"+x);
       
       x = 0; 
       b1 = v1 < v2 || x++ < v3;//左邊是true短路發生
       System.out.println("b1:"+b1);
       System.out.println("x:"+x);
    }
    
}
