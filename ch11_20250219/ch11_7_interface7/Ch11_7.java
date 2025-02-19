/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ch11_20250219.ch11_7_interface7;

/**
 *
 * @author xvpow
 */
public class Ch11_7 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
         //Consumer<T> 接收
         //Supplier<T> 回傳
        //Function<T,​R> 轉換
        //UnaryOperator<T> 內部計算
        //Predicate<T> 驗證
      
        
        Items it1 = new Items();
        it1.foreach(new MyShowItem());
        
        System.out.println("\n======================");
        
        Items2 it2 = new Items2();
        it2.foreach(new MyShowItem2());
    }
    
}
