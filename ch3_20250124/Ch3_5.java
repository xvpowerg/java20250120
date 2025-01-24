/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ch3_20250124;

/**
 *
 * @author xvpow
 */
public class Ch3_5 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int[][]array1 = new int[2][];
        array1[0] = new int[]{8,9,11,18};
        array1[1] = new int[]{19,20};
        for (int i =0; i <array1.length ;i++){
            for (int k =0;k < array1[i].length;k++){
                System.out.print(array1[i][k]+" ");
            }
            System.out.println();
        }
        System.out.println(array1[0][2]);
        System.out.println(array1[1][2]);//java.lang.ArrayIndexOutOfBoundsException
    }
    
}
