/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ch22_20250317.ch22_5_file5;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
/**
 *
 * @author xvpow
 */
public class Ch22_5 {

    
    public static void main(String[] args) {
        File src = new File("c:\\mydir\\netbeans-25-bin.zip");
        File targe = new File("c:\\mydir\\netbeans-25-bin-copy.zip");
       try(FileInputStream fin = new FileInputStream(src);
            FileOutputStream fout = new FileOutputStream(targe);   ){
           byte[] buffer = new byte[1024];
           int index = -1;
           while( (index = fin.read(buffer)) != -1){
               fout.write(buffer, 0, index);
           }
               
           
           
       }catch(FileNotFoundException ex){
           System.out.println(ex);
       }catch(IOException ex){
             System.out.println(ex);
       }
    }
    
}
