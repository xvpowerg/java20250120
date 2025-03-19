/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ch23_20250319.ch23_4_io4;
import java.io.File;
import java.io.FileInputStream;
import java.io.ObjectInputStream;

/**
 *
 * @author xvpow
 */
public class Ch23_4_2 {

    public static void main(String[] args) {
       File pFile = new File("c:\\mydir\\product.obj");
       try(FileInputStream fin = new FileInputStream(pFile);
            ObjectInputStream objIn = new  ObjectInputStream(fin)  ){
           
        Product p1 = (Product)   objIn.readObject();
           System.out.println(p1);
       }catch(Exception ex){
           System.out.println(ex);
       }  
        
    }
    
}
