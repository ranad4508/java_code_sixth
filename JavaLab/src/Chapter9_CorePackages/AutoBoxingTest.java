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
public class AutoBoxingTest {
    public static void main(String[] args) {
    int i=10;
    Integer iobj=new Integer(i);
    System.out.println(iobj);
    String s=new String("45");
    String s1="54";
    Integer iobj2=Integer.valueOf(s);
    Integer iobj3=Integer.valueOf(s1);
    System.out.println(iobj2);
    if(iobj2>iobj3){
        System.out.println(iobj2+"\tis greater");
    }
    else{
        System.out.println(iobj3+"\tis greater");
    }
    System.out.println(Integer.toHexString(45));
    System.out.println(Integer.toBinaryString(45));
    System.out.println(Integer.toOctalString(45));
    }
}
