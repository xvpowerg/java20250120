/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ch22_20250317.ch22_7_file7;
import java.io.FileReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
/**
 *
 * @author xvpow
 */
public class Ch22_7 {

    public static void main(String[] args) {
        File file = new File("c:\\mydir\\msg.txt");
        
        try(FileReader reader = new FileReader(file);){
        
          int data = -1;
            while(  (data = reader.read()) != -1){
                System.out.print((char)data);
            }      
                  
        }catch(FileNotFoundException ex){
            System.out.println(ex);
        }catch(IOException ex){
            System.out.println(ex);
        }
        
    }
    
}
