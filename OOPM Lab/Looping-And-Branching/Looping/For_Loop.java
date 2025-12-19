/**
 * Program: For Loop Demo
 * Description: A Java program to demonstrate the 'for' loop by printing a multiplication table.
 * Author: Amey Thakur
 * Reference: https://github.com/Amey-Thakur/OOPM-JAVA-LAB
 */

import java.util.Scanner;

public class For_Loop {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("---------------------------------------------");
        System.out.println("       For Loop Demo (Multiplication Table)");
        System.out.println("---------------------------------------------");

        System.out.print("Enter the number whose table you want to view: ");
        int num = scanner.nextInt();

        System.out.println("The table for " + num + " is:");

        // Loop to generate table up to 10 times
        for (int i = 1; i <= 10; i++) {
            System.out.println(num + " X " + i + " = " + (num * i));
        }
        
        System.out.println("---------------------------------------------");
        
        scanner.close();
    }
}
