package geometry;

/**
 * Class: Perimeter_Calc
 * Description: Part of the 'geometry' package.
 *              Contains methods to calculate the perimeter of different shapes.
 * Author: Amey Thakur
 * Reference: https://github.com/Amey-Thakur/OOPM-JAVA-LAB
 */

public class Perimeter_Calc {

    /**
     * Calculate perimeter of a square.
     * @param side Side length of the square
     * @return Perimeter of the square
     */
    public int perisquare(int side) {
        return 4 * side;
    }

    /**
     * Calculate perimeter of a rectangle.
     * @param length Length of the rectangle
     * @param breadth Breadth of the rectangle
     * @return Perimeter of the rectangle
     */
    public int perirect(int length, int breadth) {
        return 2 * (length + breadth);
    }

    /**
     * Calculate perimeter of a circle.
     * @param radius Radius of the circle
     * @return Circumference (perimeter) of the circle
     */
    public float pericircle(float radius) {
        return 2 * 3.14f * radius;
    }
}
