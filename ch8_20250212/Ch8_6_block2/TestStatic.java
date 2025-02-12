/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ch8_20250212.Ch8_6_block2;

/**
 *
 * @author xvpow
 */
public class TestStatic {   
     static String[] msgs = new String[500];
    static{
        for (int i =0; i <msgs.length;i++){
            msgs[i] = "";
        }
    }
    String name;
    static String company;//共享
    public String toString(){
        return name+":"+company;
    }
}
