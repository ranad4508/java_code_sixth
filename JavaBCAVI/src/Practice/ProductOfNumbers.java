/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Practice;

/**
 *
 * @author Dinesh
 */
public class ProductOfNumbers {

    public int getProducts(int a, int b) {
        return a * b;
    }

    public static void main(String[] args) {
        ProductOfNumbers product = new ProductOfNumbers();
        int multiply = product.getProducts(5, 10);

        System.out.println("Proudcts of two numbers: " + multiply);
    }
}
