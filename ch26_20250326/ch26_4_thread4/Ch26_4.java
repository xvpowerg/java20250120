/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ch26_20250326.ch26_4_thread4;
import java.util.concurrent.Executors;
import java.util.concurrent.ExecutorService;
import java.util.Random;
import java.util.concurrent.TimeUnit;
/**
 *
 * @author xvpow
 */
public class Ch26_4 {

    
    public static void main(String[] args) {
       ExecutorService es =  Executors.newFixedThreadPool(3);
       Random ran = new Random();
       for(int i =1;i<=10;i++){
            es.submit(()->{
                  System.out.println("Start:"+Thread.currentThread().getName());
                  try{
                      TimeUnit.SECONDS.sleep(ran.nextInt(5));
                  }catch(Exception ex){
                      
                  }
                  System.out.println("End:"+Thread.currentThread().getName());
            });     
       }
       es.shutdown();
       
       
    }
    
}
