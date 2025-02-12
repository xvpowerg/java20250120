/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ch8_20250212.Ch8_4_override4;

/**
 *
 * @author xvpow
 */
public class Apple extends Fruit{
    public Apple(String name,int price){
        super(name,price);
    }
    
    public String toString(){
        return "Apple:"+super.toString();
    }
}
