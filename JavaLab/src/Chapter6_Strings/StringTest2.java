/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Chapter6_Strings;

/**
 *
 * @author Dinesh
 */
public class StringTest2 {
    public static void main(String[] args) {
    String s1 = new String("Padmashree");
    String s2 = "C";
    String s3 = "D";
    String s4 = "ANIL";
    String s5 = "anil";
    System.out.println(s1.length());
    System.out.println("Use of Concatenation:\n");
    s1.concat(" College");
    System.out.println(s1);
    s1=s1.concat(" College");
    System.out.println(s1);
    System.out.println(s2.compareTo(s3));
    System.out.println(s4.compareToIgnoreCase(s5));
    }
}
