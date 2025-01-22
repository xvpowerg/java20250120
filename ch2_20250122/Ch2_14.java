/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ch2_20250122;

/**
 *
 * @author xvpow
 */
public class Ch2_14 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       int[] array1 = new int[3];
       int array2[] = new int[3];
       int[] array3 = {8,9,7,6,11};
       int[] array4 = new int[]{7,11,12,18,15};
       //for 迴圈 取得array3 內容
       for (int i = 0; i < array3.length;i++){
           System.out.print(array3[i]+" ");
       }
       System.out.println();
       //foreatch 迴圈 取得array4 內容
       for (var v : array4){
           System.out.print(v+" ");
       }
       System.out.println();
    }
    
}
