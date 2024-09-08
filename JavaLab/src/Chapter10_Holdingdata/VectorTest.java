/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Chapter10_Holdingdata;

import java.util.Enumeration;
import java.util.Vector;

/**
 *
 * @author Dinesh
 */
public class VectorTest {

    public static void main(String[] args) {
        Vector v = new Vector();
        v.add("Oranges");
        v.add("Apple");
        v.add("Mango");
        System.out.println("Size is:\t" + v.size());
        Enumeration en = v.elements();
        while (en.hasMoreElements()) {
            System.out.printf(en.nextElement() + "\n");
        }
    }
}
