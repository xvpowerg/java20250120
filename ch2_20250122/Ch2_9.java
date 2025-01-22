/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ch2_20250122;

/**
 *
 * @author xvpow
 */
public class Ch2_9 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
      //while 迴圈 製作9x9表
      int i =1;
      
      while( i <= 9){
          int k = 2;
          while(k <= 9){
              System.out.printf("%d*%d=%2d ",i,k,i*k);
              k++;
          }
          System.out.println();
          i++;
          
      }
    }
    
}
