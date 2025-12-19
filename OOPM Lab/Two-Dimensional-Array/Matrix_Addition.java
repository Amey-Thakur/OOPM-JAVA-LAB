/**
 * Program: Matrix Addition (2D Array Demo)
 * Description: A Java program demonstrating the initialization, display, and addition
 *              of two 2-dimensional arrays (matrices).
 * Author: Amey Thakur
 * Reference: https://github.com/Amey-Thakur/OOPM-JAVA-LAB
 */

public class Matrix_Addition {

    public static void main(String[] args) {
        // Initialization of 2D arrays (matrices) with static values
        // Size: 2 rows x 3 columns
        int[][] matrixA = {
            {10, 20, 30},
            {40, 50, 60}
        };

        int[][] matrixB = {
            {11, 30, 32},
            {82, 5, 82}
        };

        // Array to store the result of addition
        int[][] resultMatrix = new int[2][3];

        System.out.println("---------------------------------------------");
        System.out.println("       Matrix Operations Demo");
        System.out.println("---------------------------------------------");

        // Displaying Matrix A
        System.out.println("Matrix A:");
        displayMatrix(matrixA);

        // Displaying Matrix B
        System.out.println("\nMatrix B:");
        displayMatrix(matrixB);

        // Performing Matrix Addition
        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 3; j++) {
                resultMatrix[i][j] = matrixA[i][j] + matrixB[i][j];
            }
        }

        // Displaying Result Matrix
        System.out.println("\n---------------------------------------------");
        System.out.println("       Result: Matrix A + Matrix B");
        System.out.println("---------------------------------------------");
        displayMatrix(resultMatrix);
    }

    /**
     * Helper method to print a 2D array in matrix format.
     * @param matrix The 2D array to display
     */
    public static void displayMatrix(int[][] matrix) {
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                System.out.print("\t" + matrix[i][j]);
            }
            System.out.println(); // New line after each row
        }
    }
}
