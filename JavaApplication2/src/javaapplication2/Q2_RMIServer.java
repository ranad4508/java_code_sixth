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

public class Q2_RMIServer {
    public static void main(String[] args) {
        try {
            LocateRegistry.createRegistry(1099);
            Q2_RemoteImpl obj = new Q2_RemoteImpl();
            Naming.rebind("Q2_RemoteService", obj);
            System.out.println("RMI Server is ready.");
        } catch (Exception e) {
            System.out.println("RMI Server failed: " + e);
        }
    }
}
