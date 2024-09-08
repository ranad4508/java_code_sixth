/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Chapter_1;

import java.awt.BorderLayout;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;

/**
 *
 * @author Dinesh
 */
public class ImageDisplay extends JFrame {

    public ImageDisplay() {
        ImageIcon img = new ImageIcon("C:\\Users\\Dinesh\\Pictures\\Saved Pictures\\coding.jpg");
        JLabel imgLabel = new JLabel(img);
        setLayout(new BorderLayout());
        add(imgLabel, BorderLayout.CENTER);
        setTitle("Image Display Example");
        setSize(500, 500);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
        setVisible(true);

    }

    public static void main(String[] args) {
        new ImageDisplay();
    }

}
