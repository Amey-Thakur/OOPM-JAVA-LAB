/**
 * ================================================================
 *   Object-Oriented Programming (OOPM) Lab Portfolio - Interactive Logic
 * ================================================================
 *   Author: Amey Thakur
 *   GitHub: https://github.com/Amey-Thakur
 *   Course: Object-Oriented Programming (OOPM) Lab
 *   Roll No: 50
 *   Batch: B3
 *   Repository: https://github.com/Amey-Thakur/OOPM-JAVA-LAB
 *   Date: January 17, 2020
 *   
 *   Description: Logic for theme toggling, stats validation, and UI interactivity.
 * ================================================================
 */

document.addEventListener('DOMContentLoaded', () => {
    // 1. Theme Toggling Logic
    const themeToggle = document.getElementById('theme-toggle');
    const htmlElement = document.documentElement;
    const body = document.body;

    // Initialize theme from local storage or default to light
    const savedTheme = localStorage.getItem('theme') || 'light';
    htmlElement.setAttribute('data-theme', savedTheme);
    updateThemeIcon(savedTheme);

    themeToggle.addEventListener('click', () => {
        const currentTheme = htmlElement.getAttribute('data-theme');
        const newTheme = currentTheme === 'light' ? 'dark' : 'light';

        htmlElement.setAttribute('data-theme', newTheme);
        localStorage.setItem('theme', newTheme);
        updateThemeIcon(newTheme);
    });

    function updateThemeIcon(theme) {
        const icon = themeToggle.querySelector('i');
        if (theme === 'dark') {
            icon.classList.replace('fa-moon', 'fa-sun');
        } else {
            icon.classList.replace('fa-sun', 'fa-moon');
        }
    }

    // 2. Stats Counter Animation
    const stats = document.querySelectorAll('.stat-number');
    const statsObserver = new IntersectionObserver((entries) => {
        entries.forEach(entry => {
            if (entry.isIntersecting) {
                const target = parseInt(entry.target.getAttribute('data-target'));
                const suffix = entry.target.getAttribute('data-suffix') || '';
                animateValue(entry.target, 0, target, 2000, suffix);
                statsObserver.unobserve(entry.target);
            }
        });
    }, { threshold: 0.5 });

    stats.forEach(stat => statsObserver.observe(stat));

    function animateValue(obj, start, end, duration, suffix) {
        let startTimestamp = null;
        const step = (timestamp) => {
            if (!startTimestamp) startTimestamp = timestamp;
            const progress = Math.min((timestamp - startTimestamp) / duration, 1);
            obj.innerHTML = Math.floor(progress * (end - start) + start) + suffix;
            if (progress < 1) {
                window.requestAnimationFrame(step);
            }
        };
        window.requestAnimationFrame(step);
    }

    // 3. Scroll Reveal Animations
    const revealElements = document.querySelectorAll('.reveal, .reveal-left, .reveal-right');
    const revealObserver = new IntersectionObserver((entries) => {
        entries.forEach(entry => {
            if (entry.isIntersecting) {
                entry.target.classList.add('active');
            }
        });
    }, { threshold: 0.1 });

    revealElements.forEach(el => revealObserver.observe(el));

    // 4. Back to Top Button
    const backToTopBtn = document.getElementById('btn-back-to-top');
    window.addEventListener('scroll', () => {
        if (window.scrollY > 300) {
            backToTopBtn.style.display = 'flex';
        } else {
            backToTopBtn.style.display = 'none';
        }
    });

    backToTopBtn.addEventListener('click', () => {
        window.scrollTo({
            top: 0,
            behavior: 'smooth'
        });
    });

    // 5. Share Functionality
    const shareBtn = document.getElementById('share-btn');
    if (shareBtn) {
        shareBtn.addEventListener('click', async () => {
            try {
                await navigator.share({
                    title: 'OOPM Lab Portfolio — Amey Thakur & Mega Satish',
                    text: 'OOPM Lab Portfolio — Amey Thakur & Mega Satish',
                    url: window.location.href
                });
            } catch (err) {
                // Fallback: Copy to clipboard
                const dummy = document.createElement('input');
                document.body.appendChild(dummy);
                dummy.value = window.location.href;
                dummy.select();
                document.execCommand('copy');
                document.body.removeChild(dummy);
                alert('Portfolio link copied to clipboard!');
            }
        });
    }

    // 6. Footer Year Update (with null check)
    const yearEl = document.getElementById('current-year');
    if (yearEl) yearEl.textContent = new Date().getFullYear();

    // 7. Confetti Animation on GitHub Button Click
    function createConfetti(x, y) {
        const colors = ['#dc2626', '#f97316', '#eab308', '#22c55e', '#3b82f6', '#8b5cf6'];
        const confettiCount = 50;

        for (let i = 0; i < confettiCount; i++) {
            const confetti = document.createElement('div');
            confetti.className = 'confetti-piece';
            confetti.style.cssText = `
                position: fixed;
                width: 10px;
                height: 10px;
                background: ${colors[Math.floor(Math.random() * colors.length)]};
                left: ${x}px;
                top: ${y}px;
                pointer-events: none;
                z-index: 9999;
                border-radius: ${Math.random() > 0.5 ? '50%' : '0'};
            `;
            document.body.appendChild(confetti);

            const angle = Math.random() * Math.PI * 2;
            const velocity = 5 + Math.random() * 10;
            const vx = Math.cos(angle) * velocity;
            const vy = Math.sin(angle) * velocity - 5;
            let opacity = 1;
            let posX = x;
            let posY = y;
            let gravity = 0.3;
            let velocityY = vy;

            function animate() {
                posX += vx;
                velocityY += gravity;
                posY += velocityY;
                opacity -= 0.02;
                confetti.style.left = posX + 'px';
                confetti.style.top = posY + 'px';
                confetti.style.opacity = opacity;
                confetti.style.transform = `rotate(${posX * 2}deg)`;

                if (opacity > 0) {
                    requestAnimationFrame(animate);
                } else {
                    confetti.remove();
                }
            }
            requestAnimationFrame(animate);
        }
    }

    // Attach confetti to GitHub buttons
    document.querySelectorAll('a[href*="github.com"]').forEach(btn => {
        btn.addEventListener('click', (e) => {
            const rect = btn.getBoundingClientRect();
            createConfetti(rect.left + rect.width / 2, rect.top + rect.height / 2);
        });
    });

    // 8. Keyboard Navigation
    const sections = ['mini-project', 'foundations', 'oop', 'advanced', 'footer'];
    let currentSectionIndex = -1;

    document.addEventListener('keydown', (e) => {
        // Skip if user is in an input field
        if (e.target.tagName === 'INPUT' || e.target.tagName === 'TEXTAREA') return;

        // T key - Toggle theme
        if (e.key === 't' || e.key === 'T') {
            if (!e.ctrlKey && !e.shiftKey && !e.altKey) {
                themeToggle.click();
            }
        }

        // Arrow Down / J - Next section
        if (e.key === 'ArrowDown' || e.key === 'j') {
            e.preventDefault();
            currentSectionIndex = Math.min(currentSectionIndex + 1, sections.length - 1);
            scrollToSection(sections[currentSectionIndex]);
        }

        // Arrow Up / K - Previous section
        if (e.key === 'ArrowUp' || e.key === 'k') {
            e.preventDefault();
            currentSectionIndex = Math.max(currentSectionIndex - 1, 0);
            scrollToSection(sections[currentSectionIndex]);
        }

        // Home - Go to top
        if (e.key === 'Home') {
            e.preventDefault();
            window.scrollTo({ top: 0, behavior: 'smooth' });
            currentSectionIndex = -1;
        }

        // End - Go to bottom
        if (e.key === 'End') {
            e.preventDefault();
            window.scrollTo({ top: document.body.scrollHeight, behavior: 'smooth' });
            currentSectionIndex = sections.length - 1;
        }

        // Security measures - Disable dev tools shortcuts
        if (
            e.key === 'F12' ||
            (e.ctrlKey && e.shiftKey && (e.key === 'I' || e.key === 'J')) ||
            (e.ctrlKey && e.key === 'u')
        ) {
            e.preventDefault();
        }
    });

    function scrollToSection(sectionId) {
        const section = document.getElementById(sectionId);
        if (section) {
            section.scrollIntoView({ behavior: 'smooth', block: 'start' });
        }
    }

    // 9. Remove Skeleton Loader
    const skeleton = document.getElementById('skeleton-loader');
    if (skeleton) {
        setTimeout(() => {
            skeleton.style.opacity = '0';
            setTimeout(() => skeleton.remove(), 300);
        }, 500);
    }

    // 10. Low-Level Security Measures
    // Disable Right Click
    document.addEventListener('contextmenu', (e) => {
        e.preventDefault();
    });

    // Disable Dragging images
    document.addEventListener('dragstart', (e) => {
        e.preventDefault();
    });

    // Disable Selection (Optional, but "Low Level" standard)
    document.addEventListener('selectstart', (e) => {
        // Allow selection in input fields if any
        if (e.target.tagName !== 'INPUT' && e.target.tagName !== 'TEXTAREA') {
            e.preventDefault();
        }
    });

    // 11. Interactive Hangman Game
    const hangmanWords = [
        // Java OOP Concepts
        { word: 'JAVA', hint: 'Write once, run anywhere' },
        { word: 'CLASS', hint: 'Blueprint for objects' },
        { word: 'OBJECT', hint: 'Instance of a class' },
        { word: 'METHOD', hint: 'Function inside a class' },
        { word: 'SWING', hint: 'Java GUI toolkit' },
        { word: 'THREAD', hint: 'Unit of execution' },
        { word: 'ARRAY', hint: 'Collection of elements' },
        { word: 'STRING', hint: 'Sequence of characters' },
        { word: 'INTERFACE', hint: 'Contract for classes' },
        { word: 'ABSTRACT', hint: 'Cannot be instantiated' },
        { word: 'POLYMORPHISM', hint: 'Many forms' },
        { word: 'INHERITANCE', hint: 'Child extends parent' },
        // Programming Languages
        { word: 'PYTHON', hint: 'Snake-named language' },
        { word: 'JAVASCRIPT', hint: 'Language of the web' },
        { word: 'CPLUSPLUS', hint: 'C with classes' },
        { word: 'RUBY', hint: 'Gem of a language' },
        { word: 'KOTLIN', hint: 'Modern Android language' },
        { word: 'SWIFT', hint: 'Apple\'s language' },
        { word: 'RUST', hint: 'Memory-safe systems language' },
        { word: 'GOLANG', hint: 'Google\'s language' },
        // Authors
        { word: 'AMEY', hint: 'Project author' },
        { word: 'THAKUR', hint: 'Amey\'s surname' },
        { word: 'MEGA', hint: 'Project co-author' },
        { word: 'SATISH', hint: 'Mega\'s surname' }
    ];
    // Author words for higher frequency
    const authorWords = [
        { word: 'AMEY', hint: 'Project author' },
        { word: 'THAKUR', hint: 'Amey\'s surname' },
        { word: 'MEGA', hint: 'Project co-author' },
        { word: 'SATISH', hint: 'Mega\'s surname' }
    ];
    let currentWord = '';
    let currentHint = '';
    let guessedLetters = [];
    let lives = 6;
    let gameOver = false;
    let gameCount = 0;

    function initHangman() {
        const wordContainer = document.getElementById('hangman-word');
        const keyboardContainer = document.getElementById('hangman-keyboard');
        const resetBtn = document.getElementById('hangman-reset');
        const asciiContainer = document.getElementById('hangman-ascii');

        if (!wordContainer || !keyboardContainer) return;

        // ASCII Hangman stages (6 lives = 6 stages to full hangman)
        const hangmanStages = [
            // 6 lives - empty gallows
            `  ┌───────┐
  │       │
  │       
  │      
  │      
  │      
══╧══════════`,
            // 5 lives - head
            `  ┌───────┐
  │       │
  │       O
  │      
  │      
  │      
══╧══════════`,
            // 4 lives - body
            `  ┌───────┐
  │       │
  │       O
  │       │
  │      
  │      
══╧══════════`,
            // 3 lives - one arm
            `  ┌───────┐
  │       │
  │       O
  │      /│
  │      
  │      
══╧══════════`,
            // 2 lives - both arms
            `  ┌───────┐
  │       │
  │       O
  │      /│\\
  │      
  │      
══╧══════════`,
            // 1 life - one leg
            `  ┌───────┐
  │       │
  │       O
  │      /│\\
  │      / 
  │      
══╧══════════`,
            // 0 lives - dead (full hangman)
            `  ┌───────┐
  │       │
  │       O
  │      /│\\
  │      / \\
  │      
══╧══════════`
        ];

        // Gamification & PWA State
        let currentStreak = 0;
        let bestStreak = localStorage.getItem('hangmanBestStreak') || 0;
        let soundEnabled = true;

        // PWA Install Prompt
        let deferredPrompt;
        const pwaInstallBtn = document.getElementById('pwa-install-btn');

        window.addEventListener('beforeinstallprompt', (e) => {
            e.preventDefault();
            deferredPrompt = e;
            if (pwaInstallBtn) {
                pwaInstallBtn.style.display = 'inline-flex';
                pwaInstallBtn.addEventListener('click', async () => {
                    if (deferredPrompt) {
                        deferredPrompt.prompt();
                        const { outcome } = await deferredPrompt.userChoice;
                        deferredPrompt = null;
                        pwaInstallBtn.style.display = 'none';
                    }
                });
            }
        });

        // Sound Effects (Web Audio API)
        const audioCtx = new (window.AudioContext || window.webkitAudioContext)();
        function playSound(type) {
            if (!soundEnabled) return;
            const osc = audioCtx.createOscillator();
            const gainNode = audioCtx.createGain();
            osc.connect(gainNode);
            gainNode.connect(audioCtx.destination);

            const now = audioCtx.currentTime;

            if (type === 'click') {
                osc.type = 'sine';
                osc.frequency.setValueAtTime(800, now);
                osc.frequency.exponentialRampToValueAtTime(300, now + 0.1);
                gainNode.gain.setValueAtTime(0.1, now);
                gainNode.gain.exponentialRampToValueAtTime(0.01, now + 0.1);
                osc.start(now);
                osc.stop(now + 0.1);
            } else if (type === 'win') {
                // Play a Major triad arpeggio (C-E-G-C)
                const notes = [523.25, 659.25, 783.99, 1046.50]; // C5, E5, G5, C6
                notes.forEach((freq, i) => {
                    const osc2 = audioCtx.createOscillator();
                    const gain2 = audioCtx.createGain();
                    osc2.connect(gain2);
                    gain2.connect(audioCtx.destination);

                    osc2.type = 'triangle';
                    osc2.frequency.value = freq;

                    const startTime = now + (i * 0.1);
                    const duration = 0.2;

                    gain2.gain.setValueAtTime(0, startTime);
                    gain2.gain.linearRampToValueAtTime(0.1, startTime + 0.05);
                    gain2.gain.exponentialRampToValueAtTime(0.001, startTime + duration);

                    osc2.start(startTime);
                    osc2.stop(startTime + duration);
                });
                return; // Exit early as we handled notes manually
            } else if (type === 'lose') {
                osc.type = 'sawtooth';
                osc.frequency.setValueAtTime(200, now);
                osc.frequency.linearRampToValueAtTime(100, now + 0.3);
                gainNode.gain.setValueAtTime(0.1, now);
                gainNode.gain.linearRampToValueAtTime(0, now + 0.3);
                osc.start(now);
                osc.stop(now + 0.3);
            } else if (type === 'wrong') {
                osc.type = 'square';
                osc.frequency.setValueAtTime(150, now);
                gainNode.gain.setValueAtTime(0.1, now);
                gainNode.gain.exponentialRampToValueAtTime(0.01, now + 0.1);
                osc.start(now);
                osc.stop(now + 0.1);
            }
        }

        function renderHangman() {
            if (asciiContainer) {
                const stage = 6 - lives;
                asciiContainer.textContent = hangmanStages[stage];
            }
        }

        function updateStreakUI() {
            const curEl = document.getElementById('current-streak');
            const bestEl = document.getElementById('best-streak');
            if (curEl) curEl.textContent = currentStreak;
            if (bestEl) bestEl.textContent = bestStreak;
        }

        // Initialize UI
        setTimeout(() => {
            updateStreakUI();
            const soundBtn = document.getElementById('sound-toggle');
            if (soundBtn) {
                soundBtn.addEventListener('click', () => {
                    soundEnabled = !soundEnabled;
                    soundBtn.innerHTML = soundEnabled ? '<i class="fas fa-volume-up"></i>' : '<i class="fas fa-volume-mute"></i>';
                    soundBtn.style.opacity = soundEnabled ? '1' : '0.5';
                });
            }
        }, 500);

        function newGame() {
            gameCount++;
            let selected;
            if (gameCount % 3 === 0) {
                selected = authorWords[Math.floor(Math.random() * authorWords.length)];
            } else {
                selected = hangmanWords[Math.floor(Math.random() * hangmanWords.length)];
            }
            currentWord = selected.word;
            currentHint = selected.hint;
            guessedLetters = [];
            lives = 6;
            gameOver = false;
            document.getElementById('lives-count').textContent = lives;
            document.getElementById('hangman-result').textContent = '';
            document.getElementById('hangman-result').className = 'hangman-result';
            renderHangman();
            renderWord();
            renderKeyboard();
            // Resume Audio Context on interaction
            if (audioCtx.state === 'suspended') audioCtx.resume();
        }

        function renderWord() {
            const hintEl = document.getElementById('hangman-hint');
            if (hintEl) hintEl.textContent = '💡 Hint: ' + currentHint;
            wordContainer.innerHTML = currentWord
                .split('')
                .map(letter => guessedLetters.includes(letter) ? letter : '_')
                .join(' ');
        }

        function renderKeyboard() {
            keyboardContainer.innerHTML = '';
            'ABCDEFGHIJKLMNOPQRSTUVWXYZ'.split('').forEach(letter => {
                const btn = document.createElement('button');
                btn.className = 'hangman-key';
                btn.textContent = letter;
                btn.disabled = guessedLetters.includes(letter);
                if (guessedLetters.includes(letter)) {
                    btn.classList.add(currentWord.includes(letter) ? 'correct' : 'wrong');
                }
                btn.addEventListener('click', () => guessLetter(letter));
                keyboardContainer.appendChild(btn);
            });
        }

        function guessLetter(letter) {
            if (gameOver || guessedLetters.includes(letter)) return;

            // Resume context if suspended
            if (audioCtx.state === 'suspended') audioCtx.resume();

            guessedLetters.push(letter);
            playSound('click');

            if (!currentWord.includes(letter)) {
                lives--;
                playSound('wrong');
                document.getElementById('lives-count').textContent = lives;
                renderHangman();
            }

            renderWord();
            renderKeyboard();
            checkGameEnd();
        }

        function checkGameEnd() {
            const resultEl = document.getElementById('hangman-result');
            const won = currentWord.split('').every(l => guessedLetters.includes(l));

            if (won) {
                currentStreak++;
                if (currentStreak > bestStreak) {
                    bestStreak = currentStreak;
                    localStorage.setItem('hangmanBestStreak', bestStreak);
                }
                updateStreakUI();
                playSound('win');

                resultEl.textContent = '🎉 You Won! Great job!';
                resultEl.className = 'hangman-result win';
                gameOver = true;

                // Trigger confetti
                const duration = 3000;
                const end = Date.now() + duration;

                (function frame() {
                    confetti({
                        particleCount: 5,
                        angle: 60,
                        spread: 55,
                        origin: { x: 0 },
                        colors: ['#dc2626', '#1e293b', '#ffffff'] // Theme colors
                    });
                    confetti({
                        particleCount: 5,
                        angle: 120,
                        spread: 55,
                        origin: { x: 1 },
                        colors: ['#dc2626', '#1e293b', '#ffffff']
                    });

                    if (Date.now() < end) {
                        requestAnimationFrame(frame);
                    }
                }());
            } else if (lives <= 0) {
                currentStreak = 0;
                updateStreakUI();
                playSound('lose');

                resultEl.textContent = `💀 Game Over! The word was: ${currentWord}`;
                resultEl.className = 'hangman-result lose';
                gameOver = true;

                // Trigger shake animation
                const gameContainer = document.querySelector('.hangman-game');
                gameContainer.classList.add('shake-anim');
                setTimeout(() => {
                    gameContainer.classList.remove('shake-anim');
                }, 500);
            }
        }

        resetBtn.addEventListener('click', newGame);
        newGame();
    }

    initHangman();

    // 12. Code Typing Animation
    // 12. Code Typing Animation (Fixed)
    function initCodeTyping() {
        const codeElement = document.getElementById('typing-code');
        if (!codeElement) return;

        // Remove the class to prevent Prism from double-highlighting
        codeElement.className = '';

        const rawCode = `public class HangmanGame extends JFrame {
    private String[] words = {"AMEY", "MEGA", "JAVA"};
    private int lives = 6;
    
    public void checkGuess(char letter) {
        if (word.contains(letter)) {
            revealLetter(letter);
        } else {
            lives--;
            repaint();
        }
    }
}`;

        function highlightJava(code) {
            // Escape HTML first to prevent XSS and rendering issues
            code = code.replace(/&/g, "&amp;").replace(/</g, "&lt;").replace(/>/g, "&gt;");

            // Single-pass regex to avoid replacing inside already-generated HTML tags
            const tokenRegex = /(\/\/.*)|(".*?")|\b(public|class|extends|private|int|void|char|if|else|new|return|import|package)\b|\b(String|JFrame|HangmanGame|Math|System)\b|\b(lives|word|letter|words)\b|\b(\d+)\b|({|}|\[|\]|\(|\))/g;

            return code.replace(tokenRegex, function (match, comment, string, keyword, type, varName, number, bracket) {
                if (comment) return '<span style="color: #5c6370; font-style: italic;">' + comment + '</span>';
                if (string) return '<span style="color: #98c379;">' + string + '</span>';
                if (keyword) return '<span style="color: #c678dd;">' + keyword + '</span>';
                if (type) return '<span style="color: #e5c07b;">' + type + '</span>';
                if (varName) return '<span style="color: #e06c75;">' + varName + '</span>';
                if (number) return '<span style="color: #d19a66;">' + number + '</span>';
                if (bracket) return '<span style="color: #abb2bf;">' + bracket + '</span>';
                return match;
            });
        }

        let charIndex = 0;
        const typeSpeed = 40;

        function type() {
            if (charIndex < rawCode.length) {
                // Get the substring to display
                const currentText = rawCode.substring(0, charIndex + 1);
                // Apply syntax highlighting to the substring
                codeElement.innerHTML = highlightJava(currentText);

                charIndex++;
                setTimeout(type, typeSpeed);
            } else {
                codeElement.innerHTML += '<span class="typing-cursor">|</span>';
            }
        }

        const observer = new IntersectionObserver((entries) => {
            if (entries[0].isIntersecting) {
                type();
                observer.disconnect();
            }
        });
        observer.observe(codeElement);
    }

    initCodeTyping();
});



