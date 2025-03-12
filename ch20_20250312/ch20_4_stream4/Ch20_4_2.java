/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ch20_20250312.ch20_4_stream4;

import java.util.ArrayList;

/**
 *
 * @author xvpow
 */
public class Ch20_4_2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
          ArrayList<Student> list = new ArrayList<>();
      Student st1 = new Student("Ken",70);
      st1.addBook("Java");
      st1.addBook("Python");
      st1.addBook("C#");
      Student st2 = new Student("Vivin",80);
      st2.addBook("Python");
      st2.addBook("C#");
      st2.addBook("Go");
      Student st3 = new Student("Lucy",91);
      st3.addBook("Java");
      st3.addBook("Python");
      st3.addBook("C++");
      
       list.add(st1);
       //st1.getBook().add("BBBAA");
       list.add(st2);
       list.add(st3);
       list.stream().flatMap(st->st.getBook()).
               distinct().forEach(v->System.out.println(v));
       
      long count =  list.stream().flatMap(st->st.getBook()).
               filter(st->st.equals("Python") || st.equals("Java")).count();
      System.out.println(count);
    }
    
}
