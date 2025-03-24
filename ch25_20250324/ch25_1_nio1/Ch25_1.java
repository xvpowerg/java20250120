/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ch25_20250324.ch25_1_nio1;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.Files;
import java.io.IOException;
import java.util.stream.Stream;
/**
 *
 * @author xvpow
 */
public class Ch25_1 {

    static boolean filterTxt(Path p){
        return p.toString().endsWith(".txt");
    }
    public static void main(String[] args) {
      Path p1 = Paths.get("c:", "mydir");
      try{
        Stream<Path> pathSt = Files.list(p1);
        pathSt.filter(Ch25_1::filterTxt).forEach(p->System.out.println(p));
      }catch(IOException ex){
          System.out.println(ex);
      }
     
    }
    
}
