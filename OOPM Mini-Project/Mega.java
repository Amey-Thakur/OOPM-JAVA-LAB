/*
 * Program: Hangman Word Game (Mini Project)
 * Author: Amey Thakur
 * File: Mega.java
 *
 * Description:
 * A graphical Hangman game implemented using Java Applet and AWT/Swing logic.
 * The game selects a hidden word from a predefined list, and the user must guess
 * characters to save the "stick man" from being hanged.
 *
 * Concepts Covered:
 * - AWT Graphics (methods: paint, drawLine, drawString, etc.)
 * - Event Handling (keyDown, mouseMove)
 * - String Manipulation
 * - Logic Building (Game states: Win/Lose)
 *
 * Repositories:
 * 1. OOPM Java Lab: https://github.com/Amey-Thakur/OOPM-JAVA-LAB
 * 2. Game Repository: https://github.com/Amey-Thakur/HANGMAN-WORD-GAME
 */

import java.awt.*; 
import java.applet.*; 
import javax.swing.*;

/**
 * The main Applet class for the Hangman game.
 *
 * @author Amey Thakur
 */
public class Mega extends Applet {

    // --- Global Variables ---
    String hiddenWord = "";  // The word to be guessed
    String guessWord;        // Word input by user for full guess
    String guessList;        // String containing all characters guessed so far
    int missCount;           // Counter for wrong guesses
    int maxMisses;           // Maximum allowed wrong guesses (7)
    boolean win;             // Flag for win state
    boolean gameOver;        // Flag for game over state
    boolean mouseOver = true;// Flag for mouse hover effect
    boolean hanged;          // Flag to trigger the hanging animation
    boolean[] knownChars;    // Array to track which characters of the hidden word are revealed

    // Background color constant
    Color bgColor = new Color(0x00dddddd);

    /**
     * Applet Initialization Method.
     * Sets up the window size, background, and welcome messages.
     */
    public void init()
    {
        setSize(1000, 625);
        setBackground(bgColor);

        // Welcome Dialogs (Preserving credits as requested)
        JOptionPane.showMessageDialog(this, "\n \t \t \t Welcome to WORDGAME \n \n - Developed by Amey, Mega, Saakshi");
        JOptionPane.showMessageDialog(this, "\t Guess the letters to SAVE a MAN \n \n  Hit the spacebar to guess the word");
        JOptionPane.showMessageDialog(this, "\t \n Hint: PROGRAMMING LANGUAGES \n \n \t Lets Play. Have fun!!!");	
        JOptionPane.showInputDialog("Player name");
        newGame();
    }

    /**
     * Resets game variables for a new round.
     * Selects a new word and resets counters.
     */
    public void newGame()
    {
        hiddenWord = getHiddenWord();
        guessList = "";
        guessWord = "";
        knownChars = new boolean[hiddenWord.length()];

        // Initialize known characters (reveal spaces if any)
        for (int i = 0; i < hiddenWord.length(); i++)
        {	
            if (hiddenWord.charAt(i) == ' ')
                knownChars[i] = true;
            else
                knownChars[i] = false;
        }
        
        win = false;
        missCount = 0;
        maxMisses = 7;
        gameOver = false;
        hanged = false;
    }
    
    /**
     * Core Drawing Method.
     * Handles all graphics rendering: UI buttons, Gallows, Hangman steps, and Text.
     */
    public void paint(Graphics g)
    {
        // --- Draw "New Game" Button ---
        if (mouseOver)
            g.setColor(Color.white);
        else
            g.setColor(new Color(0x00eeeeee));
        g.fillRect(50, 60, 100, 30);
        
        g.setColor(new Color(0x00aaaaaa));
        g.drawRect(49, 59, 102, 32);
        
        g.setColor(Color.black);
        g.setFont(new Font("Helvetica", Font.BOLD, 16));
        g.drawString("new word", 64, 80);

        // --- Draw Gallows ---
        g.setFont(new Font("Helvetica", Font.BOLD, 32));
        g.drawLine(50, 550, 375, 550);   // Base
        g.drawLine(150, 550, 150, 150);  // Pole
        g.drawLine(150, 150, 375, 150);  // Top bar
        g.drawLine(375, 150, 375, 199);  // Rope

        // --- Draw Word Blanks and Revealed Characters ---
        for (int i = 0; i <= (hiddenWord.length() - 1) * 2; i++)
        {
            if (i % 2 == 0)
            {
                // Draw underline for each character
                if (hiddenWord.charAt(i / 2) != ' ')
                    g.drawLine(i * 15 + 225, 100, (i + 1) * 15 + 225, 100);
                
                // Draw character if known
                if (knownChars[i / 2] == true)
                    g.drawString("" + hiddenWord.charAt(i / 2), i * 15 + 224, 95);
            }
        }

        // --- Draw Hangman Parts based on Miss Count ---
        switch (missCount)
        {
        case 7: animateHang(g); break; // Game Over (Loss) animation
        
        case 6: g.drawLine(375, 270, 300, 280); // Left Arm
        
        case 5: g.drawLine(375, 270, 450, 280); // Right Arm
        
        case 4: g.drawLine(375, 400, 325, 450); // Left Leg
        
        case 3: g.drawLine(375, 400, 425, 450); // Right Leg
        
        case 2: g.drawLine(375, 250, 375, 400); // Body
        
        case 1: { g.drawOval(349, 199, 51, 51); g.setColor(new Color(0x00ffcc99)); g.fillOval(350, 200, 50, 50); } // Head
        }
        
        // --- Draw Guessed Letters List ---
        g.setColor(Color.black);
        for(int i = 0; i < guessList.length(); i++)
        {
            g.drawString("" + guessList.charAt(i), 50 + i * 28, 40);
        }

        // --- Check Win Condition ---
        if (win == true)
        {
            g.setColor(new Color(0x00009900)); // Green
            g.drawString("You Win!", 600, 200);
            gameOver = true;
            // Reveal full word
            for(int i = 0; i <= (hiddenWord.length() - 1) * 2; i++)
            {
                if (i % 2 == 0)
                {
                    g.drawString("" + hiddenWord.charAt(i / 2), i * 15 + 224, 95);
                }
            }
        }

        // --- Check Lose Condition ---
        if (missCount == maxMisses)
        {
            g.setColor(Color.red);
            g.drawString("You Lose!", 600, 200);
            gameOver = true;
            // Reveal full word
            for(int i = 0; i <= (hiddenWord.length() - 1) * 2; i++)
            {
                if (i % 2 == 0)
                {
                    g.drawString("" + hiddenWord.charAt(i / 2), i * 15 + 224, 95);
                }
            }
        }

        // --- Draw Score/Stats ---
        g.setColor(Color.black);
        g.setFont(new Font("Helvetica", Font.BOLD, 16));
        g.drawString("Misses: " + missCount, 155, 168);
    }
    
    /**
     * Helper method to select a random word from the list.
     * @return A random word in lowercase.
     */
    public String getHiddenWord() {
    
        String[] wordList = {"Java", "C language", "C++", "Python", "JavaScript", "SQL", "Ruby", "Swift", "MATLAB", "Smalltalk", "Lua", "Pearl", "Pascal", "PHP", "Fortran"};
    
        // Select random index within bounds
        int index = (int)(Math.random() * wordList.length);
        hiddenWord = wordList[index];
        hiddenWord = hiddenWord.toLowerCase();
        
        return hiddenWord;
    }
    
    /**
     * Logic to validate a full word guess.
     */
    public boolean validateGuess(String guess)
    {
        if (guess.equalsIgnoreCase(hiddenWord))
            return true;
        else
            return false;
    }
    
    /**
     * Dialog input to guess the entire word at once.
     */
    public void guessTheWord() 
    {
        guessWord = JOptionPane.showInputDialog(null, "Guess the word to SAVE LIFE:");
        if (guessWord != null && validateGuess(guessWord))
        {
            win = true;
        }
        else
        {
            // Wrong guess leads to immediate loss
            missCount = maxMisses;
        }
    }

    /**
     * Legacy Event Handling: Key Press.
     * Captures user keystrokes to guess letters.
     */
    public boolean keyDown(Event e, int k)
    {
        if (!gameOver)
        {
            boolean rightGuess = false;
            char keyChar = (char) k;
            
            // Ignore spaces
            if (keyChar != ' ')
            {
                // Check if already guessed
                for(int i = 0; i < guessList.length(); i++)
                {
                    if (keyChar == guessList.charAt(i) || keyChar == guessList.toUpperCase().charAt(i))
                        return true;
                }
                
                // Append to guessed list
                guessList = guessList + keyChar;
                
                // Check against hidden word
                for(int i = 0; i < hiddenWord.length(); i++)
                {
                    if (keyChar == hiddenWord.charAt(i) || keyChar == hiddenWord.toUpperCase().charAt(i))
                    {
                        rightGuess = true;
                        knownChars[i] = true;
                    }				
                }
                
                // Update Win State
                win = true;
                for(int i = 0; i < hiddenWord.length(); i++)
                {
                    if (knownChars[i] == false)
                    {
                        win = false;
                    }
                }
                
                // Increment Miss Count if wrong
                if (rightGuess == false)
                    missCount++;
            }
            else
            {
                // Spacebar triggers full word guess
                guessTheWord();
            }

            repaint();
        }
        return true;
    }
        
    /**
     * Legacy Event Handling: Mouse Click.
     * Used for the "New Game" button interaction.
     */
    public boolean mouseDown(Event evt, int x, int y)
    {
        if ((x > 50 && x < 150) && (y > 60 && y < 90))
        {
            newGame();
            repaint();
        }
        return true;
    }
    
    /**
     * Legacy Event Handling: Mouse Move.
     * Used for Hover Effect on the "New Game" button.
     */
    public boolean mouseMove(Event evt, int x, int y)
    {
        boolean mouseToogle = mouseOver;
        if ((x > 50 && x < 150) && (y > 60 && y < 90))
        {
            mouseOver = true;
        }
        else
        {
            mouseOver = false;		
        }
        
        if (mouseToogle != mouseOver && !hanged)
            repaint();
        
        return true;		
    }
        
    /**
     * Animation Routine for the final Hanging state.
     * Draws the rope and changes face color progressively.
     */
    public void animateHang(Graphics g)
    {
        hanged = true;
    
        g.setColor(Color.black);
    
        g.drawLine(375, 270, 335, 280);
        g.drawLine(375, 270, 415, 280);
        g.drawLine(335, 280, 375, 250);
        g.drawLine(415, 280, 375, 250);
        g.drawLine(375, 400, 350, 375);
        g.drawLine(375, 400, 400, 375);
        g.drawLine(350, 375, 350, 400);
        g.drawLine(400, 375, 400, 400);
        g.drawLine(375, 250, 375, 400);
        g.drawOval(349, 199, 51, 51);
        
        int c;
        // Animation Loop (Legacy busy-wait style)
        for (int i = 0; i < 220000; i++)
        {
            c = i / 1000;
            if (c > 255) c = 255;
            Color faceHue = new Color(255 - c, 0, c);
            g.setColor(faceHue);
            g.fillOval(350, 200, 50, 50);
        }
        
        // Redraw details after animation
        g.setColor(bgColor);
        g.drawLine(375, 270, 335, 280);
        g.drawLine(375, 270, 415, 280);
        g.drawLine(335, 280, 375, 250);
        g.drawLine(415, 280, 375, 250);
        g.drawLine(375, 400, 350, 375);
        g.drawLine(375, 400, 400, 375);
        g.drawLine(350, 375, 350, 400);
        g.drawLine(400, 375, 400, 400);
        
        g.setColor(Color.black);
        g.drawLine(375, 250, 375, 400);
        g.drawLine(375, 270, 370, 330);
        g.drawLine(375, 270, 380, 330);
        g.drawLine(375, 400, 370, 460);
        g.drawLine(375, 400, 380, 460);
    }
    
}
