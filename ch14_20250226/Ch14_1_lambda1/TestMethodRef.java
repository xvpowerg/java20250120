/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ch14_20250226.Ch14_1_lambda1;

/**
 *
 * @author xvpow
 */
public class TestMethodRef {
    private String msg = "";
    TestMethodRef(String msg){
        this.msg = msg;
    }
    
    public String myFunc(Integer count){
        String result = "";
        for (int i=1; i <= count; i++){
           result+= msg+" ";
        }
        return result;
    }
}
