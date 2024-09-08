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

public class Q2_RemoteImpl extends UnicastRemoteObject implements Q2_RemoteInterface {

    protected Q2_RemoteImpl() throws RemoteException {
        super();
    }

    @Override
    public int add(int a, int b) throws RemoteException {
        return a + b;
    }
}
