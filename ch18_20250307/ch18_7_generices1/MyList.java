/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ch18_20250307.ch18_7_generices1;
import java.util.ArrayList;
import java.util.function.Consumer;

public class MyList<T> {
    private ArrayList<T> myList = new ArrayList<>();
    
    public void add(T data){
        myList.add(data);
    }
    
    public T get(int index){
        return myList.get(index);
    }
    
    public void foreach(Consumer<T> c){
        for (int i = 0; i <myList.size(); i++){
             c.accept(myList.get(i));
        }
    }
}
