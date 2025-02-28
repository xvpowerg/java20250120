/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ch15_20250228.ch15_3_arraylist1;
import java.util.ArrayList;
/**
 *
 * @author xvpow
 */
public class Ch15_3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       ArrayList myList = new ArrayList();
       myList.add("Test");
       myList.add(15);
       myList.add(20);
       for(int i =0; i < myList.size();i++){
           System.out.println(myList.get(i));
       }
       
       for (Object obj : myList){
           System.out.println(obj);
       }
       
       ArrayList<Integer> list2 = new ArrayList<>();
       list2.add(10);
       list2.add(50);
       list2.add(25);
       int sum = 0;
       for (int v : list2){
           System.out.println(v);
           sum += v;
       }
       System.out.println(sum);
    }
    
}
