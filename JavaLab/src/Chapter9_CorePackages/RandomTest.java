/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Chapter9_CorePackages;

import java.util.Random;

/**
 *
 * @author Dinesh
 */
public class RandomTest {
    public static void main(String[] args) {
    Random r=new Random();
    int x=r.nextInt(1000);
    System.out.println(x);
    System.out.println(r.nextDouble());
    System.out.println(r.nextInt());
    }
}
