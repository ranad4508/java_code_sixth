/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Chapter5_Exception;

import java.util.Scanner;

class YAgeException extends RuntimeException {
YAgeException(String msg){
super(msg); }
}

public class VoteProcessing {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        System.out.printf("Enter age:\t");
        int age=s.nextInt();
        try {
        if (age < 18) {
            throw new YAgeException("You are not eligible to vote"); //We cannot write any statement after throw statement
        } else {
            System.out.println("Vote Successful"); }
        }catch (YAgeException e){
            e.printStackTrace();
        } 
    } 
}
