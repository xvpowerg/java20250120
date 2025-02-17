/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ch10_20250217.Ch10_6_interface6;

/**
 *
 * @author xvpow
 */
public class Ch10_6 {
    
    
    
    public static void main(String[] args) {
        Student st1 = new Student("Iris");
        st1.addScore(75);
        st1.addScore(83);
        st1.addScore(91);
        st1.test();
        
        Student st2= new Student("Ken");
        st2.addScore(71);
        st2.addScore(94);
        st2.addScore(65);
        st2.foreach();
        
        FruitBasket fb1 = new FruitBasket("A001");
        fb1.addFruit("Apple1");
        fb1.addFruit("Banan");
        fb1.addFruit("Cherry");
        fb1.foreach();
        System.out.println("============================");
        Iterator.printValues(st1);
        Iterator.printValues(st2);
        Iterator.printValues(fb1);
    }
    
}
