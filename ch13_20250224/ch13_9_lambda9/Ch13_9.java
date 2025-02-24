/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ch13_20250224.ch13_9_lambda9;
import java.util.ArrayList;
import java.util.function.UnaryOperator;
import java.util.function.Predicate;
public class Ch13_9 {

    static void testList(ArrayList<Integer> values,UnaryOperator<Integer> op){
        for (int i = 0; i < values.size();i++){
            Integer v = values.get(i);
            Integer newV =  op.apply(v);
            values.set(i, newV);
        }
    }
    
    static void filter(ArrayList<Integer> list,Predicate<Integer> p){
        for (Integer v : list){
            if (p.test(v)){
                System.out.println(v);
            }
        }
    }
    public static void main(String[] args) {
        ArrayList<Integer> list1 = new ArrayList<>();
        ArrayList<Integer> list2 = new ArrayList<>();
        list1.add(5);
        list1.add(6);
        list1.add(7);  
        list2.add(100);
        list2.add(110);
        list2.add(115);
        testList(list1,v->v*2);
        testList(list2,v->v-3);
        System.out.println(list1);
        System.out.println(list2);
        //*2
        //-3
        ArrayList<Integer> list3 = new ArrayList();
        list3.add(10);
        list3.add(5);
        list3.add(3);
        list3.add(7);
        list3.add(2);
        filter(list3,v->v>3);
        filter(list3,v->v>2);
        
    }
    
}
