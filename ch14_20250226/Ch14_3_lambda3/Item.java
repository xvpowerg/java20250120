/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ch14_20250226.Ch14_3_lambda3;

/**
 *
 * @author xvpow
 */
public class Item {
    private String name;
    Item(){
        name = "Empty";
    }
    Item(String name){
        this.name = name;
    }
    
    public String toString(){
        return this.name;
    }
}
