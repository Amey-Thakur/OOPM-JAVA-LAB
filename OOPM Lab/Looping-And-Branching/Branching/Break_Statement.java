/**
 * Program: Break Statement Demo
 * Description: A Java program to demonstrate the usage of the 'break' statement 
 *              to exit a loop prematurely when a specific condition is met.
 * Author: Amey Thakur
 * Reference: https://github.com/Amey-Thakur/OOPM-JAVA-LAB
 */

public class Break_Statement {

    public static void main(String args[]) {
        int[] numbers = {10, 20, 30, 40, 50};

        System.out.println("---------------------------------------------");
        System.out.println("       Break Statement Demo");
        System.out.println("---------------------------------------------");

        for (int x : numbers) {
            // Check if value is 30, if so break the loop
            if (x == 30) {
                System.out.println("Condition met (x==30). Breaking loop...");
                break;
            }
            System.out.println("Processing value: " + x);
        }
        
        System.out.println("---------------------------------------------");
    }
}
