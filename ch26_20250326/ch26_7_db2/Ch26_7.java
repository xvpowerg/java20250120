/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ch26_20250326.ch26_7_db2;
import java.sql.DriverManager;
import java.sql.Connection;
import java.sql.Statement;
import java.sql.SQLException;
/**
 *
 * @author xvpow
 */
public class Ch26_7 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //交易
         String url = "jdbc:derby://localhost:1527/mydb20250326";
        String user = "qwer";
        String password = "12345";
        try(Connection conn = DriverManager.getConnection(url,user,password);
              Statement stm =  conn.createStatement() ){
             conn.setAutoCommit(false);
              stm.executeUpdate("INSERT INTO student(id,name,score)VALUES(2003,'TTT',71.1)");
               stm.executeUpdate("INSERT INTO student(id,name,score)VALUES(2004,'YYYY',71.1)");
               stm.executeUpdate("INSERT INTO student(id,name,score)VALUES(2005,'KKKK',71.1)");
               conn.commit();
        }catch(SQLException ex){
            System.out.println(ex);
        }
        
    }
    
}
