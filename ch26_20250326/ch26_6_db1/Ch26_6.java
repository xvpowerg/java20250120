/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ch26_20250326.ch26_6_db1;
import java.sql.DriverManager;
import java.sql.Connection;
import java.sql.Statement;
import java.sql.SQLException;
/**
 *
 * @author xvpow
 */
public class Ch26_6 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        String url = "jdbc:derby://localhost:1527/mydb20250326";
        String user = "qwer";
        String password = "12345";
     try(  Connection con =  DriverManager.getConnection(url, user, password);
           Statement stm =  con.createStatement();){
            stm.executeUpdate("INSERT INTO student(id,name,score)VALUES(1001,'Sean',71.1)");
      }catch(SQLException sql){
          System.out.println(sql);
      }
    } 
}
