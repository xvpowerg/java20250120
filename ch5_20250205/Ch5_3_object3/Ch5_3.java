/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ch5_20250205.Ch5_3_object3;

/**
 *
 * @author xvpow
 */
public class Ch5_3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       Item item1  = new Item();
       item1.setId("A001");
       item1.setPrice(50);
       item1.printInfo();
       
       Item item2 = new Item("B002",93);
       item2.printInfo();
       item2.setId("H003");
       item2.printInfo();
       
       Item item3 = new Item("C129");
       item3.printInfo();
       
       Item item4  = new Item();
       item4.printInfo();
       
    }
    
}
