/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Lab_2;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.util.Scanner;

/**
 *
 * @author Dinesh
 */
public class Question3_InsertUsingScanner {
    public static void main(String[] args) {
        Scanner ob = new Scanner(System.in);
        String url = "jdbc:mysql://localhost:3306/db_java";
        String uname = "root";
        int number;
        String pwd = "";
        try {
            //step 1: load the database driver
            Class.forName("com.mysql.cj.jdbc.Driver");
            //step 2:create connection to database
            Connection con
                    = DriverManager.getConnection(url, uname, pwd);
            System.out.println("Enter number you want to insert: ");
            number = ob.nextInt();
            for (int i = 1; i <= number; i++) {
                System.out.println("Enter id, name ,age");
               int id = ob.nextInt();
               String name = ob.next();
               int age = ob.nextInt();
                String sql
                    = "Insert into students"
                    + "(id,name,age) Values (?,?,?)";
            PreparedStatement st = con.prepareStatement(sql);
            st.setInt(1, id);
            st.setString(2, name);
            st.setInt(3, age);
            st.execute();
            }
            con.close();
            System.out.println("Record saved in Students");
        } catch (Exception ex) {
            System.out.println(ex);
        }

    }
}
