/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ch21_20250314.Ch21_9_file1;
import java.io.File;
/**
 *
 * @author xvpow
 */
public class Ch21_9 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        File file = new File("c:\\mydir");
        System.out.println(file.isFile());
        System.out.println(file.isDirectory());
        File file2 = new File("c:\\mydir\\msg.txt");
        System.out.println(file2.isFile());
        System.out.println(file2.isDirectory());
        boolean del = file2.delete();
        if (del){
            System.out.println("Deleted File");
        }
        
    }
    
}
