/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ch8_20250212.Ch8_1_override1;

/**
 *
 * @author xvpow
 */
public class Test1 {
    public int testReturn(){
        System.out.println("Test1 TestReturn");
        return 25;
    }
    
    public Test1 testReturnObj(){
        System.out.println("Test1 testReturnObj");
        return new Test1();
    }
    
    public void testValue(Test1 v1){
        System.out.println("Test1 testValue:"+v1);
    }
}
