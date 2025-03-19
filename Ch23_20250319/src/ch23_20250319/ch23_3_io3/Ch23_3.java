/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ch23_20250319.ch23_3_io3;
import java.io.File;
import java.io.FileOutputStream;
import java.io.ObjectOutputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
/**
 *
 * @author xvpow
 */
public class Ch23_3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       Item it1 = new Item("A1",88);
       //System.out.println(it1);
       File file1 = new File("c:\\mydir\\item.obj");
       try(FileOutputStream fout = new FileOutputStream(file1);
           ObjectOutputStream objout = new  ObjectOutputStream(fout);   ){
           objout.writeObject(it1);
       }catch(FileNotFoundException ex){
           System.out.println(ex);
       }catch(IOException ex){
           System.out.println(ex);
       }
    }
    
}
