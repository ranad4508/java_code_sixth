/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package javaapplication2;

/**
 *
 * @author Dinesh
 */
import java.rmi.Naming;

public class Q2_RMIClient {
    public static void main(String[] args) {
        try {
            Q2_RemoteInterface stub = (Q2_RemoteInterface) Naming.lookup("rmi://localhost/Q2_RemoteService");
            int result = stub.add(10, 20);
            System.out.println("Result: " + result);
        } catch (Exception e) {
            System.out.println("RMI Client failed: " + e);
        }
    }
}
