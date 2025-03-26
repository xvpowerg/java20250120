/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ch26_20250326.ch26_2_thread2;

/**
 *
 * @author xvpow
 */
public class Ch26_2 {
    
    static class TestLock{
        
        public synchronized void test1(TestLock lock,String name){
          System.out.println("AAAA:"+Thread.currentThread().getName());
          lock.myRun(name);
        }
        
        public synchronized void myRun(String name){
            System.out.println(name);
        }
    }

    public static void main(String[] args) {
       TestLock tlock1 = new TestLock();
       TestLock tlock2 = new TestLock();
       Thread t1 = new Thread(()->{
        tlock1.test1(tlock2, "Test1");
       });
       
       Thread t2 = new Thread(()->{
        tlock2.test1(tlock1, "Test2");
       });
      
       t1.start();
       t2.start();
       
        
    }
    
}
