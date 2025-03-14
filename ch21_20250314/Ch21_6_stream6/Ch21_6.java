/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ch21_20250314.Ch21_6_stream6;
import java.util.ArrayList;
import java.util.stream.Collectors;
import java.util.Map;
import java.util.List;
/**
 *
 * @author xvpow
 */
public class Ch21_6 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       Item item1 = new Item("A",18);
       Item item2 = new Item("B",17);
       Item item3 = new Item("C",25);
       Item item4 = new Item("D",30);
       Item item5 = new Item("E",18);
       Item item6 = new Item("A",25);
       Item item7 = new Item("E",22);
       Item item8 = new Item("B",76);
       
       ArrayList<Item> dataList = new ArrayList<>();
       dataList.add(item1);
       dataList.add(item2);
       dataList.add(item3);
       dataList.add(item4);
       dataList.add(item5);
       dataList.add(item6);
       dataList.add(item7);
       dataList.add(item8);
      Map<String,Integer> obj =  dataList.stream().collect(Collectors.groupingBy(it->it.getName(), 
               Collectors.summingInt(it->it.getPrice())));
      System.out.println(obj);
       //幫我用name分組
       //幫我將分組好的金額加總
       
    Object itGruop = 
            dataList.stream().collect(Collectors.groupingBy(Item::getName,
                    Collectors.partitioningBy(it->it.getPrice() > 18)));  
    System.out.println(itGruop);
    }
    
}
