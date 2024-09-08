/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template

Write a Java program that creates a JFrame with a JMenuBar. Add a JMenu labeled "File" with two 
JMenuItems labeled "Open" and "Exit". Implement event handling to print "Open selected" and 
close the application for "Exit" when these menu items are 

 */
package Lab_1;

import javax.swing.*;
import java.awt.event.*;

/**
 *
 * @author Dinesh
 */
public class Question1_EventHandling {

    public static void main(String[] args) {
        // Create the JFrame
        JFrame frame = new JFrame("Menu Example");
        JLabel label;
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(400, 300);

        // Create the JMenuBar
        JMenuBar menuBar = new JMenuBar();

        // Create the "File" JMenu
        JMenu fileMenu = new JMenu("File");
        
        label = new JLabel();
        frame.add(label);

        // Create the "Open" JMenuItem
        JMenuItem openItem = new JMenuItem("Open");
        openItem.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String text = "Open Selected";
                label.setText(String.valueOf(text));
            }
        });

        // Create the "Exit" JMenuItem
        JMenuItem exitItem = new JMenuItem("Exit");
        exitItem.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                System.exit(0);
            }
        });

        // Add the JMenuItems to the JMenu
        fileMenu.add(openItem);
        fileMenu.add(exitItem);

        // Add the JMenu to the JMenuBar
        menuBar.add(fileMenu);

        // Set the JMenuBar to the JFrame
        frame.setJMenuBar(menuBar);

        // Make the frame visible
        frame.setVisible(true);
    }
}
