/**
 * Program: Labelled Continue Demo
 * Description: A Java program to demonstrate the usage of a labelled 'continue' statement
 *              to skip iterations of an outer loop from within an inner loop.
 * Author: Amey Thakur
 * Reference: https://github.com/Amey-Thakur/OOPM-JAVA-LAB
 */

public class Labelled_Continue {

    public static void main(String args[]) {
        System.out.println("---------------------------------------------");
        System.out.println("       Labelled Continue Demo");
        System.out.println("---------------------------------------------");

        // Label for the outer loop
        outerLoop: 
        for (int j = 0; j < 5; j++) {
            System.out.println("\nOuter Loop: " + j);

            for (int i = 0; i < 3; i++) {
                // If j is 2, skip the rest of this outer iteration and continue to next outer iteration
                if (j == 2) {
                    System.out.println("  [Condition j==2 met] Skipping to next Outer Loop iteration...");
                    continue outerLoop;
                }
                System.out.println("  Inner Loop: " + i);
            }
        }
        
        System.out.println("---------------------------------------------");
    }
}
