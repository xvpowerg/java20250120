/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ch10_20250217.Ch10_2_interface2;

/**
 *
 * @author xvpow
 */
public class Person implements Jump,Run {
    public void jumping(){
        System.out.println("Person jumping");
    }
    
    public void runing(){
        System.out.println("Person runing");
    }
}
