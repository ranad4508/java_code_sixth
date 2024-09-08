/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Chapter_1;

import static java.awt.AWTEventMulticaster.add;
import javax.swing.*;

/**
 *
 * @author Dinesh
 */
public class SwingIsA extends JFrame {

    JButton b1;
    SwingIsA() {
        setTitle("Swing is a application");
        b1 = new JButton("Click me");
        setSize(400, 300);
        setResizable(false);
        add(b1);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setVisible(true);
    }

    public static void main(String[] args) {
        new SwingIsA();
    }

}
