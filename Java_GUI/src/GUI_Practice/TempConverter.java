
package GUI_Practice;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class TempConverter extends JFrame implements ActionListener {

    private JTextField textField1, textField2;
    private JButton plainButton1;
    private JLabel celcius, farhenheit;

    public TempConverter() {
        super("Temperature converter");
        Container container = getContentPane();
        container.setLayout(new FlowLayout());
        container.setBackground(Color.cyan);
        setResizable(false);
        
        celcius = new JLabel("Enter Celcius Value: ");
        container.add(celcius);
        textField1 = new JTextField(10);
        container.add(textField1);

        plainButton1 = new JButton("Convert");
        container.add(plainButton1);
        farhenheit = new JLabel("Your temp in Farhenheit is: ");
        container.add(farhenheit);
        textField2 = new JTextField(15);
        textField2.setEditable(false);
        container.add(textField2);

//        TempHandler handler = new TempHandler();
        textField1.addActionListener(this);
        plainButton1.addActionListener(this);
        textField2.addActionListener(this);
        setSize(400,300);
        setVisible(true);

    }

    public static void main(String args[]) {
        TempConverter app = new TempConverter();
        app.setDefaultCloseOperation(EXIT_ON_CLOSE);
    }

    @Override
    public void actionPerformed(ActionEvent event) {
        double f = Double.parseDouble(textField1.getText());
        double c = (double) ((f*1.8)+32);
        textField2.setText(String.valueOf(c) + "  Farhenheit");
    }

}
