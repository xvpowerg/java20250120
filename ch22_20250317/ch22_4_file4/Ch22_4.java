/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ch22_20250317.ch22_4_file4;

/**
 *
 * @author xvpow
 */
public class Ch22_4 {

    public static void main(String[] args) {
      
        
        try(  MyAutoClose close1 = new MyAutoClose("A1");
        MyAutoClose close2 = new MyAutoClose("B1");){
            System.out.println("Body");
        }catch(Exception ex){
            System.out.println(ex);
        }
    }
    
}
