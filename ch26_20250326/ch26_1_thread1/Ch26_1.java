/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ch26_20250326.ch26_1_thread1;


public class Ch26_1 {

    static class Test{
        private int count = 0;
        void runTest(){
            
           synchronized(this){
                for (int i =1; i<= 10; i++){
                    String name = Thread.currentThread().getName();
                    System.out.println(name+":"+count);
                    count++;
                }
           } 
           
        }
    }
    public static void main(String[] args) {
        Test t1 = new Test();
        //t1.runTest();
        //t1.runTest();
        Thread th1  = new Thread(()->{
            t1.runTest();
        },"Thread1");
        Thread th2  = new Thread(()->{
            t1.runTest();
        },"Thread2");
        
        th1.start();
        th2.start();
        
    }
    
}
