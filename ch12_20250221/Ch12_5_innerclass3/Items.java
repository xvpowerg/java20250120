/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ch12_20250221.Ch12_5_innerclass3;
import java.util.function.Consumer;
import java.util.ArrayList;
/**
 *
 * @author xvpow
 */
public class Items {
    private ArrayList<Item> list = new ArrayList();
    static class Item{
        private String name;
        private int price;
        Item(String name,int price){
            this.name = name;
            this.price = price;
        }
        
        public String toString(){
            return this.name +":"+this.price;
        }
    }
    
    public void addItem(Item item){
        list.add(item);
    }
    
    public void showItems(Consumer<Item> c){
        for (Item i : list){
            c.accept(i);
        }
    }
}
