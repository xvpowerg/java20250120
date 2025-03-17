/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ch22_20250317.ch22_4_file4;

/**
 *
 * @author xvpow
 */
public class MyAutoClose implements AutoCloseable {
    private String name;
    boolean thex = false;
    MyAutoClose(String name){
        this.name = name;
    }
    MyAutoClose(String name,boolean thEx){
        this(name);
        this.thex = thEx;
    }
    public String toString(){
        return this.name;
    }
    
    public void close()throws Exception{
        if (this.thex){
            throw new Exception("Close Error:"+name);
        }
        System.out.println("close name:"+name);
    }
    
}
