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

public class Q3_RemoteServiceImpl extends UnicastRemoteObject implements Q3_RemoteService {

    protected Q3_RemoteServiceImpl() throws RemoteException {
        super();
    }

    @Override
    public String greet(String name) throws RemoteException {
        return "Hello, " + name + "!";
    }
}
