/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ch14_20250226.Ch14_4_stringbuilder1;

/**
 *
 * @author xvpow
 */
public class Ch14_4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        String st1 = "A";
        String st2 = "B";
        String st3 = st1+st2;
        String st4 = "AB";
        System.out.println(st3);
        System.out.println(st4);
        System.out.println(st4 == st3);
       
       StringBuilder sb = new StringBuilder();
       
        sb.append("A");
        sb.append("B");
        System.out.println(sb.toString());
    }
    
}
