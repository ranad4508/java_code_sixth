/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Chapter_1;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

/**
 *
 * @author Dinesh
 */
public class KeyEventDemo extends JFrame implements KeyListener {

    private final JTextField textField;

    public KeyEventDemo() {
        setTitle("Key Event Demo");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(300, 200);

        //Create text field
        textField = new JTextField();
        textField.addKeyListener(this);
        //add text field to frame
        add(textField);
        setVisible(true);
    }

    
    @Override
    public void keyTyped(KeyEvent e) {
        //not used in this example
    }

    @Override
    public void keyPressed(KeyEvent e) {
        textField.setText("Key Pressed: " + KeyEvent.getKeyText(e.getKeyCode()));
    }

    @Override
    public void keyReleased(KeyEvent e) {
        //Not used in this example

    }

    public static void main(String[] main) {
        new KeyEventDemo();
    }
}
