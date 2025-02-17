/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ch10_20250217.Ch10_7_interface7;

/**
 *
 * @author xvpow
 */
public class Ch10_7 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        MyClass myClass = new MyClass();
        myClass.test1(56);
        TestIF1 if1 = myClass;
        TestIF2 if2 = myClass;
        if1.test1(77);
        if2.test1(88);
    }
    
}
