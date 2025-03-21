/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ch24_20250321.Ch24_4_nio2_3;
import java.nio.file.Path;
import java.nio.file.Paths;
/**
 *
 * @author xvpow
 */
public class Ch24_4 {

    public static void main(String[] args) {
      
       Path p1 =  Paths.get("c:", "mydir",".","my_image");
       p1 = p1.normalize();
       System.out.println(p1);
       
       Path p2 =  Paths.get("c:", "mydir","my_image","..","file");
       System.out.println(p2);
        System.out.println(p2.normalize());
    }
    
}
