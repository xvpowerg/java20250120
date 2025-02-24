/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ch13_20250224.ch13_4_lambda4;

/**
 *
 * @author xvpow
 */
public class Ch13_4 {

  
    public static void main(String[] args) {
       String[] data = {"Ken","Lucy","Vivin"};
        
        TestIF3 tf3_1 = (int index)->{
        
                return data[index];
        };
        System.out.println(tf3_1.func3(0));
        //TestIF3 tf3_2 = index -> return data[index];//錯誤
        TestIF3 tf3_2 = index ->  data[index];
        System.out.println(tf3_2.func3(2));
        
    }
    
}
