/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ch3_20250124;

/**
 *
 * @author xvpow
 */
public class Ch3_2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       int[][] array1 = new int[2][3];
       int[] array2[] = new int[2][3];
       int array3[][] = new int[2][3];
       
       int[][] array4 = {{5,6,7},
                         {8,11,25}};//只能用於初始化
       int[][] array5 = new int[][]{{8,6},
                                    {11,18},
                                    {78,25}};
       int[][] array6 = {{11,88},
                         {77,66}};
       
       array6 = new int[][] {{99,86},
           {35,18},
           {14,15}};
      //使用for loop  取得 array4
      for (int i = 0; i < array4.length;i++){
          for (int k = 0; k <array4[i].length;k++){
              System.out.print(array4[i][k]+" ");
          }
          System.out.println();
      }
      System.out.println("=======================");
      //使用foreach loop 取得 array5
      for (int[] a1 : array5){
          for (int v1 : a1){
              System.out.print(v1+" ");
          }
          System.out.println();
      }
      System.out.println("=======================");
      
      for (int k = 0 ; k <array4[0].length;k++ ){
          for (int i = 0; i <array4.length ;i++){
              System.out.print(array4[i][k]+" ");
          }
          System.out.println();
      }
      
      
    }
    
}
