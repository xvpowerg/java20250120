/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ch2_20250122;

/**
 *
 * @author xvpow
 */
public class Ch2_12 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        tag:
        for (int i =1; i<= 3; i++){
            for (int k = 1; k <= 5; k++){
                System.out.println("Start:"+i);
                if (i == 2){
                    //break tag;
                    continue tag;
                }
                System.out.print(i+":"+k+" ");
            }
            System.out.println();
        }
    }
    
}
