/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ch7_20250210.Ch7_6_override1;

/**
 *
 * @author xvpow
 */
public class TestClass2 extends TestClass1 {
    
    public void testPublic(){
        System.out.println("TestClass2 testPulbic");
    }
    protected void testProtected(){
        System.out.println("TestClass2 testProtected");
    }
    
    void testDefault(){
        System.out.println("TestClass2 testDefault");
    }
     //不是複寫
   // @Override
    public void testPrivate(){
        System.out.println("TestClass2 testPrivate");
    }
}
