/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ch5_20250205.Ch5_2_object2;

/**
 *
 * @author xvpow
 */
public class Ch5_2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
      Person p1 = new Person();
      //p1.name = "Ken";//長度必須大於0 不可是null 否則顯示Error
      p1.setName(null);
      //p1.age = 500;//0~200
      p1.setAge(-25);
      p1.printInfo();
      
    }
    
}
