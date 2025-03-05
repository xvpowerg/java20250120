/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ch17_20250305.ch17_5_map4;

import java.util.HashMap;

/**
 *
 * @author xvpow
 */
public class Ch17_6 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
         HashMap<String,Integer> map = new HashMap<>();
        map.put("A", 100);
        map.put("B", 59);
        map.put("C", 88);
        //key存在會執行 function
        map.compute("A", (key,v1)->{
            System.out.println(key+":"+v1);
        return 81;
        });
        System.out.println(map);
         //key存在不會執行 function
        map.computeIfAbsent("B", (v1)->{
        System.out.println("computeIfAbsent:"+v1);
        return 0;
        });
         //key存在會執行 function       
        map.computeIfPresent("B", (key,v1)->{
        System.out.println(key+":"+v1);
        return v1+10;
        });
         System.out.println(map);
        //key不存在會執行 function   
         map.compute("D", ( key, v1)->{
            System.out.println(key+":"+v1);
        return 81;
        });
         System.out.println(map);
         //key不存在會執行 function   
         map.computeIfAbsent("E", (k)->{
         System.out.println(k);
         return 99;
         });
        System.out.println(map);
        //key不存在不會執行 function
       map.computeIfPresent("F",(v1,v2)->{
       System.out.println(v1+":"+v2);
       return 111;
       } );
    }
    
}
