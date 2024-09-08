/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Chapter13_14_GUI;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class CustomPanelTest extends JFrame {

    private JPanel buttonPanel;
    private CustomPanel myPanel;
    private JButton circleButton, squareButton;

    // set up GUI
    public CustomPanelTest() {
        super("CustomPanel Test");

 // create custom drawing area
        myPanel = new CustomPanel();
        myPanel.setBackground(Color.GREEN);
        // set up squareButton
        squareButton = new JButton("Square");
        squareButton.addActionListener(
                new ActionListener() { // anonymous inner class

                    // draw a square
                    public void actionPerformed(ActionEvent event) {
                        myPanel.draw(CustomPanel.SQUARE);
                    }

                } // end anonymous inner class

        ); // end call to addActionListener

        circleButton = new JButton("Circle");
        circleButton.addActionListener(
                new ActionListener() { // anonymous inner class

                    // draw a circle
                    public void actionPerformed(ActionEvent event) {
                        myPanel.draw(CustomPanel.CIRCLE);
                    }

                } // end anonymous inner class

        ); // end call to addActionListener
        // set up panel containing buttons
        buttonPanel = new JPanel();
        buttonPanel.setLayout(new GridLayout(1, 2));
        buttonPanel.add(circleButton);
        buttonPanel.add(squareButton);

        // attach button panel & custom drawing area to content pane
        Container container = getContentPane();
        container.add(myPanel, BorderLayout.CENTER);
        container.add(buttonPanel, BorderLayout.SOUTH);

        setSize(300, 150);
        setVisible(true);

    } // end constructor CustomPanelTest

    public static void main(String args[]) {
        CustomPanelTest application = new CustomPanelTest();
        application.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

} // end class CustomPanelTest
