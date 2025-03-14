/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ch21_20250314.Ch21_2_stream2;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.HashSet;
import java.util.TreeSet;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;
/**
 *
 * @author xvpow
 */
public class Ch21_2 {

   
    public static void main(String[] args) {
       ArrayList<Integer> numberList = new ArrayList<>();
       numberList.add(10);
       numberList.add(25);
       numberList.add(12);
       numberList.add(16);
       numberList.add(77);
       numberList.add(56);
       numberList.add(13);
       numberList.add(12);
       numberList.add(77);
       
      List<Integer> valueList = numberList.stream().filter(v->v % 2 == 0).
               collect(Collectors.toList());
       
       System.out.println(valueList);
       
       LinkedList<Integer> intList = 
               numberList.stream().filter(v->v > 12).
               collect(Collectors.toCollection(()->new LinkedList<>()));        
        System.out.println(intList);
        //找出所有數字中小於18的 不可重複
        HashSet<Integer> intSet = numberList.stream().filter(v->v<18).
                collect(Collectors.toCollection(HashSet::new));
        System.out.println(intSet);
        ////找出所有數字中小於18的 不可重複 大到小排序
     TreeSet<Integer> treeNumberSet =  numberList.stream().filter(v->v < 18).
                collect(Collectors.toCollection(()->{
                   Comparator<Integer> cmp =
                           Comparator.comparing(v->v);
                    TreeSet<Integer> treeSte = new TreeSet<>(cmp.reversed());                
                    return treeSte;
                }));
      System.out.println("=====================");
      System.out.println(treeNumberSet);
      
        
    }
    
}
