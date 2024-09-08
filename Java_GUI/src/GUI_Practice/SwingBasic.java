/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package GUI_Practice;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class SwingBasic{
    public static void main(String[] args ){
        JFrame frame = new JFrame();
    frame.setTitle("JFrame title goes here");
    frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    frame.setResizable(false);
    frame.setSize(400, 400);
    frame.setVisible(true);
    
    ImageIcon image = new ImageIcon("C:\\Users\\Dinesh\\Documents\\NetBeansProjects\\Java_GUI\\src\\images\\pet.png");
    frame.setIconImage(image.getImage());
    frame.getContentPane().setBackground(new Color(123, 50, 251));
    }   
}
