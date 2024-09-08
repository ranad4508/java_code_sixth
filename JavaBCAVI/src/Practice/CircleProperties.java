/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Practice;

/**
 *
 * @author Dinesh
 */
public class CircleProperties {

    public double getCircumference(double radius) {
        return 2 * Math.PI * radius;
    }

    public double getArea(double radius) {
        return 2 * Math.PI * radius * radius;
    }

    public static void main(String[] args) {
        CircleProperties circle = new CircleProperties();

        System.out.println("Circumference: " + circle.getCircumference(12));
        System.out.println("Circumference: " + circle.getArea(12));

    }

}
