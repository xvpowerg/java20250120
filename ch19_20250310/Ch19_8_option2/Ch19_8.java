/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ch19_20250310.Ch19_8_option2;
import java.util.Optional;
/**
 *
 * @author xvpow
 */
public class Ch19_8 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       Optional<String> op1 =  Optional.of("A");
       System.out.println(op1.get());
       //Optional.of(null);
       Optional<String> op2 =  Optional.ofNullable("ABC");
       Optional<String> op3 =  Optional.ofNullable(null);
       System.out.println(op2.get());
       
       op2.ifPresent(v->System.out.println(v));
       
       if (op3.isPresent()){
           System.out.println(op3.get());
       }
       op3.ifPresent(v->System.out.println(v));
       
       //op3 內容是null
       String v1 = op2.orElse("CCC");
       System.out.println(v1);
       String v2 = op3.orElse("CCC");
       System.out.println(v2);
       String v3 =  op3.orElseGet(()->{return "ERTY";});
       System.out.println(v3);
       //op3.orElseThrow();
       op3.orElseThrow(()->new IllegalArgumentException("NullError!"));
       
    }
    
}
