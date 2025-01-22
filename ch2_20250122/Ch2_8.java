/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ch2_20250122;

/**
 *
 * @author xvpow
 */
public class Ch2_8 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        for (int i =1; i<= 9; i++){
            for (int k = 2; k<= 9; k++){
                System.out.printf("%d*%d=%2d ",i,k,i*k);
            }
            System.out.println();
        }
        
    }
    
}
