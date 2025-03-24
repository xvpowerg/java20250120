/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ch25_20250324.ch25_6_nio6;

/**
 *
 * @author xvpow
 */
public class Person {
    private String name;
    private int score;
    Person(String name,int score){
        this.name = name;
        this.score = score;
    }
    
    public String getName(){
        return this.name;
    }
    
    public String toString(){
        return this.name+":"+this.score;
    }
}
