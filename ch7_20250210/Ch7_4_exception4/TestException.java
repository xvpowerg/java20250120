/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ch7_20250210.Ch7_4_exception4;
import java.lang.IllegalArgumentException;

public class TestException {
    public void testRuntimeException(int v){
        if (v > 20){
            throw new IllegalArgumentException("Error V");
        }
    }
}
