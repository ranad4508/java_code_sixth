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
public class JapanFlag extends JFrame {
    public JapanFlag(){
        setTitle("2D Shapes");
        setSize(400, 300);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
        
        add(new ShapeFlag());
    }
    
    public static void main(String[] args){
        JapanFlag frame = new JapanFlag();
        frame.setVisible(true);
        
    }
    
    
}

class ShapeFlag extends JPanel{
    @Override
    protected void paintComponent(Graphics g){
        super.paintComponent(g);
        
        Graphics2D flag = (Graphics2D)g;
        
        flag.setColor(Color.white);
        flag.fillRect(50, 50, 250, 150);
        
        flag.setColor(Color.red);
        flag.fillOval(150, 100, 50, 50);
    }
}
