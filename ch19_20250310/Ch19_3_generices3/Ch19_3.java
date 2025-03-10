/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ch19_20250310.Ch19_3_generices3;
import java.util.function.UnaryOperator;
/**
 *
 * @author xvpow
 */
public class Ch19_3 {

    //依我傳入的類型決定回傳類型
    static <T> T getValue(T v){
        return v;
    }
    
    static <T> T addValue(T v,UnaryOperator<T>op){
        return op.apply(v);
    }
    
    public static void main(String[] args) {
       String s1 = getValue("String");
       Integer v2 = getValue(25);
       System.out.println(s1);
       System.out.println(v2);
       Integer v3 = addValue(25,v->v+6);
       System.out.println(v3);
       float v4 =  addValue(1.52f,v->v*3);
       System.out.println(v4);
    }
    
}
