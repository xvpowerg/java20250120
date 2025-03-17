/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ch22_20250317.ch22_2_file2;

import java.io.File;
import java.io.InputStream;
import java.io.FileInputStream;
import java.io.OutputStream;
import java.io.FileOutputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
/**
 *
 * @author xvpow
 */
public class Ch22_2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        File src = new File("c:\\mydir\\netbeans-25-bin.zip");
        File targe = new File("c:\\mydir\\netbeans-25-bin-copy.zip");
        InputStream fin = null;
        OutputStream fout = null;
        try{
            fin = new BufferedInputStream(new FileInputStream(src)) ; 
            fout = new BufferedOutputStream(new FileOutputStream(targe)) ;
            int data = -1;
            while( (data = fin.read()) != -1){
                fout.write(data);
            }
            
        }catch(FileNotFoundException ex){
           System.out.println(ex);
        }catch(IOException ex){
         System.out.println(ex);
        }finally{
            try{
                fout.close();
                fin.close();
            }catch(Exception ex){
                System.out.println(ex);
            }

        }
        
    }
    
}
