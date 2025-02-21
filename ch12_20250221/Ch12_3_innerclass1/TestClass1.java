/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ch12_20250221.Ch12_3_innerclass1;
import java.util.function.Predicate;
/**
 *
 * @author xvpow
 */
public class TestClass1 {
    private String name;
    private int price;
    
    static class TestPrice implements Predicate<Integer>{
        private int min = 0;
        TestPrice(){
            min = 0;
        }
        TestPrice(int min){
            this.min = min;
        }
        
        public String toString(){
            return this.min+"";
        }
        
        public boolean test(Integer v){
            return v > min;
        }
    }
    TestClass1(String name,int price){
        this.name = name;
        this.price = price;
    }
    
    
    public void testPrice(TestPrice tp){
        if (tp.test(price)){
            System.out.println("Pass");
        }else{
            System.out.println("Error");
        }
    }
    
    public String toString(){
        return this.name+":"+this.price;
    }
}
