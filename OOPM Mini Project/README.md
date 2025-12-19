<div align="center">

# Hangman Word Game (OOPM Mini Project)

### CSL304 · Semester III · Computer Engineering

[![Curated by](https://img.shields.io/badge/Curated%20by-Amey%20Thakur-blue.svg)](https://github.com/Amey-Thakur)
[![Language](https://img.shields.io/badge/Language-Java%20Applet-orange.svg)](Mega.java)
[![Status](https://img.shields.io/badge/Status-Completed-green.svg)](./)

**A classic graphical Hangman game implemented using Java Applets and AWT/Swing components.**

---

[📖 Overview](#overview) · [📸 Screenshots](#screenshots) · [✨ Features](#features) · [🚀 How to Run](#how-to-run) · [👥 Team](#team)

</div>

---

## Overview

The **Hangman Word Game** is a Java-based mini project developed for the Object-Oriented Programming Methodology (OOPM) laboratory. It demonstrates the application of core Java concepts, including Applets, Graphics programming (AWT), Event Handling, and String manipulation.

The objective of the game is to guess the hidden word letter by letter. For every incorrect guess, a part of the stick figure (the "man") is drawn. The player wins if they guess the word before the drawing is complete, otherwise, they lose.

---

## 📸 Screenshots

| Welcome Screen | Input Player Name |
|:---:|:---:|
| <img src="Outputs/Welcome_Message.png" width="400"> | <img src="Outputs/Player_Name_Input.png" width="400"> |

| Game Play | Win Condition |
|:---:|:---:|
| <img src="Outputs/Game_Screen.png" width="400"> | <img src="Outputs/Win.png" width="400"> |

<details>
<summary><strong>View More Screenshots</strong></summary>

<div align="center">

| Lose Condition | Hint Message |
|:---:|:---:|
| <img src="Outputs/Lose.png" width="400"> | <img src="Outputs/Hint_Message.png" width="400"> |

</div>

</details>

---

## ✨ Features

- **Graphical User Interface (GUI)**: Built using Java Applet and AWT Graphics.
- **Interactive Gameplay**: Mouse and Keyboard event handling for user interaction.
- **Dynamic Graphics**: visual representation of the hangman drawing progress.
- **Word Bank**: Random selection of words from a predefined list (e.g., Programming Languages).
- **Game State Management**: Tracks misses, correct guesses, and win/lose conditions.
- **User Feedback**: Pop-up dialogs for welcome messages, hints, and game results.

---

## 🚀 How to Run

Since Java Applets are deprecated in newer JDK versions, you may need to use `appletviewer` or an older JDK (like JDK 8) to run this project.

### Method 1: Using AppletViewer (Recommended for JDK 8)

1. **Compile** the code:
   ```bash
   javac Mega.java
   ```

2. **Create** an HTML file (e.g., `game.html`) to host the applet:
   ```html
   <html>
   <body>
       <applet code="Mega.class" width="1000" height="625"></applet>
   </body>
   </html>
   ```

3. **Run** using appletviewer:
   ```bash
   appletviewer game.html
   ```

---

## 👥 Team

Developed by **Amey, Mega, and Saakshi** as part of the Second Year Computer Engineering coursework.

---

<div align="center">

**[⬆ Back to Top](#hangman-word-game-oopm-mini-project)**

</div>
