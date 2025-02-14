/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ch9_20250214.Ch9_1_initblock1;

/**
 *
 * @author xvpow
 */
public class Test1 {
    
    static int v1 = 10;
       int v2 = 10;
    static void test(){
        v1 = 25;
     //   v2 = 99;
    }
    public Test1(){
        System.out.println("Test1()");
         v1 = 50;
         v2 = 99;
    }
    {
     System.out.println("Init 1");
    }
    static{
         System.out.println("static Init 1");
          //v2 = 99;
         
    }
    {
     System.out.println("Init 2");
     v1 = 50;
    }
    static{
        System.out.println("static Init 2");  
    }
}
