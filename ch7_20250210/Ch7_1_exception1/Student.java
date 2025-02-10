/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ch7_20250210.Ch7_1_exception1;

/**
 *
 * @author xvpow
 */
public class Student {
    private String name;
    private int age;
    Student(String name){
        this.name = name;
    }
    public void setAge(int age){
        //年齡如果小於0 大於200歲 顯示Error
        if(age < 0 || age > 200){
            System.out.println("Error");
            throw new RuntimeException("Error");
            //return;
        }
        this.age = age;
    }
    
    public int getAge(){
         return age;
    }
    public void printInfo(){
        System.out.println(this.name+":"+this.getAge());
    }
}
