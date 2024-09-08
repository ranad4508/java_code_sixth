/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Chapter_1;

import java.awt.*;
import java.awt.event.*;
/**
 *
 * @author Dinesh
 */
public class ClosableAwt extends WindowAdapter {
    Frame f1;
    
    ClosableAwt(){
        f1 = new Frame();
        f1.setSize(400, 300);
        f1.addWindowListener(this);
        f1.setVisible(true);
    }
    
    
    public static void main(String[] args){
        new ClosableAwt();
    }
    
    @Override
    public void windowClosing(WindowEvent e){
        f1.dispose();
    }
}
