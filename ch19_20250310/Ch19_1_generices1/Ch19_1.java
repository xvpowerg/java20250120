/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ch19_20250310.Ch19_1_generices1;
import java.util.ArrayList;

public class Ch19_1 {

    static void printSubList(ArrayList<Test1> list){
        for (Test1 v : list){
            System.out.println(v+" ");
        }
    }
    static void printSub2List(ArrayList<? extends Test1> list){
          for (Test1 v : list){
            System.out.println(v+" ");
        }
          //list.add(new Test1())
    }
    //所有Test2的父類型
    static void printParnetList(ArrayList<? super Test2> list){
        for (Object obj : list){//讀取類型只能是Object
            System.out.println(obj);
        }
        list.add(new Test3());
        list.add(new Test2());
    }
    
    public static void main(String[] args) {
        ArrayList<Test1> list1 = new ArrayList(); 
        list1.add(new Test1());
        list1.add(new Test1());
        list1.add(new Test1());
        printSubList(list1);
        
        ArrayList<Test2> list2 = new ArrayList(); 
        list2.add(new Test2());
        list2.add(new Test3());
        list2.add(new Test2());
        printSub2List(list2);
        
        ArrayList<Test2> list3 = new ArrayList(); 
        list3.add(new Test2());
        list3.add(new Test3());
        list3.add(new Test2());
        printParnetList(list3);
        ArrayList<Test3> list4 = new ArrayList(); 
       // printParnetList(list4);//因為Test3不是Test2的父類型
        
    }
    
}
