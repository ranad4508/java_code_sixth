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

public class Q1_CalculatorImpl extends UnicastRemoteObject implements Q1_Calculator {

    // Constructor
    protected Q1_CalculatorImpl() throws RemoteException {
        super();
    }

    // Implementation of the add method
    @Override
    public int add(int a, int b) throws RemoteException {
        return a + b;
    }
}
