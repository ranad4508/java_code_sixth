/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Chapter7_Threads;

class Account{
    double balance=10000.00;
    synchronized public double withDraw(double wamt){
        System.out.println("Withdraw process Starts:\n");
        System.out.printf("\nBefore withdraw"+balance);
        if(balance<wamt){
            System.out.printf("\nSalary insufficient balance waiting for deposit\n");
            try{
            wait();
            } catch (InterruptedException e) {
            e.printStackTrace(); } 
        }
        balance=balance-wamt;
        System.out.println("\nafter withdraw:"+balance);
        return wamt; 
    }
    synchronized public void deposit(double damt){
    System.out.printf("\nDeposit process starts:");
    System.out.println("\nBefore deposit:"+balance);
    balance=balance+damt;
    System.out.println("\nAfter Deposit:"+balance);
    notify(); 
    } 
}

public class TestAccount {
    public static void main(String[] args) {
    final Account acc=new Account();
    new Thread(){
        public void run(){
            acc.withDraw(15000);
            }
        }.start();
    new Thread(){
        public void run(){
            acc.deposit(10000);
            }
        }.start();
    }
}
