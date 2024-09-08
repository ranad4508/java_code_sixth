package Java_Beans;

import java.awt.BorderLayout;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.beans.Customizer;
import java.beans.PropertyChangeEvent;
import java.beans.PropertyChangeListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.JOptionPane;

public class AccountBeanCustomizer extends JFrame implements Customizer, PropertyChangeListener {

    private AccountBean accountBean;
    private JTextField balanceField;

    public AccountBeanCustomizer() {
        setLayout(new BorderLayout());

        JPanel panel = new JPanel(new FlowLayout());
        panel.add(new JLabel("Balance:"));

        balanceField = new JTextField(10);
        panel.add(balanceField);

        JButton updateButton = new JButton("Update Balance");
        panel.add(updateButton);

        updateButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                try {
                    double newBalance = Double.parseDouble(balanceField.getText());
                    accountBean.setBalance(newBalance);
                } catch (NumberFormatException ex) {
                    JOptionPane.showMessageDialog(AccountBeanCustomizer.this, "Please enter a valid number");
                } catch (Exception ex) {
                    JOptionPane.showMessageDialog(AccountBeanCustomizer.this, "Error setting balance: " + ex.getMessage());
                }
                
                // Display updated balance
                JOptionPane.showMessageDialog(AccountBeanCustomizer.this, 
                    "Updated Balance: " + accountBean.getBalance(), 
                    "Success", 
                    JOptionPane.INFORMATION_MESSAGE);
            }
        });

        add(panel, BorderLayout.CENTER);
        setVisible(true);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(300, 200);
    }

    @Override
    public void setObject(Object bean) {
        this.accountBean = (AccountBean) bean;
        accountBean.addPropertyChangeListener(this);
        balanceField.setText(String.valueOf(accountBean.getBalance()));
    }

    @Override
    public void propertyChange(PropertyChangeEvent evt) {
        if ("balance".equals(evt.getPropertyName())) {
            balanceField.setText(String.valueOf(accountBean.getBalance()));
        }
    }

    public static void main(String[] args) {
        // Create an instance of AccountBean
        AccountBean account = new AccountBean();

        // Create the customizer and set the AccountBean instance
        AccountBeanCustomizer customizer = new AccountBeanCustomizer();
        customizer.setObject(account);
    }
}
