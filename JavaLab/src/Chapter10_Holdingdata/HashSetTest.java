/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Chapter10_Holdingdata;

import java.util.HashSet;
import java.util.Iterator;

/**
 *
 * @author Dinesh
 */
public class HashSetTest {

    public static void main(String[] args) {
        HashSet hs = new HashSet();
        hs.add("Manish");
        hs.add("Anil");
        hs.add("Sangeeta");
        hs.add("Anil"); //duplicate data
        Iterator itr = hs.iterator();
        while (itr.hasNext()) {
            System.out.println(itr.next());
        }
    }
}
