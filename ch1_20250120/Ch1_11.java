/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ch1_20250120;

/**
 *
 * @author xvpow
 */
public class Ch1_11 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       String name = new String("YuYu");
       
       switch(name){
           default:
               System.out.println("Error");
               break;
           case "Ken":
               System.out.println("PM");
               break;
           case "Lucy":
               System.out.println("HR");
               break;
           case "Iris":
                System.out.println("RD");
               break;
       }
    }
    
}
