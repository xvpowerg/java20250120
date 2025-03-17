/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ch22_20250317.ch22_8_file8;
import java.io.InputStreamReader;
import java.io.FileInputStream;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.UnsupportedEncodingException;
/**
 *
 * @author xvpow
 */
public class MyFileReader  extends InputStreamReader{
    
    public MyFileReader(File file,String code)
            throws FileNotFoundException,
            UnsupportedEncodingException{
        super(new FileInputStream(file),code);
    }
     public MyFileReader(File file)throws FileNotFoundException,
             UnsupportedEncodingException{
         this(file,"utf-8");
     }
}
