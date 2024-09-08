/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Chapter_1;

import javax.swing.*;

public class JDialogExample {
    public static void main(String[] args) {
        JFrame frame = new JFrame("JDialog Example");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(400, 300);

        JButton button = new JButton("Show Dialog");
        button.addActionListener(e -> {
            JDialog dialog = new JDialog(frame, "Dialog Example", true);
            dialog.setSize(200, 150);
            dialog.add(new JLabel("This is a dialog", SwingConstants.CENTER));
            dialog.setVisible(true);
        });

        frame.add(button);
        frame.setVisible(true);
    }
}
