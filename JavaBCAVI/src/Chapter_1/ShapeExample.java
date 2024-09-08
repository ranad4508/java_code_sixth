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
public class ShapeExample extends JFrame {

    public ShapeExample() {
        setTitle("2D Shapes");
        setSize(400, 300);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);

        add(new ShapesPanel());
    }

    public static void main(String[] args) {
        ShapeExample frame = new ShapeExample();
        frame.setVisible(true);

    }

}

class ShapesPanel extends JPanel {
    @Override
    protected void paintComponent(Graphics g){
        super.paintComponent(g);
        
        Graphics2D g2d = (Graphics2D)g;
        
        //Draw a rectangle
        g2d.setColor(Color.RED);
        g2d.fillRect(50, 50, 100, 50);
        
        //Draw an oval
        Color customColor = new Color(66, 194, 153);
        g2d.setColor(customColor);
        
        g2d.fillOval(200, 50, 100, 50);
        
        //Draw a line
        g2d.setColor(Color.green);
        g2d.drawLine(50, 150, 300, 150);
        
    }
}
