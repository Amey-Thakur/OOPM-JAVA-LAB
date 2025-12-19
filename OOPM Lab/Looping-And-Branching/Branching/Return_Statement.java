/**
 * Program: Return Statement Demo
 * Description: A Java program to demonstrate the usage of the 'return' statement
 *              to return a value from a method.
 * Author: Amey Thakur
 * Reference: https://github.com/Amey-Thakur/OOPM-JAVA-LAB
 */

public class Return_Statement {

    public static void main(String[] args) {
        Return_Statement e = new Return_Statement();
        
        System.out.println("---------------------------------------------");
        System.out.println("       Return Statement Demo");
        System.out.println("---------------------------------------------");
        
        int n1 = 9;
        int n2 = 12;

        System.out.println("Calling add method with " + n1 + " and " + n2);
        int ans = e.add(n1, n2);
        System.out.println("The result of addition returned is: " + ans);
        
        System.out.println("---------------------------------------------");
    }

    /**
     * Method to add two integers and return the result.
     * @param a First integer
     * @param b Second integer
     * @return Sum of a and b
     */
    int add(int a, int b) {
        int c = a + b;
        return c; // Returning the value to the caller
    }
}
