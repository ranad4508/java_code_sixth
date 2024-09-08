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
public class StringBufferMethod {
    public static void main(String[] args ) {
    StringBuffer sb = new StringBuffer("PadmaShree");
    StringBuffer sb1=new StringBuffer("WhiteHouse");
    System.out.println(sb.length());//returns length of college
    System.out.println(sb.capacity()); //return capacity of StringBuffer object
    System.out.println(sb.append("College")); //concate
    System.out.println(sb1.reverse());
    System.out.println(sb.replace(5,10,"n...."));
    System.out.println(sb.insert(6," HI "));
    System.out.println(sb1.reverse());
    System.out.println(sb1.delete(3,6));
    System.out.println(sb.deleteCharAt(5));
    }
}
