/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ch19_20250310.Ch19_6_stream3;
import java.util.ArrayList;
import java.util.stream.Stream;
public class Ch19_6 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //Stream 規則
        //只能使用一次
        //惰性lazy  終端terminal 
        //不會改原始資料
        ArrayList<String> list = new ArrayList(); 
        list.add("AAA");
        list.add("BBB");
        list.add("CC");
        list.add("D");
        Stream<String> st1 = list.stream();
        st1.forEach(v->System.out.print(v+" "));
        System.out.println();
       // st1.forEach(v->System.out.println(v));//Stream只能使用一次
       
       //惰性lazy  終端terminal 
       long count = 
               list.stream().peek(v->System.out.println("peek:"+v)).
                       filter(v->v.length() > 0).count();
       System.out.println(count);
       
       list.stream().filter(p->p.length() > 2).forEach(v->System.out.println(v));
       System.out.println();
       System.out.println(list);
       
        
    }
    
}
