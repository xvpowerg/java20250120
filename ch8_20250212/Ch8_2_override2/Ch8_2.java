/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ch8_20250212.Ch8_2_override2;
import java.io.IOException;
/**
 *
 * @author xvpow
 */
public class Ch8_2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       Test1 t2 = new Test2();
       try{
             t2.testException(50);
       }catch(IOException ex){
           System.out.println("IOException ex:"+ex);
       }
       
       try{
            t2.testRuntimeException(70);
       }catch(RuntimeException ex){
           System.out.println(ex);
       }
    } 
}
