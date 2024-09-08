/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package JDBC;

import java.util.Scanner;
import java.sql.*;

/**
 *
 * @author Dinesh
 */
public class SaveRecord_Multiple {

    public static void main(String[] args) {
        Scanner ob = new Scanner(System.in);
        String url = "jdbc:mysql://localhost:3306/db_java";
        String uname = "root";
        String pwd = "";
        try {
            //step 1: load the database driver
            Class.forName("com.mysql.cj.jdbc.Driver");
            //step 2:create connection to database
            Connection con
                    = DriverManager.getConnection(url, uname, pwd);
            for (int i = 1; i <= 3; i++) {
                System.out.println("Enter name,address ,salary");
                String Name = ob.next();
                String Address = ob.next();
                double Salary = ob.nextDouble();
                String sql
                        = "Insert into tbl_person"
                        + "(Name,Address,Salary) Values (?,?,?)";
                PreparedStatement st = con.prepareStatement(sql);
                st.setString(1, Name);
                st.setString(2, Address);
                st.setDouble(3, Salary);
                st.execute();
            }
            con.close();
            System.out.println("record saved");
        } catch (Exception ex) {
            System.out.println(ex);
        }

    }

}
