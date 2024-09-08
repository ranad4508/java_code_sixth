/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package javaapplication2;

/**
 *
 * @author Dinesh
 */
import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;

public class Q4_MyClient {
    public static void main(String[] args) {
        try {
            // Locate the registry where the remote object is bound
            Registry registry = LocateRegistry.getRegistry("localhost", 1099);
            Q4_MyRemoteService service = (Q4_MyRemoteService) registry.lookup("MyRemoteService");

            // Call the remote method
            String message = service.sayHello();
            System.out.println("Received from server: " + message);

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
