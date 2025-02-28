/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ch15_20250228.ch15_5_arraylist3;
import java.util.ArrayList;
/**
 *
 * @author xvpow
 */
public class Ch15_5 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        ArrayList<Item> list = new ArrayList();
        Item item1 = new Item("AAA",12);
        Item item2 = new Item("BBB",13);
        Item item3 = new Item("CCC",14);
        Item item4 = new Item("CCC",14);
        System.out.println(item3.equals(item4));
        list.add(item1);
        list.add(item2);
        list.add(item3);
        System.out.println(item1);
        list.forEach(v->System.out.print(v+" "));
        System.out.println();
        
      System.out.println(list.indexOf(item3));  
       System.out.println(list.indexOf(item4));  
    }
    
}
