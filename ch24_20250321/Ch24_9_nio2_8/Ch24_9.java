/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ch24_20250321.Ch24_9_nio2_8;
import java.nio.file.Path;
import java.nio.file.Paths;

/**
 *
 * @author xvpow
 */
public class Ch24_9 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
       Path src = Paths.get("c:", "mydir","netbeans-25-bin.zip");
       Path target = Paths.get("c:", "mydir","netbeans-25-bin-copy.zip");
       boolean copy = MyFile.copy(src, target);
       if(copy){
          System.out.println("Copy SUCCESSFUL");
       }else{
           System.out.println("Copy Fail");
       }
    }
    
}
