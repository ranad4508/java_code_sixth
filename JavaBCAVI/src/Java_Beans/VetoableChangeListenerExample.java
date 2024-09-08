/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Java_Beans;

import java.beans.PropertyChangeEvent;
import java.beans.PropertyVetoException;
import java.beans.VetoableChangeListener;
import java.beans.VetoableChangeSupport;
import java.io.Serializable;

/**
 *
 * @author Dinesh
 */
class ConstrainedPropertyBean implements Serializable {

    private int age;

    // The support object to handle vetoable change listeners
    private final VetoableChangeSupport vcs = new VetoableChangeSupport(this);

    public int getAge() {
        return age;
    }

    public void setAge(int age) throws PropertyVetoException {
        int oldAge = this.age;

        // Notify all registered listeners about the property change attempt
        vcs.fireVetoableChange("age", oldAge, age);

        // If no listener vetoes the change, update the property value
        this.age = age;
    }

    // Method to add a vetoable change listener
    public void addVetoableChangeListener(VetoableChangeListener listener) {
        vcs.addVetoableChangeListener(listener);
    }

    // Method to remove a vetoable change listener
    public void removeVetoableChangeListener(VetoableChangeListener listener) {
        vcs.removeVetoableChangeListener(listener);
    }
}

public class VetoableChangeListenerExample {

    public static void main(String[] args) {
        // Create an instance of ConstrainedPropertyBean
        ConstrainedPropertyBean bean = new ConstrainedPropertyBean();

        // Add a vetoable change listener to the bean
        bean.addVetoableChangeListener(new VetoableChangeListener() {
            @Override
            public void vetoableChange(PropertyChangeEvent event) throws PropertyVetoException {
                if ("age".equals(event.getPropertyName())) {
                    // Get the new value of the 'age' property
                    int newAge = (int) event.getNewValue();

                    // Validate the new value and throw an exception if invalid
                    if (newAge < 0 || newAge > 100) {
                        throw new PropertyVetoException("Age must be between 0 and 100", event);
                    }
                }
            }
        });

        try {
            bean.setAge(23);
            System.out.println("Age set to: " + bean.getAge());
            bean.setAge(-5);
        } catch (PropertyVetoException e) {
            System.out.println("Failed to set age: " + e.getMessage());
        }
    }
}
