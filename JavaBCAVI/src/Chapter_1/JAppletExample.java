/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Chapter_1;

/**
 *
 * @author Dinesh
 */
import javax.swing.*;
import java.awt.*;

public class JAppletExample extends JApplet {
    @Override
    public void init() {
        JLabel label = new JLabel("Hello, JApplet!", SwingConstants.CENTER);
        add(label);
    }
    
    public static void main(String[] args) {
        JFrame frame = new JFrame("JApplet Example");
        JApplet applet = new JAppletExample();
        frame.getContentPane().add(applet);
        frame.setSize(400, 300);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        applet.init();
        applet.start();
        frame.setVisible(true);
    }
}
