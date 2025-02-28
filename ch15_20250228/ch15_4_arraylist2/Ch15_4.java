/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ch15_20250228.ch15_4_arraylist2;
import java.util.ArrayList;
/**
 *
 * @author xvpow
 */
public class Ch15_4 {

    static void printList(ArrayList<Integer> list){
        
        for (int i =0; i <list.size()  ;i++){
            System.out.print(list.get(i)+" ");           
        }
        System.out.println();
    }
    
    static boolean inList(Object obj,ArrayList list){
        
        if (list.indexOf(obj) == -1){
            return false;
        }
        return true;
    }
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        list.add(12);
        list.add(25);
        list.add(18);
        list.add(60);
      printList(list);
        list.add(2, 99);        
        printList(list);
        ArrayList<Integer> list2 = new ArrayList<>();
        list2.add(888);
        list2.add(999);
        list2.add(777);
        list.addAll(list2);
         printList(list);
        ArrayList<Integer> list3 = new ArrayList(); 
        list3.add(102);
        list3.add(156);
          list.addAll(3,list3);
         printList(list);  
         list.remove(Integer.valueOf(102));
         printList(list); 
         
         ArrayList<Integer> delList = new ArrayList<>();
         delList.add(60);
         delList.add(888);
         list.removeAll(delList);
         printList(list);         
         list.removeIf(v->v>100);
         printList(list);
         
         list.set(1, 76);
          printList(list);
          list.replaceAll(v->v * 2);
          printList(list);
          list.replaceAll(v->{
              if (v < 100){
                  return v + 5;
              }
              return v;
          });
          printList(list);
          
          int indxe = list.indexOf(198);
          System.out.println(indxe);
          indxe = list.indexOf(77);
          System.out.println(indxe);
          
         System.out.println(inList(198,list));
         System.out.println(inList(77,list));
         
         
          
    }
    
}
