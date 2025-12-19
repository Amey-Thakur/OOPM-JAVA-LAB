/**
 * Program: StringBuffer Operations Demo
 * Description: A Java program to demonstrate the functionality of the StringBuffer class.
 *              StringBuffer is a mutable sequence of characters, unlike String which is immutable.
 *              Operations demonstrated: length, capacity, append, insert, and reverse.
 * Author: Amey Thakur
 * Reference: https://github.com/Amey-Thakur/OOPM-JAVA-LAB
 */

public class String_Buffer_Demo {

    public static void main(String[] args) {
        System.out.println("---------------------------------------------");
        System.out.println("       StringBuffer Operations Demo");
        System.out.println("---------------------------------------------");

        // Creating a StringBuffer object initialized with "computer"
        StringBuffer sb = new StringBuffer("computer");

        System.out.println("Original String: " + sb);

        // 1. Length of the string buffer
        System.out.println("1. Length: " + sb.length());

        // 2. Capacity of the string buffer
        // Note: Initial capacity is 16 + length of argument ("computer" is 8) = 24
        System.out.println("2. Capacity: " + sb.capacity());

        // 3. Append string at the end
        sb.append(" engineering");
        System.out.println("3. After Append (' engineering'): " + sb);

        // 4. Insert string at specific index
        // Inserting "engg" at index 4 (after 'comp')
        sb.insert(4, "engg");
        System.out.println("4. After Insert (at index 4, 'engg'): " + sb);

        // 5. Reverse the string
        sb.reverse();
        System.out.println("5. After Reverse: " + sb);
        
        System.out.println("---------------------------------------------");
    }
}
