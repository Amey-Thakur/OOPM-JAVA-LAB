/**
 * Program: Continue Statement Demo
 * Description: A Java program to demonstrate the usage of the 'continue' statement
 *              to skip the current iteration of a loop and proceed to the next one.
 * Author: Amey Thakur
 * Reference: https://github.com/Amey-Thakur/OOPM-JAVA-LAB
 */

public class Continue_Statement {

    public static void main(String args[]) {
        System.out.println("---------------------------------------------");
        System.out.println("       Continue Statement Demo");
        System.out.println("---------------------------------------------");

        for (int i = 0; i < 10; i++) {
            // Skip the iteration when i is 4
            if (i == 4) {
                System.out.println("Skipping iteration for i = " + i);
                continue;
            }
            System.out.println("Value of i: " + i);
        }
        
        System.out.println("---------------------------------------------");
    }
}
