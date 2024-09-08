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
public class PriorityThread extends Thread{
    public void run(){
        for(int i=0;i<5;i++){
            System.out.println("Child Thread"); 
        }
    }
}

class PriorityThread1 extends Thread{
    public void run(){
        for(int i=0;i<5;i++){
            System.out.println("child1 Thread"); 
        }
    }
}

class Mainthread {
    public static void main(String[] args) {
        PriorityThread t=new PriorityThread();
        PriorityThread1 t1=new PriorityThread1();
        t.setPriority(1);
        t1.setPriority(10);
        t1.start();
        t.start(); 
    } 
}
