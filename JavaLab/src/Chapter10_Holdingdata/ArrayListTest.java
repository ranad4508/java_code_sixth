/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Chapter10_Holdingdata;

import java.util.ArrayList;
import java.util.Iterator;

/**
 *
 * @author Dinesh
 */
public class ArrayListTest {

    public static void main(String args[]) {
        ArrayList a = new ArrayList(); // creating array list
        a.add("Jack"); // adding elements
        a.add("Tyler");
        Iterator itr = a.iterator();
        while (itr.hasNext()) {
            System.out.println(itr.next());
        }
    }
}
