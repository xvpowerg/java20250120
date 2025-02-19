/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ch11_20250219.ch11_7_interface7;
import java.util.function.Consumer;
/**
 *
 * @author xvpow
 */
public class MyShowItem2 implements Consumer  {
    public void accept(Object obj){
        System.out.println(obj);
    }
}
