package Chapter_1;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class MouseQuestion extends JFrame implements MouseListener {

    private JLabel label1;
    private final JTextField number1, number2, number3;
    private JPanel panel1 = null;

    public MouseQuestion() {
        setTitle("Arithmetic Operation Using Mouse");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(300, 200);

        // Create label
        label1 = new JLabel("Enter numbers");
        number1 = new JTextField(5);
        number2 = new JTextField(5);
        number3 = new JTextField(10);

        // Add mouse listener to label
        panel1 = new JPanel();
        panel1.addMouseListener(this);

        panel1.setLayout(new FlowLayout());

        // Add components to panel
        panel1.add(label1);
        panel1.add(number1);
        panel1.add(number2);
        panel1.add(number3);

        // Add panel to frame
        add(panel1);

        setVisible(true);
    }

    @Override
    public void mouseClicked(MouseEvent e) {
        // No action needed on mouseClicked
    }

    @Override
    public void mousePressed(MouseEvent e) {
        int num1 = Integer.parseInt(number1.getText());
        int num2 = Integer.parseInt(number2.getText());
        int sum = num1 + num2;
        if (e.getSource() == panel1) {

            number3.setText(String.valueOf(sum));
        }
    }

    @Override
    public void mouseReleased(MouseEvent e) {
        int num1 = Integer.parseInt(number1.getText());
        int num2 = Integer.parseInt(number2.getText());
        int difference = num1 - num2;
        if (e.getSource() == panel1) {

            number3.setText(String.valueOf(difference));
        }
    }

    @Override
    public void mouseEntered(MouseEvent e) {
        // No action needed on mouseEntered
    }

    @Override
    public void mouseExited(MouseEvent e) {
        // No action needed on mouseExited
    }

    public static void main(String[] args) {
        new MouseQuestion();
    }
}
