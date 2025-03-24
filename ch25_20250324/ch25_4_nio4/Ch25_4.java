/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ch25_20250324.ch25_4_nio4;

import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.Files;
import java.io.IOException;
import java.util.stream.Stream;

public class Ch25_4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
          Path p1 = Paths.get("c:", "mydir","dir");
          try{
             Stream<Path> walkPath =  Files.walk(p1,0);
             walkPath.forEach(s->System.out.println(s));
          }catch(IOException ex){
              System.out.println(ex);
          }
          
    }
    
}
