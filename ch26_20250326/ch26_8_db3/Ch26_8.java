/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ch26_20250326.ch26_8_db3;
import java.sql.DriverManager;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class Ch26_8 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
         String url = "jdbc:derby://localhost:1527/mydb20250326";
        String user = "qwer";
        String password = "12345";
        String sql = "SELECT * FROM student WHERE id=?";
        try(Connection conn = DriverManager.getConnection(url,user,password);
                PreparedStatement p = conn.prepareStatement(sql)){
            p.setString(1, "2001");
            ResultSet result = p.executeQuery();
            while(result.next()){
                int id = result.getInt(1);
                String name = result.getString("name");
                double score = result.getDouble(3);
                System.out.println(id+":"+name+":"+score);
            }
        }catch(SQLException ex){
            System.out.println(ex);
        }
        
    }
    
}
