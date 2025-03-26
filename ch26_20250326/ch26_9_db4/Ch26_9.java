/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ch26_20250326.ch26_9_db4;
import java.sql.DriverManager;
import java.sql.Connection;
import java.sql.Statement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

public class Ch26_9 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
         String url = "jdbc:derby://localhost:1527/mydb20250326";
        String user = "qwer";
        String password = "12345";
        String sql = "SELECT * FROM student";
        ArrayList<Student> resultList = new ArrayList(); 
        try(Connection conn = DriverManager.getConnection(url,user,password);
                Statement p = conn.createStatement()){
            ResultSet result = p.executeQuery(sql);
            while(result.next()){
                int id = result.getInt(1);
                String name = result.getString("name");
                double score = result.getDouble(3);
                Student st = new Student(id,name,score);
                resultList.add(st);
                //System.out.println(id+":"+name+":"+score);
            }
        }catch(SQLException ex){
            System.out.println(ex);
        }
        System.out.println(resultList);
    }
    
}
