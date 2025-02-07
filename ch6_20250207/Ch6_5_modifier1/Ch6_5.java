/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ch6_20250207.Ch6_5_modifier1;

/**
 *
 * @author xvpow
 */
public class Ch6_5 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        /*
            public
            protected
            default 空白
            private
        */
        TestClass1 tc1 = new TestClass1();
        System.out.println(tc1.publicTest);//public 可跨package
        System.out.println(tc1.protectedTest);
        System.out.println(tc1.defaultTest);
        
        
    }
    
}
