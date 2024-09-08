/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Chapter10_Holdingdata;

import java.util.Iterator;
import java.util.TreeSet;

/**
 *
 * @author Dinesh
 */
public class TreeSetTest {

    public static void main(String[] args) {
        TreeSet ts = new TreeSet();
        ts.add("Sangeeta");
        ts.add("Manish");
        ts.add("Anil");
        ts.add("Manisha");
        System.out.println("Z".compareTo("A")); //25
        System.out.println("A".compareTo("Z")); //-25
        System.out.println("A".compareTo("A")); //0
        Iterator itr = ts.iterator();
        while (itr.hasNext()) {
            System.out.println(itr.next());
        }
    }
}
