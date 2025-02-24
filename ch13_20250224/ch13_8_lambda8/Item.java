/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ch13_20250224.ch13_8_lambda8;

/**
 *
 * @author xvpow
 */
public class Item {
    private String name;
    private int price;
    
    public Item(String name,int price){
        this.name = name;
        this.price = price;
    }
    
    public String toString(){
        return this.name+":"+this.price;
    }
}
