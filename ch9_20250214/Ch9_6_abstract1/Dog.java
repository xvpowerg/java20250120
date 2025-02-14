/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ch9_20250214.Ch9_6_abstract1;

/**
 *
 * @author xvpow
 */
public  class Dog extends Animal {
    Dog(String name,int age){
        super(name,age);
    }
    public void bark(){
        System.out.println("HoHo!!");
    }
}
