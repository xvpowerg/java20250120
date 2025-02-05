/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ch5_20250205.Ch5_3_object3;

/**
 *
 * @author xvpow
 */
public class Item {
    private String id;
    private int price;
    //建構式
    Item(){
        //inPrice -1
        //id = 000
        this("000",-1);
    }
    Item(String inId,int inPrice){
        id = inId;
        price = inPrice;
    }
    Item(String inId){
        //id = inId;
        this(inId,0);
    }
    public void setId(String inId){
        id = inId;
    }
    public String getId(){
        return id;
    }
    public void setPrice(int inPrice){
        price = inPrice;
    }
    public int getPrice(){
        return price;
    }
    
    public void printInfo(){
        System.out.println(getId()+":"+getPrice());
    }
}
