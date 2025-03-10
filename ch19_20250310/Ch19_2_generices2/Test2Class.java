/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ch19_20250310.Ch19_2_generices2;
import java.util.List;
import java.util.function.Consumer;
/**
 *
 * @author xvpow
 */
public class Test2Class<E,T extends List<E>> {
    private T myList;
    Test2Class(T myList){
        this.myList = myList;
    }
    public void test(E e){
       myList.add(e);
    }
    public void foreach(Consumer<E> c){
        this.myList.forEach(c);
    }
}
