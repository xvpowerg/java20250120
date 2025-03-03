/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ch16_20250303.ch16_5_set5;
import java.util.Comparator;
/**
 *
 * @author xvpow
 */
public class MyStudentComp implements Comparator<Student> {
    public int compare(Student st1,Student st2){
        //左大於右回傳正數
        //左小於右回傳負數
        //左等於右回傳0
        if (st1.getScore1() > st2.getScore1()){
            return 1;
        }else if(st1.getScore1() < st2.getScore1()){
            return -1;
        }else if (st1.getScore2() > st2.getScore2()){
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
    
}
