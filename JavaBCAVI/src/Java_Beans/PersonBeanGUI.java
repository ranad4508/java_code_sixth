/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Java_Beans;
import javax.swing.*;
import java.awt.event.*;
import java.awt.*;

/**
 *
 * @author Dinesh
 */
public class PersonBeanGUI {
    public static void main(String[] args) {
        JFrame frame = new JFrame("PersonBean Example");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(300, 200);
        
        PersonBean person = new PersonBean();
        
        // Create text fields for name and age
        JTextField nameField = new JTextField(20);
        JTextField ageField = new JTextField(10);
        
        JButton updateButton = new JButton("Update");
        
        // Add an action listener to the button
        updateButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                person.setName(nameField.getText());
                
                try {
                    person.setAge(Integer.parseInt(ageField.getText()));
                } catch (NumberFormatException ex) {
                    JOptionPane.showMessageDialog(frame, "Please enter a valid age.", "Invalid Input", JOptionPane.ERROR_MESSAGE);
                    return;
                }
                
                JOptionPane.showMessageDialog(frame, "Person Updated:\n" + "Name: "+person.getName() + "\nAge: " + person.getAge(), "Success", JOptionPane.INFORMATION_MESSAGE);
            }
        });
        
        // Use a JPanel to organize the components
        JPanel panel = new JPanel();
        panel.setLayout(new GridLayout(3, 2)); // 3 rows, 2 columns
        panel.add(new JLabel("Name:"));
        panel.add(nameField);
        panel.add(new JLabel("Age:"));
        panel.add(ageField);
        panel.add(new JLabel("")); // Empty label for spacing
        panel.add(updateButton);
        
        frame.add(panel);
        frame.setVisible(true);
    }
}
