/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package javaapplication2;

/**
 *
 * @author Dinesh
 */
import java.rmi.Naming;
import java.rmi.registry.LocateRegistry;

public class Q1_CalculatorServer {

    public static void main(String[] args) {
        try {
            // Start the RMI registry on port 1099
            LocateRegistry.createRegistry(1099);
            
            // Create an instance of the CalculatorImpl
            Q1_CalculatorImpl calculator = new Q1_CalculatorImpl();
            
            // Bind the remote object's stub in the registry
            Naming.rebind("rmi://localhost/CalculatorService", calculator);
            
            System.out.println("Calculator Service is ready.");
        } catch (Exception e) {
            System.err.println("Server exception: " + e.toString());
            e.printStackTrace();
        }
    }
}
