/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ch13_20250224.ch13_7_lambda7;
import java.util.function.Supplier;
import java.util.ArrayList;
import java.util.Collection;
/**
 *
 * @author xvpow
 */
public class Ch13_7 {

      
    
    static Collection<String> 
        testToCollection( Supplier<Collection<String>> sp,String ... value){
        Collection<String> coll =  sp.get();
            for (String s1 :  value){
                coll.add(s1);
            }
          return coll;
    }
    public static void main(String[] args) {
        Collection<String> c1 =  testToCollection(()->new ArrayList(),
                                "A","B","C","D");
        System.out.println(c1);
       
    }
    
}
