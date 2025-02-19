/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package ch11_20250219.ch11_2_interface2;

/**
 *
 * @author xvpow
 */
public interface TestIF2  extends TestIF1{
      default void testFunc(){
        System.out.println("testFunc TestIF2");
    }
}
