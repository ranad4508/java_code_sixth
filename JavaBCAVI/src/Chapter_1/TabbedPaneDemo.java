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
public class TabbedPaneDemo {

    public TabbedPaneDemo() {
        JFrame frame = new JFrame("Jlabel and icon demo");
        frame.setSize(400, 400);

        JTabbedPane jtp = new JTabbedPane();

        jtp.addTab("Cities", new CitiesPanel());
        jtp.addTab("Colors", new ColorPanel());
        jtp.addTab("Flavours", new FlavourPanel());

        frame.add(jtp);
        frame.setLocationRelativeTo(null);
        frame.setVisible(true);
    }

    public static void main(String[] args) {
        new TabbedPaneDemo();
    }

}

class CitiesPanel extends JPanel {

    public CitiesPanel() {
        JButton b1 = new JButton("New York");
        add(b1);

        JButton b2 = new JButton("London");
        add(b2);

        JButton b3 = new JButton("HonKong");
        add(b3);

        JButton b4 = new JButton("Tokyo");
        add(b4);

    }
}

class ColorPanel extends JPanel {

    public ColorPanel() {
        JCheckBox c1 = new JCheckBox("Red");
        add(c1);

        JCheckBox c2 = new JCheckBox("Yellow");
        add(c2);

        JCheckBox c3 = new JCheckBox("Blue");
        add(c3);

        JCheckBox c4 = new JCheckBox("Green");
        add(c4);

    }
}

class FlavourPanel extends JPanel {

    public FlavourPanel() {
        JComboBox jcb = new JComboBox();
        jcb.addItem("Vanilla");
        jcb.addItem("Chocolate");
        
        jcb.addItem("Strawberry");

        add(jcb);
    }
}
