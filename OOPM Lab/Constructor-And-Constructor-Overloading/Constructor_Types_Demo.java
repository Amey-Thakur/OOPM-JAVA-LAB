/**
 * Program: Constructor Types Demo
 * Description: A Java program to demonstrate different types of constructors:
 *              1. No-argument constructor (user-defined)
 *              2. Parameterized constructor
 * Author: Amey Thakur
 * Reference: https://github.com/Amey-Thakur/OOPM-JAVA-LAB
 */

public class Constructor_Types_Demo {
    int x;
    float y;

    // No-arguments constructor
    // This is explicitly defined by the user, replacing the compiler's default constructor.
    Constructor_Types_Demo() {
        System.out.println("[Constructor Execution] In no-arguments constructor");
        // Initializing with some default values if needed
        this.x = 0;
        this.y = 0.0f;
    }

    // Parameterized constructor
    // Allows initializing objects with specific values passed as arguments.
    Constructor_Types_Demo(int a, float b) {
        System.out.println("[Constructor Execution] In parameterized constructor");
        this.x = a;
        this.y = b;
    }

    public static void main(String[] args) {
        System.out.println("---------------------------------------------");
        System.out.println("       Constructor Types Demo");
        System.out.println("---------------------------------------------");
        
        // Calling the no-arguments constructor
        System.out.println("Creating object c1 (No-Args):");
        Constructor_Types_Demo c1 = new Constructor_Types_Demo();
        System.out.println("Values: x=" + c1.x + ", y=" + c1.y);
        System.out.println();

        // Calling the parameterized constructor
        System.out.println("Creating object c2 (Parameterized):");
        Constructor_Types_Demo c2 = new Constructor_Types_Demo(5, 10.5f);
        System.out.println("Values: x=" + c2.x + ", y=" + c2.y);
        
        System.out.println("---------------------------------------------");
    }
}
