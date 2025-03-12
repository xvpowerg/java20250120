/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ch20_20250312.ch20_2_stream2;

import java.util.ArrayList;

/**
 *
 * @author xvpow
 */
public class Ch20_2 {

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
        
        list.stream().skip(2).forEach(v->System.out.println(v));
        System.out.println("=====================");
        list.stream().map(s->s.toUpperCase()).
                forEach(v->System.out.println(v));
        System.out.println("=====================");
        list.stream().mapToInt(s->s.length()).forEach(v->System.out.println(v));
      
    }
    
}
