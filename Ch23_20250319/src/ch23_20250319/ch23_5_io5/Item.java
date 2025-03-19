/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ch23_20250319.ch23_5_io5;

import java.io.Serializable;

/**
 *
 * @author xvpow
 */
public class Item  implements Serializable {
    private String name;
    private int price;
    private Company  company;
    
    Item(String name,String companyName,int price){
        this.name = name;
        this.price = price;
        this.company = new Company(companyName);
    }
    Item(){}
    public String toString(){
        return name+":"+price+":"+company;
    }
}
