/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ch20_20250312.ch20_5_stream5;
import java.util.ArrayList;
import java.util.stream.Stream;
import java.util.stream.IntStream;
public class Student {
    private String name;
    private ArrayList<Integer> scores;
    private ArrayList<String> books = new ArrayList();
    
    Student(String name){
        this.name = name;
        this.scores = new ArrayList();
    }
    public void addScore(int score){
        scores.add(score);
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
    
    public IntStream getScore(){
        return scores.stream().mapToInt(s->s);
    }
    

    
}
