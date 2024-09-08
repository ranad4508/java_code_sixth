/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Chapter_1;

/**
 *
 * @author Dinesh
 */
import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class AllInOneMenuExample {
    public static void main(String[] args) {
        JFrame frame = new JFrame("All-in-One Menu Example");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(400, 300);

        JMenuBar menuBar = new JMenuBar();

        // File Menu
        JMenu fileMenu = new JMenu("File");
        JMenuItem newItem = new JMenuItem("New");
        JMenuItem openItem = new JMenuItem("Open");
        JMenuItem exitItem = new JMenuItem("Exit");

        exitItem.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                System.exit(0);
            }
        });

        fileMenu.add(newItem);
        fileMenu.add(openItem);
        fileMenu.add(exitItem);

        // View Menu
        JMenu viewMenu = new JMenu("View");
        JCheckBoxMenuItem showStatusBar = new JCheckBoxMenuItem("Show Status Bar");

        showStatusBar.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (showStatusBar.isSelected()) {
                    System.out.println("Status Bar is shown");
                } else {
                    System.out.println("Status Bar is hidden");
                }
            }
        });

        viewMenu.add(showStatusBar);

        // Color Menu
        JMenu colorMenu = new JMenu("Color");
        JRadioButtonMenuItem redItem = new JRadioButtonMenuItem("Red");
        JRadioButtonMenuItem greenItem = new JRadioButtonMenuItem("Green");
        JRadioButtonMenuItem blueItem = new JRadioButtonMenuItem("Blue");

        ButtonGroup group = new ButtonGroup();
        group.add(redItem);
        group.add(greenItem);
        group.add(blueItem);

        redItem.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                System.out.println("Red selected");
            }
        });

        greenItem.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                System.out.println("Green selected");
            }
        });

        blueItem.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                System.out.println("Blue selected");
            }
        });

        colorMenu.add(redItem);
        colorMenu.add(greenItem);
        colorMenu.add(blueItem);

        // Adding Menus to MenuBar
        menuBar.add(fileMenu);
        menuBar.add(viewMenu);
        menuBar.add(colorMenu);

        // Setting the MenuBar to the Frame
        frame.setJMenuBar(menuBar);
        frame.setVisible(true);
    }
}
