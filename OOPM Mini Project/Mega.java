import java.awt.*; 
import java.applet.*; 
import javax.swing.*;

public class Mega extends Applet{
String hiddenWord="", guessWord, guessList;
int missCount;
int maxMisses;
boolean win, gameOver, mouseOver = true;
boolean hanged;
boolean[] knownChars;

Color bgColor = new Color(0x00dddddd);

	public void init()
	{
		setSize(1000,625);
		setBackground(bgColor);
		JOptionPane.showMessageDialog(this, "\n \t \t \t Welcome to WORDGAME \n \n - Developed by Amey, Mega, Saakshi");
		JOptionPane.showMessageDialog(this, "\t Guess the letters to SAVE a MAN \n \n  Hit the spacebar to guess the word");
		JOptionPane.showMessageDialog(this, "\t \n Hint: PROGRAMMING LANGUAGES \n \n \t Lets Play. Have fun!!!");	
		JOptionPane.showInputDialog("Player name");
		newGame();
	}

	public void newGame()
	{
		hiddenWord = getHiddenWord();
        guessList = "";
        guessWord = "";
        knownChars = new boolean[hiddenWord.length()];
        for (int i=0; i<hiddenWord.length(); i++)
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
	
	public void paint(Graphics g)
	{
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
		g.setFont(new Font("Helvetica", Font.BOLD, 32));
		g.drawLine(50,550,375,550);
		g.drawLine(150,550,150,150);
	  	g.drawLine(150,150,375,150);
		g.drawLine(375,150,375,199);
	    for(int i=0; i<=(hiddenWord.length()-1)*2; i++)
		{
			if (i%2 == 0)
			{
				if (hiddenWord.charAt(i/2) != ' ')
					g.drawLine(i*15+225,100,(i+1)*15+225,100);
				if (knownChars[i/2] == true)
					g.drawString(""+hiddenWord.charAt(i/2), i*15+224, 95);
			}
		}
		switch (missCount)
		{
		case 7: animateHang(g); break;
		
		case 6: g.drawLine(375,270,300,280);
		
		case 5: g.drawLine(375,270,450,280);
		
		case 4: g.drawLine(375,400,325,450);
		
		case 3: g.drawLine(375,400,425,450);
		
		case 2: g.drawLine(375,250,375,400);
		
		case 1: {g.drawOval(349,199,51,51); g.setColor(new Color(0x00ffcc99)); g.fillOval(350,200,50,50);}
		}
		g.setColor(Color.black);
		for(int i=0; i<guessList.length(); i++)
		{
			g.drawString(""+guessList.charAt(i),50+i*28,40);
		}
		if (win == true)
		{
			g.setColor(new Color(0x00009900));
			g.drawString("You Win!",600,200);
			gameOver = true;
			for(int i=0; i<=(hiddenWord.length()-1)*2; i++)
			{
				if (i%2 == 0)
				{
					g.drawString(""+hiddenWord.charAt(i/2), i*15+224, 95);
				}
			}
		}
		if (missCount == maxMisses)
		{
			g.setColor(Color.red);
			g.drawString("You Lose!",600,200);
			gameOver = true;
			for(int i=0; i<=(hiddenWord.length()-1)*2; i++)
			{
				if (i%2 == 0)
				{
					g.drawString(""+hiddenWord.charAt(i/2), i*15+224, 95);
				}
			}
		}
		g.setColor(Color.black);
		g.setFont(new Font("Helvetica", Font.BOLD, 16));
		g.drawString("Misses: "+missCount,155,168);
	}
	
	public String getHiddenWord() {
	
		String[] wordList = {"Java","C language","C++","Python","JavaScript","SQL","Ruby","Swift","MATLAB","Smalltalk","Lua","Pearl","Pascal","PHP","Fortran"};
	
		hiddenWord = wordList[(int)(Math.random()*(wordList.length+1))];
		hiddenWord = hiddenWord.toLowerCase();
		
		return hiddenWord;
	}
	
	public boolean validateGuess(String guess)
	{
		if (guess.equalsIgnoreCase(hiddenWord))
			return true;
		else
			return false;
	}
	
	public void guessTheWord() 
	{
		guessWord = JOptionPane.showInputDialog(null, "Guess the word to SAVE LIFE:");
		if (validateGuess(guessWord))
		{
			win = true;
		}
		else
		{
				missCount = maxMisses;
		}
	}

	public boolean keyDown(Event e, int k)
	{
		if (!gameOver)
		{
		boolean rightGuess = false;
		char keyChar = (char) k;
		if (keyChar != ' ')
	    {
			for(int i=0; i<guessList.length(); i++)
			{
				if (keyChar == guessList.charAt(i) || keyChar == guessList.toUpperCase().charAt(i))
					return true;
			}
			guessList = guessList+keyChar;
		    for(int i=0; i<hiddenWord.length(); i++)
			{
				if (keyChar == hiddenWord.charAt(i) || keyChar == hiddenWord.toUpperCase().charAt(i))
				{
					rightGuess = true;
					knownChars[i] = true;
				}				
			}
			win = true;
			for(int i=0; i<hiddenWord.length(); i++)
			{
				if (knownChars[i] == false)
				{
					win = false;
				}
			}
			if (rightGuess == false)
				missCount++;
		}
		else
		{
		
			guessTheWord();
		}

		repaint();
		}
		return true;
	}
		
	public boolean mouseDown(Event evt, int x, int y)
	{
		if ((x>50 && x<150) && (y>60 && y<90))
		{
			newGame();
			repaint();
		}
		return true;
	}
	
	public boolean mouseMove(Event evt, int x, int y)
	{

		boolean mouseToogle = mouseOver;
		if ((x>50 && x<150) && (y>60 && y<90))
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
		
	public void animateHang(Graphics g)
	{
		hanged = true;
	
		g.setColor(Color.black);
	
		g.drawLine(375,270,335,280);
		g.drawLine(375,270,415,280);
		g.drawLine(335,280,375,250);
		g.drawLine(415,280,375,250);
		g.drawLine(375,400,350,375);
		g.drawLine(375,400,400,375);
		g.drawLine(350,375,350,400);
		g.drawLine(400,375,400,400);
	    g.drawLine(375,250,375,400);
		g.drawOval(349,199,51,51);
		int c;
		for (int i=0; i<220000; i++)
		{
			c = i/1000;
			Color faceHue = new Color(255-c,0,c);
			g.setColor(faceHue);
			g.fillOval(350,200,50,50);
		}
		g.setColor(bgColor);
		g.drawLine(375,270,335,280);
		g.drawLine(375,270,415,280);
		g.drawLine(335,280,375,250);
		g.drawLine(415,280,375,250);
		g.drawLine(375,400,350,375);
		g.drawLine(375,400,400,375);
		g.drawLine(350,375,350,400);
		g.drawLine(400,375,400,400);
		g.setColor(Color.black);
		g.drawLine(375,250,375,400);
		g.drawLine(375,270,370,330);
		g.drawLine(375,270,380,330);
		g.drawLine(375,400,370,460);
		g.drawLine(375,400,380,460);
	}
	
}
