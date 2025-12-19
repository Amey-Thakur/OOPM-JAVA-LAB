/**
 * Program: Student Marks Report
 * Description: A basic Java program to demonstrate the creation, input, and output of a one-dimensional array
 *              by storing and displaying marks for 10 students.
 * Author: Amey Thakur
 * Reference: https://github.com/Amey-Thakur/OOPM-JAVA-LAB
 */

import java.util.Scanner;

public class StudentMarksReport {
    public static void main(String[] args) {
        // Create a Scanner object to read input from the user
        Scanner scanner = new Scanner(System.in);

        // Declaration and instantiation of a 1-D array to hold 10 integers
        int[] studentMarks = new int[10];

        System.out.println("---------------------------------------------");
        System.out.println("       Student Marks Entry System");
        System.out.println("---------------------------------------------");
        System.out.println("Please enter the marks for 10 students:");

        // Loop to accept input for each element of the array
        for (int i = 0; i < studentMarks.length; i++) {
            System.out.print("Enter marks for Student " + (i + 1) + ": ");
            studentMarks[i] = scanner.nextInt();
        }

        System.out.println("\n---------------------------------------------");
        System.out.println("       Student Marks Report");
        System.out.println("---------------------------------------------");

        // Loop to display the contents of the array
        for (int i = 0; i < studentMarks.length; i++) {
            System.out.println("Student " + (i + 1) + ": " + studentMarks[i]);
        }

        // Close the scanner to prevent resource leaks
        scanner.close();
    }
}
