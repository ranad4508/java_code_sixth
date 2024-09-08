/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package JDBC;
import java.sql.*;

/**
 *
 * @author Dinesh
 */
public class SelectAllExample{
    public static void main(String[] args){
        String url = "jdbc:mysql://localhost:3306/db_java";
        String uname = "root";
        String pwd = "";
        
        try{
            Class.forName("com.mysql.cj.jdbc.Driver");
            
            Connection conn = DriverManager.getConnection(url, uname, pwd);
            String sql = "Select * from tbl_person";
            Statement stmt = conn.createStatement();
            ResultSet rs = stmt.executeQuery(sql);
            
            while(rs.next()){
                String name = rs.getString("Name");
                String address = rs.getString("Address");
                int salary = rs.getInt("Salary");
                
                System.out.println("Name: "+name+ " Address: "+address+" Salary: "+salary);
            }
            stmt.close();
            conn.close();
        }catch(ClassNotFoundException e){
            System.out.print(e);
        }catch(SQLException e){
            System.out.print(e);
        }
    }
    
}
