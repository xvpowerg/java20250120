/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ch15_20250228.ch15_5_arraylist3;

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
    
    public boolean equals(Object obj){
        Item i1 = (Item)obj;
        return this.price == i1.price &&  this.name.equals(i1.name);
    }
}
