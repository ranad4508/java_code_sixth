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
public class CheckFlagByClick extends JFrame implements ActionListener {
    private final JButton buttonJapan;
    private final JButton buttonGermany;
    private final JLabel labelText;
    private final ShapeFlag flagPanel;

    public CheckFlagByClick() {
        setTitle("Action EventDemo");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(350, 300);
        setLayout(new BorderLayout());

        //Create label
        labelText = new JLabel("Click a button to see a flag");

        //Create button
        buttonJapan = new JButton("Japan");
        buttonJapan.addActionListener(this);
        buttonGermany = new JButton("Germany");
        buttonGermany.addActionListener(this);

        //Add components to frame
        JPanel buttonPanel = new JPanel();
        buttonPanel.add(buttonJapan);
        buttonPanel.add(buttonGermany);
        buttonPanel.add(labelText);
        add(buttonPanel, BorderLayout.NORTH);

        flagPanel = new ShapeFlag();
        add(flagPanel, BorderLayout.CENTER);

        setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == buttonJapan) {
            flagPanel.setCountry("Japan");
            labelText.setText("This is the flag of Japan");
        } else if (e.getSource() == buttonGermany) {
            flagPanel.setCountry("Germany");
            labelText.setText("This is the flag of Germany");
        }
        flagPanel.repaint();
    }

    public static void main(String[] args) {
        new CheckFlagByClick();
    }
}

class ShapeFlag extends JPanel {
    private String country = null;

    public void setCountry(String country) {
        this.country = country;
    }

    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);

        Graphics2D flag = (Graphics2D) g;

        if (country == null) {
            // No flag selected, display a message
            flag.setColor(Color.black);
            flag.setFont(new Font("Arial", Font.PLAIN, 18));
            flag.drawString("Click a button to see a flag", 50, 150);
            return;
        }

        if (country.equals("Japan")) {
            flag.setColor(Color.white);
            flag.fillRect(50, 50, 250, 150);

            flag.setColor(Color.red);
            flag.fillOval(150, 100, 50, 50);
        } else if (country.equals("Germany")) {
            flag.setColor(Color.black);
            flag.fillRect(50, 50, 250, 50);

            flag.setColor(Color.red);
            flag.fillRect(50, 100, 250, 50);

            flag.setColor(Color.yellow);
            flag.fillRect(50, 150, 250, 50);
        }
    }
}