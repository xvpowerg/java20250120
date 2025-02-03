/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ch4_20250203.Ch4_3_vargs;

/**
 *
 * @author xvpow
 */
public class Ch4_3 {
    //最少0個 最多無限多參數
    static int test1(int ... values){
        int sum = 0;
       // sum = v1 + v2;
       for (int i  : values){
           sum += i;
       }
        return sum;
    }
    //長參數只能是最後一個
    static void test2(String v1,int ... v2){
        System.out.println(v1);
        for (int v : v2){
            System.out.print(v+" ");
        }
        System.out.println();
    }
    public static void main(String[] args) {
        // TODO code application logic here
        int v1 = test1(20,15);
        System.out.println(v1);
          int v2 = test1(20,45);
        System.out.println(v2);
          int v3 = test1(20,65);
        System.out.println(v3);
          int v4 = test1(20,75);
        System.out.println(v4);
          int v5 = test1(20,95,10,20,30,40,50,60,70);
        System.out.println(v5);
        test2("Ken",75,86,99);
    }
    
}
