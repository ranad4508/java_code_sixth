/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Chapter_1;

import java.awt.Image;
import javax.swing.*;

/**
 *
 * @author Dinesh
 */
public class SwingProgram {
    //This is has A relationship because we create an object of frame
    //Is A relationship extends frame
    JFrame f1;
    
    SwingProgram(){
        f1 = new JFrame("My Application");//Set the title of the window
        f1.setSize(400, 300); //Setting the height and the width of window
        f1.setResizable(false); //Making resizable false, by default it is true
        f1.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); //Used to hide the window on clicking close button
        
        //This will set the icon for the frame in the top left corner
        ImageIcon icon = new ImageIcon("C:\\Users\\Dinesh\\Pictures\\Saved Pictures\\coding.jpg");
        f1.setIconImage(icon.getImage());
        
        //This will set the image in frame
        JLabel label = new JLabel(icon);
        f1.add(label);
        f1.setVisible(true);
    }
    
    public static void main(String[] args){
        new SwingProgram();
    }
}
