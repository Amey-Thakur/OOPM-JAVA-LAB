/**
 * Program: Array Parameter Passing
 * Description: A Java program demonstrating how to pass an entire array as a parameter to a method
 *              and return an array from a method.
 * Author: Amey Thakur
 * Reference: https://github.com/Amey-Thakur/OOPM-JAVA-LAB
 */

import java.util.Scanner;

public class Array_Parameter_Passing {

    public static void main(String[] args) {
        // Create an instance of the class to call instance methods
        Array_Parameter_Passing demoArgs = new Array_Parameter_Passing();
        Scanner scanner = new Scanner(System.in);

        // Declare and instantiate an array of size 10
        int[] numbers = new int[10];

        System.out.println("---------------------------------------------");
        System.out.println("       Array Parameter Demo");
        System.out.println("---------------------------------------------");
        System.out.println("Enter 10 integer values for the array:");

        // Input loop
        for (int i = 0; i < numbers.length; i++) {
            System.out.print("Value " + (i + 1) + ": ");
            numbers[i] = scanner.nextInt();
        }

        // Calling the method and passing the array 'numbers' as an argument
        // The returned array is stored in 'updatedArray'
        int[] updatedArray = demoArgs.displayAndModifyArray(numbers);

        System.out.println("\n---------------------------------------------");
        System.out.println("       Final Updated Array");
        System.out.println("---------------------------------------------");

        // Displaying the modified array returned by the method
        for (int i = 0; i < updatedArray.length; i++) {
            System.out.println("Index " + i + ": " + updatedArray[i]);
        }
        
        scanner.close();
    }

    /**
     * Method to display an array and modify its values.
     * @param inputArray The array passed from the main method.
     * @return The modified array with values incremented by 2.
     */
    public int[] displayAndModifyArray(int[] inputArray) {
        System.out.println("\n[Method Call] Received array. Displaying values:");

        // Displaying received values
        for (int i = 0; i < inputArray.length; i++) {
            System.out.println("  Val " + (i + 1) + ": " + inputArray[i]);
        }

        System.out.println("[Method Call] Incrementing each value by 2...");

        // Modifying the array elements
        for (int i = 0; i < inputArray.length; i++) {
            inputArray[i] = inputArray[i] + 2;
        }

        // Returning the modified array reference
        return inputArray;
    }
}
