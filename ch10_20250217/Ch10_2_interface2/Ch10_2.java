/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ch10_20250217.Ch10_2_interface2;

/**
 *
 * @author xvpow
 */
public class Ch10_2 {


    public static void main(String[] args) {
       
        Person p1 = new Person();
        Jump j1 = p1;
        Run run1 = p1;
        j1.jumping();
        run1.runing();
        
    }
    
}
