/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ch26_20250326.ch26_9_db4;

/**
 *
 * @author xvpow
 */
public class Student {
    private int id;
    private String name;
    private double score;
    Student(int id,String name,double score){
        this.id = id;
        this.name = name;
        this.score = score;
    }
    
    public String toString(){
        return this.id +":"+this.name+":"+this.score;
    } 
}
