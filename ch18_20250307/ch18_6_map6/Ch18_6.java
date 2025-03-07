/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ch18_20250307.ch18_6_map6;
import java.util.TreeMap;

import java.util.Comparator;
/**
 *
 * @author xvpow
 */
public class Ch18_6 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       MyKey key1 = new MyKey(10,20,"A");
       MyKey key2 = new MyKey(10,25,"B");
       MyKey key3 = new MyKey(15,20,"C");
       MyKey key4 = new MyKey(15,27,"D");
       MyKey key5 = new MyKey(10,20,"E");
       Comparator<MyKey> myKeyComp = Comparator.comparing(k->k.getValue1());
       myKeyComp = myKeyComp.thenComparing(k->k.getValue2()).
               thenComparing(k->k.getMsg());
       TreeMap<MyKey,String> treeMap = new TreeMap(myKeyComp.reversed());
       treeMap.put(key1, "Key1");
       treeMap.put(key2, "key2");
       treeMap.put(key3, "key3");
       treeMap.put(key4, "key4");
       treeMap.put(key5, "key5");
       System.out.println(treeMap);
       
       
    }
    
}
