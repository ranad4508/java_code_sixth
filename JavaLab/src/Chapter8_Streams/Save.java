/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Chapter8_Streams;

import java.io.*;
public class Save implements Serializable{
    int i;
}
class SerialDemo {
    public static void main(String args[]) throws IOException, ClassNotFoundException{
        Save obj = new Save();
        obj.i= 50;
        File f=  new File("D:\\serial.txt");
        FileOutputStream fis = new FileOutputStream(f);
        ObjectOutputStream oos = new ObjectOutputStream(fis);
        oos.writeObject(obj);
        oos.close();
        fis.close();
        System.out.println("Serialized data is saved in serial.txt in D drive! check it ?");
        FileInputStream fis1 = new FileInputStream(f);
        ObjectInputStream ois = new ObjectInputStream(fis1);
        Save obj1 = (Save)ois.readObject();//It give object of object class type cast to save type
        System.out.println("Value after deserialize is:\t"+obj1.i);
    }
}
