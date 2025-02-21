/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ch12_20250221.Ch12_1_interface1;
import java.util.function.UnaryOperator;
import java.util.ArrayList;
public class Ch12_1 {

     static ArrayList<Integer> testOperator(ArrayList<Integer> data,
             UnaryOperator<Integer> op ){
             
         for (int i = 0; i <data.size();i++){
            data.set(i, op.apply(data.get(i)));
         }             
         return data;
         
     }
    public static void main(String[] args) {
       //UnaryOperator
       ArrayList<Integer> data = new ArrayList<>();
       data.add(25);
       data.add(30);
       data.add(45);
       TestOp1 op1 = new TestOp1();
        testOperator(data,op1);
        System.out.println(data);
    }
    
}
