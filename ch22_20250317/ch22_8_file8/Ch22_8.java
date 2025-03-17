/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ch22_20250317.ch22_8_file8;

import java.io.File;
import java.io.InputStreamReader;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.FileInputStream;
/**
 *
 * @author xvpow
 */
public class Ch22_8 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        File file = new File("c:\\mydir\\msg.txt");
        
        try(FileInputStream fin = new FileInputStream(file);
            InputStreamReader ir = new InputStreamReader(fin,"big5")){
            int data = -1;
            while( (data = ir.read()) != -1){
                
                System.out.print((char)data);
            }
        }catch(FileNotFoundException ex){
            System.out.println(ex);
        }catch(IOException ex){
            System.out.println(ex);
        }
        
    }
    
}
