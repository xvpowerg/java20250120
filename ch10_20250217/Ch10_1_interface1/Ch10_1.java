/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ch10_20250217.Ch10_1_interface1;

/**
 *
 * @author xvpow
 */
public class Ch10_1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
      Fly f1 = null;
      var action = 3;
      switch(action){
          case 1:
              f1 = new Bird();
              break;
          case 2:
              f1 = new AirPlan();
              break;
          default:
              System.out.println("Error");
              return;
      }
      f1.flying();
      
      //AirPlan
    }
    
}
