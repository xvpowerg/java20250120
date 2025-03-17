/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ch22_20250317.ch22_6_file6;

/**
 *
 * @author xvpow
 */
public class Ch22_6 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
    
        String path1 = "c:\\mydir\\netbeans-25-bin.zip";
        String path2 = "c:\\mydir\\netbeans-25-bin-copy.zip";
      boolean copy =  MyFile.copy(path1, path2);
      System.out.println(copy);
    }
    
}
