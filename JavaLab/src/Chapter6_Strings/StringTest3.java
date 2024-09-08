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
public class StringTest3 {
    public static void main(String[] args) {
    String s1="Ram";
    String s2="";
    String s3="Padmashree ";
    System.out.println(s2.isEmpty());
    System.out.println(s3.isEmpty());
    System.out.println(s3+"College");
    System.out.println(s3.trim()+"College");//use to remove spaces
    System.out.println(s1.toUpperCase());
    System.out.println(s1.toLowerCase());
    System.out.println(s3.indexOf("a"));
    System.out.println(s3.lastIndexOf("a")); 
    }
}
