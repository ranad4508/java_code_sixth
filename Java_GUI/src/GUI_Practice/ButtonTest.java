/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package GUI_Practice;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class ButtonTest extends JFrame {

    private JButton plainButton, fancyButton;

    public ButtonTest() {
        super("Button test");
        Container container = getContentPane();
        container.setLayout(new FlowLayout());

        plainButton = new JButton("I'm button");
        container.add(plainButton);

        Icon icon1 = new ImageIcon("C:\\Users\\Dinesh\\Documents\\NetBeansProjects\\Java_GUI\\src\\images\\Icon2.png");
        Icon icon2 = new ImageIcon("C:\\Users\\Dinesh\\Documents\\NetBeansProjects\\Java_GUI\\src\\images\\pet.png");

        fancyButton = new JButton("fancy button", icon1);
        fancyButton = new JButton("Icon for pet", icon2);
        fancyButton.setRolloverIcon(icon2);
        container.add(fancyButton);
        ButtonHandler handler = new ButtonHandler();
        plainButton.addActionListener(handler);
        fancyButton.addActionListener(handler);
        setSize(350, 200);
        setVisible(true);

    }

    public static void main(String[] args) {
        ButtonTest application = new ButtonTest();
        application.setDefaultCloseOperation(EXIT_ON_CLOSE);
    }

    private class ButtonHandler implements ActionListener {

        public void actionPerformed(ActionEvent event) {
            JOptionPane.showMessageDialog(ButtonTest.this, "Your Pressed: " + event.getActionCommand());
            
        }
    }
}
