/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ch10_20250217.Ch10_5_interface5;

/**
 *
 * @author xvpow
 */
public class Ch10_5 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       Person p1 = new Person();
       Horse horse = new Horse();
       
       Walk walk1 = horse;
       
       walk1.upWalk();
       walk1.downWalk();
       walk1.leftWalk();
       walk1.rightWalk();
       
    }
    
}
