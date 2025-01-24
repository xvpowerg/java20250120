/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ch3_20250124;
import java.util.Arrays;

public class Ch3_3 {

    public static void main(String[] args) {
        int[] array1 = {10,21,15,3,19};
        Arrays.sort(array1);
        for (int v : array1){
            System.out.print(v+" ");
        }
        System.out.println("===================");
        //搜尋binarySearch 之前一定要排序
        int idx = Arrays.binarySearch(array1, 15);
        System.out.println(idx);
        //全都找不到
        
        //比全都小 一律-1
         idx = Arrays.binarySearch(array1, -2);
         System.out.println(idx);
        //比全都大 length +1 * -1
         idx = Arrays.binarySearch(array1, 99);
          System.out.println(idx);
        //在中間
        idx = Arrays.binarySearch(array1, 18);
        System.out.println(idx);
        idx = Arrays.binarySearch(array1, 13);
        System.out.println(idx);
    }
    
}
