/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ch10_20250217.Ch10_5_interface5;

/**
 *
 * @author xvpow
 */
public class Horse  implements Walk{
    
    public void walk(int action){
        
        switch(action){
            case Walk.UP:
                System.out.println("Horse Up Walk");
                break;
            case Walk.DOWN:
                System.out.println("Horse DOWN Walk");
                break;
            case Walk.LEFT:
                System.out.println("Horse LEFT Walk");
                break;
            case Walk.RIGHT:
                System.out.println("Horse RIGHT Walk");
                break;        
        }
        
    }
    
}
