/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ch16_20250303.ch16_3_set3;
import java.util.TreeSet;
/**
 *
 * @author xvpow
 */
public class Ch16_3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        TreeSet<Integer> treeSet = new TreeSet<>();
        treeSet.add(15);
        treeSet.add(2);
        treeSet.add(71);
        treeSet.add(8);
        treeSet.add(36);
        System.out.println(treeSet);//小到大排序
        System.out.println(treeSet.first());
        System.out.println( treeSet.last());
      
      System.out.println(treeSet.floor(9));
      System.out.println(treeSet.lower(9));
      System.out.println(treeSet.floor(8));//<=8
      System.out.println(treeSet.lower(8));//<8
               
      System.out.println(treeSet.ceiling(14));
      System.out.println(treeSet.higher(14));
      System.out.println(treeSet.ceiling(15));//>=15
      System.out.println(treeSet.higher(15));//> 15
      
      //小寫 > 大寫 > 數字
      TreeSet<String> treeSetStr = new TreeSet<>();
      treeSetStr.add("cV1");
      treeSetStr.add("cV2");
      treeSetStr.add("gV2");
      treeSetStr.add("Zv0");
      treeSetStr.add("Ab1");
      System.out.println(treeSetStr);
    }
    
}
