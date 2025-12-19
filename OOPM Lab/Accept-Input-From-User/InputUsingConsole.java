/**
 * Program: Input Using Console
 * Description: A Java program to demonstrate user input using the Console class.
 *              Note: System.console() typically requires the program to be run from a command line, 
 *              not from within typical IDE consoles/terminals.
 * Author: Amey Thakur
 * Reference: https://github.com/Amey-Thakur/OOPM-JAVA-LAB
 */

import java.io.Console;

public class InputUsingConsole {
    public static void main(String args[]) {
        // Creating object of the Console class
        Console console = System.console();

        System.out.println("---------------------------------------------");
        System.out.println("       Console Input Demo");
        System.out.println("---------------------------------------------");

        if (console == null) {
            System.out.println("No console available (Running in basic IDE terminal?)");
            return;
        }

        // Read a string and then display it
        String name = console.readLine("Enter you name: ");
        System.out.println("Hello, " + name);

        // Read password (masked input) and then display it
        char[] passwordArray = console.readPassword("Enter the password: ");
        
        // Converting char array into string
        String password = String.valueOf(passwordArray);
        System.out.println("Password accepted: " + password); // Displaying just to verify
        
        System.out.println("---------------------------------------------");
    }
}
