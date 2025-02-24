/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ch13_20250224.ch13_6_lambda6;
import java.util.function.Consumer;
/**
 *
 * @author xvpow
 */
public class Ch13_6 {

    static void printStrings(Consumer<String> c ,String ... values){
        
        for (String v : values){
            c.accept(v);
        }
    }
    public static void main(String[] args) {
        // TODO code application logic here
        printStrings((String s)->{
            System.out.println(s);
        },"A","B","C","D");
        printStrings(s->System.out.print(s),"A","B","C","D");
    }
    
}
