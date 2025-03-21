/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ch24_20250321.Ch24_7_nio2_6;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.Files;
import java.io.IOException;
/**
 *
 * @author xvpow
 */
public class Ch24_7 {

    
    public static void main(String[] args) {
        
        Path p1 = Paths.get("c:", "mydir","msg.txt");
        Path p2 = Paths.get("c:","mydir","dir","msg.txt");
        try{
             Files.copy(p1, p2);
             Files.deleteIfExists(p1);
        }catch(IOException ex){
            System.out.println(ex);
        }
       
        
    }
    
}
