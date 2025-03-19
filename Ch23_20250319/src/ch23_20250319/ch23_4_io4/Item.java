/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ch23_20250319.ch23_4_io4;

import java.io.Serializable;

/**
 *
 * @author xvpow
 */
public class Item  {
    private String name;
    private int price;
    Item(String name,int price){
        this.name = name;
        this.price = price;
    }
    Item(){
        
    }
    public String toString(){
        return name+":"+price;
    }
}
