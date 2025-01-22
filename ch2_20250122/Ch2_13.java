/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ch2_20250122;

/**
 *
 * @author xvpow
 */
public class Ch2_13 {

    
    public static void main(String[] args) {
       int[] score = new int[5];
       score[0] = 95;
       score[1] = 75;
       score[3] = 86;
      //index 索引 
      for (int i = 0; i < 5 ;i++){
          System.out.print(i+":"+score[i]+" ");
      }
      System.out.println();
      //foreach
      for(var v : score){
          System.out.print(v+" ");
      }
    }
    
}
