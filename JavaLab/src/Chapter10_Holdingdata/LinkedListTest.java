/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Chapter10_Holdingdata;

import java.util.Iterator;
import java.util.LinkedList;

/**
 *
 * @author Dinesh
 */
public class LinkedListTest {

    public static void main(String[] args) {
        LinkedList l = new LinkedList();
        l.add("Java");
        l.add("Python");
        l.add("PHP");
        l.addFirst("C Programing");
        l.addLast("Java Script");
        Iterator itr = l.iterator();
        while (itr.hasNext()) {
            System.out.println(itr.next());
        }
    }
}
