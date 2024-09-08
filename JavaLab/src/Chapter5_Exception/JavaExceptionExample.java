/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Chapter5_Exception;

/**
 *
 * @author Dinesh
 */
public class JavaExceptionExample {
    public static void main(String args[]){
        System.out.println("1");
        try{
            System.out.println("2");
            int a =100, b=2,c, result;
            System.out.println("3");
            c=a/b;
            System.out.println("4");
            System.out.println(c);
            System.out.println("5");
            
        }
        catch(ArithmeticException e){
            System.out.println("6");
            
            System.out.println(e);
            System.out.println("7");
        }
        System.out.println("Do i understand exception?");
    }
}
