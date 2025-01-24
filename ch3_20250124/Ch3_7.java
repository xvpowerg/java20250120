/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ch3_20250124;

/**
 *
 * @author xvpow
 */
public class Ch3_7 {
    
   static void test1(){
        System.out.println("Test!!");
    }
   static int test2(int v1,int v2){
       int ans = v1 + v2;
       return ans;
   }
    
   static void test3(int v1){
       if (v1 > 30){
           return;//離開函數
       }
       System.out.println(v1);
   }
   
    public static void main(String[] args) {
        // TODO code application logic here
        test1();
        int v1 = test2(10,15);
        System.out.println(v1);
        test3(10);
        test3(50);
    }
    
}
