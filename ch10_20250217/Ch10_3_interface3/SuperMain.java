/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ch10_20250217.Ch10_3_interface3;

/**
 *
 * @author xvpow
 */
public class SuperMain implements Attack,Fly,Jump,Run,Walk{
    
    public void attacking(){
        System.out.println("SuperMain attacking ");
    }
    
    public void flying(){
         System.out.println("SuperMain flying");
    }
    public void jumping(){
           System.out.println("SuperMain jumping");
    }
    public void runing(){
           System.out.println("SuperMain runing");
    }
    
    public void walking(){
         System.out.println("SuperMain walking");
    }
    
}
