/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ch7_20250210.Ch7_5_exception5;

/**
 *
 * @author xvpow
 */
public class Ch7_5 {

    static void testMyException(int v)throws MyException{
         MyException myEx = new MyException("My Error");
         if (v > 20){
             throw myEx;
         }
    }
    public static void main(String[] args) {
        
        try{
             testMyException(25);
        }catch(MyException ex){
            System.out.println(ex);
        }
      
        
        
        
    }
    
}
