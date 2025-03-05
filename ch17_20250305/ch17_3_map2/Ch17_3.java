/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ch17_20250305.ch17_3_map2;
import java.util.HashMap;
import java.util.ArrayList;
import java.util.Set;
/**
 *
 * @author xvpow
 */
public class Ch17_3 {
    public static void main(String[] args) {
        HashMap<String,ArrayList<Integer>> map = new HashMap();
        
        ArrayList<Integer> array1 = new ArrayList();
        array1.add(77);
        array1.add(83);
        array1.add(92);
        
        ArrayList<Integer> array2 = new ArrayList();
        array2.add(51);
        array2.add(62);
        array2.add(94);
        
        ArrayList<Integer> array3 = new ArrayList();
        array3.add(65);
        array3.add(91);
        array3.add(77);
        
        map.put("Ken", array1);
        map.put("Lucy", array2);
        map.put("Iris", array3);
        HashMap<String,Integer> sumMap = new HashMap();
        Set<String> keySet = map.keySet();
        for (String key : keySet){
            ArrayList<Integer> dataList = map.get(key);
            System.out.println(key);
            int sum = 0;
            for (int v : dataList){
                System.out.print(v+" ");
                sum += v;
            }
            sumMap.put(key, sum);
            System.out.println();
        }
        //產生一組Map 
        //Key 是name
        //Value 是加總
        System.out.println(sumMap);
    }
    
}
