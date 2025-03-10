/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ch19_20250310.Ch19_2_generices2;
import java.util.ArrayList;
/**
 *
 * @author xvpow
 */
public class Ch19_2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       Test1Class<Integer> tc1 = new Test1Class();
       tc1.test(25);
       //tc1.test("A");
       ArrayList<String> myList = new ArrayList<>();
       Test2Class<String,ArrayList<String>> t2 = 
               new Test2Class(myList);
       t2.test("AA");
       t2.test("BBB");
       t2.test("CC");
       t2.foreach(v->System.out.println(v));
       
    }
    
}
