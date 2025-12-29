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
                    title: 'AMEY | OOPM Lab Portfolio',
                    text: 'Explore my Java Object-Oriented Programming Laboratory Portfolio!',
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

    // 6. Footer Year Update
    document.getElementById('current-year').textContent = new Date().getFullYear();

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
});

