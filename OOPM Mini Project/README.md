<div align="center">

# Hangman Word Game (OOPM Mini Project)

### CSL304 · Semester III · Computer Engineering

[![Curated by](https://img.shields.io/badge/Curated%20by-Amey%20Thakur-blue.svg)](https://github.com/Amey-Thakur)
[![Language](https://img.shields.io/badge/Language-Java%20Applet-orange.svg)](Mega.java)
[![Status](https://img.shields.io/badge/Status-Completed-green.svg)](./)

**A classic graphical Hangman game implemented using Java Applets and AWT/Swing components.**

---

[📖 Overview](#overview) · [🔗 Resources](#-resources) · [📸 Screenshots](#screenshots) · [✨ Features](#features) · [🚀 How to Run](#how-to-run) · [👥 Authors](#authors)

</div>

---

## 👥 Authors

<div align="center">

**Terna Engineering College | Computer Engineering | Batch of 2022**

| <img src="https://github.com/Amey-Thakur.png" width="150" alt="Amey Thakur"> | <img src="Mega/Mega.png" width="150" alt="Mega Satish"> | <img src="Mega/Saakshi.png" width="150" alt="Saakshi Deokar"> |
| :---: | :---: | :---: |
| [**Amey Thakur**](https://github.com/Amey-Thakur) | [**Mega Satish**](https://github.com/msatmod) | [**Saakshi Deokar**](https://www.linkedin.com/in/saakshideokar/) |

</div>

---

## Overview

The **Hangman Word Game** is a Java-based mini project developed for the Object-Oriented Programming Methodology (OOPM) laboratory. It demonstrates the application of core Java concepts, including Applets, Graphics programming (AWT), Event Handling, and String manipulation.

The objective of the game is to guess the hidden word letter by letter. For every incorrect guess, a part of the stick figure (the "man") is drawn. The player wins if they guess the word before the drawing is complete, otherwise, they lose.

---

## � Resources

- [**Project Presentation**](http://dx.doi.org/10.13140/RG.2.2.26806.22082)
- [**Source Code**](http://dx.doi.org/10.13140/RG.2.2.20095.33446)
- [**Project Demo**](https://youtu.be/JsT9KYKPUgs)

---

## �📸 Screenshots

<div align="center">

### Welcome Screen
<img src="Outputs/Welcome_Message.png" width="100%">

### Instructions
<img src="Outputs/Instructions_Message.png" width="100%">

### Input Player Name
<img src="Outputs/Player_Name_Input.png" width="100%">

### Game Play
<img src="Outputs/Game_Screen.png" width="100%">

### Input Window
<img src="Outputs/Input_Window.png" width="100%">

### Input Answer
<img src="Outputs/Input_Answer.png" width="100%">

### Game Progression (Missed Attempts)
<img src="Outputs/Missed_1.png" width="100%">
<img src="Outputs/Missed_2.png" width="100%">
<img src="Outputs/Missed_3.png" width="100%">
<img src="Outputs/Missed_4.png" width="100%">
<img src="Outputs/Missed_5.png" width="100%">
<img src="Outputs/Missed_6.png" width="100%">
<img src="Outputs/Missed_7.1.png" width="100%">
<img src="Outputs/Missed_7.2.png" width="100%">
<img src="Outputs/Missed_7.3.png" width="100%">

### Lose Condition
<img src="Outputs/Lose.png" width="100%">

### Win Condition
<img src="Outputs/Win.png" width="100%">

### Input Win
<img src="Outputs/Input_Win.png" width="100%">

### Hint Message
<img src="Outputs/Hint_Message.png" width="100%">

</div>

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



---

<div align="center">

**[⬆ Back to Top](#hangman-word-game-oopm-mini-project)** · **[🧪 Back to OOPM Lab](../OOPM%20Lab)** · **[🏠 Back to Main Repository](../)**

</div>

---

<div align="center">

### 🎓 [Computer Engineering Repository](https://github.com/Amey-Thakur/COMPUTER-ENGINEERING)

**Computer Engineering (B.E.) - University of Mumbai**

*Semester-wise curriculum, laboratories, projects, and academic notes.*

</div>
