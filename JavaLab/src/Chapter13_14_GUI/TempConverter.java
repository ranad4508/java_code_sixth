/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Chapter13_14_GUI;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class TempConverter extends JFrame implements ActionListener {
  private JTextField celsiusField, fahrenheitField;

  public TempConverter() {
    setTitle("Temperature Converter");
    setSize(300, 100);
    setLayout(new FlowLayout());
    setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

    celsiusField = new JTextField(10);
    fahrenheitField = new JTextField(10);

    add(new JLabel("Celsius: "));
    add(celsiusField);
    add(new JLabel("Fahrenheit: "));
    add(fahrenheitField);

    celsiusField.addActionListener(this);
    fahrenheitField.addActionListener(this);

    setVisible(true);
  }

  public void actionPerformed(ActionEvent event) {
    double celsius, fahrenheit;

    if (event.getSource() == celsiusField) {
      celsius = Double.parseDouble(celsiusField.getText());
      fahrenheit = celsius * 9.0 / 5.0 + 32;
      fahrenheitField.setText(String.format("%.1f", fahrenheit));
    } else {
      fahrenheit = Double.parseDouble(fahrenheitField.getText());
      celsius = (fahrenheit - 32) * 5.0 / 9.0;
      celsiusField.setText(String.format("%.1f", celsius));
    }
  }

  public static void main(String[] args) {
    new TempConverter();
  }
}
