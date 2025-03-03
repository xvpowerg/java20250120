/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ch16_20250303.ch16_2_set2;
import java.util.ArrayList;
import java.util.HashSet;
/**
 *
 * @author xvpow
 */
public class Ch16_2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       String msg = "Ken:25,Lucy:26,Vivin:30,Lucy:26,Joy:31,Vivin:30,";
       String[] tmp1 =  msg.split(",");
       ArrayList<Person> personList = new ArrayList<>();
       for (String data :tmp1){
          String[] personData =  data.split(":");
          personList.add(new Person(personData[0],
          Integer.parseInt(personData[1])));
       }
       System.out.println(personList);
       tage:
       for (int i = 0; i <personList.size();i++){
           Person p =  personList.get(i);
           for (int k = i+1; k < personList.size();k++){
               if (p.equals(personList.get(k))){
                   System.out.println("重複!"+p);
                   break tage;
               }
           }
           
       }
       
       //幫我轉換msg成為一個Person的List
       //必須過濾重複
       HashSet<Person> pSet = new HashSet();
       for (Person p : personList){
           pSet.add(p);
       }
       System.out.println(pSet);
    }
    
}
