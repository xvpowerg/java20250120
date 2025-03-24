/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ch25_20250324.ch25_10_thread4;

/**
 *
 * @author xvpow
 */
public class Ch25_10 {

    static class Test1{
        int count = 0;
        public void runTest(){
            for (int i =1; i<= 10; i++){
                System.out.println(count++);
            }
        }
    }
    public static void main(String[] args) {
       Test1 t1 = new Test1();
       Thread th1 = new Thread(()->{
       t1.runTest();
       
       });
       
       Thread th2 = new Thread(()->{
          t1.runTest();
       });
       th1.start();
       th2.start();
    
    }
    
}
