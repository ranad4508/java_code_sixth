package Java_Beans;

import java.awt.*;
import java.awt.event.*;
import java.beans.*;
import java.io.Serializable;

public class Colors extends Canvas implements Serializable {

    transient private Color color;
    private boolean rectangular;

    public Colors() {
        addMouseListener(new MouseAdapter() {
            @Override
            public void mousePressed(MouseEvent me) {
                change();
            }

            @Override
            public void mouseWheelMoved(MouseWheelEvent e) {
                change();
            }
        });

        rectangular = false;
        setSize(200, 100);
        change();
    }

    public boolean getRectangular() {
        return rectangular;
    }

    public void setRectangular(boolean flag) {
        this.rectangular = flag;
        repaint();
    }

    public void change() {
        color = randomColor();
        repaint();
    }

    private Color randomColor() {
        int r = (int) (255 * Math.random());
        int g = (int) (255 * Math.random());
        int b = (int) (255 * Math.random());
        return new Color(r, g, b);
    }

    @Override
    public void paint(Graphics g) {
        Dimension d = getSize();
        g.setColor(color);
        if (rectangular) {
            g.fillRect(0, 0, d.width - 1, d.height - 1);
        } else {
            g.fillOval(0, 0, d.width - 1, d.height - 1);
        }
    }
}

class ColorsBeanInfo extends SimpleBeanInfo {

    @Override
    public PropertyDescriptor[] getPropertyDescriptors() {
        try {
            PropertyDescriptor rectangular = new PropertyDescriptor("rectangular", Colors.class);
            return new PropertyDescriptor[]{rectangular};
        } catch (IntrospectionException e) {
            System.err.println("Exception caught: " + e.getMessage());
            return null;
        }
    }
}

class IntrospectorDemo {

    public static void main(String[] args) {
        try {
            Class<?> c = Class.forName("Java_Beans.Colors");
            BeanInfo beanInfo = Introspector.getBeanInfo(c);
            System.out.println("Properties:");
            for (PropertyDescriptor propertyDescriptor : beanInfo.getPropertyDescriptors()) {
                System.out.println("\t" + propertyDescriptor.getName());
            }
            System.out.println("Events:");
            for (EventSetDescriptor eventSetDescriptor : beanInfo.getEventSetDescriptors()) {
                System.out.println("\t" + eventSetDescriptor.getName());
            }
        } catch (ClassNotFoundException | IntrospectionException e) {
            System.err.println("Exception caught: " + e.getMessage());
        }
    }
}
