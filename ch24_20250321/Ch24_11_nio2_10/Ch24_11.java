/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ch24_20250321.Ch24_11_nio2_10;
import java.io.File;
import java.nio.file.Files;
import java.io.IOException;
import java.util.stream.Stream;
import java.nio.file.Path;
/**
 *
 * @author xvpow
 */
public class Ch24_11 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        File f1 = new File("c:\\mydir");
        try{
          Stream<Path> streamp = Files.list(f1.toPath());
          streamp.forEach(p->System.out.println(p));
        }catch(IOException ex){
            System.out.println(ex);
        }
        
    }
    
}
