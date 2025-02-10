/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ch7_20250210.Ch7_2_exception2;

/**
 *
 * @author xvpow
 */
public class Ch7_2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        TestException tex = new TestException();
        try{
            tex.testException(15);
        }catch(Exception ex){
            System.out.println(ex);
        }
        
        try{
            tex.testRuntimeException(25); 
        }catch(RuntimeException ex){
            System.out.println(ex);
        }
       
        
    }
    
}
