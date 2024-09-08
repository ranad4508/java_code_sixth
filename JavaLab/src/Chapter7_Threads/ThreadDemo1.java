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
public class ThreadDemo1 implements Runnable {
    public void run() {
        for(int i=0;i<3;i++){
            System.out.println(Thread.currentThread().getId()+"Value:"+i); }
        try{
            Thread.sleep(100);
        }catch(InterruptedException e){
            e.printStackTrace(); 
        }
    } 
}

class Demo{
    public static void main(String[] args) {
        Thread t1=new Thread(new ThreadDemo1());
        Thread t2=new Thread(new ThreadDemo1());
        t1.start();
        t2.start(); 
    }
}