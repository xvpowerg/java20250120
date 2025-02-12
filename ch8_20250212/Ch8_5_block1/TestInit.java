/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ch8_20250212.Ch8_5_block1;

public class TestInit {
    String[] msg = new String[500];
    String name;
    
    {
       for (int i =0; i < msg.length;i++){
            msg[i] = "";
        }
    
    }
    public TestInit(){
     
    }
    public TestInit(String name){
        this.name = name;
    }
    public String getMsg(int index){
        return msg[index];
    }
    
}
