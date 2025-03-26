/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ch26_20250326.ch26_5_thread5;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;
import java.util.concurrent.ExecutorService;
import java.util.Random;
import java.util.concurrent.TimeUnit;
public class Ch26_5 {

    public static void main(String[] args) {
            Random ran = new Random();
        ExecutorService es = Executors.newCachedThreadPool();
        Future<Integer> f1 = es.submit(()->{
        
              System.out.println("Start:");
              int value = ran.nextInt();
              TimeUnit.SECONDS.sleep(3);
        return value;
        
        });
        
        System.out.println("Wait ... Futire...");
       
        es.execute(()->{
                try{
                   int value = f1.get();
                   System.out.println("Result:"+value);
               }catch(Exception ex){

              }
        
        });
        
        
       
         System.out.println("End ... Futire...");
        es.shutdown();
       
        
    }
    
}
