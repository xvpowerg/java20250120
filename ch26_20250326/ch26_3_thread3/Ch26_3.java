/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ch26_20250326.ch26_3_thread3;
import java.util.concurrent.Executors;
import java.util.concurrent.ExecutorService;
import java.util.Random;
import java.util.concurrent.TimeUnit;
public class Ch26_3 {
    public static void main(String[] args) {
        // TODO code application logic here
        Random ran = new Random();
       ExecutorService es =  Executors.newCachedThreadPool();
       for (int i =1; i<=10;i++){
           es.execute(()->{
               System.out.println("Start Run:"+Thread.currentThread().getName());
               
               try{
                   TimeUnit.SECONDS.sleep(ran.nextInt(5));
               }catch(Exception ex){
                   System.out.println(ex);
               }
                 System.out.println("Start Stop:"+Thread.currentThread().getName());
           
           });
           
       }
       
       //es.shutdown();
       es.shutdownNow();
    }
    
}
