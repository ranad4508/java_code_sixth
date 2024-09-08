/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Chapter7_Threads;

/**
 *
 * @author Dinesh
 */
public class ThreadDemo implements Runnable {
    public void run() {
        System.out.println("This is thread using Runnable"); 
    }
    public static void main(String[] args) {
        ThreadDemo td=new ThreadDemo();
        Thread t=new Thread(td);
        t.start();
        Runnable r=new Runnable() {
        @Override
            public void run() {
                System.out.println("This is Thread using anonymous Runnable"); 
            }
        };
        Thread t2=new Thread(r);
        t2.start(); 
    } 
}
