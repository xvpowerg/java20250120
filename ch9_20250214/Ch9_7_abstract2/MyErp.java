/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ch9_20250214.Ch9_7_abstract2;
import java.util.ArrayList;
/**
 *
 * @author xvpow
 */
public abstract class MyErp {
    private ArrayList<String> getData(){
        ArrayList<String> data = new ArrayList<>();
        return data;
    }
    
    public void showReport(){
          ArrayList<String> data =  getData();
          data.add("Ken,100,95,75");
          data.add("Iris,91,88,55");
          data.add("Lucy,77,31,100");
          
          reportStyle(data);
    }
    protected  abstract void reportStyle(ArrayList<String> data);
}
