/**
 * Program: Labelled Break Demo
 * Description: A Java program to demonstrate the usage of a labelled 'break' statement
 *              to exit from nested loops.
 * Author: Amey Thakur
 * Reference: https://github.com/Amey-Thakur/OOPM-JAVA-LAB
 */

public class Labelled_Break {

    public static void main(String args[]) {
        System.out.println("---------------------------------------------");
        System.out.println("       Labelled Break Demo");
        System.out.println("---------------------------------------------");

        // Label for the outer loop
        outerLoop: 
        for (int j = 0; j < 5; j++) {
            System.out.println("\nOuter Loop: " + j);

            for (int i = 0; i < 5; i++) {
                // If j is 2, break out of the OUTER loop
                if (j == 2) {
                    System.out.println("  [Condition j==2 met] Breaking out of Outer Loop...");
                    break outerLoop;
                }
                System.out.println("  Inner Loop: " + i);
            }
        }
        
        System.out.println("---------------------------------------------");
    }
}
