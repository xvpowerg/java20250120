/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ch6_20250207.Ch6_7_modifier3;

/**
 *
 * @author xvpow
 */
public class Ch6_8 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        TestPublic tptb = new TestPublic();
        TestProtected tpro = new TestProtected();
        TestDefault tDef = new TestDefault();
        //TestPrivate tPrivet = new TestPrivate();
        TestPrivate.newTestPrivate();
        
    }
    
}
