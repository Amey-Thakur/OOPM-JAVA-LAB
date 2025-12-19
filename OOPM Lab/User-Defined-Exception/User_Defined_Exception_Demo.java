/**
 * Program: User Defined Exception Demo
 * Description: A Java program to demonstrate the creation and handling of a custom (user-defined) exception.
 *              The program asks for an odd number and throws an exception if an even number is entered.
 * Author: Amey Thakur
 * Reference: https://github.com/Amey-Thakur/OOPM-JAVA-LAB
 */

import java.util.Scanner;

// Custom Exception Class extending Exception
class CustomNumberException extends Exception {
    // Constructor receiving string message
    public CustomNumberException(String s) {
        // Call constructor of parent Exception class
        super(s);
    }
}

public class User_Defined_Exception_Demo {

    // Main method declares that it might throw our custom exception
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("---------------------------------------------");
        System.out.println("       User Defined Exception Demo");
        System.out.println("---------------------------------------------");

        try {
            System.out.print("Please enter an ODD number: ");
            int num = scanner.nextInt();

            // Check if the number is even
            if (num % 2 == 0) {
                // Throw custom exception if condition (even number) is met
                throw new CustomNumberException("Error: You entered an EVEN number. An ODD number was expected.");
            } else {
                System.out.println("Success! You entered an ODD number: " + num);
            }
        } catch (CustomNumberException e) {
            // Catch and handle the custom exception
            System.out.println("\n[Exception Caught] " + e.getMessage());
        } catch (Exception e) {
            // Catch any other generic exceptions (like invalid input)
            System.out.println("\n[Generic Exception] " + e);
        } finally {
            // Always close scanner
            scanner.close();
            System.out.println("---------------------------------------------");
        }
    }
}
