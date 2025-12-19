/**
 * Program: Default Constructor Demo
 * Description: A Java program to demonstrate the default constructor provided by the compiler.
 *              It shows that when no constructor is strictly defined, the compiler initializes 
 *              instance variables to their default values (0, null, false, etc.).
 * Author: Amey Thakur
 * Reference: https://github.com/Amey-Thakur/OOPM-JAVA-LAB
 */

public class Default_Constructor_Demo {
    // Instance variables of different data types
    int intVal;
    float floatVal;
    String stringVal;
    long longVal;
    char charVal;
    double doubleVal;
    boolean booleanVal;
    short shortVal;
    byte byteVal;

    public static void main(String[] args) {
        System.out.println("---------------------------------------------");
        System.out.println("       Default Constructor Demo");
        System.out.println("---------------------------------------------");
        
        // Creating an object without passing any arguments. 
        // Since no constructor is defined in this class, the compiler's default constructor is called.
        Default_Constructor_Demo obj = new Default_Constructor_Demo();

        System.out.println("Displaying default values initialized by the compiler:");
        System.out.println("Integer (int): " + obj.intVal);
        System.out.println("Float (float): " + obj.floatVal);
        System.out.println("String (String): " + obj.stringVal);
        System.out.println("Long (long): " + obj.longVal);
        System.out.println("Character (char): [" + obj.charVal + "]"); // converting to int to see value if invisible
        System.out.println("Double (double): " + obj.doubleVal);
        System.out.println("Boolean (boolean): " + obj.booleanVal);
        System.out.println("Short (short): " + obj.shortVal);
        System.out.println("Byte (byte): " + obj.byteVal);
        
        System.out.println("---------------------------------------------");
    }
}
