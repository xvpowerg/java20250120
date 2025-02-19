/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ch11_20250219.ch11_7_interface7;

/**
 *
 * @author xvpow
 */
public class Items implements MyIterator {
    private Item[] items = new Item[3]; 
    {
        items[0] = new Item("A",100);
        items[1] = new Item("B",150);
        items[2] = new Item("C",200);
    }
    
    public int size(){
        return items.length;
    }
    
    public Object value(int index){
        return items[index];
    }
    
}
