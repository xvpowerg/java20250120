/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ch25_20250324.ch25_2_nio2;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.PathMatcher;
import java.nio.file.FileSystems;
import java.util.stream.Stream;

/**
 *
 * @author xvpow
 */
public class Ch25_2 {
    //glob:**.txt 表示前面不管甚麼路徑只要副檔名是.txt
    private final static PathMatcher matcher = FileSystems.getDefault().
            getPathMatcher("glob:**.txt");
   static boolean filterTxt(Path p){  
        return matcher.matches(p);
    }
    public static void main(String[] args) {
      Path p1 = Paths.get("c:", "mydir");
      try{
        Stream<Path> pathSt = Files.list(p1);
        pathSt.filter(Ch25_2::filterTxt).forEach(p->System.out.println(p));
      }catch(IOException ex){
          System.out.println(ex);
      }
     
    }
    
}
