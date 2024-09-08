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
public class InsertToTable {

    public static void main(String[] args) throws ClassNotFoundException {
        String url = "jdbc:mysql://localhost:3306/db_java";
        String uname = "root";
        String password = "";
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection conn = DriverManager.getConnection(url, uname, password);

            String query = "INSERT INTO USERS(Name, Age, Roll_no, Password) values('Krypton','23', 101, 'krypton123')";

            Statement stmt = conn.createStatement();
            stmt.executeUpdate(query);
            stmt.close();
            conn.close();
            System.out.println("User inserted successfully");
        } catch (SQLException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }

}
