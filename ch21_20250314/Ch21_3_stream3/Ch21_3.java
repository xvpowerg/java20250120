/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ch21_20250314.Ch21_3_stream3;
import java.util.ArrayList;
import java.util.Map;
import java.util.stream.Collectors;
/**
 *
 * @author xvpow
 */
public class Ch21_3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       Item item1 = new Item("A",18);
       Item item2 = new Item("B",17);
       Item item3 = new Item("C",25);
       Item item4 = new Item("D",30);
       Item item5 = new Item("E",18);
       
       ArrayList<Item> dataList = new ArrayList<>();
       dataList.add(item1);
       dataList.add(item2);
       dataList.add(item3);
       dataList.add(item4);
       dataList.add(item5);
       
       Map<String,Item> itemMap = 
               dataList.stream().collect(Collectors.toMap(it->it.getName(),
               it->it));
       System.out.println(itemMap);
    }
    
}
