/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ch5_20250205.Ch5_1_object1;

/**
 *
 * @author xvpow
 */
public class Ch5_1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Student st1 = new Student();
        st1.name = "Ken";
        st1.score = 75;
        
        Student st2 = new Student();
        st2.name = "Joy";
        st2.score = 86;
        
        Student st3 = new Student();
        st3.name = "Iris";
        st3.score = 71;
                
//        System.out.println(st1.name+":"+st1.score);
//        System.out.println(st2.name+":"+st2.score);
//        System.out.println(st3.name+":"+st3.score);
        st1.printInfo();
        st2.printInfo();
        st3.printInfo();
    }
    
}
