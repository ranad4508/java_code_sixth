/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package GUI_Practice;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class CheckBoxTest extends JFrame implements ItemListener {

    private JTextField field;
    private JCheckBox bold, italic;
    JLabel label;

    public CheckBoxTest() {
        super("CheckBox Example");
        Container container = getContentPane();
        container.setLayout(new FlowLayout());

        label = new JLabel("Enter text ");
        container.add(label);

        field = new JTextField(25);
        field.setFont(new Font("serif", Font.PLAIN, 15));
        container.add(field);

        bold = new JCheckBox("Bold");
        container.add(bold);

        italic = new JCheckBox("Italic");
        container.add(italic);

        bold.addItemListener(this);
        italic.addItemListener(this);

        setSize(350, 175);
        setVisible(true);
    }
    private int ValBold = Font.PLAIN;
    private int ValItalic = Font.PLAIN;

    public void itemStateChanged(ItemEvent event) {
        if (event.getSource() == bold) {
            ValBold = bold.isSelected() ? Font.BOLD : Font.PLAIN;
        }
        if (event.getSource() == italic) {
            ValItalic = italic.isSelected() ? Font.ITALIC : Font.PLAIN;

        }
        field.setFont(new Font("serif", ValBold + ValItalic, 15));

    }

    public static void main(String args[]) {
        CheckBoxTest app = new CheckBoxTest();
        app.setDefaultCloseOperation(EXIT_ON_CLOSE);

    }
}
