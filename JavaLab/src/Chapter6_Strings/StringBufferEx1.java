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
public class StringBufferEx1 {
    public static void main(String[] args) {
    String str = "Padma";
    str.concat("Shree");
    System.out.println(str);
    //StringBuffer a mutable class
    StringBuffer strb = new StringBuffer("Padma");
    strb.append("Shree");
    System.out.println(strb); 
    }
}