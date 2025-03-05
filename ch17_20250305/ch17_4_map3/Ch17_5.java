/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ch17_20250305.ch17_4_map3;
import java.util.HashMap;
import java.util.function.BinaryOperator;
public class Ch17_5 {

   public static void merge(HashMap<String,Integer> map,String key,int value,
           BinaryOperator<Integer> biop){
       if (!map.containsKey(key)){
           map.put(key, value);
           return;
       }
      int mValue =  biop.apply(value, map.get(key));
      map.put(key, mValue);
   }
    public static void main(String[] args) {
        HashMap<String,Integer> map = new HashMap<>();
        map.put("A", 100);
        map.put("B", 59);
        map.put("C", 88);
        map.merge("D", 78,(v1,v2)->{//Key不存在新增
        System.out.println(v1);
        System.out.println(v2);    
        return 0;
        });
        System.out.println(map);
        
        map.merge("B", 91, (v1,v2)->{//key存在合併
            System.out.println(v1);
            System.out.println(v2);
            return v1 + v2;
        });
        System.out.println("==========================");
        merge(map,"E",77,(v1,v2)->86);
        System.out.println(map);
        merge(map,"A",81,(v1,v2)->v1+v2);
        System.out.println(map);
    }
    
}
