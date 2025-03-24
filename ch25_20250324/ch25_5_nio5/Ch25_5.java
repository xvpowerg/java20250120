/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ch25_20250324.ch25_5_nio5;

import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.Files;
import java.io.IOException;
import java.util.stream.Stream;
import java.nio.charset.Charset;
/**
 *
 * @author xvpow
 */
public class Ch25_5 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
     Path path =   Paths.get("c:", "mydir","dir","msg.txt");
     try{
         Stream<String> strlist =  Files.lines(path, Charset.forName("big5"));
         strlist.forEach(v->System.out.println(v));
     }catch(IOException ex){
         System.out.println(ex);
     }
     
    }
    
}
