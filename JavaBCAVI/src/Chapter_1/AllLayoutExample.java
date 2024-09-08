package Chapter_1;
import java.awt.*;
import javax.swing.*;

public class AllLayoutExample {
    public static void main(String[] args){
        JFrame frame = new JFrame("All Layout Example");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLayout(new BorderLayout());
        
        // FlowLayout Example (North)
        JPanel flowLayoutPanel = new JPanel(new FlowLayout());
        JLabel flowLayoutLabel = new JLabel("Flow Layout");
        JButton flowLayoutButton = new JButton("Button 1");
        flowLayoutPanel.add(flowLayoutLabel);
        flowLayoutPanel.add(flowLayoutButton);
        
        // GridLayout Example (Center)
        JPanel gridLayoutPanel = new JPanel(new GridLayout(3, 3));
        for (int i = 1; i <= 8; i++) {
            gridLayoutPanel.add(new JButton("Button " + i));
        }
        JLabel gridLayoutLabel = new JLabel("Grid Layout", JLabel.CENTER);
        gridLayoutPanel.add(gridLayoutLabel);
        

        // BorderLayout South
        JPanel panel1 = new JPanel(new BorderLayout());
        JButton button1 = new JButton("North");//East
        JButton button2 = new JButton("East");//West
        JButton button3 = new JButton("West");//North
        JButton button4 = new JButton("South");//South
        JButton button5 = new JButton("Center");//Center
        
        panel1.add(button1, BorderLayout.NORTH);
        panel1.add(button2, BorderLayout.EAST);
        panel1.add(button3, BorderLayout.WEST);
        panel1.add(button4, BorderLayout.SOUTH);
        panel1.add(button5, BorderLayout.CENTER);
        
        
        
        //adding all the layout in borderlayout
        JPanel borderLayoutPanel = new JPanel(new BorderLayout());
        JButton buttonWest = new JButton("West");
        JButton buttonEast = new JButton("East");

        borderLayoutPanel.add(flowLayoutPanel, BorderLayout.NORTH);
        borderLayoutPanel.add(panel1, BorderLayout.SOUTH);
        borderLayoutPanel.add(gridLayoutPanel, BorderLayout.CENTER);
        borderLayoutPanel.add(buttonWest, BorderLayout.WEST);
        borderLayoutPanel.add(buttonEast, BorderLayout.EAST);


        
        frame.getContentPane().add(borderLayoutPanel);
        frame.pack();
        
        
        frame.setResizable(false);
//        frame.setSize(500, 600);
        frame.setVisible(true);
    }
}
