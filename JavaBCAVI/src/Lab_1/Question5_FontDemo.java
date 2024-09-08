/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template

Wap to show how you can changes fonts in SWING
 */
package Lab_1;

import javax.swing.*;
import java.awt.*;

/**
 *
 * @author Dinesh
 */
public class Question5_FontDemo extends JFrame {

    public Question5_FontDemo() {
        // Create the frame
        setTitle("Font Change Demo");
        setSize(400, 200);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(new GridLayout(2, 1));

        // Create the first label with a plain font
        JLabel label1 = new JLabel("This is a plain font.", SwingConstants.CENTER);
        label1.setFont(new Font("Serif", Font.PLAIN, 20));

        // Create the second label with a bold italic font
        JLabel label2 = new JLabel("This is a bold italic font.", SwingConstants.CENTER);
        label2.setFont(new Font("Serif", Font.BOLD | Font.ITALIC, 20));

        // Add the labels to the frame
        add(label1);
        add(label2);

        // Make the frame visible
        setVisible(true);
    }

    public static void main(String[] args) {
        new Question5_FontDemo();
    }
}
