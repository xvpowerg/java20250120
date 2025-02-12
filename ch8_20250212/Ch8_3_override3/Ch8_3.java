/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ch8_20250212.Ch8_3_override3;

/**
 *
 * @author xvpow
 */
public class Ch8_3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //建立Student
        //有兩個屬性 name age
        //必須封裝
        //可new Student("Ken",18)建立
        //可new Student("Ken")建立
        
        Student st1 = new Student("Ken",18);
        Student st2 = new Student("Lucy");
        Student st3 = new Student("Ken",18);
        Test1 t1 = new Test1();
        System.out.println(st1.getName()+":"+st1.getAge());
        
        System.out.println(st1);
        System.out.println(st2);
        Object ob = t1;
        System.out.println(st1.equals(st3));
        System.out.println(st1.equals(t1));
        
    }
    
}
