/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ch12_20250221.Ch12_6_innerclass4;
import java.util.function.Function;
import  java.util.ArrayList;
import ch12_20250221.Ch12_6_innerclass4.Items.Item;
/**
 *
 * @author xvpow
 */
public class Ch12_6 {

    
    public static void main(String[] args) {
       Items items = new Items();
       items.addItem(new Items.Item("GGGGGG",10));
       items.addItem(new Items.Item("BB",20));
       items.addItem(new Items.Item("CCC",30));
       
       
     Integer sumInt =   items.calculatItems(new Function<Item,Integer>(){
           
           public Integer apply(Item it){
               return it.getPrice();
           }
       }, new Function<ArrayList<Integer>,Integer>(){
       
            public Integer apply(ArrayList<Integer> list){
                int sum  = 0;
                
                for (Integer v : list){
                    sum += v;
                }
                return sum;
            }
       
       });
     System.out.println(sumInt);
    }
    
}
