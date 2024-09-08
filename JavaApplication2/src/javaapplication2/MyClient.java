/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package javaapplication2;

import java.rmi.*;

/**
 *
 * @author Dinesh
 */
public class MyClient {
    public static void main(String[] args){
        try{
            MyRemoteInterface obj = (MyRemoteInterface) Naming.lookup("rmi://localhost/HelloService");
            String message = obj.sayHello();
            int addition = obj.add(10, 20);
            System.out.println("Message from server: "+message);
            System.out.println("Addition: "+addition);
        }
        catch(Exception e){
            e.printStackTrace();
        }
    }
}
