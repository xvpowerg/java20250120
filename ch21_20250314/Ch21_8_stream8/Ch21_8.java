/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ch21_20250314.Ch21_8_stream8;
import java.util.ArrayList;
import java.util.stream.Collectors;

/**
 *
 * @author xvpow
 */
public class Ch21_8 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       Item item1 = new Item("A",18);
       Item item2 = new Item("B",17);
       Item item3 = new Item("C",25);
       Item item4 = new Item("D",30);
       Item item5 = new Item("E",18);

       
       ArrayList<Item> dataList = new ArrayList<>();
       dataList.add(item1);
       dataList.add(item2);
       dataList.add(item3);
       dataList.add(item4);
       dataList.add(item5);
      String msg =  dataList.stream().map(it->it.toString())
               .collect(Collectors.joining("#", "msg", "."));
      System.out.println(msg);
       //使用joining 產生字串 格式如下 使用#隔開 開頭Msg: 結尾.
    }
    
}
