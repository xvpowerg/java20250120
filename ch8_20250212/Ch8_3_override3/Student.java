/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ch8_20250212.Ch8_3_override3;

/**
 *
 * @author xvpow
 */
public class Student {
    private String name;
    private int age;
    public Student(String name,int age){
        this.name = name;
        this.age = age;
    }
    public Student(String name){
        this(name,0);
    }
    
    public void setName(String name){
        this.name = name;
    }
    public String getName(){
        return this.name;
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
    public boolean equals(Object obj){
        
        if (obj instanceof Student == false){
            return false;
        }
        Student st1 = (Student)obj;
        return this.age == st1.age && this.name.equals(st1.name);
    }
}
