/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Chapter13_14_GUI;
import java.awt.*;
import javax.swing.*;
public class GridLayoutDemo extends JFrame {

    JFrame f;

    GridLayoutDemo() {
        f = new JFrame();
        JButton b1 = new JButton("1");
        JButton b2 = new JButton("2");
        JButton b3 = new JButton("3");
        JButton b4 = new JButton("4");
        // adding buttons to the frame       
        f.add(b1);
        f.add(b2);
        f.add(b3);
        f.add(b4);   
        f.setLayout(new GridLayout(3, 3));
        f.setSize(300, 300);
        f.setVisible(true);
    }

    public static void main(String[] args) {
        GridLayoutDemo app =new GridLayoutDemo();
        app.setDefaultCloseOperation(EXIT_ON_CLOSE);
    }
}
