/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ch13_20250224.ch13_1_lambda1;

/**
 *
 * @author xvpow
 */
public class Ch13_1 {
    
    static void testMyLambda(TestLambda t,int v){
        System.out.println(t.testFun(v));
    }
    public static void main(String[] args) {
        int c = 65;
        char tmpc = (char)c;
        String st = tmpc+"";
        System.out.println(st);
        testMyLambda(new TestLambda(){
             public String testFun(int v){
                 char c = (char)v;
                 String tmpC = c+"";
                 return tmpC;
             }   
        },66);
        
        testMyLambda((int v)->{
                char cx = (char)v;
                String tmpC = cx +"";
                return tmpC;
        
        },67);
    }
    
}
