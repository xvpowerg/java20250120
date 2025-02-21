/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ch12_20250221.Ch12_1_interface1;
import java.util.function.UnaryOperator;
/**
 *
 * @author xvpow
 */
public class TestOp1 implements UnaryOperator<Integer> {
    public Integer apply(Integer v){
        return v * 2;
    }
}
