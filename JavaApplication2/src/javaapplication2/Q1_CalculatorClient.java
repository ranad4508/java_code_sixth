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

public class Q1_CalculatorClient {

    public static void main(String[] args) {
        try {
            // Look up the remote object from the RMI registry
            Q1_Calculator calculator = (Q1_Calculator) Naming.lookup("rmi://localhost/CalculatorService");
            
            // Invoke the remote method
            int result = calculator.add(5, 10);
            
            // Print the result
            System.out.println("The sum is: " + result);
        } catch (Exception e) {
            System.err.println("Client exception: " + e.toString());
            e.printStackTrace();
        }
    }
}
