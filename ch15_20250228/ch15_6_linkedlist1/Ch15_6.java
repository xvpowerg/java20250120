/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ch15_20250228.ch15_6_linkedlist1;
import java.util.LinkedList;
/**
 *
 * @author xvpow
 */
public class Ch15_6 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       LinkedList<String> myList = new LinkedList<>();
       myList.add("A");
       myList.add("B");
       myList.add("C");
       myList.add("D");
       myList.forEach(v->System.out.println(v));
       myList.addFirst("100");
       myList.addLast("200");
       System.out.println("==============");
       myList.forEach(v->System.out.println(v));
       String s1 = myList.peek();
        System.out.println("==============");
       myList.forEach(v->System.out.println(v));
       System.out.println(s1);
       System.out.println("=======pop=======");
       String s2 = myList.pop();
       myList.forEach(v->System.out.println(v));
       System.out.println(s2);
       System.out.println("==============");
       
       while(true){
           try{
               String v = myList.pop();
               System.out.println(v);
           }catch(Exception ex){
               System.out.println(ex);
               break;
           }           
       }
       
       
    }
    
}
