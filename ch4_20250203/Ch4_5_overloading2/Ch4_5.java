/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ch4_20250203.Ch4_5_overloading2;

/**
 *
 * @author xvpow
 */
public class Ch4_5 {

    /*
       1 先找一樣類型的
       2 找相同類型可相容的
       3 不同類型可相容的
       4 封箱類型
    */
    
    static void test1(int v1){
        System.out.println("test1 v1:"+v1);
    }
    static void test1(float f1){
        System.out.println("test1 f1:"+f1);
    }
    static void test2(short v1){
        System.out.println("test2 short v1:"+v1);
    }
    static void test2(float f1){
        System.out.println("test2 float f1"+f1);
    }
    
    static void test3(float f1){
        System.out.println("test3 f1:"+f1);
    }
    static void test3(double d1){
        System.out.println("test3 d1:"+d1);
    }
    
    static void test4(short s1){
        System.out.println("test4 s1:"+s1);
    }
    static void test4(Integer objInt){
        System.out.println("test4 objInt:"+objInt);
    }
    public static void main(String[] args) {
       test1(5);
       test1(18.23f);
       test2(6);
       test3(25.6);
       test4(25);
       short s1 = 38;
       test4(s1);
    }
    
}
