/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ch19_20250310.Ch19_9_stream4;
import java.util.ArrayList;
/**
 *
 * @author xvpow
 */
public class Ch19_9 {

    
    public static void main(String[] args) {
       ArrayList<String> list = new ArrayList<>();
       list.add("Ken");
       list.add("Viivn");
       list.add("Lucy");
       list.add("Joy");
       boolean b1 =  list.stream().allMatch(v->v.length() >2);//所有都要符合條件才回傳true
       System.out.println(b1);
       boolean b2 =  list.stream().allMatch(v->v.length() >3);//所有都要符合條件才回傳true
       System.out.println(b2);
       
       boolean b3 = list.stream().anyMatch(v->v.length() > 3);
         System.out.println(b3);
        boolean b4 = list.stream().anyMatch(v->v.length() < 2);
         System.out.println(b4);
         
       boolean b5 =  list.stream().noneMatch(v->v.length() < 2);
       System.out.println(b5);
       boolean b6 = list.stream().noneMatch(v->v.length() > 3);
         System.out.println(b6);
    }
    
}
