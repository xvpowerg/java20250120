/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ch14_9_module9;

import ch14_8_module8.MyTool;
import ch14_6_module6.Test14_6;
import ch14_7_module7.Test14_7;
/**
 *
 * @author xvpow
 */
public class TestTool {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
     MyTool myTool = new MyTool();
     Test14_6 t146 = new Test14_6();
     Test14_7 t147 = new Test14_7();
     myTool.test146(t146);
     myTool.test147(t147);
    }
    
}
