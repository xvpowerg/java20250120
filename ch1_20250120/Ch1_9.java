/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ch1_20250120;

/**
 *
 * @author xvpow
 */
public class Ch1_9 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int aqi = 200;
        if (aqi >= 0 && aqi <= 50){
            System.out.println("A");
        }else if(aqi >= 51 && aqi <= 100){
            System.out.println("B");
        }else if(aqi >= 101 && aqi <= 150){
            System.out.println("C");
        }else{
            System.out.println("D");
        }
    }
    
}
