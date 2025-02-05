/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ch5_20250205.Ch5_4_object4;

/**
 *
 * @author xvpow
 */
public class Cat extends Animal {
    Cat(){}
    
    Cat(String name,int h,float w){
        super(name,h,w);
    }
    
    @Override
    public void printInfo(){
        System.out.print("Cat:");
        super.printInfo();
    }
    
}
