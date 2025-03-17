/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ch22_20250317.ch22_3_file3;
import java.io.File;
import java.io.FileInputStream;
import java.io.BufferedInputStream;
import java.io.FileOutputStream;
import java.io.BufferedOutputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class Ch22_3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        File src = new File("c:\\mydir\\netbeans-25-bin.zip");
        File targe = new File("c:\\mydir\\netbeans-25-bin-copy.zip");
        
        try(
         BufferedInputStream bfin = new BufferedInputStream(new FileInputStream(src));
         BufferedOutputStream bfout = new BufferedOutputStream(new FileOutputStream(targe) )         ){
            
            int data = -1;
            while( (data = bfin.read()) != -1){
                bfout.write(data);
            }
            
        }catch(FileNotFoundException ex){
            System.out.println(ex);
        }catch(IOException ex){
            System.out.println(ex);
        }
        
    }
    
}
