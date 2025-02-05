/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ch5_20250205.Ch5_4_object4;

/**
 *
 * @author xvpow
 */
public class Animal {
    private String name;
    private int height;
    private float weight;
    Animal(){
        
    }
    Animal(String inName,int inHeight,float inWeight){
        name = inName;
        height = inHeight;
        weight = inWeight;
    }
    public void setName(String inName){
        name = inName;
    }
    
    public String getName(){
        return name;
    }
    
    public void setWeight(float w){
        weight = w;
    }
    
    public float getWeight(){
        return weight;
    }
    
    public void setHeight(int h){
        height = h;
    }
    
    public int getHeight(){
        return height;
    }
    
    public void printInfo(){
        System.out.println(getName()+":"+getHeight()+":"+getWeight());
    }
    
}
