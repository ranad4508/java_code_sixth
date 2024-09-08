/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template

WAP  a java program to make a frame that has butttons with countries name on it on the top side of 
the frame and when the user clicks on it the remaining portion of the frame consist of the flag of that county .

The button however should still be at the top and when the user clicks om another country the flag should
be replaced ( COuntries : Germany ,Columbia,India,Japan)

 */
package Lab_1;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 *
 * @author Dinesh
 */

public class Question2_Flag {

    public static void main(String[] args) {
        // Create the JFrame
        JFrame frame = new JFrame("Country Flags");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(400, 400);

        // Create the JPanel for the buttons
        JPanel buttonPanel = new JPanel();
        buttonPanel.setLayout(new FlowLayout());

        // Create the JPanel for the flag display
        JPanel flagPanel = new FlagPanel();
        flagPanel.setLayout(new BorderLayout());

        // Add the panels to the frame
        frame.add(buttonPanel, BorderLayout.NORTH);
        frame.add(flagPanel, BorderLayout.CENTER);

        // Create buttons for the countries
        JButton germanyButton = new JButton("Germany");
        JButton colombiaButton = new JButton("Colombia");
        JButton indiaButton = new JButton("India");
        JButton japanButton = new JButton("Japan");

        // Add the buttons to the button panel
        buttonPanel.add(germanyButton);
        buttonPanel.add(colombiaButton);
        buttonPanel.add(indiaButton);
        buttonPanel.add(japanButton);

        // Create action listeners for the buttons
        germanyButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                ((FlagPanel) flagPanel).setFlag("Germany");
                flagPanel.repaint();
            }
        });

        colombiaButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                ((FlagPanel) flagPanel).setFlag("Colombia");
                flagPanel.repaint();
            }
        });

        indiaButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                ((FlagPanel) flagPanel).setFlag("India");
                flagPanel.repaint();
            }
        });

        japanButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                ((FlagPanel) flagPanel).setFlag("Japan");
                flagPanel.repaint();
            }
        });

        // Make the frame visible
        frame.setVisible(true);
    }

    static class FlagPanel extends JPanel {
        private String flag;

        public void setFlag(String flag) {
            this.flag = flag;
        }

        @Override
        protected void paintComponent(Graphics g) {
            super.paintComponent(g);
            Graphics2D g2d = (Graphics2D) g;

            if ("Germany".equals(flag)) {
                drawGermanyFlag(g2d);
            } else if ("Colombia".equals(flag)) {
                drawColombiaFlag(g2d);
            } else if ("India".equals(flag)) {
                drawIndiaFlag(g2d);
            } else if ("Japan".equals(flag)) {
                drawJapanFlag(g2d);
            }
        }

        private void drawGermanyFlag(Graphics2D g2d) {
            int width = getWidth();
            int height = getHeight();

            g2d.setColor(Color.BLACK);
            g2d.fillRect(0, 0, width, height / 3);

            g2d.setColor(Color.RED);
            g2d.fillRect(0, height / 3, width, height / 3);

            g2d.setColor(Color.YELLOW);
            g2d.fillRect(0, 2 * height / 3, width, height / 3);
        }

        private void drawColombiaFlag(Graphics2D g2d) {
            int width = getWidth();
            int height = getHeight();

            g2d.setColor(Color.YELLOW);
            g2d.fillRect(0, 0, width, height / 2);

            g2d.setColor(Color.BLUE);
            g2d.fillRect(0, height / 2, width, height / 4);

            g2d.setColor(Color.RED);
            g2d.fillRect(0, 3 * height / 4, width, height / 4);
        }

        private void drawIndiaFlag(Graphics2D g2d) {
            int width = getWidth();
            int height = getHeight();

            g2d.setColor(Color.ORANGE);
            g2d.fillRect(0, 0, width, height / 3);

            g2d.setColor(Color.WHITE);
            g2d.fillRect(0, height / 3, width, height / 3);

            g2d.setColor(Color.GREEN);
            g2d.fillRect(0, 2 * height / 3, width, height / 3);

            g2d.setColor(Color.BLUE);
            int diameter = height / 6;
            g2d.drawOval(width / 2 - diameter / 2, height / 2 - diameter / 2, diameter, diameter);
        }

        private void drawJapanFlag(Graphics2D g2d) {
            int width = getWidth();
            int height = getHeight();

            g2d.setColor(Color.WHITE);
            g2d.fillRect(0, 0, width, height);

            g2d.setColor(Color.RED);
            int diameter = Math.min(width, height) / 2;
            g2d.fillOval((width - diameter) / 2, (height - diameter) / 2, diameter, diameter);
        }
    }
}
