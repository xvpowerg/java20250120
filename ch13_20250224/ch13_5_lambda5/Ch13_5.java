/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ch13_20250224.ch13_5_lambda5;

/**
 *
 * @author xvpow
 */
public class Ch13_5 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        TestIF5  itf5_1 = (String data,int index)->{        
            return data.charAt(index)+"";
        };
        System.out.println(itf5_1.testFunc5("ABCDE", 1));
        TestIF5  itf5_2 = (data,index)->data.charAt(index)+"";
        System.out.println(itf5_2.testFunc5("ABCDE", 3));
        
    }
    
}
