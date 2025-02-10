/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ch7_20250210.Ch7_6_2_override1;
import ch7_20250210.Ch7_6_override1.TestClass1;
/**
 *
 * @author xvpow
 */
public class TestClass3 extends TestClass1 {
    public void testPublic(){
        System.out.println("TestClass3 testPublic");
    }
    public void testProtected(){
        System.out.println("TestClass3 Protected");
    }
   //跨package Default不能複寫
    void testDefault(){
        System.out.println("TestClass3 Default");
    }
    private void testPrivate(){
         System.out.println("TestClass3 Private");
    }
}
