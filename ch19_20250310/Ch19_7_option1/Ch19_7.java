/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ch19_20250310.Ch19_7_option1;
import java.util.Optional;
/**
 *
 * @author xvpow
 */
public class Ch19_7 {

//    static void testName(String name){
//        if (name!= null && name.length() > 2){
//            System.out.println(name);
//        }else{
//           System.out.println("Error!");
//        }
//    }
        static void testName(Optional<String> nameOp){
            
        if (nameOp.isPresent() &&
                nameOp.get().length() > 2){
            System.out.println(nameOp.get());
        }else{
           System.out.println("Error!");
        }
    }
    
    public static void main(String[] args) {
        Student st1 = new Student();
        st1.setName("Ken");
        testName(st1.getName());
         Student st2 = new Student();
          testName(st2.getName());
    }
    
}
