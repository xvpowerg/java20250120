/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ch1_20250120;

/**
 *
 * @author xvpow
 */
public class Ch1_2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        int v1 = 10;
        int v2 = 20;
        var ans = v1 + v2;
        System.out.println(ans);
        ans = v1 - v2;
        System.out.println(ans);
        ans = v1 * v2;
        System.out.println(ans);
        ans = v1 / v2;//因為計算的都是整數所以結果也是整數
        System.out.println(ans);
        var ans2 = v1 / (float)v2;
        System.out.println(ans2);
        ans = 8 % 5;
        System.out.println(ans);
    }
    
}
