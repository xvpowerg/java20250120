/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ch9_20250214.Ch9_8_abstract3;
import ch9_20250214.Ch9_7_abstract2.MyErp;
import java.util.ArrayList;
/**
 *
 * @author xvpow
 */
public class MyErpReport extends MyErp {
    protected void reportStyle(ArrayList<String> data){
        for (String d : data){
            int total = 0;
     
            String[] newData = d.split(",");
            int len = newData.length - 1;
            System.out.print("name:"+newData[0]+" ");
            System.out.print("Score:");
            for (int i = 1; i < newData.length;i++){
                int score =  Integer.parseInt(newData[i]);
                total += score;
         
                System.out.print(score+" ");
            }
            System.out.printf("total:%d ",total);
            float avg = total / (float)len;
            System.out.printf("avg:%.2f ",avg);
            System.out.println();
            //total
            //avg:
        }
        
    }
}
