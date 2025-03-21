/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ch24_20250321.Ch24_10_nio2_9;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.Files;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.FileInputStream;
import java.nio.file.StandardCopyOption;

/**
 *
 * @author xvpow
 */
public class Ch24_10 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       Path p1 =  Paths.get("c:", "mydir","netbeans-25-bin.zip");
       Path target =  Paths.get("c:", "mydir","netbeans-25-bin-copy.zip");
       
       try( FileOutputStream fout = new FileOutputStream(target.toFile());){
            Files.copy(p1, fout);
       }catch(IOException ex){
           System.out.println(ex);
       }
       
        try(FileInputStream fin = new FileInputStream(p1.toFile());){
            Files.copy(fin, target,StandardCopyOption.REPLACE_EXISTING);
       }catch(IOException ex){
           System.out.println(ex);
       }
      
       
    }
    
}
