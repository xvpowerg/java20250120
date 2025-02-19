/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ch11_20250219.ch11_7_interface7;

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
        return this.name +":" + this.price;
    }
}
