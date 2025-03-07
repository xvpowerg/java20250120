/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ch18_20250307.ch18_7_generices1;

/**
 *
 * @author xvpow
 */
public class Ch18_7 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        MyList myList = new MyList();
        myList.add("Ken");
        myList.add("Vivin");
        myList.add("Iris");
        myList.foreach(c->System.out.println(c));
        
         MyList<Integer> myList2 = new MyList();
         myList2.add(25);
         myList2.add(10);
         myList2.add(75);
         myList2.foreach(v->System.out.println(v));
    }
    
}
