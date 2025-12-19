/**
 * Program: Applet Parameters Demo
 * Description: A Java Applet program to demonstrate receiving parameters passed from an HTML file.
 *              The applet reads the 'msg1' parameter defined in the HTML tag and displays it.
 * Author: Amey Thakur
 * Reference: https://github.com/Amey-Thakur/OOPM-JAVA-LAB
 * Note: Applets are deprecated in newer Java versions but remain part of legacy coursework.
 */

import java.applet.Applet;
import java.awt.Graphics;

public class Applet_Parameters_Demo extends Applet {

    /**
     * The paint method is called to draw the applet.
     * @param g The Graphics context used for drawing.
     */
    public void paint(Graphics g) {
        // Retrieve the parameter named "msg1" from the HTML tag
        String str = getParameter("msg1");
        
        // If parameter is found, display it; otherwise display a default message
        if (str == null) {
            str = "No parameter received!";
        }
        
        // Draw the string at coordinates (50, 50)
        // Adjusted coordinates to be more visible within likely applet window size
        g.drawString("Parameter Value: " + str, 50, 50);
    }
}
