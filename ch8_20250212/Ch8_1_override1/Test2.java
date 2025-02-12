/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ch8_20250212.Ch8_1_override1;

/**
 *
 * @author xvpow
 */
public class Test2 extends Test1 {
    public int testReturn(){
        System.out.println("Test2 TestReturn");
        return 18;
    }
      
    public Test2 testReturnObj(){
        System.out.println("Test2  testReturnObj");
        return new Test2();
    }  
    
    public void testValue(Test1 v1){
        System.out.println("Test2 testValue:"+v1);
    }
}
