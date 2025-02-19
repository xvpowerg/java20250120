/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ch11_20250219.ch11_9_interface9;
import java.util.function.Function;
/**
 *
 * @author xvpow
 */
public class MyFuncToInteger implements Function<String,Integer>{
    
    public Integer apply(String s){
        return Integer.valueOf(s);
    }
}
