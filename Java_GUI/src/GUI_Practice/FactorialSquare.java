/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package GUI_Practice;

import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

public class FactorialSquare {
  JTextField textField;
  JButton factorialButton, squareButton;
  JLabel resultLabel;

  public FactorialSquare() {
    JFrame frame = new JFrame("Factorial and Square");
    frame.setLayout(new FlowLayout());

    textField = new JTextField(10);
    frame.add(textField);

    factorialButton = new JButton("Factorial");
    frame.add(factorialButton);
    factorialButton.addActionListener(new ActionListener() {
      public void actionPerformed(ActionEvent e) {
        int number = Integer.parseInt(textField.getText());
        int factorial = calculateFactorial(number);
        resultLabel.setText(String.valueOf(factorial));
      }
    });

    squareButton = new JButton("Square");
    frame.add(squareButton);
    squareButton.addActionListener(new ActionListener() {
      public void actionPerformed(ActionEvent e) {
        int number = Integer.parseInt(textField.getText());
        int square = number * number;
        resultLabel.setText(String.valueOf(square));
      }
    });

    resultLabel = new JLabel("");
    frame.add(resultLabel);

    frame.setSize(400, 100);
    frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    frame.setVisible(true);
  }

  public int calculateFactorial(int number) {
    int factorial = 1;
    for (int i = 1; i <= number; i++) {
      factorial *= i;
    }
    return factorial;
  }

  public static void main(String[] args) {
    new FactorialSquare();
  }
}
