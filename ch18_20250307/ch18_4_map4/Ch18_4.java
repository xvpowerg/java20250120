/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ch18_20250307.ch18_4_map4;
import java.util.TreeMap;
/**
 *
 * @author xvpow
 */
public class Ch18_4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        TreeMap<Integer,String> treeMap = new TreeMap();
        treeMap.put(18, "A");
        treeMap.put(5, "B");
        treeMap.put(11, "C");
        treeMap.put(7, "D");
        treeMap.forEach((k,v)->{
        System.out.println(k+":"+v);
        });
        
        
    }
    
}
