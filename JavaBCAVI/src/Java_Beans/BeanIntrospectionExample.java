/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Java_Beans;

import java.beans.BeanInfo;
import java.beans.EventSetDescriptor;
import java.beans.IntrospectionException;
import java.beans.Introspector;
import java.beans.MethodDescriptor;
import java.beans.PropertyDescriptor;

/**
 *
 * @author Dinesh
 */
public class BeanIntrospectionExample {
    public static void main(String[] args){
        try{
            //get the BeanInfo for PersonBean - BeanInfo is the class inside the bean package
            BeanInfo beanInfo = Introspector.getBeanInfo(PersonBean.class, Object.class);
            
            //get and print the property descriptions
            System.out.println("Properties: ");
            for(PropertyDescriptor propertyDescriptor : beanInfo.getPropertyDescriptors()){
                System.out.println(" - "+propertyDescriptor.getName());
            }
            
            //get and print the method properties
            System.out.println("\nMethods: ");
            for(MethodDescriptor methodDescriptor : beanInfo.getMethodDescriptors()){
                System.out.println(" - "+methodDescriptor.getMethod().getName());
            }
            
            //get and print the event set descriptors
            System.out.println("\nEvents: ");
            for(EventSetDescriptor eventSetDescriptor : beanInfo.getEventSetDescriptors()){
                System.out.println(" - "+eventSetDescriptor.getName());
            }
        }catch(IntrospectionException e){
            System.out.println("Error: "+e.getMessage());
        }
    }
}
