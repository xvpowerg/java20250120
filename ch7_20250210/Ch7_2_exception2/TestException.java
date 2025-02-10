/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ch7_20250210.Ch7_2_exception2;
/**
 *
 * @author xvpow
 */
public class TestException {
    public void testException(int v)throws Exception{
         
          if(v > 10){
                throw new Exception("Exception ex");
          }
    }
    
    public void testRuntimeException(int v){
       if(v > 10){
           throw new RuntimeException("RuntimeException ex");
       }
    }
}
