/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Chapter_1;

import javax.swing.*;
import java.awt.*;

/**
 *
 * @author Dinesh
 * 
 * 
 * * 1. Top level containers: 
 * JFrame
 * JDialog
 * JApplet
 * JWindow
 * 
 * 
 * 2. Control Components
 * JButton
 * JCheckBox
 * JRadioButton
 * JComboBox
 * JList
 * JTextField
 * JPasswordField
 * JTextArea
 * JLabel
 * JSlider
 * JProgressBar
 * 
 * 
 * 3. Containers
 * JPanel
 * JScrollPane
 * JSplitPane
 * JTabbedPane
 * JToolBar
 * 
 * 
 * 4. Menu Components
 * JMenuBar
 * JMenu
 * JMenuItem
 * JCheckBoxMenuItem
 */
public class LightWeightComponentsExample {

    public static void main(String[] args) {

        JFrame frame = new JFrame("Lightweight Component");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(400, 300);
        frame.setResizable(false);

        JPanel panel = new JPanel();
        panel.setBackground(Color.red);

        JLabel label = new JLabel("Hello, Swing");
        label.setFont(new Font("Arial", Font.BOLD, 20));
        label.setForeground(Color.CYAN);
        
        JTextArea text = new JTextArea(1, 20);
        JButton button = new JButton("Click me");

//        Adding label, text and button in the panel to show in the window
        panel.add(label);
        panel.add(text);
        panel.add(button);

//        getContentPane() will only show the output in the window after completion. 
//        and setVisible() should always be at the button of frame.getContentPane().add(panel)
        frame.getContentPane().add(panel);
        frame.setVisible(true);

    }
}
