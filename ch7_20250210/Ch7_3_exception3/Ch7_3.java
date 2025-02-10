/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ch7_20250210.Ch7_3_exception3;
import java.io.IOException;
import java.io.FileNotFoundException;
import java.sql.SQLException;

import java.lang.NullPointerException;
import java.lang.IllegalArgumentException;
import java.lang.ArithmeticException;
import java.lang.IndexOutOfBoundsException;
/**
 *
 * @author xvpow
 */
public class Ch7_3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       TestException ex1 = new TestException();
       try{
        ex1.testIoException(40);   
       }catch(IOException ex){
           System.out.println(ex);
       }catch(SQLException ex){
           System.out.println(ex);
       }
       //越下越父
       try{
         ex1.testException2(90); 
       }catch(FileNotFoundException ex){
           System.out.println("F:"+ex);
       }catch(IOException ex){
           System.out.println(ex);
       }
       
    }
    
}
