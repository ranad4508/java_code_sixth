/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Chapter10_Holdingdata;

/**
 *
 * @author Dinesh
 */
import java.util.Comparator;
import java.util.TreeSet;

public class ComparatorTest {

    public static void main(String[] args) {
        TreeSet t = new TreeSet(new MyCompare());
        t.add(10);
        t.add(0);
        t.add(15);
        t.add(20);
        System.out.println(t);
    }

}
class MyCompare implements Comparator {

    public int compare(Object o1, Object o2) {
        Integer i1 = (Integer) o1; //0
        Integer i2 = (Integer) o2; //10
        if (i1 < i2) {
            return 1;
        } else if (i1 > i2) {
            return -1;
        } else {
            return 0;
        }
    }
}
