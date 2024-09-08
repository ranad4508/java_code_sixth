/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Java_Beans;

/**
 *
 * @author Dinesh
 */
public class UsingBean{
    public static void main(String[] args){
        //Create an instance of PersonBean
        PersonBean person = new PersonBean();
        person.setName("Dinesh");
        person.setAge(22);
        
        //Get properties using getter methods
        
        String name = person.getName();
        int age = person.getAge();
        
        //Display the properties
        System.out.println("Name: "+name);
        System.out.println("Age: "+age);
    }
}