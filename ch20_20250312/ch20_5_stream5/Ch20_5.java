/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ch20_20250312.ch20_5_stream5;
import java.util.ArrayList;
import java.util.IntSummaryStatistics;
/**
 *
 * @author xvpow
 */
public class Ch20_5 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       ArrayList<Student> list = new ArrayList<>();
      Student st1 = new Student("Ken");
      st1.addScore(80);
      st1.addScore(75);
      st1.addScore(91);
      Student st2 = new Student("Vivin");
      st2.addScore(61);
      st2.addScore(83);
      st2.addScore(74);
      Student st3 = new Student("Lucy");
      st3.addScore(88);
      st3.addScore(63);
      st3.addScore(95);
      
       list.add(st1);
       //st1.getBook().add("BBBAA");
       list.add(st2);
       list.add(st3);
       
       IntSummaryStatistics intSum =
               list.stream().flatMapToInt(st->st.getScore()).summaryStatistics();
       long sum = intSum.getSum();
       float avg = (float)intSum.getAverage();
       System.out.println(sum+":"+avg);
       
       IntSummaryStatistics intSum2 =
               list.stream().flatMapToInt(st->st.getScore()).
                       filter(s->s>70).summaryStatistics();
      long sum2 =  intSum2.getSum();
      double avg2 = intSum2.getAverage();
      System.out.println(sum2+":"+avg2);
      
      
    }
    
}
