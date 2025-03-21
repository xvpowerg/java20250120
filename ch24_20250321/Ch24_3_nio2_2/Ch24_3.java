/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ch24_20250321.Ch24_3_nio2_2;
import java.nio.file.Path;
import java.nio.file.Paths;
/**
 *
 * @author xvpow
 */
public class Ch24_3 {

    
    public static void main(String[] args) {
      Path p1 = Paths.get("c:", "mydir","dir1","dir1_1","dir1_1_1");
      Path p2 = Paths.get("c:", "mydir","dir1");
      Path p3 = p1.relativize(p2);
      System.out.println(p3);
      //必須是相同root
      Path p4 =  Paths.get("c:", "mydir");
      Path p5 =   Paths.get("d:", "abc");
      p4.relativize(p5);
    }
    
}
