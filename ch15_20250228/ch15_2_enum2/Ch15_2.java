/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ch15_20250228.ch15_2_enum2;

/**
 *
 * @author xvpow
 */
public class Ch15_2 {

    enum Fruit{
        APPLE,
        BANANA,
        KEWI
    }
    public static void main(String[] args) {
      System.out.println(Fruit.APPLE);
      System.out.println(Fruit.BANANA);
      
      System.out.println(Fruit.BANANA.name());
      System.out.println(Fruit.BANANA.ordinal());
   
     /*
     Fruit f1 =  Fruit.valueOf("APPLE");
     System.out.println(f1);
     Fruit f2 =  Fruit.valueOf("KEWI");
     System.out.println(f2);
     Fruit f3 =  Fruit.valueOf("AAAA");
     System.out.println(f3);*/
     
     String enumType = "AAAAA";
     try{
         
        Fruit f = Fruit.valueOf(enumType);
        System.out.println(f);
     }catch(IllegalArgumentException ex){
         System.out.println("Not Found ");
     }
      Fruit[] frits = Fruit.values();
      for (Fruit f : frits){
          System.out.println(f);
      }
     //Not Found 
    }
    
}
