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
public class Product  extends Item implements Serializable{
    private float weight;
    private float height;
    
    Product(String name,int price,float weight,float height){
        super(name,price);
        this.weight = weight;
        this.height = height;
    }
    public String toString(){
        return super.toString()+":"+this.weight+":"+this.height;
    }
    //幫我更正
    //
}
