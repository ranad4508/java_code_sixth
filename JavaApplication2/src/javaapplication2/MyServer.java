/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package javaapplication2;
import java.rmi.*;
import java.rmi.registry.LocateRegistry;

/**
 *
 * @author Dinesh
 */
public class MyServer {
    public static void main(String [] args){
        try{
            MyRemoteObject obj = new MyRemoteObject();
            LocateRegistry.createRegistry(1099);
            Naming.rebind("rmi://localhost/HelloService", obj);
            System.out.println("Service bound to registry.");
            
        }catch(Exception e){
            e.printStackTrace();
        }
    }
}
