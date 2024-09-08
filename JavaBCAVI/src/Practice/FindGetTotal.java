/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Practice;

/**
 *
 * @author Dinesh
 */
public class FindGetTotal {

    public int getTotal(int num1, int num2) {
        return num1 + num2;
    }

    public static void main(String[] args) {
        FindGetTotal fgt = new FindGetTotal();
        int total = fgt.getTotal(5, 6);
        System.out.println("The total of two numbers is: " + total);
    }
}
