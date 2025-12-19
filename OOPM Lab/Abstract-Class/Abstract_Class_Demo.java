/**
 * Program: Abstract Class Demonstration
 * Description: A Java program to demonstrate the concept of abstraction using abstract classes 
 *              and abstract methods. It defines an abstract class 'Shape' and a concrete class 'Square'.
 * Author: Amey Thakur
 * Reference: https://github.com/Amey-Thakur/OOPM-JAVA-LAB
 */

// Abstract class definition
abstract class Shape {
    int dimension = 10; // Instance variable

    // Abstract method (does not have a body)
    abstract void calculateArea();

    // Concrete method (has a body)
    void displayMessage() {
        System.out.println("Display method from abstract class 'Shape'");
    }
}

// Concrete class extending the abstract class
class Square extends Shape {
    
    // Providing implementation for the abstract method
    @Override
    void calculateArea() {
        // Using the inherited variable 'dimension'
        int area = dimension * dimension; // Assuming dimension is side length
        
        System.out.println("Calculating Area of Square...");
        System.out.println("Side Length: " + dimension);
        System.out.println("The area of the square is: " + area);
    }
}

// Main class to test the implementation
public class Abstract_Class_Demo {
    public static void main(String[] args) {
        System.out.println("---------------------------------------------");
        System.out.println("       Abstract Class Demo");
        System.out.println("---------------------------------------------");

        // Instantiating the concrete class
        Square sq = new Square();
        
        // Calling the implemented abstract method
        sq.calculateArea();
        
        // Calling the concrete method inherited from abstract class
        sq.displayMessage();
        
        System.out.println("---------------------------------------------");
    }
}
