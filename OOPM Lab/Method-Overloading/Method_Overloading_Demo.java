/**
 * Program: Method Overloading Demo
 * Description: A Java program to demonstrate method overloading.
 *              Method overloading is a feature where multiple methods can have the same name 
 *              but with different parameter lists (different type, number, or order of parameters).
 * Author: Amey Thakur
 * Reference: https://github.com/Amey-Thakur/OOPM-JAVA-LAB
 */

public class Method_Overloading_Demo {

    public static void main(String[] args) {
        Method_Overloading_Demo demo = new Method_Overloading_Demo();

        System.out.println("---------------------------------------------");
        System.out.println("       Method Overloading Demo");
        System.out.println("---------------------------------------------");
        
        // Calling method with String parameter
        demo.display("AIKTC");
        
        // Calling method with integer parameter
        demo.display(23);
        
        // Calling method with integer and float parameters
        demo.display(12, 3.4f);
        
        System.out.println("---------------------------------------------");
    }

    /**
     * Method to display an integer value.
     * @param a Integer value
     */
    void display(int a) {
        System.out.println("\n[Method 1 Called] Parameter: int");
        System.out.println("Value: " + a);
    }

    /**
     * Method to display a String value.
     * @param s String value
     */
    void display(String s) {
        System.out.println("\n[Method 2 Called] Parameter: String");
        System.out.println("Value: " + s);
    }

    /**
     * Method to display an integer and a float value.
     * @param a Integer value
     * @param b Float value
     */
    void display(int a, float b) {
        System.out.println("\n[Method 3 Called] Parameters: int, float");
        System.out.println("Value 1 (int): " + a);
        System.out.println("Value 2 (float): " + b);
    }
}
