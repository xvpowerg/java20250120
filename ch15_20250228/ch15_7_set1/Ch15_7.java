/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ch15_20250228.ch15_7_set1;
import java.util.HashSet;
/**
 *
 * @author xvpow
 */
public class Ch15_7 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       HashSet<String> set1 = new HashSet<>();
       set1.add("Ken");
       set1.add("Vivin");
       set1.add("Joy");
       set1.add("Vivin");
       
       for (String v : set1){
           System.out.println(v);
       }
       
       System.out.println(set1.contains("Vivin"));
       System.out.println(set1.contains("Lucy"));
    }
    
}
