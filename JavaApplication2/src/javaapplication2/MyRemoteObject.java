/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package javaapplication2;
import java.rmi.server.UnicastRemoteObject;
import java.rmi.*;

/**
 *
 * @author Dinesh
 */
public class MyRemoteObject extends UnicastRemoteObject implements MyRemoteInterface {
    protected MyRemoteObject() throws RemoteException{
        super();
    }
    
    @Override
    public String sayHello() throws RemoteException{
        return "Hello Dinesh!";
    }
    
    @Override
    public int add(int a, int b) throws RemoteException{
        int sum = a+b ;
        return sum;
    }
}
