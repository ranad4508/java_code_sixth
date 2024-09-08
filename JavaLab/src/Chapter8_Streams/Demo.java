/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
chapter 5: page no. 10, 11, 12, 13, 14, 15, 17, 19, 
 */
package Chapter8_Streams;

import java.io.*;
import java.io.FileOutputStream;
import java.io.ObjectOutputStream;
class Employee implements Serializable
{
String name;
int eid;
String contact;
Employee(String n, int r, String c)
{
this.name = n;
this.eid = r;
this.contact = c;
}
}
 class Demo {
    public static void main(String[] args)
    { try{
    Employee emp = new Employee("Kamal", 27, "9841000000");
    FileOutputStream fos = new FileOutputStream("D:\\file1.txt");
    ObjectOutputStream oos = new ObjectOutputStream(fos);
    oos.writeObject(emp);
    oos.flush();
    oos.close();
    }
    catch (IOException e)
    { System.out.println(e); }
    }
}