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
public class BorderLayoutExample {
    public static void main(String[] args){
        JFrame frame = new JFrame("BorderLayout Example");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
        JButton button1 = new JButton("North");//North
        JButton button2 = new JButton("East");//East
        JButton button3 = new JButton("West");// West
        JButton button4 = new JButton("South");//South
        JButton button5 = new JButton("Center");//Center
        
        //Set BorderLayout for the frame
        frame.setLayout(new BorderLayout());
        
        //Add components to diffrenet regions
        frame.add(button1, BorderLayout.NORTH);
        frame.add(button2, BorderLayout.EAST);
        frame.add(button3, BorderLayout.WEST);
        frame.add(button4, BorderLayout.SOUTH);
        frame.add(button5, BorderLayout.CENTER);
        
        frame.setResizable(false);
        frame.setSize(300, 300);
        frame.setVisible(true);
    }
}
