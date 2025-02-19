/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ch11_20250219.ch11_6_interface6;

/**
 *
 * @author xvpow
 */
public class Ch11_6 {

    
    static  void testCalculat(int a,int b,MyCalculate ... cs){
        for(MyCalculate c : cs){
           System.out.println(c.calcu(a, b));
        }
    }
    public static void main(String[] args) {
        int a = 5,b = 9;
        MyCalculate[] cs = {new MyAdd(),new MyMin(),
                            new MyMinus(),new MyMul()};
       testCalculat(a,b,cs);
    }
    
}
