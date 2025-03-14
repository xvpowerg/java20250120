/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ch21_20250314.Ch21_5_stream5;
import java.util.ArrayList;
import java.util.Map;
import java.util.List;
import java.util.stream.Collectors;
/**
 *
 * @author xvpow
 */
public class Ch21_5 {

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
     
      Map<String,List<Item>> group = 
              dataList.stream().collect(Collectors.groupingBy(it->it.getName()));
      System.out.println(group);
      
       Map<String,Long> countMap = 
               dataList.stream().collect(Collectors.groupingBy(it->it.getName(),
                  Collectors.counting()));
       System.out.println(countMap);
       
      Map<Boolean,List<Item>>  pMap =  dataList.stream().
                collect(Collectors.partitioningBy(it->it.getPrice() > 20));
      System.out.println(pMap);
      
    }
    
}
