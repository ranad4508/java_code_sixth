/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Chapter7_Threads;

class SyncMethod {
    synchronized public void classRoom(String TeacherName){
        for(int i=1;i<=5;i++){
            System.out.println(i+"\tClass taking by:"+TeacherName);
            try {
            Thread.sleep(1000);
            } catch (InterruptedException e) {
            e.printStackTrace(); }
        } 
    } 
}
class MyThread extends Thread{
    SyncMethod sym;
    String TeacherName;
    public void run(){
    sym.classRoom(TeacherName);
}
    MyThread(SyncMethod sym, String TeacherName){
        this.sym=sym;
        this.TeacherName = TeacherName; 
    }
}

public class Test extends Thread {
    public static void main(String[] args) {
        SyncMethod sym=new SyncMethod();
        MyThread mt1=new MyThread(sym,"Rajkumar");
        MyThread mt2=new MyThread(sym,"Suresh");
        mt1.start();
        mt2.start();
    }
}
