/**
 * Program: Input Using Scanner
 * Description: A Java program to demonstrate how to accept various types of input from the user
 *              (String, int, float) using the Scanner class.
 * Author: Amey Thakur
 * Reference: https://github.com/Amey-Thakur/OOPM-JAVA-LAB
 */

import java.util.Scanner;

public class Input_Using_Scanner {
    public static void main(String args[]) {
        // Initializing Scanner object for keyboard input
        Scanner scanner = new Scanner(System.in);

        System.out.println("---------------------------------------------");
        System.out.println("       Scanner Input Demo");
        System.out.println("---------------------------------------------");

        // Accepting String input
        System.out.print("Enter a string: ");
        String text = scanner.nextLine();
        System.out.println("You entered string: " + text);

        // Accepting Integer input
        System.out.print("Enter an integer: ");
        int number = scanner.nextInt();
        System.out.println("You entered integer: " + number);

        // Accepting Float input
        System.out.print("Enter a float value: ");
        float decimal = scanner.nextFloat();
        System.out.println("You entered float: " + decimal);

        System.out.println("---------------------------------------------");
        
        // Closing scanner
        scanner.close();
    }
}
