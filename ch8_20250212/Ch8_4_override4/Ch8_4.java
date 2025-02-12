/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ch8_20250212.Ch8_4_override4;

/**
 *
 * @author xvpow
 */
public class Ch8_4 {
    
    //希望輸出Apple Banana Kiwi 品名 金額
    static void print(Fruit... fruits){
        for (Fruit f : fruits){
            System.out.println(f);
        }
    } 
    public static void main(String[] args) {
        Fruit f1 = new Fruit("A",100);
        System.out.println(f1);
        Apple a1 = new Apple("App1",97);
        Banana b1 = new Banana("AAN",80);
        Kiwi ki = new Kiwi("WI",75);
        Banana b2 = new Banana("Apple",93);
        print(a1,b1,ki,b2);
        
    }
    
}
