/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ch5_20250205.Ch5_2_object2;

/**
 *
 * @author xvpow
 */
public class Person {
    private String name;
    private int age;
    
    public void setName(String inName){
        if (inName == null || inName.length() == 0 ){
            System.out.println("Error!"+inName);
            return;
        }
        name = inName;
    }
    
    public String getName(){
        return name;
    }
    
    public void setAge(int inAge){
        if(inAge < 0 || inAge > 200){
            System.out.println("Error!:"+inAge);
            return;
        }
        age = inAge;
    }
    public int getAge(){
        return age;
    }
    void printInfo(){
        System.out.println(getName()+":"+getAge());
    }
}
