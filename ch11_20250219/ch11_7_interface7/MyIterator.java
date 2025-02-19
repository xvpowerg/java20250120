/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package ch11_20250219.ch11_7_interface7;
import java.util.function.Consumer;
/**
 *
 * @author xvpow
 */
public interface MyIterator {
    int size();
    Object value(int index);
    default void foreach(Consumer c){
        for(int i =0; i <size();i++){
            c.accept(value(i));
            //System.out.print(value(i));
        }
    }
}
