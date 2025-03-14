/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ch21_20250314.Ch21_1_stream1;

import java.util.ArrayList;

/**
 *
 * @author xvpow
 */
public class Ch21_1 {

    public static void main(String[] args) {
       ArrayList<Integer> numberList = new ArrayList<>();
       numberList.add(10);
       numberList.add(25);
       numberList.add(12);
       numberList.add(16);
       numberList.add(77);
       
    Integer intValue =    numberList.stream().reduce(5, (v1,v2)->{
       
       System.out.println(v1+":"+v2);
       return v1 + v2;
       });
    
    System.out.println(intValue);
    System.out.println("====================================");
   Integer ans =  numberList.parallelStream().reduce(0, (v1,v2)->{
        
        System.out.println("Acc:"+v1+":"+v2);
        
    return v1 + v2;
    }, (v1,v2)->{
        System.out.println("Cm:"+v1+":"+v2);
        return v1 + v2;
    });
       
   System.out.println(ans);
   
    }
    
}
