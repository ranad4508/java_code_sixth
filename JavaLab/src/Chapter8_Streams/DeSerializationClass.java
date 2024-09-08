/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Chapter8_Streams;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.Serializable;

public class DeSerializationClass implements Serializable {

    public static void main(String[] args) {
        Employee emp = null;
        try {
            FileInputStream fis = new FileInputStream("D:\\file1.txt");
            ObjectInputStream ois = new ObjectInputStream(fis);
            emp = (Employee) ois.readObject();
        } catch (IOException | ClassNotFoundException e) {
            e.printStackTrace();
        }
        System.out.println(emp.name);
        System.out.println(emp.eid);
        System.out.println(emp.contact);
    }
}
