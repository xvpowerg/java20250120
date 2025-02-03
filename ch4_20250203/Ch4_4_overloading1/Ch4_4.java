/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ch4_20250203.Ch4_4_overloading1;

/**
 *
 * @author xvpow
 */
public class Ch4_4 {

            
   static float max(float v1,float v2){
       return v1 > v2 ? v1 : v2;
   }
    
    static int max(int v1,int v2){
        return v1 > v2 ? v1 : v2;    
    }
    
    static int max(int v1,int v2,int v3){
        return max(max(v1,v2),v3) ;
        
    }
    
    public static void main(String[] args) {
      
        int m1 = max(25,60);
        System.out.println(m1);
        int m2 = max(75,21);
        System.out.println(m2);
        float m3 = max(18.5f,72.5f);
        System.out.println(m3);
        float m4 = max(65.5f,31.5f);
        System.out.println(m4 );
        int m5 = max(25,77,16);
        System.out.println(m5);
    }
    
}
