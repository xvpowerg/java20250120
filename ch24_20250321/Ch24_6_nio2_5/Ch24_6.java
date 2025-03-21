/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ch24_20250321.Ch24_6_nio2_5;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.Files;
import java.nio.file.StandardCopyOption;
import java.io.IOException;

public class Ch24_6 {
    
    public static void main(String[] args) {
      Path src =  Paths.get("c:", "mydir","netbeans-25-bin.zip");
      Path copyPath = Paths.get("c:","mydir","netbeans-25-bin-copy.zip");
      try{
          Files.copy(src, copyPath,StandardCopyOption.REPLACE_EXISTING);
      }catch(IOException ex){
          System.out.println(ex);
      }
       
              
    }
    
}
