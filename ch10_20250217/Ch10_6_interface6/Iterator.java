/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package ch10_20250217.Ch10_6_interface6;

/**
 *
 * @author xvpow
 */
public interface Iterator {
    int size();
    Object values(int index);
    default void foreach(){
        for (int i = 0; i < size();i++){
           Object obj = values(i);
           System.out.println(obj);
        }
    }
    
    static void printValues(Iterator it){
        it.foreach();
    }
}
