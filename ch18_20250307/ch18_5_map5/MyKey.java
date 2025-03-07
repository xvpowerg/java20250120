/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ch18_20250307.ch18_5_map5;

/**
 *
 * @author xvpow
 */
public class MyKey {
    private int value1;
    private int value2;
    private String msg;
    public MyKey(int value1,int value2,String msg){
        this.value1 = value1;
        this.value2 = value2;
        this.msg = msg;
    }
    
    public int getValue1(){
        return this.value1;
    }
    public int getValue2(){
        return this.value2;
    }
    
    public String getMsg(){
        return this.msg;
    }
    
    public String toString(){
        return this.msg+":"+this.value1+":"+this.value2;
    }
    
}
