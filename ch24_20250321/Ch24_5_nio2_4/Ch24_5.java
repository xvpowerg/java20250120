/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ch24_20250321.Ch24_5_nio2_4;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.Files;
import java.io.IOException;
/**
 *
 * @author xvpow
 */
public class Ch24_5 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //只要路徑一樣 就認為檔案一樣 不會檢查是否真的存在
        Path p1 = Paths.get("c:", "mydir","AAA.txt");
        Path p2 = Paths.get("c:", "mydir","AAA.txt");
        try{
            boolean isSame =  Files.isSameFile(p1, p2);
            System.out.println(isSame);
        }catch(IOException ex){
            System.out.println(ex);
        }
       
    }
    
}
