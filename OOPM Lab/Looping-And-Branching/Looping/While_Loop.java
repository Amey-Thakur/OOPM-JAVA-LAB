/**
 * Program: While Loop Demo
 * Description: A Java program to demonstrate the 'while' loop by printing a multiplication table.
 * Author: Amey Thakur
 * Reference: https://github.com/Amey-Thakur/OOPM-JAVA-LAB
 */

public class While_Loop {
    public static void main(String[] args) {
        int i = 1;
        int num = 7;

        System.out.println("---------------------------------------------");
        System.out.println("       While Loop Demo");
        System.out.println("---------------------------------------------");
        System.out.println("Printing table of " + num + " using while loop:");

        // Loop runs as long as i is less than or equal to 10
        while (i <= 10) {
            System.out.println(num + " X " + i + " = " + (num * i));
            i++; // Increment counter
        }

        System.out.println("---------------------------------------------");
    }
}
