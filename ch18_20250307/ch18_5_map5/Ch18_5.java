/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ch18_20250307.ch18_5_map5;
import java.util.TreeMap;
import java.util.Comparator;
/**
 *
 * @author xvpow
 */
public class Ch18_5 {

    private static class MyComparator implements Comparator<MyKey>{
        private int reversed = 1;
        
        public MyComparator(){
            
        }
        public MyComparator(int reversed){
            this.reversed = reversed;
        }
        
        public int compare(MyKey v1,MyKey v2){
           
            int cmp =  v1.getValue1() - v2.getValue1();
            if(cmp == 0){
                cmp = v1.getValue2() - v2.getValue2();
            }
            if(cmp == 0){
                cmp = v1.getMsg().compareTo(v2.getMsg());
            } 
           return cmp * this.reversed;
        }
       
    }
    public static void main(String[] args) {
       MyKey key1 = new MyKey(10,20,"A");
       MyKey key2 = new MyKey(10,25,"B");
       MyKey key3 = new MyKey(15,20,"C");
       MyKey key4 = new MyKey(15,27,"D");
       MyKey key5 = new MyKey(10,20,"E");
       MyComparator cmp = new MyComparator(-1);
       
       TreeMap<MyKey,String> treeMap = new TreeMap(cmp);
       treeMap.put(key1, "Key1");
       treeMap.put(key2, "key2");
       treeMap.put(key3, "key3");
       treeMap.put(key4, "key4");
       treeMap.put(key5, "key5");
       System.out.println(treeMap);
       
    }
    
}
