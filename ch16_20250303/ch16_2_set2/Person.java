/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ch16_20250303.ch16_2_set2;

/**
 *
 * @author xvpow
 */
public class Person {
    private String name;
    private int age;
    Person(String name,int age){
        this.age = age;
        this.name = name;
    }
    public String toString(){
        return this.name+":"+this.age;
    }
    
    public boolean equals(Object obj){
        if (obj instanceof Person == false){
            return false;
        }
        Person tmpObj = (Person)obj;
        return this.age == tmpObj.age && 
                this.name.equals(tmpObj.name);
    }
    
    public int hashCode(){
        return this.age + this.name.hashCode();
    }
}
