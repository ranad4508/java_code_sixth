/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Chapter9_CorePackages;

import java.util.Enumeration;
import java.util.Hashtable;

/**
 *
 * @author Dinesh
 */
public class HashTableTest {
    public static void main(String[] args) {
        Enumeration name; String key;
        Hashtable ht=new Hashtable();
        ht.put("key 1","Romeo");
        ht.put("Key 2","Peter"); name=ht.keys();
        while(name.hasMoreElements()){
            key=(String) name.nextElement();
            System.out.println("Key: " +key+ " \t Value: " +ht.get(key));
        } 
    }
}
