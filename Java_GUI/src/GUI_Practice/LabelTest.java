package GUI_Practice;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class LabelTest extends JFrame {

    private JLabel label1, label2, label3;

    public LabelTest() {
        super("Testing JLabel");
        Container container = getContentPane();
        container.setLayout(new FlowLayout());
        label1 = new JLabel("This is label 1");
        label1.setToolTipText("You hover on level 1");
        container.add(label1);
        Icon java = new ImageIcon("C:\\Users\\Dinesh\\Documents\\NetBeansProjects\\Java_GUI\\src\\images\\Icon2.png");
        label2 = new JLabel("This is label 2", java, SwingConstants.LEFT);
        label2.setToolTipText("You hover your mouse on label2");
        container.add(label2);
        label3 = new JLabel();
        label3.setText("This is label3");
        label3.setIcon(java);
        label3.setHorizontalTextPosition(SwingConstants.CENTER);
        label3.setVerticalTextPosition(SwingConstants.BOTTOM);
        label3.setToolTipText("This is label 3");
        container.add(label3);
        setSize(275, 150);
        setVisible(true);

    }

    public static void main(String[] args) {
        LabelTest application = new LabelTest();
        application.setDefaultCloseOperation(EXIT_ON_CLOSE);
    }
}
