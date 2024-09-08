package JDBC;

import java.sql.*;

public class SaveRecord {
    public static void main(String[] args) {
        String url = "jdbc:mysql://localhost:3306/db_java";
        String uname = "root";
        String password = "";

        try {
            // Load MySQL JDBC Driver
            Class.forName("com.mysql.cj.jdbc.Driver");
            
            // Establish the connection
            Connection con = DriverManager.getConnection(url, uname, password);
            
            // Create SQL statement
            String sql = "CREATE TABLE USERS ("
                       + "ID INT PRIMARY KEY NOT NULL, "
                       + "Name VARCHAR(100) NOT NULL, "
                       + "Age VARCHAR(3) NOT NULL, "
                       + "Roll_no INT, "
                       + "Password VARCHAR(100) NOT NULL"
                       + ")";
            
            // Create a Statement
            Statement stmt = con.createStatement();
            
            // Execute the SQL statement
            stmt.executeUpdate(sql);
            
            // Close the connection
            
            stmt.close();
            con.close();
            System.out.println("Table created successfully");
            
        } catch (ClassNotFoundException e) {
            System.out.println("JDBC Driver not found");
        } catch (SQLException e) {
            System.out.println("SQL Exception occurred");
        }
    }
}
