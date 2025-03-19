/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ch23_20250319.ch23_5_io5;
import java.io.File;
import java.io.FileOutputStream;
import java.io.ObjectOutputStream;
/**
 *
 * @author xvpow
 */
public class Ch23_5 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       Item item = new Item("B1","MyCimpany",65);
       System.out.println(item);
       File fItem = new File("c:\\mydir\\item.obj");
       try(FileOutputStream fout = new FileOutputStream(fItem);
            ObjectOutputStream objOut = new ObjectOutputStream(fout)){
           objOut.writeObject(item);
       }catch(Exception ex){
           System.out.println(ex);
       }
       
    }
    
}
