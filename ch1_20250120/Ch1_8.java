/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ch1_20250120;

/**
 *
 * @author xvpow
 */
public class Ch1_8 {

    public static void main(String[] args) {
        int age = 25;
        
        if (age >= 18){
            System.out.println("Pass");
        }else{
            System.out.println("Fail");
        }
        
        String msg = age >= 18 ? "Pass":"Fail";
        System.out.println(msg);
        
        
    }
    
}
