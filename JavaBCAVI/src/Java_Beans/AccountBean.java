/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Java_Beans;

/**
 *
 * @author Dinesh
 */
import java.beans.PropertyChangeListener;
import java.beans.PropertyChangeSupport;
import java.beans.PropertyVetoException;
import java.beans.VetoableChangeListener;
import java.beans.VetoableChangeSupport;

public class AccountBean {
    private double balance;
    private VetoableChangeSupport vcs = new VetoableChangeSupport(this);
    private PropertyChangeSupport pcs = new PropertyChangeSupport(this);

    // Getter for balance
    public double getBalance() {
        return balance;
    }

    // Setter for balance
    public void setBalance(double newBalance) throws PropertyVetoException {
        double oldBalance = this.balance;

        // Fire a vetoable change event
        vcs.fireVetoableChange("balance", oldBalance, newBalance);

        // If no exception was thrown, the change is accepted
        this.balance = newBalance;

        // Notify listeners that the balance has changed
        pcs.firePropertyChange("balance", oldBalance, newBalance);
    }

    // Method to add a VetoableChangeListener
    public void addVetoableChangeListener(VetoableChangeListener listener) {
        vcs.addVetoableChangeListener(listener);
    }

    // Method to remove a VetoableChangeListener
    public void removeVetoableChangeListener(VetoableChangeListener listener) {
        vcs.removeVetoableChangeListener(listener);
    }

    // Method to add a PropertyChangeListener
    public void addPropertyChangeListener(PropertyChangeListener listener) {
        pcs.addPropertyChangeListener(listener);
    }

    // Method to remove a PropertyChangeListener
    public void removePropertyChangeListener(PropertyChangeListener listener) {
        pcs.removePropertyChangeListener(listener);
    }

    public static void main(String[] args) {
        try {
            // Create an instance of AccountBean
            AccountBean account = new AccountBean();

            // Add a VetoableChangeListener to validate the balance
            account.addVetoableChangeListener(evt -> {
                double newBalance = (double) evt.getNewValue();
                if (newBalance < 0) {
                    throw new PropertyVetoException("Balance cannot be negative", evt);
                }
            });

            // Set the balance to a valid value
            account.setBalance(100.0);
            System.out.println("Balance set to: " + account.getBalance());

            // Attempt to set the balance to an invalid value
            account.setBalance(-50.0);
            System.out.println("Balance set to: " + account.getBalance());
        } catch (PropertyVetoException e) {
            System.out.println("Failed to set balance: " + e.getMessage());
        }
    }
}
