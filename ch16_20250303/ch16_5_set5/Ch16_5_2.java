/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ch16_20250303.ch16_5_set5;

import java.util.TreeSet;
import java.util.Comparator;
/**
 *
 * @author xvpow
 */
public class Ch16_5_2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        TreeSet<Student> stTree = new TreeSet(new Comparator<Student>(){
            public int compare(Student st1,Student st2){
                    if (st1.getScore1() > st2.getScore1()){
                        return 1;
                    }else if(st1.getScore1() < st2.getScore1()){
                         return -1;
                    }else if(st1.getScore2() > st2.getScore2()){
                        return 1;
                    }else if(st1.getScore2() < st2.getScore2()){
                        return -1;
                    }else if(st1.getScore3() > st2.getScore3()){
                        return 1;
                    }else if(st1.getScore3() < st2.getScore3()){
                        return -1;
                    }
                    return st1.getName().compareTo(st2.getName());
                
            }
        
        });
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
