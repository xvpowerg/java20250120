/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ch18_20250307.ch18_1_map1;
import java.util.ArrayList;
import java.util.Map;
import java.util.List;
import java.util.HashMap;
/**
 *
 * @author xvpow
 */
public class Ch18_1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       ArrayList<Item> list = new ArrayList<>();
       Item i1 = new Item("A",100);
       Item i2 = new Item("B",150);
       Item i3 = new Item("C",70);
       Item i4 = new Item("A",120);
       Item i5 = new Item("B",110);
       list.add(i1);
       list.add(i2);
       list.add(i3);
       list.add(i4);
       list.add(i5);
       Map<String,List<Item>> group = new HashMap();
      for (Item it : list){
          String name = it.getName();
          List<Item> dataList ;
          if(group.containsKey(name)){
              dataList = group.get(name);
          }else{
             dataList = new ArrayList();
          }
          dataList.add(it);
          group.put(name, dataList);
      }
      
      System.out.println(group);
       
    }
    
}
