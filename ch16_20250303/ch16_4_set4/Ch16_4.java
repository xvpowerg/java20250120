/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ch16_20250303.ch16_4_set4;
import java.util.TreeSet;
/**
 *
 * @author xvpow
 */
public class Ch16_4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        TreeSet<Product> treeSet = new TreeSet<>();
        treeSet.add(new Product("A",50));
        treeSet.add(new Product("B",20));
        treeSet.add(new Product("C",70));
        treeSet.add(new Product("D",45));
        treeSet.add(new Product("E",16));
        treeSet.add(new Product("C",16));
        System.out.println(treeSet);
    }
    
}
