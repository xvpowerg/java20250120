/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ch16_20250303.ch16_5_set5;
import java.util.TreeSet;
/**
 *
 * @author xvpow
 */
public class Ch16_5 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        MyStudentComp stComp = new MyStudentComp();
       TreeSet<Student> stTree = new TreeSet(stComp);
       stTree.add(new Student("Ken",73,85,75));
       stTree.add(new Student("Iris",85,85,75));
       stTree.add(new Student("Vivin",85,93,75));
       stTree.add(new Student("Lucy",85,93,69));
       stTree.add(new Student("Joy",73,85,75));
       for (Student st : stTree){
           System.out.println(st);
       }
       
       
       
     
    }
    
}
