/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ch6_20250207.Ch6_1_obj1;

/**
 *
 * @author xvpow
 */
public class PM extends Employee {
    //所有建構式 會預設呼叫super()除非自行呼叫 super() 或 this()
    public PM(String name,int salary){
        super(name,salary);
        this.setName(name);
        this.setSalary(salary);
       
    }
    public void printInfo(){
        System.out.println(this.getName()+
                ":"+this.getSalary());
    }
}
