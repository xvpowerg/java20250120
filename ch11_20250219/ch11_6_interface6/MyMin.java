/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ch11_20250219.ch11_6_interface6;

/**
 *
 * @author xvpow
 */
public class MyMin  implements MyCalculate{
    public int calcu(int a,int b){
        return a > b ?  b : a;
    }
}
