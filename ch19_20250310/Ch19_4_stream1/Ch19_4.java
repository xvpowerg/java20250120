/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ch19_20250310.Ch19_4_stream1;
import java.util.ArrayList;
/**
 *
 * @author xvpow
 */
public class Ch19_4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        ArrayList<Integer>list = new ArrayList<>();
        list.add(10);
        list.add(15);
        list.add(17);
        list.add(22);
        list.add(18);
        list.add(14);
        //列出在這個list內的所有偶數
        for(Integer v  : list){
            if (v % 2 == 0){
                System.out.println(v);
            }
        }
        System.out.println("======================");
        list.forEach(v->{
            if (v % 2 == 0 ){
                 System.out.println(v);
            }
           });
        System.out.println("===========使用Stream SOP============");
        list.stream().filter(v->v % 2 == 0).
                forEach(System.out::println);
        
    }
    
}
