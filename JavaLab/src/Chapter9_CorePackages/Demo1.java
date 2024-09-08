/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Chapter9_CorePackages;

/**
 *
 * @author Dinesh
 */
public class Demo1 {
    public static void main(String[] args) {
    Integer i = new Integer(10);
    // unboxing the Object
    int i1 = i;
    System.out.println("Value of i: " + i);
    System.out.println("Value of i1: " + i1);
    //Autoboxing of char
    Character ch= 'a';
    // Auto-unboxing of Character
    char ch1 = ch;
    System.out.println("Value of ch: " + ch);
    System.out.println("Value of ch1: " + ch1);
    }
}
