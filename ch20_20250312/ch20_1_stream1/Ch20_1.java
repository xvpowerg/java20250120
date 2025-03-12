/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ch20_20250312.ch20_1_stream1;
import java.util.ArrayList;
import java.util.Optional;
/**
 *
 * @author xvpow
 */
public class Ch20_1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
      ArrayList<String> list = new ArrayList<>();
         list.add("Ben");
      list.add("Ken");
      list.add("Vivin");
      list.add("Lucy");
      list.add("Iris");
      list.add("AA");
      list.add("Joy");
       list.add("BBB");
      list.add("Lucy");
      list.add("Vivin");
      long count = list.stream().count();
      System.out.println(count);
      list.stream().distinct().forEach(v->System.out.print(v+" "));//過濾重複
      System.out.println();
    Optional<String> op1 = list.stream().findAny();//無parallel狀態下findAny跟findFirst是一樣的
    Optional<String> op2 =  list.stream().findFirst();
    System.out.println(op1.get());
    System.out.println(op2.get());
    Optional<String> op3 = list.parallelStream().findAny();//parallel狀態下findAny不一定是哪一筆
    Optional<String> op4 =  list.stream().findFirst();
    System.out.println("===================================");
    System.out.println(op3.get());
    System.out.println(op4.get());
    
   Optional<String> op5  = 
           list.stream().parallel().filter(v->v.length()>3).sequential().findFirst();
    System.out.println(op5.get());
    
    
    }
    
}
