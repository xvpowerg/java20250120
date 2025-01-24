/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ch3_20250124;

/**
 *
 * @author xvpow
 */
public class Ch3_6 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int[][]array1 = new int[2][];
        array1[1] = new int[]{8,9,18};
        System.out.println(array1[1][1]);
        //System.out.println(array1[1][3]);//java.lang.ArrayIndexOutOfBoundsException
        
        System.out.println(array1[0][0]);//java.lang.NullPointerException
    }
    
}
