/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ch11_20250219.ch11_7_interface7;
import java.util.ArrayList;

public class Items2 implements MyIterator {
    private  ArrayList<Item> itemList = new ArrayList(); 
    {
        itemList.add(new Item("Z",300));
        itemList.add(new Item("X",310));
        itemList.add(new Item("C",600));
    }
    public int size(){
        return itemList.size();
    }
    public Object value(int index){
        return itemList.get(index);
    }

}
