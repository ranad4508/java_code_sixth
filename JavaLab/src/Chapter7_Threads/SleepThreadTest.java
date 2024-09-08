/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Chapter7_Threads;

public class SleepThreadTest extends Thread{
    public void run(){
        for(int i=0;i<5;i++){
            try{
                Thread.sleep(1000);
            }catch(Exception e){ }
                System.out.println(i); 
        }
    }
}

class SleepTest{
    public static void main(String[] args) {
        SleepThreadTest t=new SleepThreadTest();
        System.out.println("Thread ID is:\t"+t.getId());
        System.out.println("Thread Name is:\t"+t.getName());
        t.setName("Anil");
        System.out.println("Thread Name is:\t"+t.getName());
        t.start();
    }
}
