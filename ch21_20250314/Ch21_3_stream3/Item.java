/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ch21_20250314.Ch21_3_stream3;

/**
 *
 * @author xvpow
 */
public class Item {
    private String name;
    private int price;
    
    Item(String name,int price){
        this.name = name;
        this.price = price;
    }
    public String getName(){
        return this.name;
    }
    
    public int getPrice(){
        return this.price;
    }
    
    public String toString(){
        return this.name+":"+this.price;
    }
}
