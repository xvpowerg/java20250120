/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ch5_20250205.Ch5_4_object4;

/**
 *
 * @author xvpow
 */
public class Ch5_4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Animal a1 = new Animal("Bobo",10,2);
        a1.printInfo();
        Animal a2 = new Animal("LuLu",15,3);
        a2.printInfo();
        a2.setHeight(5);
        a2.setName("Joy");
        a2.setWeight(7.2f);
        a2.printInfo();
        
        Dog dog1 = new Dog();
        dog1.setName("Kuku");
        dog1.setWeight(2);
        dog1.setHeight(7);
        dog1.printInfo();
        
        Dog dog2 = new Dog("Yuyu",1,2.5f);
        dog2.printInfo();
        
        Cat cat1= new Cat("Kitty",5,10);
        cat1.printInfo();
        
         Animal a3 = dog2;//多型
         a3.printInfo();
        
    }
    
}
