/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ch10_20250217.Ch10_3_interface3;

/**
 *
 * @author xvpow
 */
public class Ch10_3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        SuperMain superMain1 = new SuperMain();
        Run r1 = superMain1;
        r1.runing();
        Jump j1 = superMain1;
        j1.jumping();
        Fly f1 = superMain1;
        f1.flying();
        Attack a1 = superMain1;
        a1.attacking();
        
        SuperGirl sg =  new SuperGirl();
        SuperSkill superSkill = sg;
        superSkill.attacking();
        Fly f2 = sg;
        f2.flying();
    }
    
}
