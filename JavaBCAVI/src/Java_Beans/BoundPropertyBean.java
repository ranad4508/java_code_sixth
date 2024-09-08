/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Java_Beans;

import java.beans.PropertyChangeEvent;
import java.beans.PropertyChangeListener;
import java.beans.PropertyChangeSupport;
import java.io.Serializable;

/**
 *
 * @author Dinesh Kumar Rana
 */
public class BoundPropertyBean implements Serializable {

    private String name;

    //The support object to handle property change listeners
    private final PropertyChangeSupport pcs = new PropertyChangeSupport(this);

    public String getName() {
        return name;
    }

    public void setName(String name) {

        String oldName = this.name;
        this.name = name;

        //Notify all registered listeners about the property change
        pcs.firePropertyChange("name", oldName, name);

    }

    //Method to add a property change listener
    public void addPropertyChangeListener(PropertyChangeListener listener) {
        pcs.addPropertyChangeListener(listener);
    }

    //Method to remove a property change listener
    public void removePropertyChangeListner(PropertyChangeListener listener) {
        pcs.removePropertyChangeListener(listener);
    }
}

class PropertyChangeListenerExample {

    public static void main(String[] args) {
        BoundPropertyBean bean = new BoundPropertyBean();
        
        //Add a property chane listener to the bean
        bean.addPropertyChangeListener(new PropertyChangeListener() {
            @Override
            public void propertyChange(PropertyChangeEvent event) {
                System.out.println("Property " + event.getPropertyName() + " changed from " + event.getOldValue() + " to " + event.getNewValue());
            }

        });

        //change the 'name' property, which will trigger the property change listener
        bean.setName("Dinesh");
        bean.setName("Dinesh Rana");

        
    }
}
