/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ch18_20250307.ch18_3_map3;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
/**
 *
 * @author xvpow
 */
public class Ch18_3 {

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
       
       HashMap<String,List<Item>> map = new HashMap();
       
       for (Item it :list){
           String key = it.getName();
        //Key存在使用Key對映的List並將Item寫入List
           map.computeIfPresent(key, (k,v)->{
           
               v.add(it);
                return v;
           });
           //Key不存在建立新的List並將Item寫入List
           map.computeIfAbsent(key, (k)->{
           ArrayList<Item> itList = new ArrayList();
           itList.add(it);
           return itList;
           });
           
                      
         
           
       }
       System.out.println(map);
       
    }
    
}
