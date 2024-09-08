/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Java_Beans;

import java.io.*;
import java.io.ObjectOutputStream;

/**
 *
 * @author Dinesh
 */
public class PersonBean1 implements Serializable {

    private static final long serialVersionUID = 1L;

    private String name;
    private int age;

    public PersonBean1(String dinesh_Rana, int age) {
        this.name = name;
        this.age = age;

    }

//    Getter methods for name
    public String getName() {
        return name;
    }

    //    Setter methods for name
    public void setName(String name) {
        this.name = name;
    }

    //    Getter methods for Age
    public int getAge() {
        return age;
    }

    //    Setter methods for Age
    public void setAge(int age) {
        this.age = age;
    }

    public static void main(String[] args) {
        PersonBean1 person1 = new PersonBean1("Dinesh Rana", 23);

        try (ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("person.ser"))) {
            oos.writeObject(person1);

            System.out.println("PersonBean serialized successfully");
        } catch (IOException e) {
            System.out.println("IO EXception: " + e.getMessage());
        }

        try (ObjectInputStream ois = new ObjectInputStream(new FileInputStream("person.ser"))) {
            PersonBean1 deserializedPerson = (PersonBean1) ois.readObject();
            System.out.println("PersonBean deserialized successfully");
            System.out.println("Desrialized Person: " + deserializedPerson);
        } catch (IOException | ClassNotFoundException e) {
            System.out.println("Exception");
        }
    }

}
