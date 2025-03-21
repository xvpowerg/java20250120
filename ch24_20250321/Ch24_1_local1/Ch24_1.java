/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ch24_20250321.Ch24_1_local1;
import java.util.Locale;
import java.util.ResourceBundle;
import java.text.MessageFormat;
/**
 *
 * @author xvpow
 */
public class Ch24_1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Locale enLocal = new Locale("en","US");
        Locale znLocal = new Locale("zh","TW");
      ResourceBundle defRes = ResourceBundle.getBundle("messages");
      String defMsg1 = MessageFormat.format(defRes.getString("greeting"),"Ken");  
      System.out.println(defMsg1);
     ResourceBundle enRes =   ResourceBundle.getBundle("messages",enLocal);
     ResourceBundle zhRes =   ResourceBundle.getBundle("messages",znLocal);
     
     String enMsg =  MessageFormat.format(enRes.getString("number_format"), 7);
     String zhMsg =  MessageFormat.format(zhRes.getString("number_format"), 7);
     System.out.println(enMsg);
     System.out.println(zhMsg);
    }
    
}
