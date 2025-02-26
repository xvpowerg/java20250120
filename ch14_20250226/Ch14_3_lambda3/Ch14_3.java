/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ch14_20250226.Ch14_3_lambda3;
import java.util.function.Supplier;
import java.util.function.Function;

public class Ch14_3 {
    
    static Item  newEmptyItem(Supplier<Item> s){
        return s.get();
    }
    static Item newItem(String name,Function<String,Item> func){
        return func.apply(name);
    }
        
    public static void main(String[] args) {
       //Item i1 = new Item();
       Item i2 = new Item("AAA");
      // System.out.println(i1);
       System.out.println(i2);
       
       Item i3 = newEmptyItem(Item::new);
       Item i4 = newItem("BBB",Item::new);
       System.out.println(i3);
       System.out.println(i4);
       
       
       
    }
    
}
