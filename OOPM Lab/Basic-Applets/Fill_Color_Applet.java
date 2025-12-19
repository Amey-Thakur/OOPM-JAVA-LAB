/**
 * Program: Fill Color Applet
 * Description: A basic Java Applet to demonstrate graphics drawing and color filling.
 *              It draws a rectangle and fills it with yellow color.
 * Author: Amey Thakur
 * Reference: https://github.com/Amey-Thakur/OOPM-JAVA-LAB
 * 
 * Note: Applets are deprecated in newer Java versions. This is for educational purposes.
 * To run: Use 'appletviewer Fill_Color_Applet.html' or an IDE that supports Applets.
 */

import java.applet.Applet;
import java.awt.Color;
import java.awt.Graphics;

public class Fill_Color_Applet extends Applet {

    /**
     * Paint method to draw graphics on the applet window.
     * @param g The Graphics object used for drawing.
     */
    @Override
    public void paint(Graphics g) {
        // Drawing a rectangle outline
        // x=30, y=50, width=200, height=100 (Adjusted coordinates to be visible in standard window)
        g.drawRect(30, 50, 200, 100);

        // Setting color to yellow for filling
        g.setColor(Color.YELLOW);
        
        // Filling the rectangle
        g.fillRect(30, 50, 200, 100);

        // Setting color to magenta for text
        g.setColor(Color.MAGENTA);
        
        // Drawing text description
        g.drawString("Rectangle Filled with Yellow", 30, 170);
    }
}
