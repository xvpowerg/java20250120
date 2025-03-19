/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ch23_20250319.ch23_1_io1;
import java.io.File;
import java.io.FileOutputStream;
import java.io.ObjectOutputStream;
import java.io.FileNotFoundException;
import java.io.IOException;


public class Ch23_1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        File file = new File("c:\\mydir\\msg.obj");
        String msg = "Hello! Vivin!";
        
        try(FileOutputStream fout = new FileOutputStream(file);
            ObjectOutputStream ojbOut = new  ObjectOutputStream(fout);  ){
            ojbOut.writeObject(msg);
        }catch(FileNotFoundException ex){
            System.out.println(ex);
        }catch(IOException ex){
            System.out.println(ex);
        }
        
        
    }
    
}
