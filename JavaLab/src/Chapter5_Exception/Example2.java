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
public class Example2 {
    public static void main(String args[]){
        try{
        int a[] = new int[7];
        a[4] = 30/0;
        System.out.println("First print statement in try block");
        }
        catch(ArithmeticException e){
            System.out.println("Warning:Arithmetic Exception");
        }
        catch(ArrayIndexOutOfBoundsException e){
            System.out.println("Warning:ArrayIndexOutOfBoundsException");
        }
        catch(Exception e){
        System.out.println("Warning: Some Other exception");
        }
        System.out.println("Out of try-catch block");
    }
}
