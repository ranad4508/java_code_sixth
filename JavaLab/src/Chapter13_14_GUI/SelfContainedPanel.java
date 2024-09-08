/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Chapter13_14_GUI;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class SelfContainedPanel extends JPanel {

    private int x1, y1, x2, y2;

    // set up mouse event handling for SelfContainedPanel
    public SelfContainedPanel() {
        // set up mouse listener
        addMouseListener(
                new MouseAdapter() { // anonymous inner class

// handle mouse press event
                    public void mousePressed(MouseEvent event) {
                        x1 = event.getX();
                        y1 = event.getY();
                    }

                    // handle mouse release event

                    public void mouseReleased(MouseEvent event) {
                        x2 = event.getX();
                        y2 = event.getY();
                        repaint();
                    }

                } // end anonymous inner class

        ); // end call to addMouseListener

        // set up mouse motion listener
        addMouseMotionListener(
                new MouseMotionAdapter() { // anonymous inner class

                    // handle mouse drag event
                    public void mouseDragged(MouseEvent event) {
                        x2 = event.getX();
                        y2 = event.getY();
                        repaint();
                    }
                } // end anonymous inner class

        ); // end call to addMouseMotionListener

    } // end constructor SelfContainedPanel

    // return preferred width and height of SelfContainedPanel
    public Dimension getPreferredSize() {
        return new Dimension(150, 100);
    }

    // paint an oval at the specified coordinates
    public void paintComponent(Graphics g) {
        super.paintComponent(g);

        g.drawOval(Math.min(x1, x2), Math.min(y1, y2),
                Math.abs(x1 - x2), Math.abs(y1 - y2));
    }

} // end class SelfContainedPanel
