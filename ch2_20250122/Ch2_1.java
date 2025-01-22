/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ch2_20250122;

/**
 *
 * @author xvpow
 */
public class Ch2_1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        String name = "Ken";
        switch(name){
            case "Ken":
                System.out.println("PM");
                break;
            case "Vivin":
                System.out.println("HR");
                break;
            default:
                System.out.println("Error");
                break;
        }
        
        //equals 意思比較內容
        //== 比較數字
        if (name.equals("Ken")  ){
            System.out.println("PM");
        }else if(name.equals("Vivin") ){
            System.out.println("HR");
        }else{
            System.out.println("Error");
        }
    }
    
}
