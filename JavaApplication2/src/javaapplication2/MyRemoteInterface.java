/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package javaapplication2;

import java.rmi.Remote;
import java.rmi.RemoteException;

/**
 *
 * @author Dinesh
 */
public interface MyRemoteInterface extends Remote{
    String sayHello() throws RemoteException;
    int add(int a, int b) throws RemoteException;
}
