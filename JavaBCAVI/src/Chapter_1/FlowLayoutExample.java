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
 */
public class FlowLayoutExample {
    
    public static void main(String[] args){
        JFrame frame = new JFrame("FlowLayout Example");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
        JPanel panel = new JPanel(new FlowLayout());
        //add components to the panel
        panel.add(new JButton("Button 1"));
        panel.add(new JButton("Button 2"));
        panel.add(new JButton("Button 3"));
        
        //Add panel to the frame
        /*
        frame.getContentPane() returns the content
        */
        
        frame.getContentPane().add(panel);
        frame.setSize(500, 500);
        frame.setResizable(false);
        frame.pack(); // It is a method of JFrame that automatically define the 
        //size of a container according to the content in our code
        
        frame.setVisible(true);
    }
}
