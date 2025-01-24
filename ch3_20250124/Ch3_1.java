/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ch3_20250124;

/**
 *
 * @author xvpow
 */
public class Ch3_1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       int[][] score = new int[3][5];
       score[0][0] = 75;
       score[0][1] = 88;
       score[0][2] = 93;
       score[0][3] = 89;
       
       score[1][2]  = 77;
       score[1][3]  = 95;    
       
       score[2][0]  = 61;
       score[2][3]  = 86; 
        
        for (int i = 0; i <score.length ;i++){
            for (int k = 0; k < score[i].length; k++){
                System.out.print(score[i][k]+" ");
            }
            System.out.println();
        }
        System.out.println("====================");
        for (int [] a1 : score){
            for (int v1 : a1){
                System.out.print(v1+" ");
            }
            System.out.println();
        }
        
        
       
       
    }
    
}
