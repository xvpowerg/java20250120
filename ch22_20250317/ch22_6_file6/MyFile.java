/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ch22_20250317.ch22_6_file6;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
/**
 *
 * @author xvpow
 */
public class MyFile {
     public static boolean copy(String path1,String path2 ){
         return copy(path1,path2,1024);
     }
     
    public static boolean copy(String path1,String path2,int buffsize){
        File f1 = new File(path1);
        File f2 = new File(path2);
        try(FileInputStream fin = new FileInputStream(f1);
           FileOutputStream fout = new FileOutputStream(f2);){
            byte[]buffer = new byte[buffsize];
            int index = -1;
            while((index = fin.read(buffer)) != -1){
                fout.write(buffer, 0, index);
            }      
        }catch(FileNotFoundException ex){
            System.out.println("FileNotFoundException:"+ex);
             return false;
        }catch(IOException ex){
           System.out.println("IOException:"+ex);
             return false; 
        }
        
        return true;
    }
}
