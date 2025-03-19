/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ch23_20250319.ch23_6_io6;
import java.io.File;
import java.io.FileInputStream;
import java.io.ObjectInputStream;
/**
 *
 * @author xvpow
 */
public class Ch23_6_2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
     File file = new File("c:\\mydir\\item.obj");
     try(FileInputStream fin = new FileInputStream(file);
          ObjectInputStream objIn = new ObjectInputStream(fin);   ){
         
        System.out.println(objIn.readObject());
     }catch(Exception ex){
         System.out.println(ex);
     }
    }
    
}
