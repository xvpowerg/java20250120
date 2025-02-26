/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ch14_20250226.Ch14_1_lambda1;
import java.util.function.Function;
/**
 *
 * @author xvpow
 */
public class Ch14_1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       TestMethodRef tmr = new TestMethodRef("ABCD");
       Function<Integer,String> func1 = tmr::myFunc;
       System.out.println(func1.apply(5));
    }
    
}
