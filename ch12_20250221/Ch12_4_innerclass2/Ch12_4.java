/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ch12_20250221.Ch12_4_innerclass2;

/**
 *
 * @author xvpow
 */
public class Ch12_4 {
    public static void main(String[] args){
        Student st1 = new Student("Iris");
        Student.Book book1 = st1.new Book("A1","A0001");
        Student.Book book2 = st1.new Book("A2","A0002");
        st1.addBook(book1);
        st1.addBook(book2);
        st1.addBook("B3", "B001");
        
        st1.showBooks();
        
        
    }
}
