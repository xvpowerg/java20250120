/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ch23_20250319.ch23_2_io2;
import java.io.File;
import java.io.FileInputStream;
import java.io.ObjectInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;
/**
 *
 * @author xvpow
 */
public class Ch23_2_2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
         File f1 = new File("c:\\mydir\\name_list.obj");
         try(FileInputStream fin = new FileInputStream(f1);
             ObjectInputStream objin = new  ObjectInputStream(fin);){
             
            ArrayList list = (ArrayList) objin.readObject();
            System.out.println(list);
         }catch(FileNotFoundException | ClassNotFoundException ex){
             System.out.println(ex);
         }catch(IOException ex){
             System.out.println(ex);
         }
    }
    
}
