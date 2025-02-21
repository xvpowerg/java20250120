/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ch12_20250221.Ch12_2_interface2;
import java.util.function.Predicate;
/**
 *
 * @author xvpow
 */
public class TestClass implements Predicate<String> {
    
    public boolean test(String data){        
        return data.length() > 3;
    }
}
