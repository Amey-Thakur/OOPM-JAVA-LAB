/**
 * Program: Do-While Loop Demo
 * Description: A Java program to demonstrate the 'do-while' loop by printing a multiplication table.
 *              The do-while loop executes the block of code at least once before checking the condition.
 * Author: Amey Thakur
 * Reference: https://github.com/Amey-Thakur/OOPM-JAVA-LAB
 */

public class Do_While_Loop {
    public static void main(String[] args) {
        int num = 5;
        int c = 1;

        System.out.println("---------------------------------------------");
        System.out.println("       Do-While Loop Demo");
        System.out.println("---------------------------------------------");
        System.out.println("Printing table of " + num + " using do-while loop:");

        do {
            System.out.println(num + " X " + c + " = " + (num * c));
            c++; // Increment counter
        } while (c <= 10); // Condition is checked after execution

        System.out.println("---------------------------------------------");
    }
}
