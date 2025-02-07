/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ch6_20250207.Ch6_1_obj1;

/**
 *
 * @author xvpow
 */
public class Ch6_1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Employee emp1 = new Employee("Lucy",25000);
        emp1.setName("Ken");
        emp1.setSalary(65000);
        emp1.printInfo();
        
        Employee emp2 = new PM("Iris",56000);
        emp2.printInfo();
    }
    
}
