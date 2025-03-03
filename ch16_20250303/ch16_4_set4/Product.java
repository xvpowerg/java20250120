/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ch16_20250303.ch16_4_set4;

/**
 *
 * @author xvpow
 */
public class Product implements Comparable<Product> {
    private String name;
    private int price;
    Product(String name,int price){
        this.name = name;
        this.price = price;
    }
    public String toString(){
        return this.name+":"+this.price;
    }
    
    public int compareTo(Product p){
        //現在大於傳入回傳正數
        //現在小於傳入回傳負數
        //依樣回傳0
        if (this.price > p.price){
            return 1;
        }else if(this.price < p.price){
            return -1;
        }
        
        return this.name.compareTo(p.name);
    }
}
