/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ch23_20250319.ch23_6_io6;

import java.time.LocalDateTime;
import java.io.Serializable;
import java.io.IOException;
public class Item implements Serializable {
    private static final long serialVersionUID = 201L;
    private String name;
    private int price;
    private String dataTime;
    Item(String name,int price,String dataTime){
        this.name = name;
        this.price = price;
        this.dataTime = dataTime;
    }
    
    //序列化會執行
    private void writeObject(java.io.ObjectOutputStream out)throws IOException{
        System.out.println("writeObject");
        out.writeObject(this.name);
        out.writeInt(this.price);
    }
    //反序列化
    private void readObject(java.io.ObjectInputStream in)throws IOException,ClassNotFoundException{
        System.out.println("readObject");
        this.name = in.readObject().toString();
        this.price = in.readInt();
        this.dataTime = LocalDateTime.now().toString();
    } 
    
    Item(){
        
    }
    public String toString(){
        return name+":"+price+":"+dataTime;
    }
}
