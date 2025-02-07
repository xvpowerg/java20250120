/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ch6_20250207.Ch6_5_2_modifier1;
import ch6_20250207.Ch6_5_modifier1.TestClass1;
/**
 *
 * @author xvpow
 */
public class TestClass2  extends TestClass1{
        public void testValue(){
           System.out.println("protectedTest:"+this.protectedTest); 
           System.out.println("publicTest:"+this.publicTest); 
        }
        
}
