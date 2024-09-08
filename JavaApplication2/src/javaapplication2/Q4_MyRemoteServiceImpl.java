/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package javaapplication2;

/**
 *
 * @author Dinesh
 */
import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;

public class Q4_MyRemoteServiceImpl extends UnicastRemoteObject implements Q4_MyRemoteService {

    public Q4_MyRemoteServiceImpl() throws RemoteException {
        super();
    }

    @Override
    public String sayHello() throws RemoteException {
        return "Hello from the server!";
    }
}

