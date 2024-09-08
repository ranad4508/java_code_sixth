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
public class ActionEventDemo extends JFrame implements ActionListener {
    
    private JButton button;
    private JLabel label;
    
    public ActionEventDemo(){
        setTitle("Action EventDemo");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(300, 200);
        
        
        //Create button
        button = new JButton("Click me");
        button.addActionListener(this);
        
        //Create label
        label = new JLabel("No button click yet.");
        
        //Add components to frame
        JPanel panel = new JPanel();
        panel.add(button);
        panel.add(label);
        add(panel);
        
        setVisible(true);
    }
    
    @Override
    public void actionPerformed(ActionEvent e){
        if (e.getSource() == button){
            label.setText("Button clicked!");
        }
    }
    
    public static void main(String[] args){
        new ActionEventDemo();
    }
}
