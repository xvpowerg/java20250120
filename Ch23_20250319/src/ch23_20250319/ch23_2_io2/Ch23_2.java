/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ch23_20250319.ch23_2_io2;
import java.util.ArrayList;
import java.io.File;
import java.io.FileOutputStream;
import java.io.ObjectOutputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
/**
 *
 * @author xvpow
 */
public class Ch23_2 {
    
    public static void main(String[] args) {
        ArrayList<String> nameList = new ArrayList<>();
        nameList.add("Ken");
        nameList.add("Vivin");
        nameList.add("Lucy");
        nameList.add("Joy");
        File f1 = new File("c:\\mydir\\name_list.obj");
        try(FileOutputStream fout = new FileOutputStream(f1);
           ObjectOutputStream objOut = new  ObjectOutputStream(fout);    ){
            objOut.writeObject(nameList);
        }catch(FileNotFoundException ex){
            System.out.println(ex);
        }catch(IOException ex){
              System.out.println(ex);
        }
    }
    
}
