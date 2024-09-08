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
public class StringTest1 {
    public static void main(String [] args){
    String s1 = new String("laxman");
    String s2 = new String("laxman");
    String s3 = "laxman";
    String s4 = "LAXMAN";
    String s5 = "laxman";
    System.out.println(s1==s2);
    System.out.println(s1==s3);
    System.out.println("s1.equals(s2):\t"+s1.equals(s2));
    System.out.println("s1.equalsIgnoreCase(s2):\t"+s1.equalsIgnoreCase(s4));
    System.out.println(s3==s5);
    }
}
