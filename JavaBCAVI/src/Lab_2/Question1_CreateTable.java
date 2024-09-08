/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Lab_2;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

/*
Write a Java program that connects to a MySQL database and creates a table named
 students with columns id (integer, primary key), name (varchar), and age (integer).
*/
/**
 *
 * @author Dinesh
 */
public class Question1_CreateTable {
    public static void main(String[] args) throws ClassNotFoundException {
        String url = "jdbc:mysql://localhost:3306/db_java";
        String uname = "root";
        String password = "";
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection conn = DriverManager.getConnection(url, uname, password);

            String query = "Create table students(ID INT PRIMARY KEY NOT NULL,"
                    + " Name VARCHAR(100) NOT NULL,"
                    + "Age INT(3) NOT NULL)";

            Statement stmt = conn.createStatement();
            stmt.executeUpdate(query);
            stmt.close();
            conn.close();
            System.out.println("Table Students successfully");
        } catch (SQLException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
    
}
