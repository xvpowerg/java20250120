/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ch19_20250310.Ch19_5_stream2;
import java.util.stream.Stream;
import java.util.stream.IntStream;
import java.util.stream.LongStream;
import java.util.stream.DoubleStream;
import java.util.Random;
/**
 *
 * @author xvpow
 */
public class Ch19_5 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Stream<Integer> st1 = Stream.of(1,2,4,5,6);
        st1.forEach(v->System.out.print(v+" "));
        System.out.println();
        Stream<Integer> st2 = Stream.generate(()->{
                Random random = new Random();
            return random.nextInt();
        });
        
        st2.limit(10).forEach(v->System.out.println(v));
        System.out.println("========================");
        st2.forEach(v->System.out.println(v));//Sream只能使用一次
    }
    
}
