/**
 * Program: Classes and Methods Demo
 * Description: A Java program to demonstrate the creation of a class, instantiation of objects,
 *              and definition of methods for basic arithmetic and geometric calculations.
 * Author: Amey Thakur
 * Reference: https://github.com/Amey-Thakur/OOPM-JAVA-LAB
 */

import java.util.Scanner;

public class Class_Method_Demo {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // Creation of an object of the class Class_Method_Demo
        Class_Method_Demo demoObject = new Class_Method_Demo();

        System.out.println("---------------------------------------------");
        System.out.println("       Class and Methods Demo");
        System.out.println("---------------------------------------------");

        // Input for arithmetic operations
        System.out.print("Enter first number for arithmetic ops: ");
        int num1 = scanner.nextInt();
        System.out.print("Enter second number for arithmetic ops: ");
        int num2 = scanner.nextInt();

        // Input for circle calculation
        System.out.print("Enter the radius for circle: ");
        int r = scanner.nextInt();

        // Calling instance methods using the object
        int sum = demoObject.add(num1, num2);
        int difference = demoObject.subtract(num1, num2);
        float circumference = demoObject.calculateCircumference(r);

        System.out.println("\n---------------------------------------------");
        System.out.println("       Results");
        System.out.println("---------------------------------------------");
        System.out.println("Addition Result: " + sum);
        System.out.println("Subtraction Result: " + difference);
        System.out.println("Circumference of Circle: " + circumference);
        System.out.println("---------------------------------------------");
        
        scanner.close();
    }

    /**
     * Method to add two integers.
     * @param a First integer
     * @param b Second integer
     * @return Sum of a and b
     */
    int add(int a, int b) {
        return a + b;
    }

    /**
     * Method to subtract two integers.
     * @param c First integer
     * @param d Second integer
     * @return Difference of c and d
     */
    int subtract(int c, int d) {
        return c - d;
    }

    /**
     * Method to calculate circumference of a circle.
     * @param radius Radius of the circle
     * @return Circumference (2 * pi * r)
     */
    float calculateCircumference(int radius) {
        return 2 * 3.14f * radius;
    }
}
