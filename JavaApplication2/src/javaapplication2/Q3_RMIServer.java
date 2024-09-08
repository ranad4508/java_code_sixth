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

public class Q3_RMIServer {
    public static void main(String[] args) {
        try {
            LocateRegistry.createRegistry(1099); // Start the RMI registry
            Q3_RemoteServiceImpl obj = new Q3_RemoteServiceImpl();
            Naming.rebind("Q3_GreetingService", obj); // Bind the remote object
            System.out.println("RMI Server is running.");
        } catch (Exception e) {
            System.out.println("RMI Server failed: " + e);
        }
    }
}
