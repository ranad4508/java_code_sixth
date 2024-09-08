package GUI_Practice;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class PrimeCheck extends JFrame implements ActionListener {

    private final JTextField textField1, textField2;
    private JButton calculateSquare;
    private JLabel label1, label2;

    PrimeCheck() {
        super("Square Calculator");
        Container container = getContentPane();
        container.setLayout(new FlowLayout());
        label1 = new JLabel("Enter any number   ");
        container.add(label1);
        textField1 = new JTextField(10);
        container.add(textField1);
        calculateSquare = new JButton("Determine");
        container.add(calculateSquare);
        label2 = new JLabel("Entered number is  ");
        container.add(label2);
        textField2 = new JTextField(10);
        container.add(textField2);

        textField1.addActionListener(this);
        calculateSquare.addActionListener(this);
        textField2.addActionListener(this);
        setSize(200, 200);
        setVisible(true);

    }

    @Override
    public void actionPerformed(ActionEvent event) {
        int number = Integer.parseInt(textField1.getText());
        for (int i = 2; i <= number; i++) {
            int digit = 0;
            for (int j = 1; j <= i; j++) {
                if (i % j == 0) {
                    digit++;
                }
            }

            if (digit == 2) {
                textField2.setText(String.valueOf("prime"));
            } else {
                textField2.setText(String.valueOf("composite"));
            }
        }
    }

    public static void main(String args[]) {
        PrimeCheck application = new PrimeCheck();
        application.setDefaultCloseOperation(EXIT_ON_CLOSE);
    }
}
