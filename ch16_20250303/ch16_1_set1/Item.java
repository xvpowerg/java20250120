/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ch16_20250303.ch16_1_set1;

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
        if (obj instanceof Item == false){
            return false;
        }
        Item tmpObj =  (Item)obj;
        
        return this.price == tmpObj.price && 
                this.name.equals(tmpObj.name);
    }
    
    public int hashCode(){
        return this.price+this.name.hashCode();
    }
}
