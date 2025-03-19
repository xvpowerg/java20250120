/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ch23_20250319.ch23_6_io6;
import java.io.File;
import java.io.FileOutputStream;
import java.io.ObjectOutputStream;
import java.time.LocalDateTime;
public class Ch23_6 {

    public static void main(String[] args) {
        File file = new File("c:\\mydir\\item.obj");
        String dataTime = LocalDateTime.now().toString();
        Item item = new Item("AA",66,dataTime);
      try(FileOutputStream fout = new FileOutputStream(file);
           ObjectOutputStream objOut = new  ObjectOutputStream(fout);  ){
          objOut.writeObject(item);
      }catch(Exception ex){
          System.out.println(ex);
      }
    }
    
}
