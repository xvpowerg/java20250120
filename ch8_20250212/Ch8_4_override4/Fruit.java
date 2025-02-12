/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ch8_20250212.Ch8_4_override4;

/**
 *
 * @author xvpow
 */
public class Fruit {
    private String name;
    private int price;
    
    public Fruit(String name,int price){
        this.name = name;
        this.price = price;
    }
    public String toString(){
        return this.name+":"+this.price;
    }
}
