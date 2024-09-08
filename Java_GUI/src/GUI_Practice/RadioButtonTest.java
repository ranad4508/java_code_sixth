/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package GUI_Practice;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class RadioButtonTest extends JFrame {

    private JTextField field;
    private JRadioButton plainButton, boldButton, italicButton, boldItalicButton;
    private Font plainFont, boldFont, italicFont, boldItalicFont;
    private JLabel text;
    private ButtonGroup radioGroup;

    public RadioButtonTest() {
        super("Radio Button Example");
        Container container = getContentPane();
        container.setLayout(new FlowLayout());

        text = new JLabel("Enter you text: ");
        container.add(text);

        field = new JTextField(25);
        container.add(field);

        plainButton = new JRadioButton("Plain", true);
        container.add(plainButton);

        boldButton = new JRadioButton("Bold", false);
        container.add(boldButton);

        italicButton = new JRadioButton("Italic", false);
        container.add(italicButton);

        boldItalicButton = new JRadioButton("Bold/Italic", false);
        container.add(boldItalicButton);

        radioGroup = new ButtonGroup();
        radioGroup.add(plainButton);
        radioGroup.add(boldButton);
        radioGroup.add(italicButton);
        radioGroup.add(boldItalicButton);

        plainFont = new Font("serif", Font.PLAIN, 15);
        boldFont = new Font("serif", Font.BOLD, 15);
        italicFont = new Font("serif", Font.ITALIC, 15);
        boldItalicFont = new Font("serif", Font.BOLD + Font.ITALIC, 15);
        field.setFont(plainFont);

        plainButton.addItemListener(new RadioButtonHandler(plainFont));
        boldButton.addItemListener(new RadioButtonHandler(boldFont));
        italicButton.addItemListener(new RadioButtonHandler(italicFont));
        boldItalicButton.addItemListener(new RadioButtonHandler(boldItalicFont));

        setSize(400, 200);
        setVisible(true);

    }

    private class RadioButtonHandler implements ItemListener {

        private Font font;

        public RadioButtonHandler(Font f) {
            font = f;
        }

        public void itemStateChanged(ItemEvent event) {
            field.setFont(font);

        }
    }

    public static void main(String args[]) {
        RadioButtonTest app = new RadioButtonTest();
        app.setDefaultCloseOperation(EXIT_ON_CLOSE);

    }
}
