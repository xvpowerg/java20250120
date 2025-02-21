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
public class Test2Class implements Predicate<String> {
    private int len ;
    Test2Class(){
        len = 3;
    }
    Test2Class(int len){
        this.len = len;
    }
    public boolean test(String v1){
        
        
        return v1.length() > len;
    }
}
