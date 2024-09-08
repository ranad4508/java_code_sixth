/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template

WAP a Program to show the implementation of Mouse Listener
 */
package Lab_1;

import javax.swing.*;
import java.awt.*;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

/**
 *
 * @author Dinesh
 */
public class Question3_MouseListenerDemo extends JFrame implements MouseListener {

    private JPanel panel;
    private JLabel statusLabel;

    public Question3_MouseListenerDemo() {
        // Create the frame
        setTitle("MouseListener Demo");
        setSize(400, 300);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(new BorderLayout());

        // Create the panel
        panel = new JPanel();
        panel.addMouseListener(this);
        
        statusLabel = new JLabel();
        
        // Add components to the frame
        add(panel, BorderLayout.CENTER);
        add(statusLabel, BorderLayout.SOUTH);

        // Make the frame visible
        setVisible(true);
    }

    @Override
    public void mouseClicked(MouseEvent e) {
        statusLabel.setText("Mouse Clicked at (" + e.getX() + ", " + e.getY() + ")");
    }

    @Override
    public void mousePressed(MouseEvent e) {
        statusLabel.setText("Mouse Pressed at (" + e.getX() + ", " + e.getY() + ")");
    }

    @Override
    public void mouseReleased(MouseEvent e) {
        statusLabel.setText("Mouse Released at (" + e.getX() + ", " + e.getY() + ")");
    }

    @Override
    public void mouseEntered(MouseEvent e) {
        statusLabel.setText("Mouse Entered the panel.");
    }

    @Override
    public void mouseExited(MouseEvent e) {
        statusLabel.setText("Mouse Exited the panel.");
    }

    public static void main(String[] args) {
        new Question3_MouseListenerDemo();
    }
}
