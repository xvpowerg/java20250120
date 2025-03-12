/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ch20_20250312.ch20_6_stream6;
import java.util.ArrayList;
import java.util.Optional;
/**
 *
 * @author xvpow
 */
public class Ch20_7 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       ArrayList<Integer> numberList = new ArrayList<>();
       numberList.add(10);
       numberList.add(25);
       numberList.add(12);
       numberList.add(16);
       numberList.add(77);
       
      Optional<Integer> ansOp =  numberList.stream().reduce((v1,v2)->{
            System.out.println(v1+":"+v2);
           
           return v1+v2;
       
       });
       System.out.println(ansOp.get());
    }
    
}
