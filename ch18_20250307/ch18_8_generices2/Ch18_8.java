/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ch18_20250307.ch18_8_generices2;
import java.util.ArrayList;
/**
 *
 * @author xvpow
 */
public class Ch18_8 {
    //一般的泛型不支持多型
    static void testMyList(ArrayList<Test1> myList){
        System.out.println(myList);
    }
    //唯讀支持多型
    static void testMyList2(ArrayList<? extends Test1> myList){
        for(Test1 t : myList){
           System.out.println(t);
        }
        //myList.add(new Test1());
    }
    public static void main(String[] args) {
        ArrayList<Test1> myList2 = new ArrayList();
        testMyList(myList2);
        ArrayList<Test2> myList3 = new ArrayList();
        myList3.add(new Test3());
        myList3.add(new Test2());
        testMyList2(myList3);
        
    }
    
}
