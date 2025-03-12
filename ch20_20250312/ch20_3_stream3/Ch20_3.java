/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ch20_20250312.ch20_3_stream3;
import java.util.ArrayList;
import java.util.IntSummaryStatistics;
/**
 *
 * @author xvpow
 */
public class Ch20_3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
       ArrayList<Student> list = new ArrayList<>();
       list.add(new Student("Ken",70));
       list.add(new Student("Vivin",80));
       list.add(new Student("Lucy",91));
       list.add(new Student("Ken",70));
       list.add(new Student("Ben",65));
       list.add(new Student("Sean",72));
       list.add(new Student("Ben",65));
       list.add(new Student("Lucy",91));
       //不可重複 輸出大於70分 學生的所有成績
       
//       list.stream().distinct().
//               forEach(System.out::println);
       
//       list.stream().distinct().
//               mapToInt(st->st.getScore()).filter(sc->sc>70).
//               forEach(v->System.out.println(v));
     int scoreSum =  list.stream().distinct().
               mapToInt(st->st.getScore()).sum();  
       System.out.println(scoreSum);
      IntSummaryStatistics intSummary = 
              list.stream().distinct().mapToInt(st->st.getScore()).
                      summaryStatistics();
      System.out.println(intSummary.getAverage());
      long summarySum = intSummary.getSum();
      System.out.println(summarySum);
      
    }
    
}
