/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ch24_20250321.Ch24_8_nio2_7;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.Files;
import java.io.IOException;

public class Ch24_8 {
    public static void main(String[] args) {
       Path source =   Paths.get("c:","mydir","netbeans-25-bin.zip");
       Path target = Paths.get("c:","mydir","dir","netbeans-25-bin.zip");
       try{
            Files.move(source, target);
       }catch(IOException ex){
           System.out.println(ex);
       }
        
    }
    
}
