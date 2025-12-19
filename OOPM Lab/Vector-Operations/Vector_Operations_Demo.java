/**
 * Program: Vector Operations Demo
 * Description: A Java program to demonstrate the functionality of the Vector class.
 *              Vector works similar to an ArrayList but is synchronized.
 *              Operations demonstrated: add, size, capacity, contains, get, indexOf, remove, trimToSize, setElementAt.
 * Author: Amey Thakur
 * Reference: https://github.com/Amey-Thakur/OOPM-JAVA-LAB
 */

import java.util.Vector;

public class Vector_Operations_Demo {

    public static void main(String[] args) {
        System.out.println("---------------------------------------------");
        System.out.println("       Vector Operations Demo");
        System.out.println("---------------------------------------------");

        // 1. Creation of a Vector with initial capacity 15 and capacity increment 3
        Vector<Integer> v = new Vector<Integer>(15, 3);
        System.out.println("Vector created with initial capacity: 15");

        // 2. Add elements (appends to the end)
        v.add(24);
        v.add(33);
        v.add(26);
        v.add(70);
        System.out.println("Added elements: " + v);

        // 3. Add element at a specific index
        v.add(1, 25);
        System.out.println("After adding 25 at index 1: " + v);

        // 4. Size of the vector
        System.out.println("Current Size: " + v.size());

        // 5. Capacity of the vector
        System.out.println("Current Capacity: " + v.capacity());

        // 6. Check if vector contains a specific element
        System.out.println("Does vector contain 26? " + v.contains(26));

        // 7. Get element at specific index
        System.out.println("Element at index 2: " + v.get(2));

        // 8. Find index of first occurrence of an element
        System.out.println("Index of 24: " + v.indexOf(24));

        // 9. Check if vector is empty
        System.out.println("Is vector empty? " + v.isEmpty());

        // 10. Remove element at index 1
        // Note: remove(int index) removes element at that index. 
        // remove(Object o) removes first occurrence of that object.
        v.remove(1);
        System.out.println("After removing element at index 1: " + v);

        // 11. Trim capacity to current size
        v.trimToSize();
        System.out.println("Capacity after trimToSize(): " + v.capacity());

        // 12. Set element at specific index (Replace)
        // Replacing element at index 1 with 4
        if (v.size() > 1) {
            v.setElementAt(4, 1);
            System.out.println("After setting element at index 1 to 4: " + v);
        }

        System.out.println("---------------------------------------------");
    }
}
