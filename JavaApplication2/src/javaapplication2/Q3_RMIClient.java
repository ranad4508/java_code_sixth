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

public class Q3_RMIClient {
    public static void main(String[] args) {
        try {
            Q3_RemoteService stub = (Q3_RemoteService) Naming.lookup("rmi://localhost/Q3_GreetingService");
            String response = stub.greet("Jyoti");
            System.out.println("Server response: " + response);
        } catch (Exception e) {
            System.out.println("RMI Client failed: " + e);
        }
    }
}
