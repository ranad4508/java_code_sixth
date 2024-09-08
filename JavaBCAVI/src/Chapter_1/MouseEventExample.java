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
public class MouseEventExample extends JFrame implements MouseListener {

    //Defining two labels and panels for different operation
    private final JLabel label1;
    private final JLabel label2;
    private final JPanel panel1;
    private final JPanel panel2;

    public MouseEventExample() {
//        Setting title of the Frame
        setTitle("Mouse Event Demo");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
//        Set size of the frame
        setSize(300, 200);

        // Create label
        label1 = new JLabel("Press here to see yellow color");
        label2 = new JLabel("Click here to see red color");

        // Create panels
        panel1 = new JPanel();
        panel2 = new JPanel();
        
        //Adding label to the panels
        panel1.add(label1);
        panel2.add(label2);
        
        // Add mouse listeners to panels
        panel1.addMouseListener(this);
        panel2.addMouseListener(this);

        // Set layout and add panels
        setLayout(new GridLayout(2, 1));
        
        //Adding panels to the layout to arrange frame
        add(panel1);
        add(panel2);

//        Make our program visible
        setVisible(true);
    }
    
    
//If mouse clicked on panel2 setBackground color to red
    @Override
    public void mouseClicked(MouseEvent e) {
        if (e.getSource() == panel2) {
            panel2.setBackground(Color.RED);
        }
    }

//    If mouse is pressed on panel1 then setBackground color to yellow
    @Override
    public void mousePressed(MouseEvent e) {
        if (e.getSource() == panel1) {
            panel1.setBackground(Color.YELLOW);
        }
    }

//    If mouse is released on panel1 then background color will be white
    @Override
    public void mouseReleased(MouseEvent e) {
        if (e.getSource() == panel1) {
            panel1.setBackground(Color.WHITE);
        }
    }

    
    @Override
    public void mouseEntered(MouseEvent e) {
        // Not used in this example
    }

    
//    If mouse is exited in panel2 then background color will be white
    @Override
    public void mouseExited(MouseEvent e) {
        if (e.getSource() == panel2) {
            panel2.setBackground(Color.WHITE);
        }
    }

//    This methods creates new instance of the class.
//    The constructor MouseEventExample() is called, 
//    which sets up the GUI components and displays the JFrame.
    public static void main(String[] args) {
        new MouseEventExample();
    }
}
