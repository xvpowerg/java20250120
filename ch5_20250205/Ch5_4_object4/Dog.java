/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ch5_20250205.Ch5_4_object4;

/**
 *
 * @author xvpow
 */
public class Dog extends Animal {
    Dog(){
        
    }
    Dog(String name,int h,float w){
        setName(name);
        setHeight(h);
        setWeight(w);
    }
    
    //複寫 Override
    @Override
    public void printInfo(){
       System.out.print("Dog:");
       super.printInfo();//呼叫父類別的printInfo
    }
}
