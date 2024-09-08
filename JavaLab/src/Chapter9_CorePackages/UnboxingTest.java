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
public class UnboxingTest {
    public static void main(String[] args) {
    Integer I1=new Integer(40);
    Integer I2=new Integer(50);
    int i1=I1.intValue();
    int i2=I2.intValue();
    String s=I2.toString();
    Integer i3=Integer.valueOf("45");
    int x=Integer.parseInt("32");
    System.out.println("i1\t"+i1+"\ni2\t"+i2+"\ns"+s+"\ni3"+i3+"\nX\t"+x);
    }
}
