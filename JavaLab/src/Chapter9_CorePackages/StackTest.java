/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Chapter9_CorePackages;

import java.util.Stack;

/**
 *
 * @author Dinesh
 */
public class StackTest {
    public static void main(String[] args) {
    Stack<Integer> s=new Stack<Integer>();
    s.push(5); //insert data into stack
    s.push(2);
    s.push(6);
    s.push(9);
    s.push(8);
    s.push(9);
    s.pop(); //delete data from stack
    System.out.println(s.peek());//show last item added in stack
    s.push(7);
    System.out.println(s.search(9));//search the object 9 and print the index
    System.out.println(s);
    }
}
