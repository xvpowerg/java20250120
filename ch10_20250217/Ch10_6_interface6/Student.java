/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ch10_20250217.Ch10_6_interface6;

/**
 *
 * @author xvpow
 */
public class Student implements Iterator {
    private String name;
    private int[] scores = new int[3];
    private int index = -1;
    Student(String name){
        this.name = name;
    }
    public void addScore(int score){
        index++;
        scores[index] = score;
    }
    private int[] getScores(){
         return scores;
     }
    
    public int size(){
        return scores.length;
    }
    public Integer values(int index){
        return scores[index];
    }
    
    void test(){
        System.out.println("name:"+this.name);
        for (int s : getScores()){
            System.out.println(s);
        }
    }
    
}
