/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ch18_20250307.ch18_2_map2;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
/**
 *
 * @author xvpow
 */
public class Ch18_2 {

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
       
       HashMap<String,List<Item>> group = new HashMap<>();
        for(Item item : list){
            ArrayList<Item> dataList = new ArrayList();
            dataList.add(item);
           group.merge(item.getName(), dataList, (d1,d2)->{
           
               //System.out.println(d1);//map內的資料
               //System.out.println(d2);//新的資料
              // System.out.println("=================");
               d1.addAll(d2);
               return d1;
           
           }); 
        }
        System.out.println(group);
    }
    
}
