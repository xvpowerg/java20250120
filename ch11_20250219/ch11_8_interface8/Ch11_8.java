/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ch11_20250219.ch11_8_interface8;
import java.util.function.Supplier;
/**
 *
 * @author xvpow
 */
public class Ch11_8 {

    
    static void test(int a,int b,Supplier<Exception> s)throws Exception{
        if (a < b){
            throw s.get();
        }
        System.out.println(a);
    }
    
    public static void main(String[] args) {
        // TODO code application logic here
        try{
             test(2,3,new MyExceptionSupplier());
        }catch(Exception ex){
            System.out.println(ex);
        }
       
    }
    
}
