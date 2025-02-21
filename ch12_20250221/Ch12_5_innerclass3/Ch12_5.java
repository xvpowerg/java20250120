/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ch12_20250221.Ch12_5_innerclass3;
import java.util.function.Consumer;
/**
 *
 * @author xvpow
 */
public class Ch12_5 {

   static class Dog2 extends Dog{
       public void bark(){
           System.out.println("bibi");
       }
   }
    public static void main(String[] args) {
       Dog d1 = new Dog();
       d1.bark();
       Dog d2 = new Dog2();
       d2.bark();//bibi
       Dog d3 = new Dog(){
       
       public void bark(){
           System.out.println("MiMi");
       }
       
       };
       d3.bark();

       Consumer<Items.Item> itemsShowSytel = new Consumer<Items.Item> (){
           
           public void accept(Items.Item it){
               System.out.println(it);
           }
           
       };
       
       Items items = new Items();
       items.addItem(new Items.Item("A1",10));
       items.addItem(new Items.Item("B2",20));
       items.addItem(new Items.Item("C3",30));
       //items.showItems(itemsShowSytel);
       items.showItems(new Consumer<Items.Item>(){
       
           public void accept(Items.Item it){
               System.out.print(it);
           }
       
       });
       
       
       
    }
    
}
