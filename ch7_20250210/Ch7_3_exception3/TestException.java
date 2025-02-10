/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ch7_20250210.Ch7_3_exception3;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.sql.SQLException;
/**
 *
 * @author xvpow
 */
public class TestException {
    public void testIoException(int v)throws IOException,SQLException{
        if (v >50){
            throw new IOException("IOError!");
        }else if(v > 30){
            throw new SQLException("SQLError");
        }
    }
    //FileNotFoundException 是　IOException子類
    public void testException2(int v2)throws IOException,FileNotFoundException{
        if (v2 > 50){
          throw new IOException("IOException ex");  
        }else if(v2 > 30){
          throw new FileNotFoundException("FileNotFoundException Ex");
        }
      
    }
}
