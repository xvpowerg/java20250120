/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ch22_20250317.ch22_4_file4;

/**
 *
 * @author xvpow
 */
public class Ch22_4_3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        try(MyAutoClose ac1 = new MyAutoClose("A1");
                MyAutoClose ac2 = new MyAutoClose("A2",true);){
            System.out.println("Body");
            throw new Exception("Body~");
        }catch(Exception ex){
            System.out.println(ex);
           Throwable[] thArray=  ex.getSuppressed();
           for (Throwable th : thArray){
               System.out.println(th);
           }
        }
    }
    
}
