/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ch12_20250221.Ch12_4_innerclass2;
import java.util.ArrayList;
/**
 *
 * @author xvpow
 */
public class Student {
    private String name;
    private ArrayList<Book> books = new ArrayList<Book>();
    
    Student(String name){
        this.name = name;
    }
    public class Book{
        private String name;
        private String isbn;
        Book(String name,String isbn){
            this.name = name;
            this.isbn = isbn;
        }
        public String toString(){
            return this.name+":"+this.isbn;
        }
    }
    
    public void addBook(Book book){
        books.add(book);
    }
    public void addBook(String name,String isbn){
        Book book = new Book(name,isbn);
        books.add(book);
    }
    
    public void showBooks(){
        System.out.println("Student name:"+name);
        for (Book b : books){
            System.out.println(b);
        }
    }
    
}
