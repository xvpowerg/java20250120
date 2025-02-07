/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ch6_20250207.Ch6_7_2_modifier3;
import ch6_20250207.Ch6_7_modifier3.TestPublic;
import ch6_20250207.Ch6_7_modifier3.TestProtected;
import ch6_20250207.Ch6_7_modifier3.TestDefault;
import ch6_20250207.Ch6_7_modifier3.TestPrivate;
/**
 *
 * @author xvpow
 */
public class Ch6_7_2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       TestPublic tp = new TestPublic();
       //TestProtected tpro = new TestProtected();
       //TestDefault tded = new TestDefault();
       TestPrivate.newTestPrivate();
       //繼承才能呼叫到TestProtected的建構式
       TestClass2 tclass2 = new TestClass2();
       
    }
    
}
