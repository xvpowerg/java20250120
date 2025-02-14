/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ch9_20250214.Ch9_6_abstract1;

/**
 *
 * @author xvpow
 */
public class Ch9_6 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //abstract 不可new
        Animal a1 = new Dog("Bobo",5);
        a1.setAge(20);
        a1.setName("JoJo");
        a1.bark();
        System.out.println(a1);
        Animal c1 = new Cat("Lulu",2);
        System.out.println(c1);
        c1.bark();
    }
    
}
