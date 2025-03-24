/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ch25_20250324.ch25_9_thread3;

/**
 *
 * @author xvpow
 */
public class Ch25_9 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        String name = Thread.currentThread().getName();
        System.out.println(name);
        
        Thread t1 = new Thread(()->{
        
            String name2 = Thread.currentThread().getName();
            System.out.println(name2);
        
        });
        t1.start();
          Thread t2 = new Thread(()->{
        
            String name2 = Thread.currentThread().getName();
            System.out.println(name2);
        
        },"MyThread");
        t2.start();
    }
    
}
