/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ch6_20250207.Ch6_7_modifier3;

/**
 *
 * @author xvpow
 */
public class TestPrivate {
    private TestPrivate(){
        System.out.println("TestPrivate");
    }
    
    public static TestPrivate newTestPrivate(){
        return new TestPrivate();
    }
}
