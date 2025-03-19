/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ch23_20250319.ch23_3_io3;
import java.io.File;
import java.io.FileInputStream;
import java.io.ObjectInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
/**
 *
 * @author xvpow
 */
public class Ch23_3_2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
         File file1 = new File("c:\\mydir\\item.obj");
         try(FileInputStream fin = new FileInputStream(file1);
             ObjectInputStream objin = new ObjectInputStream(fin) ){
             
            Item item = (Item) objin.readObject();
             System.out.println(item);
         }catch(FileNotFoundException | ClassNotFoundException ex){
             System.out.println(ex);
         }catch(IOException ex){
               System.out.println(ex);
         }
    }
    
}
