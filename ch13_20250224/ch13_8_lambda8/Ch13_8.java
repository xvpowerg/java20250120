/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ch13_20250224.ch13_8_lambda8;
import java.util.function.BiFunction;
import java.util.List;
import java.util.ArrayList;
/**
 *
 * @author xvpow
 */
public class Ch13_8 {

    
    static List<Item> toItemList(BiFunction<String,Integer,Item> bifuc,
            List<Object[]> values){
            ArrayList<Item> itmeList = new ArrayList<Item>();
            for (Object[] v : values){
                
                Item it = bifuc.apply(v[0].toString(), 
                        Integer.valueOf(v[1].toString()));
                itmeList.add(it);
            }
        
        return itmeList;
    }
    
    public static void main(String[] args) {
        
        ArrayList<Object[]> itemValues = new ArrayList<>();
        itemValues.add(new Object[]{"A",100});
        itemValues.add(new Object[]{"B",150});
        itemValues.add(new Object[]{"C",200});
      List<Item> itemList =  toItemList(
        (name, price)->new Item(name,price)
       ,itemValues);
      System.out.println(itemList);
    }
    
}
