/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ch23_20250319.ch23_4_io4;
import java.io.File;
import java.io.FileOutputStream;
import java.io.ObjectOutputStream;

/**
 *
 * @author xvpow
 */
public class Ch23_4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Product p1 = new Product("A1",100,56.2f,38.5f);
        System.out.println(p1);//name price wheight height
        File pFile = new File("c:\\mydir\\product.obj");
        try(FileOutputStream out = new FileOutputStream(pFile);
            ObjectOutputStream objOut = new   ObjectOutputStream(out);  ){
            objOut.writeObject(p1);
        }catch(Exception ex){
            System.out.println(ex);
        }
        
    }
    
}
