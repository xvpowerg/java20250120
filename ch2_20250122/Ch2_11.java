/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ch2_20250122;

/**
 *
 * @author xvpow
 */
public class Ch2_11 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       for(int i =1; i <= 10;i++){
           if(i == 3 || i== 5 || i== 8){
               continue;
           }
           System.out.print(i+" ");
       }
    }
    
}
