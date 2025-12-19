/**
 * Program: Constructor Overloading Demo
 * Description: A Java program to demonstrate constructor overloading.
 *              It shows how a class can have multiple constructors with different parameter lists,
 *              allowing objects to be initialized in different ways.
 * Author: Amey Thakur
 * Reference: https://github.com/Amey-Thakur/OOPM-JAVA-LAB
 */

public class Constructor_Overloading_Demo {
    int valA, valB;
    float valC;
    String valD;

    // Constructor 1: Two integer parameters
    Constructor_Overloading_Demo(int num1, int num2) {
        System.out.println("[Constructor Init] Int-Int constructor called");
        this.valA = num1;
        this.valB = num2;
    }

    // Constructor 2: One float parameter
    Constructor_Overloading_Demo(float num) {
        System.out.println("[Constructor Init] Float constructor called");
        this.valC = num;
    }

    // Constructor 3: One String parameter
    Constructor_Overloading_Demo(String val) {
        System.out.println("[Constructor Init] String constructor called");
        this.valD = val;
    }

    public static void main(String[] args) {
        System.out.println("---------------------------------------------");
        System.out.println("       Constructor Overloading Demo");
        System.out.println("---------------------------------------------");

        // Object initialized with two integers
        Constructor_Overloading_Demo obj1 = new Constructor_Overloading_Demo(5, 7);
        System.out.println("Object 1 Data: valA=" + obj1.valA + ", valB=" + obj1.valB);
        System.out.println();

        // Object initialized with a float
        Constructor_Overloading_Demo obj2 = new Constructor_Overloading_Demo(5.9f);
        System.out.println("Object 2 Data: valC=" + obj2.valC);
        System.out.println();

        // Object initialized with a String
        Constructor_Overloading_Demo obj3 = new Constructor_Overloading_Demo("AIKTC");
        System.out.println("Object 3 Data: valD=" + obj3.valD);
        
        System.out.println("---------------------------------------------");
    }
}
