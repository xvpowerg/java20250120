/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ch9_20250214.Ch9_6_abstract1;

/**
 *
 * @author xvpow
 */
//方法抽象類別一定是抽象的
public abstract class Animal {
    private String name;
    private int age;
    public Animal(String name,int age){
        this.name = name;
        this.age = age;
    }
    public void setName(String name){
       this.name = name;
    }
    public String getName(){
       return this.name ;
    }
    
    public void setAge(int age){
        this.age = age;
    }
    public int getAge(){
        return this.age;
    }
    
    public String toString(){
        return this.getName()+":"+this.getAge();
    }
    
    public abstract void bark();
}
