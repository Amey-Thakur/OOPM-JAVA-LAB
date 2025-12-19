/**
 * Program: Multilevel Inheritance Demo
 * Description: A Java program to demonstrate multilevel inheritance.
 *              - Level 1 (GrandParent): Accepts input.
 *              - Level 2 (Parent): Calculates logic (Multiplication Table).
 *              - Level 3 (Child): Displays output.
 * Author: Amey Thakur
 * Reference: https://github.com/Amey-Thakur/OOPM-JAVA-LAB
 */

import java.util.Scanner;

// Level 1: Base Class
class GrandParent {
    /**
     * Method to accept integer input from the user.
     * @return The entered integer.
     */
    int acceptInput() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Please enter a number: ");
        int no = scanner.nextInt();
        return no;
    }
}

// Level 2: Derived from GrandParent
class ParentCalculator extends GrandParent {
    int index = 0;
    int[] tableArray = new int[10];

    /**
     * Method to generate multiplication table and store in an array.
     * @param num The number for which table is generated.
     * @return Array containing the multiplication table.
     */
    int[] generateTable(int num) {
        index = 0; // Reset index
        for (int i = 1; i <= 10; i++) {
            tableArray[index] = num * i;
            index++;
        }
        return tableArray;
    }
}

// Level 3: Derived from ParentCalculator
class ChildDisplay extends ParentCalculator {
    /**
     * Method to display the elements of an integer array.
     * @param arr The array to display.
     */
    void displayTable(int[] arr) {
        System.out.println("The table of entered number is: ");
        for (int i = 0; i < 10; i++) {
            System.out.println(arr[i]);
        }
    }
}

// Main class to test Multilevel Inheritance
public class Multilevel_Inheritance_Demo {
    public static void main(String[] args) {
        System.out.println("---------------------------------------------");
        System.out.println("       Multilevel Inheritance Demo");
        System.out.println("---------------------------------------------");

        // Creating an object of the most derived class (Level 3)
        ChildDisplay obj = new ChildDisplay();
        
        // Level 1 functionality: Accept Input
        int num = obj.acceptInput();
        
        // Level 2 functionality: Calculate Table
        int[] result = obj.generateTable(num);
        
        // Level 3 functionality: Display Result
        obj.displayTable(result);

        System.out.println("---------------------------------------------");
    }
}
