/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ch10_20250217.Ch10_6_interface6;

/**
 *
 * @author xvpow
 */
public class FruitBasket implements Iterator {
    private String  basketId ;
    private String[] fruits = new String[3];
    private int index = -1;
    FruitBasket(String basketId){
        this.basketId = basketId;
    }
    public void addFruit(String fruit){
        fruits[++index] = fruit;
    }
    
   public int size(){
       return fruits.length;
   }
   public Object values(int index){
       return fruits[index];
   }
    
}
