/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ch6_20250207.Ch6_1_obj1;

public class Employee {
    private String name;
    private int salary;
 
    Employee(String name,int salary){
        this.name = name;
        this.salary = salary;
    }
    
    //this 當前物件
    public void setName(String name){
        this.name = name;
    }
    public String getName(){
        return name;
    }
    public void setSalary(int salary){
        this.salary = salary;
    }
    
    public int getSalary(){
        return salary;
    }
    public void printInfo(){
        System.out.println(getName()+":"+getSalary());
    }
}
