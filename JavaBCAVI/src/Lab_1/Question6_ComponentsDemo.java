/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template

write a Java Swing application that uses a JTabbedPane to create a frame with five tabs each with a 
different layout and   each containing different components  like (buttons, checkboxes, and a 
combo box,Jtable,shapes etc  ).
 Showcase as much components of swing as you can
 */
package Lab_1;

import javax.swing.*;
import java.awt.*;

/**
 *
 * @author Dinesh
 */
public class Question6_ComponentsDemo extends JFrame {

    public Question6_ComponentsDemo() {
        setTitle("Swing Components Demo");
        setSize(600, 400);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        JTabbedPane tabbedPane = new JTabbedPane();

        // Add tabs
        tabbedPane.addTab("Button", new ButtonTab());
        tabbedPane.addTab("Checkbox", new CheckboxTab());
        tabbedPane.addTab("ComboBox", new ComboBoxTab());
        tabbedPane.addTab("Table", new TableTab());
        tabbedPane.addTab("Shapes", new ShapesTab());

        add(tabbedPane);

        setVisible(true);
    }

    public static void main(String[] args) {
        new Question6_ComponentsDemo();
    }
}

// Tab classes
class ButtonTab extends JPanel {

    public ButtonTab() {
        setLayout(new FlowLayout());
        add(new JLabel("Button Example"));
        add(new JButton("Click Me"));
    }
}

class CheckboxTab extends JPanel {

    public CheckboxTab() {
        setLayout(new FlowLayout());
        add(new JLabel("Checkbox Example"));
        add(new JCheckBox("Check me"));
    }
}

class ComboBoxTab extends JPanel {

    public ComboBoxTab() {
        setLayout(new FlowLayout());
        add(new JLabel("ComboBox Example"));
        String[] fruits = {"Apple", "Orange", "Banana"};
        JComboBox<String> comboBox = new JComboBox<>(fruits);
        add(comboBox);
    }
}

class TableTab extends JPanel {

    public TableTab() {
        setLayout(new BorderLayout());
        add(new JLabel("Table Example"), BorderLayout.NORTH);
        String[] columnNames = {"Name", "Age"};
        Object[][] data = {
            {"Dinesh", 22},
            {"Roshni", 22}
        };
        JTable table = new JTable(data, columnNames);
        add(new JScrollPane(table), BorderLayout.CENTER);
    }
}

class ShapesTab extends JPanel {

    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);
        g.setColor(Color.BLUE);
        g.fillRect(50, 50, 100, 100);
    }

    @Override
    public Dimension getPreferredSize() {
        return new Dimension(200, 200);
    }
}
