/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ch9_20250214.Ch9_1_initblock1;

/**
 *
 * @author xvpow
 */
public class Ch9_1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //static只能呼static的 static不可呼叫非static的
        //非static的 都可呼叫
        Test1.test();
        Test1 t1 = new Test1();
        Test1 t2 = new Test1();
    }
    
}
