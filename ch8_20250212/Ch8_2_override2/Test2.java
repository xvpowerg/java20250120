/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ch8_20250212.Ch8_2_override2;
import java.io.FileNotFoundException;
import java.lang.IllegalArgumentException;
import java.sql.SQLException;
/**
 *
 * @author xvpow
 */
public class Test2 extends Test1{
    
    public void testException(int v)throws FileNotFoundException{
        System.out.println("Test2 testException");
        if (v > 20){
         throw new FileNotFoundException("Test2 testException"); 
        }  
    }
    
    public void testRuntimeException(int v)throws IllegalArgumentException{
        System.out.println("Test2 testRuntimeException");
        if (v > 30){
             throw new IllegalArgumentException("Test2 testRuntimeException"); 
        }
    }
}
