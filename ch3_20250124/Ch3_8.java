/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ch3_20250124;

/**
 *
 * @author xvpow
 */
public class Ch3_8 {
        //x y
       static void  showForLoop(int x,int y){
            for (int i = x;i<=y;i++){
                if (i != y){
                   System.out.print(i+","); 
                }else{
                    System.out.print(i);
                }
                
            }
            System.out.println();
        }
    public static void main(String[] args) {
       //迴圈可顯示1~10
        for (int i =1; i<= 10;i++){
            System.out.print(i+" ");
        }
        System.out.println();
        System.out.println("================");
       // 迴圈可顯示x ~ y
       //
       int x = 3;
       int y = 5;
       for (int i = x; i <= y;i++){
           System.out.print(i+" ");
       }
        System.out.println();
        System.out.println("================");
        showForLoop(3,5);//3 4 5
        showForLoop(2,10);//2 3 4 5 6 7 8 9 10        
    }
    
}
