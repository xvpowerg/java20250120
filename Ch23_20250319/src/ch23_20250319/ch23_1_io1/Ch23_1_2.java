/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ch23_20250319.ch23_1_io1;
import java.io.File;
import java.io.FileInputStream;
import java.io.ObjectInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
public class Ch23_1_2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
         File file = new File("c:\\mydir\\msg.obj");
         try(FileInputStream fin = new FileInputStream(file);
             ObjectInputStream objIn = new  ObjectInputStream(fin);   ){
             String msg =  objIn.readObject().toString();
             System.out.println(msg);
         }catch(FileNotFoundException | ClassNotFoundException ex){
             System.out.println(ex);
         }catch(IOException ex){
             System.out.println(ex);
         }
    }
    
}
