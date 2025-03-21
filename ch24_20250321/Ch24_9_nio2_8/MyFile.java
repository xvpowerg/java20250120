/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ch24_20250321.Ch24_9_nio2_8;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.Files;
import java.nio.file.StandardCopyOption;
import java.io.IOException;
/**
 *
 * @author xvpow
 */
public class MyFile {
    public static boolean copy(Path src,Path target){
        
            try{
                Files.copy(src, target,StandardCopyOption.REPLACE_EXISTING);
            }catch(IOException ex){
                return false;
            }
        
        return true;
    }
    public static boolean move(Path src,Path target){
            try{
                Files.move(src, target, StandardCopyOption.REPLACE_EXISTING);
            }catch(IOException ex){
                return false;
            }
        return true;
    }
}
