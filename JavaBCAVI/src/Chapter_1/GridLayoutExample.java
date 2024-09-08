/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Chapter_1;
import java.awt.*;
import javax.swing.*;

/**
 *
 * @author Dinesh
 */
public class GridLayoutExample {
    public static void main(String[] args){
        JFrame frame = new JFrame("GridLayout Example");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
        //Create a panel with GridLayout
        JPanel panel = new JPanel(new GridLayout(3, 3));
        
        
        //Add buttons to the panel
        for(int i =0; i < 9; i++){
            panel.add(new JButton("Button "+i));
        }
        
        //Add the panel to the frame
        
        frame.getContentPane().add(panel);
        frame.setResizable(false);
        frame.setSize(400, 500);
        frame.setVisible(true);
    }
}
