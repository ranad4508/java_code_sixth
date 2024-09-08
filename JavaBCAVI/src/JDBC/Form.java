/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package JDBC;

import java.awt.event.*;
import javax.swing.*;
import java.awt.*;
import java.sql.*;

public class Form implements ActionListener {

    JFrame f1;
    JLabel l1, l2, l3;
    JTextField t1, t2, t3;
    JButton b1, b2;

    Form() {
        f1 = new JFrame("form");
        f1.setSize(400, 400);
        f1.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        f1.setLayout(new GridLayout(4, 2, 5, 5));

        l1 = new JLabel("Name");
        t1 = new JTextField(20);
        l2 = new JLabel("Address");
        t2 = new JTextField(20);
        l3 = new JLabel("Salary");
        t3 = new JTextField(20);
        b1 = new JButton("submit");
        b2 = new JButton("reset");
        b1.addActionListener(this);
        b2.addActionListener(this);

        f1.add(l1);
        f1.add(t1);
        f1.add(l2);
        f1.add(t2);
        f1.add(l3);
        f1.add(t3);
        f1.add(b1);
        f1.add(b2);

        f1.setVisible(true);

    }

    public static void main(String[] args) {
        new Form();
    }

    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == b2) {
            t1.setText("");
            t2.setText("");
            t3.setText("");
        }

        if (e.getSource() == b1) {
            String name = t1.getText();
            String address = t2.getText();
            double salary = Double.parseDouble(t3.getText());

            String url = "jdbc:mysql://localhost:3306/db_java";
            String uname = "root";
            String pwd = "";

            try {

                Class.forName("com.mysql.cj.jdbc.Driver");
                Connection con = DriverManager.getConnection(url, uname, pwd);

                String sql = "insert into tbl_person(name,address,salary) Values (?,?,?)";

                //PREPARED STATEMENT
                PreparedStatement st = con.prepareStatement(sql);
                st.setString(1, name);
                st.setString(2, address);
                st.setDouble(3, salary);
                st.execute();

                con.close();

            } catch (Exception ex) {
                System.out.println(ex);
            }
            
            JOptionPane.showMessageDialog(null,"record saved");
        }
    }
}