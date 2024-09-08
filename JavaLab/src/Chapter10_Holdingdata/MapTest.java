/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Chapter10_Holdingdata;

import java.util.HashMap;
import java.util.Map;

/**
 *
 * @author Dinesh
 */
public class MapTest {

    public static void main(String[] args) {
        Map<String, String> courses = new HashMap<String, String>();
        courses.put("Book 1", "java");
        courses.put("Book 2", "Python");
        System.out.println(courses);
        System.out.println("Total size is:\t" + courses.size());
        String key = courses.get("Book 1");
        if (courses.containsKey("Book 1")) {
            System.out.println("found\t" + courses.replace("Book 1", "C++"));
        }
        System.out.println(courses);
    }
}
