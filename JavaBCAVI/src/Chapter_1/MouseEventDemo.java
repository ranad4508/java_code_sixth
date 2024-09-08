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
public class MouseEventDemo extends JFrame implements MouseListener {
    private JLabel label;
    
    
    public MouseEventDemo(){
        setTitle("Mouse Event Demo");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(300, 200);
        
        //Create label
        label = new JLabel("No mouse action yet.");
        
        //Add mouse listener to label
        label.addMouseListener(this);
        
        //Add label to frame
        add(label);
        
        setVisible(true);
        
    }
    
    //Overriding all the method because MouseListener is interface 
    //thus we have to override all the methods although we did not use
    
    @Override
    public void mouseClicked(MouseEvent e){
        label.setText("Mouse clicked at: ("+e.getX()+","+e.getY()+")");
        
    }
    
    @Override
    public void mousePressed (MouseEvent e){
        //Not used in this example
    }
    
    @Override
    public void mouseReleased(MouseEvent e){
        //Not used in this example
    }
    
    @Override
    public void mouseEntered(MouseEvent e){
        label.setText("Mouse entered at: ("+e.getX()+", "+e.getY()+")");
    }
    
    @Override
    public void mouseExited(MouseEvent e){
         label.setText("Mouse exited at: ("+e.getX()+", "+e.getY()+")");
    }
    
    public static void main(String [] args){
        new MouseEventDemo();
    }
    
}
