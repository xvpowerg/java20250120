/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ch10_20250217.Ch10_5_interface5;

/**
 *
 * @author xvpow
 */
public class Person implements Walk {
    public void walk(int action){
        
        switch(action){
            case Walk.UP:
                System.out.println("Person UP");
                break;
            case Walk.DOWN:
                System.out.println("Person DOWN");
                break;
            case  Walk.LEFT:
                System.out.println("Person LEFT");
                break;
             case  Walk.RIGHT:
                System.out.println("Person RIGHT");
                break;    
        }
        
    }
}
