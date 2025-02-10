/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ch7_20250210.Ch7_1_exception1;

/**
 *
 * @author xvpow
 */
public class Ch7_1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Student st1 = new Student("Ken");
        try{
          st1.setAge(-10);  
        }catch(RuntimeException ex){
            System.out.println(ex);
        }
        
        st1.printInfo();
    }
    
}
