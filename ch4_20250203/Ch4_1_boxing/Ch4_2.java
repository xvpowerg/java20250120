/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ch4_20250203.Ch4_1_boxing;

/**
 *
 * @author xvpow
 */
public class Ch4_2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int x = 20;
        int y = 20;
        System.out.println(y == x);
        Integer xi = x;
        Integer yi = y;
        System.out.println(yi == xi);
        System.out.println("================================");
        x = 128 ;//valueOf 有一個暫存 -128~127
        y = 128;
        System.out.println(x == y);
        xi = Integer.valueOf(x) ;//valueOf 有一個暫存 -128~127;
        yi = y;
        System.out.println(yi == xi);
        System.out.println(yi.equals(xi) );

    }
    
}
