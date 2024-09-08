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

public class Q4_MyServer {

    public static void main(String[] args) {
        try {
            // Manually create and bind the remote object when the server starts
            Q4_MyRemoteService service = new Q4_MyRemoteServiceImpl();
            Registry registry = LocateRegistry.createRegistry(1099);
            registry.rebind("MyRemoteService", service);

            System.out.println("Service bound and ready.");

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
