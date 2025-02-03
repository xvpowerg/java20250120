/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ch4_20250203.Ch4_7_BoxObject;

/**
 *
 * @author xvpow
 */
public class Ch4_8 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       String sb1 = "true";
       boolean b1 = Boolean.parseBoolean(sb1);
       System.out.println(b1);
       
       String sb2 = "TrUe";
       boolean b2 = Boolean.parseBoolean(sb2);//最差就是false
       System.out.println(b2);
       
    }
    
}
