/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package ch11_20250219.ch11_3_interface3;

/**
 *
 * @author xvpow
 */
public interface TestIF3 extends TestIF1,TestIF2 {
    default void testFunc(){
        System.out.println("TestIF3 testFunc");
    }
    
}
