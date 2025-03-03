/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ch16_20250303.ch16_1_set1;
import java.util.HashSet;
/**
 *
 * @author xvpow
 */
public class Ch16_1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       Item item1 = new Item("A",100);
       Item item2 = new Item("B",77);
       Item item3 = new Item("C",85);
       Item item4 = new Item("A",100);
       System.out.println(item1.equals(item4));
       HashSet<Item> itSet = new HashSet<>();
       itSet.add(item1);
       itSet.add(item2);
       itSet.add(item3);
       itSet.add(item4);
       for(Item it : itSet){
           System.out.println(it);
       }
       
    }
    
}
