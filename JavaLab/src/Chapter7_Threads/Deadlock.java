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
public class Deadlock extends Thread{
    static Thread mt=null;
    @Override
    public void run(){
        System.out.println("run:"+Thread.currentThread().getName());
        try {
        mt.join();
        } catch (InterruptedException e) {
        e.printStackTrace(); }
        for(int i=1;i<=3;i++){
            System.out.println("run:"+Thread.currentThread().getName()); 
        } 
    }
    public static void main(String[] args) throws InterruptedException {
        System.out.printf("Main:"+Thread.currentThread().getName());
        Deadlock d=new Deadlock();
        mt=Thread.currentThread();
        d.start();
        d.join();
        for(int i=1;i<3;i++){
        System.out.println("\nMain:"+Thread.currentThread().getName()); 
        }
    }
}
