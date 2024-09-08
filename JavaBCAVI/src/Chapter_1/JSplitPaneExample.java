/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Chapter_1;

/**
 *
 * @author Dinesh
 */
import javax.swing.*;

public class JSplitPaneExample {
    public static void main(String[] args) {
        JFrame frame = new JFrame("JSplitPane Example");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(400, 300);

        JTextArea textArea1 = new JTextArea("Left Component");
        JTextArea textArea2 = new JTextArea("Right Component");
        
        JSplitPane splitPane = new JSplitPane(JSplitPane.HORIZONTAL_SPLIT, textArea1, textArea2);
        splitPane.setDividerLocation(150);

        frame.add(splitPane);
        frame.setVisible(true);
    }
}
