/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ch23_20250319.ch23_7_locale1;
import java.util.Locale;
import java.util.ResourceBundle;
import java.text.MessageFormat;
/**
 *
 * @author xvpow
 */
public class Ch23_7 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       ResourceBundle resb = ResourceBundle.getBundle("messages");
       System.out.println(resb.getString("greeting"));
      String msg1 =  MessageFormat.format(resb.getString("greeting"), "曉華");
      System.out.println(msg1);
    }
    
}
