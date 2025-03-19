/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ch23_20250319.ch23_5_io5;
import java.io.Serializable;
/**
 *
 * @author xvpow
 */
public class Company implements Serializable {
    private String name;
   Company(){}
   Company(String name){
       this.name = name;
   }
    public String toString(){
        return this.name;
    }
}
