/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ch10_20250217.Ch10_4_interface4;

/**
 *
 * @author xvpow
 */
public class Bird implements Fly{
    private int speed = 0;
    
    Bird(int speed){
        this.speed = speed;
    }
    
    public void addSpeed(){
       speed += 10; 
    }
    public void flying(){
        if (this.speed > Fly.MX_SPEED){
            throw new IllegalArgumentException("speed overflow "+Fly.MX_SPEED);
        }else{
            System.out.println("Bird:"+this.speed);
        }
    }
}
