/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Chapter7_Threads;

class College {
    public void classRoom(String TeacherName){
    synchronized(College.class) {
        for (int i = 1; i <= 5; i++) {
            System.out.println(i + "\tClass taking by:" + TeacherName);
            try {
            Thread.sleep(1000);
            } catch (InterruptedException e) {
              e.printStackTrace();}
            }
        }
    } 
}

class MyThread1 extends Thread{
    College c;
    String TeacherName;
    public void run(){
    c.classRoom(TeacherName);
    }
    MyThread1(College c, String TeacherName){
    this.c=c;
    this.TeacherName=TeacherName;
    }
}

public class Test1 extends Thread {
    public static void main(String[] args) {
    College c1=new College();
    College c2=new College();
    MyThread1 mt1=new MyThread1(c1,"Rajkumar");
    MyThread1 mt2=new MyThread1(c2,"Suresh");
    mt1.start();
    mt2.start();
    }
}
