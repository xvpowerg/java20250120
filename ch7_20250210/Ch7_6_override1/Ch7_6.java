/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ch7_20250210.Ch7_6_override1;

/**
 *
 * @author xvpow
 */
public class Ch7_6 {

    public static void main(String[] args) {
        
               /* 複寫的規則
            1 只能公開不能封閉
            2 回傳如果是基本型態必須一樣 如果是參考型態可以一樣可以是子類
            3 函數名稱要一樣傳入的類型必須一樣
            4 拋出例外 可拋出一樣的例外 可以拋出子例外 可以不拋出
        */
               
               TestClass1 tc2 = new TestClass2();
               tc2.testPublic();
               tc2.testProtected();
               tc2.testDefault();
        
    }
    
}
