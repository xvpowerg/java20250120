/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ch21_20250314.Ch21_7_stream7;
import java.util.ArrayList;
import java.util.stream.Collectors;
/**
 *
 * @author xvpow
 */
public class Ch21_7 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       ArrayList<String> dataList = new ArrayList();
       dataList.add("Ken");
       dataList.add("Vivin");
       dataList.add("Lindy");
       dataList.add("Joy");
       dataList.add("Iris");
       String msg = 
               dataList.stream().collect(Collectors.joining(",", "Title:", "."));
       System.out.println(msg);
    }
    
}
