/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Chapter_1;

import javax.swing.JLabel;
import javax.swing.JWindow;
import javax.swing.SwingConstants;

/**
 *
 * @author Dinesh
 */
public class JWindowExample {
    public static void main(String[] args) {
        JWindow window = new JWindow();
        window.setSize(400, 300);

        JLabel label = new JLabel("Hello, JWindow!", SwingConstants.CENTER);
        window.getContentPane().add(label);

        window.setVisible(true);
    }
}