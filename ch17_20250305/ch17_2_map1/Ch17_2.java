/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ch17_20250305.ch17_2_map1;
import java.util.HashMap;
import java.util.Set;
public class Ch17_2 {

   static void put(HashMap<String,Integer> myMap,String key,int value){
       if (!myMap.containsKey(key)){
          myMap.put(key, value);
       }
   }
   
   static int getDefault(HashMap<String,Integer> myMap,String key,int defValue){
       if (myMap.containsKey(key)){
           return myMap.get(key);
       }
       return defValue;
   }
    public static void main(String[] args) {
        HashMap<String,Integer> myMap = new HashMap<>();
        myMap.put("Ken",100);
        myMap.put("Vivin",75);
        myMap.put("Lucy",93);
        System.out.println(myMap.get("Vivin"));
        Set<String> keySet = myMap.keySet();
        for (String key : keySet){
            System.out.println(key+":"+myMap.get(key));
        }
        boolean b1 = myMap.containsKey("Lucy");
        System.out.println(b1);
        boolean b2 = myMap.containsKey("Joy");
        System.out.println(b2);
        myMap.put("Lucy", 85);
        myMap.forEach((k,v)->System.out.println(k+":"+v));
        System.out.println("======================");
        put(myMap,"Lucy",72);
        put(myMap,"Iris",93);
        myMap.forEach((k,v)->System.out.println(k+":"+v));
        System.out.println("======================");
        myMap.putIfAbsent("Ken", 51);//key不存在才put
        myMap.forEach((k,v)->System.out.println(k+":"+v));
        myMap.putIfAbsent("Lindy", 51);//key不存在才put
        System.out.println("======================");
        myMap.forEach((k,v)->System.out.println(k+":"+v));
        
        int vx = myMap.getOrDefault("Sean",0);
        System.out.println(vx);
        int v2 = getDefault(myMap,"Yumi",-2);
        System.out.println(v2);
        int v3 = getDefault(myMap,"Iris",-2);
        System.out.println(v3);
    }
    
}
