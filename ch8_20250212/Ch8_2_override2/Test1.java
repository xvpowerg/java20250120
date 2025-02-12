/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ch8_20250212.Ch8_2_override2;
import java.io.IOException;
/**
 *
 * @author xvpow
 */
public class Test1 {
    public void testException(int v)throws IOException{
        System.out.println("Test1 testException");
        if (v > 10){
            throw new IOException("Test1 testException");
        }
    }
    
    public void testRuntimeException(int v)throws NullPointerException{
        System.out.println("Test1 testRuntimeException");
        if (v > 30){
            throw new NullPointerException("Test1 testRuntimeException");
        }
    }
}
