/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ch7_20250210.Ch7_4_exception4;

/**
 *
 * @author xvpow
 */
public class Ch7_4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
      System.out.println("Init.....");
       try{
          TestException tex = new TestException();
          tex.testRuntimeException(26);
       }catch(IllegalArgumentException ex){
           System.out.println(ex);
       }finally{
           System.out.println("Clear.......");
       }
      
     
    
    }
    
}
