/**
 * Program: Input Using BufferedReader
 * Description: A Java program to demonstrate how to accept user input using the BufferedReader class.
 *              It reads a string from the console and converts it to an integer.
 * Author: Amey Thakur
 * Reference: https://github.com/Amey-Thakur/OOPM-JAVA-LAB
 */

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class InputUsingBufferedReader {
    public static void main(String[] args) throws IOException {
        // Creating an object of BufferedReader class wrapped around InputStreamReader
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        System.out.println("---------------------------------------------");
        System.out.println("       BufferedReader Input Demo");
        System.out.println("---------------------------------------------");
        System.out.print("Please enter an integer value: ");

        // Reading data using readLine() method (returns String)
        String inputString = reader.readLine();

        try {
            // Converting the string to integer
            int number = Integer.parseInt(inputString);
            System.out.println("The value entered by the user is: " + number);
        } catch (NumberFormatException e) {
            System.out.println("Error: The input provided is not a valid integer.");
        }
        
        System.out.println("---------------------------------------------");
    }
}
