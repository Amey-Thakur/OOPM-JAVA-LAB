/**
 * Program: User Defined Package Demo
 * Description: A Java program to demonstrate the creation and usage of a user-defined package.
 *              Imports classes from the 'geometry' package to calculate area and perimeter.
 * Author: Amey Thakur
 * Reference: https://github.com/Amey-Thakur/OOPM-JAVA-LAB
 */

import geometry.Area_Calc;
import geometry.Perimeter_Calc;

public class Package_Demo {

    public static void main(String[] args) {
        System.out.println("---------------------------------------------");
        System.out.println("       User Defined Package Demo");
        System.out.println("---------------------------------------------");

        // Creating objects of classes from the geometry package
        Area_Calc area = new Area_Calc();
        Perimeter_Calc perimeter = new Perimeter_Calc();

        // Using Area_Calc methods
        System.out.println("1. Rectangle (4, 5):");
        System.out.println("   Area: " + area.areaRect(4, 5));
        System.out.println("   Perimeter: " + perimeter.perirect(4, 5));
        System.out.println();

        // Using Perimeter_Calc methods
        System.out.println("2. Square (Side 5):");
        System.out.println("   Area: " + area.areaSquare(5));
        System.out.println("   Perimeter: " + perimeter.perisquare(5));

        System.out.println("---------------------------------------------");
    }
}
