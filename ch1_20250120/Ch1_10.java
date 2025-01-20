/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ch1_20250120;
import java.util.Scanner;

public class Ch1_10 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        System.out.println("1 Play");
        System.out.println("2 Stop");
        System.out.println("3 Exit");
        Scanner scan = new Scanner(System.in);
        int action = scan.nextInt();
        if (action == 1){
            System.out.println("Play");
        }else if(action == 2){
            System.out.println("Stop");
        }else if (action == 3){
           System.out.println("Exit");
        }else{
            System.out.println("Error");
        }
        
        final int PLAY = 1;
        final int STOP = 2;
        final int EXIT = 3;
        switch(action){
            case PLAY:
                System.out.println("Play");
                break;
            case STOP:
                System.out.println("Stop");
                break;
            case EXIT:
                System.out.println("Exit");
                break;
            default:
                System.out.println("Error");
                break;
        }
        
        
        
    }
    
}
