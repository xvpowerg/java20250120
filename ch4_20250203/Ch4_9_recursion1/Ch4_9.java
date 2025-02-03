/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ch4_20250203.Ch4_9_recursion1;

/**
 *
 * @author xvpow
 */
public class Ch4_9 {

    static void test1(int v){
        System.out.println("Start:"+v);
        if (v <= 5){
            System.out.println(v+" ");
            
            test1(v + 1);
        }
        System.out.println("End:"+v);
    }
    
    public static void main(String[] args) {
       
         test1(1);   
        
        
    }
    
}
