/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ch4_20250203.Ch4_6_overloading3;

/**
 *
 * @author xvpow
 */
public class Ch4_6 {

    static void test1(int v1,int v2){
        System.out.println("test1 v1 v2:"+v1+":"+v2);
    }
    
    static void test1(float f1,float f2){
        System.out.println("float f1 float f2:"+f1+":"+f2);
    }
    
    static void test2(int v1,float f1){
        System.out.println("test2 int float:"+v1+":"+f1);
    }
    
    static void test2(float f1,int v2){
        System.out.println("float int:"+f1+":"+v2);
    }
    static void test3(int v1,float f1,Integer objInt){
        System.out.println("int Integer:"+v1+":"+objInt);
    }
     static void test3(Integer objInt,int v2,int v1 ){
        System.out.println("Integer int:"+objInt+":"+v1);
    }
    public static void main(String[] args) {
        test1(5,6);
        test1(7.25f,10);
        //test2(10,20);
        test2(10.52f,20);
        test2(1,15.6f);
        
        test3(12,25f,30);
        
    }
    
}
