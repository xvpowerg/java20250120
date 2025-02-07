/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ch6_20250207.Ch6_2_obj2;

/**
 *
 * @author xvpow
 */
public class TestClass {
    TestClass(){
        System.out.println("TestClass()");
    }
    TestClass(String v1,int v2){
        this();
        System.out.println("String v1,int v2");
                
    }
    TestClass(int v1){
        this("Msg",v1);
         System.out.println("int v2");
    }
    
}
