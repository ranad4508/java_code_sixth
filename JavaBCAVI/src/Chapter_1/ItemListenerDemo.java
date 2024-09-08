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
public class ItemListenerDemo extends JFrame implements ItemListener {

    private JCheckBox checkBox;
    private JLabel label;

    public ItemListenerDemo() {
        //create checkbox
        checkBox = new JCheckBox("Check me!");
        //create a label to show the status
        label = new JLabel("Checkbox is unchecked");
        Font font = new Font("Serif", Font.BOLD, 30);
        label.setFont(font);
//method 1: create an item listener 
        checkBox.addItemListener(this);

        //method 2: create an item listener 
//        checkBox.addItemListener(new ItemListener() {
//            @Override
//            public void itemStateChanged(ItemEvent e) {
//                if(e.getStateChange() == ItemEvent.SELECTED){
//                    label.setText("Checkbox is checked");
//                }
//                else{
//                    label.setText("Checkbox is unchecked");
//                }
//            }
//        });
        setLayout(new FlowLayout());
        add(checkBox);
        add(label);
//frame 
        setTitle("ItemListener Example");
        setSize(400, 300);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
        setVisible(true);
    }

    //method 1: create an item listener 
    public void itemStateChanged(ItemEvent e) {
        if (e.getStateChange() == ItemEvent.SELECTED) {
            label.setText("Checkbox is checked");
        } else {
            label.setText("Checkbox is unchecked");
        }
    }

    public static void main(String[] args) {
        new ItemListenerDemo();
    }

}
