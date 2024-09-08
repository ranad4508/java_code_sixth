/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Java_Beans;

import java.io.Serializable;

/**
 *
 * @author Dinesh
 */
public class PersonBean implements Serializable{
    private String name;
    private int age;
    
    public PersonBean(){
        
    }
    
//    Getter methods for name
    public String getName(){
        return name;
    }
    
    //    Setter methods for name

    public void setName(String name){
        this.name = name;
    }
    
    //    Getter methods for Age

    public int getAge(){
        return age;
    }
    
    //    Setter methods for Age

    public void setAge(int age){
        this.age = age;
    }
    
    
    
}


