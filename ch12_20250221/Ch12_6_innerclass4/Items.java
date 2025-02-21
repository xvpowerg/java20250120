/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ch12_20250221.Ch12_6_innerclass4;
import java.util.function.Consumer;
import java.util.ArrayList;
import java.util.function.Function;

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
       public int getPrice(){
           return price;
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
    
  
    
    public Integer calculatItems(Function<Item,Integer> fun,
            Function<ArrayList<Integer>,Integer> op){
        ArrayList<Integer> priceList = new ArrayList<>();
        for (Item i : list){
            priceList.add(fun.apply(i));
        }
        return op.apply(priceList);
    } 
}
