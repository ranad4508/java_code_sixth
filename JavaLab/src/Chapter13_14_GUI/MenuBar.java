/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Chapter13_14_GUI;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class MenuBar extends JFrame {

    private final Color colorValues[]
            = {Color.BLACK, Color.BLUE, Color.RED, Color.GREEN};
    private JRadioButtonMenuItem colorItems[], fonts[];
    private JCheckBoxMenuItem styleItems[];
    private JLabel displayLabel;
    private ButtonGroup fontGroup, colorGroup;
    private int style;

    // set up GUI
    public MenuBar() {
        super("Using JMenus");

        // set up File menu and its menu items
        JMenu fileMenu = new JMenu("File");
        fileMenu.setMnemonic('F');
        JMenuItem aboutItem = new JMenuItem("About...");
        aboutItem.setMnemonic('A');
        fileMenu.add(aboutItem);
        aboutItem.addActionListener(
                new ActionListener() { // anonymous inner class

                    // display message dialog when user selects About...
                    public void actionPerformed(ActionEvent event) {
                        JOptionPane.showMessageDialog(MenuBar.this,
                                "This is an example\nof using menus",
                                "About", JOptionPane.PLAIN_MESSAGE);
                    }

                } // end anonymous inner class

        ); // end call to addActionListener

// set up Exit menu item
        JMenuItem exitItem = new JMenuItem("Exit");
        exitItem.setMnemonic('x');
        fileMenu.add(exitItem);
        exitItem.addActionListener(
                new ActionListener() { // anonymous inner class

                    // terminate application when user clicks exitItem
                    public void actionPerformed(ActionEvent event) {
                        System.exit(0);
                    }

                } // end anonymous inner class

        ); // end call to addActionListener

        // create menu bar and attach it to MenuTest window
        JMenuBar bar = new JMenuBar();
        setJMenuBar(bar);
        bar.add(fileMenu);

        // create Format menu, its submenus and menu items
        JMenu formatMenu = new JMenu("Format");
        formatMenu.setMnemonic('r');

        // create Color submenu
        String colors[] = {"Black", "Blue", "Red", "Green"};
        JMenu colorMenu = new JMenu("Color");
        colorMenu.setMnemonic('C');

        colorItems = new JRadioButtonMenuItem[colors.length];
        colorGroup = new ButtonGroup();
        ItemHandler itemHandler = new ItemHandler();

// create color radio button menu items
        for (int count = 0; count < colors.length; count++) {
            colorItems[count]
                    = new JRadioButtonMenuItem(colors[count]);
            colorMenu.add(colorItems[count]);
            colorGroup.add(colorItems[count]);
            colorItems[count].addActionListener(itemHandler);
        }

        // select first Color menu item
        colorItems[0].setSelected(true);

        // add format menu to menu bar
        formatMenu.add(colorMenu);
        formatMenu.addSeparator();
 // create Font submenu
        String fontNames[] = {"Serif", "Monospaced", "SansSerif"};

        JMenu fontMenu = new JMenu("Font");
        fontMenu.setMnemonic('n');

        fonts = new JRadioButtonMenuItem[fontNames.length];
        fontGroup = new ButtonGroup();

        // create Font radio button menu items
        for (int count = 0; count < fonts.length; count++) {
            fonts[count] = new JRadioButtonMenuItem(fontNames[count]);
            fontMenu.add(fonts[count]);
            fontGroup.add(fonts[count]);
            fonts[count].addActionListener(itemHandler);
        }

        // select first Font menu item
        fonts[0].setSelected(true);
        fontMenu.addSeparator();

// set up style menu items
        String styleNames[] = {"Bold", "Italic"};

        styleItems = new JCheckBoxMenuItem[styleNames.length];
        StyleHandler styleHandler = new StyleHandler();

        // create style checkbox menu items
        for (int count = 0; count < styleNames.length; count++) {
            styleItems[count]
                    = new JCheckBoxMenuItem(styleNames[count]);
            fontMenu.add(styleItems[count]);
            styleItems[count].addItemListener(styleHandler);
        }

 // put Font menu in Format menu
        formatMenu.add(fontMenu);

        // add Format menu to menu bar
        bar.add(formatMenu);

        // set up label to display text
        displayLabel = new JLabel("Sample Text", SwingConstants.CENTER);
        displayLabel.setForeground(colorValues[0]);
        displayLabel.setFont(new Font("Serif", Font.PLAIN, 72));

        getContentPane().setBackground(Color.CYAN);
        getContentPane().add(displayLabel, BorderLayout.CENTER);

        setSize(500, 200);
        setVisible(true);

    } // end constructor

    public static void main(String args[]) {
        MenuBar application = new MenuBar();
        application.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

    }

    // inner class to handle action events from menu items
    private class ItemHandler implements ActionListener {

// process color and font selections
        public void actionPerformed(ActionEvent event) {
 // process color selection
            for (int count = 0; count < colorItems.length; count++) {
                if (colorItems[count].isSelected()) {
                    displayLabel.setForeground(colorValues[count]);
                    break;
                }
            }

// process font selection
            for (int count = 0; count < fonts.length; count++) {
                if (event.getSource() == fonts[count]) {
                    displayLabel.setFont(
                            new Font(fonts[count].getText(), style, 72));
                    break;
                }
            }

            repaint();

        } // end method actionPerformed
    } // end class ItemHandler

    // inner class to handle item events from check box menu items
    private class StyleHandler implements ItemListener {

// process font style selections
        public void itemStateChanged(ItemEvent e) {
            style = 0;

// check for bold selection
            if (styleItems[0].isSelected()) {
                style += Font.BOLD;
            }

            // check for italic selection
            if (styleItems[1].isSelected()) {
                style += Font.ITALIC;
            }

            displayLabel.setFont(
                    new Font(displayLabel.getFont().getName(), style, 72));
            repaint();
        }

    } // end class StyleHandler

}// end class MenuTest
