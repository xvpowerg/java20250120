/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ch17_20250305.ch17_1_set1;
import java.util.TreeSet;
import java.util.Comparator;
import java.util.Scanner;
/**
 *
 * @author xvpow
 */
public class Ch17_1 {

    static TreeSet<Student> sortStudent(int action){
         Comparator<Student> cmp =  
                Comparator.comparing(st->st.getScore1());
        cmp = cmp.thenComparing(st->st.getScore2()).
                thenComparing(st->st.getScore3()).
                thenComparing(st->st.getName());
        switch(action){
            case 1:
                break;
            case 2:
                cmp = cmp.reversed();    
                break;
            default:
                 throw new IllegalArgumentException("Error");
        }
       
       TreeSet<Student> stTree = new TreeSet(cmp);                
       stTree.add(new Student("Ken",73,85,75));
       stTree.add(new Student("Iris",85,85,75));
       stTree.add(new Student("Vivin",85,93,75));
       stTree.add(new Student("Lucy",85,93,69));
       stTree.add(new Student("Joy",73,85,75));
       return stTree;
      
    }
    public static void main(String[] args) {
        
        // TODO code application logic here
        Scanner sc = new Scanner(System.in);
        try{
               int action = sc.nextInt();
            //1 小到大
            //2 大到小
            //3 不是數字或不是1,2 顯示Error 
            TreeSet<Student> stTreeSet = sortStudent(action);
             stTreeSet.forEach(st->System.out.println(st)); 
        }catch(Exception ex){
            System.out.println("Error");
        }
     

       
    }
    
}
