/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ch22_20250317.ch22_4_file4;

public class Ch22_4_2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        try(MyAutoClose c1 = new MyAutoClose("A1");
            MyAutoClose c2 = new MyAutoClose("B2",true);){
            System.out.println("Body");
        }catch(Exception ex){
            System.out.println(ex);
        }
        
    }
    
}
