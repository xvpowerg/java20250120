/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ch8_20250212.Ch8_5_block1;

/**
 *
 * @author xvpow
 */
public class Ch8_5 {

 
    public static void main(String[] args) {
        TestInit t1 = new TestInit();
        if (t1.getMsg(20).length() == 0){
            System.out.println("Empty");
        }else{
            System.out.println(t1.getMsg(20));
        }
    }
    
}
