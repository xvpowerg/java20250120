/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ch19_20250310.Ch19_10_stream5;

import java.util.ArrayList;

/**
 *
 * @author xvpow
 */
public class Ch19_10 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();
       list.add("Ken");
       list.add("Viivn");
       list.add("Lucy");
       list.add("Joy");
       list.stream().peek(v->System.out.println("peek:"+v)).allMatch(v->v.length() >2);
       System.out.println(list);
       //allMatch遇見false的條件停止
        list.stream().peek(v->System.out.println("peek:"+v)).allMatch(v->v.length() >3);
        System.out.println("======================");
        list.stream().peek(v->
                System.out.println("anyMatch peek:"+v)).anyMatch(v->v.length() <2);
         System.out.println("======================");
        list.stream().peek(v->
                System.out.println("anyMatch peek:"+v)).anyMatch(v->v.length() > 3);
              System.out.println("======================");
        list.stream().peek(v->
                System.out.println("noneMatchpeek:"+v)).noneMatch(v->v.length() <2);
         System.out.println("======================");
        list.stream().peek(v->
                System.out.println("noneMatch peek:"+v)).noneMatch(v->v.length() > 3);
    }
    
}
