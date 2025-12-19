package geometry;

/**
 * Class: Area_Calc
 * Description: Part of the 'geometry' package.
 *              Contains methods to calculate the area of different shapes.
 * Author: Amey Thakur
 * Reference: https://github.com/Amey-Thakur/OOPM-JAVA-LAB
 */

public class Area_Calc {

    /**
     * Calculate area of a rectangle.
     * @param length Length of the rectangle
     * @param breadth Breadth of the rectangle
     * @return Area of the rectangle
     */
    public int areaRect(int length, int breadth) {
        return length * breadth;
    }

    /**
     * Calculate area of a square.
     * @param side Side length of the square
     * @return Area of the square
     */
    public int areaSquare(int side) {
        return side * side;
    }

    /**
     * Calculate area of a triangle.
     * @param base Base length of the triangle
     * @param height Height of the triangle
     * @return Area of the triangle
     */
    public float areaTriangle(int base, int height) {
        return 0.5f * base * height;
    }
}
