/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Chapter13_14_GUI;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class SelfContainedPanelTest extends JFrame {

    private SelfContainedPanel myPanel;

    // set up GUI and mouse motion event handlers for application window
    public SelfContainedPanelTest() {
        // set up a SelfContainedPanel
        myPanel = new SelfContainedPanel();
        myPanel.setBackground(Color.YELLOW);

        Container container = getContentPane();
        container.setLayout(new FlowLayout());
        container.add(myPanel);
        // set up mouse motion event handling
        addMouseMotionListener(
                new MouseMotionListener() { // anonymous inner class

                    // handle mouse drag event
                    public void mouseDragged(MouseEvent event) {
                        setTitle("Dragging: x=" + event.getX()
                                + "; y=" + event.getY());
                    }

                    // handle mouse move event
                    public void mouseMoved(MouseEvent event) {
                        setTitle("Moving: x=" + event.getX()
                                + "; y=" + event.getY());
                    }

                } // end anonymous inner class

        ); // end call to addMouseMotionListener

        setSize(300, 200);
        setVisible(true);

    } // end constructor SelfContainedPanelTest

    public static void main(String args[]) {
        SelfContainedPanelTest application = new SelfContainedPanelTest();
        application.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

} // end class SelfContainedPanelTest
