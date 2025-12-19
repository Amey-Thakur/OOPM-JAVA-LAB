/**
 * Program: Single Inheritance Demo
 * Description: A Java program to demonstrate single-level inheritance.
 *              - Parent class: Contains logic to generate and print a multiplication table.
 *              - Child class: Inherits from Parent and adds functionality to accept user input.
 * Author: Amey Thakur
 * Reference: https://github.com/Amey-Thakur/OOPM-JAVA-LAB
 */

import java.util.Scanner;

// Base class (Parent)
class ParentOps {
    /**
     * Method to print a multiplication table for a given number.
     * @param num The number for which the table is generated.
     */
    void printTable(int num) {
        System.out.println("Multiplication Table for " + num + ":");
        for (int i = 1; i <= 10; i++) {
            System.out.println(num + " X " + i + " = " + (num * i));
        }
    }
}

// Derived class (Child) inheriting from ParentOps
class ChildOps extends ParentOps {
    /**
     * Method to accept an integer input from the user.
     * @return The integer entered by the user.
     */
    int acceptInput() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Please enter a number: ");
        int no = scanner.nextInt();
        // Note: Scanner is not closed here to avoid closing System.in if used elsewhere, 
        // but in a real-world app, resource management is key.
        return no;
    }
}

// Main class to test Single Inheritance
public class Single_Inheritance_Demo {
    public static void main(String[] args) {
        System.out.println("---------------------------------------------");
        System.out.println("       Single Inheritance Demo");
        System.out.println("---------------------------------------------");

        // Creating an object of the Child class
        ChildOps childObj = new ChildOps();
        
        // Using method from Child class to input number
        int number = childObj.acceptInput();
        
        // Using inherited method from Parent class to print table
        childObj.printTable(number);

        System.out.println("---------------------------------------------");
    }
}
