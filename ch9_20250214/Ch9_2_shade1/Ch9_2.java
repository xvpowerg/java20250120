/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ch9_20250214.Ch9_2_shade1;

/**
 *
 * @author xvpow
 */
public class Ch9_2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
      //複寫 非靜態方法
      //遮蔽 靜態方法 所有的屬性
      //複寫看物件
      //遮蔽看類別
      //屬性與方法查詢的順序
      //先由最靠近的開始找 在往父類別找
      
      Test1 t1 = new Test2();
      t1.testv1();
      System.out.println(t1.msg);
      t1.testv2();
      
    }
    
}
