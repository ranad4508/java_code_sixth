/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package javaapplication2;

/**
 *
 * @author Dinesh
 */
import java.rmi.Remote;
import java.rmi.RemoteException;

public interface Q3_RemoteService extends Remote {
    String greet(String name) throws RemoteException;
}
