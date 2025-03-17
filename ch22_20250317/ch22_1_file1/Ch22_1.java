/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ch22_20250317.ch22_1_file1;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
/**
 *
 * @author xvpow
 */
public class Ch22_1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        File src = new File("c:\\mydir\\msg.txt");
        File target = new File("c:\\mydir\\copymsg.txt");
        try{
             FileInputStream fin = new FileInputStream(src); 
             FileOutputStream fout = new FileOutputStream(target);
             int data = -1;
             while( (data = fin.read())!= -1 ){
                 //System.out.println(data);
                 fout.write(data);
             }
        }catch(FileNotFoundException ex){
            System.out.println(ex);
        }catch(IOException ex){
             System.out.println(ex);
        }
           
    }
    
}
