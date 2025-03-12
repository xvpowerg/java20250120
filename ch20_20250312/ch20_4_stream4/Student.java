/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ch20_20250312.ch20_4_stream4;
import java.util.ArrayList;
import java.util.stream.Stream;
public class Student {
    private String name;
    private int score;
    private ArrayList<String>books = new ArrayList();
    
    Student(String name,int score){
        this.name = name;
        this.score = score;
    }
    
    public void addBook(String book){
        books.add(book);
    }
    public Stream<String> getBook(){
        return books.stream();
    }
    public String getName(){
        return this.name;
    }
    
    public int getScore(){
        return score;
    }
    
    public String toString(){
        return this.name+":"+this.score;
    }
    
    
    public boolean equals(Object obj){
        Student st = (Student)obj;
        return this.score == st.score && this.name.equals(st.name);
    }
    
    public int hashCode(){
        return this.score+this.name.hashCode();
    }
    
}
