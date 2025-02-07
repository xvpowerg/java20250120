/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ch6_20250207.Ch6_4_obj4;

/**
 *
 * @author xvpow
 */
public class TestClass1 {
    TestClass1(){
       this(10);
        System.out.println("TestClass1()");
    }
    TestClass1(int v1,String v2){
        System.out.println("TestClass1(int v1,String v2)");
    }
    TestClass1(int v1){
        this(v1,"ABC");
        System.out.println("TestClass1(int v1)");
    }
}
