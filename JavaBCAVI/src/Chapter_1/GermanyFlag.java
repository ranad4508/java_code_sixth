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
public class GermanyFlag extends JFrame {
    public GermanyFlag(){
        setTitle("2D Shapes");
        setSize(400, 300);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
        
        add(new ShapeFlagGermany());
    }
    
    public static void main(String[] args){
        GermanyFlag frame = new GermanyFlag();
        frame.setVisible(true);
    }
}

class ShapeFlagGermany extends JPanel{
    protected void paintComponent(Graphics g){
        super.paintComponent(g);
        
        int width = getWidth();
        int height = getHeight();
        
        int bandHeight = height/3;
        
        Graphics2D flag = (Graphics2D) g;
        flag.setColor(Color.black);
        flag.fillRect(0, 0, width, bandHeight);
        
        flag.setColor(Color.red);
        flag.fillRect(0, bandHeight, width, bandHeight);
//        
        flag.setColor(Color.yellow);
        flag.fillRect(0, 2*bandHeight, width, bandHeight);
    }
}
