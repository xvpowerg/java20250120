/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ch4_20250203.Ch4_1_boxing;

/**
 *
 * @author xvpow
 */
public class Ch4_1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        /*
        byte             Byte
        short            Short  
        int              Integer
        long             Long
        
        float           Float
        double          Double
        
        char            Character
        boolean         Boolean  
        */
        
        //手動 封箱 Boxing
        Integer v1 = Integer.valueOf(250);
        
        //手動 開箱unBoxing
        int v2 = v1.intValue();
        System.out.println(v2);
        //自動
        Integer vx1 = 360;
        //自動 開箱unBoxing
        int vx2 = vx1;
        System.out.println(vx2);
    }
    
}
