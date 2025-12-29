/**
 * ================================================================
 *   Object-Oriented Programming (OOPM) Lab Portfolio - Service Worker
 * ================================================================
 *   Author: Amey Thakur
 *   GitHub: https://github.com/Amey-Thakur
 *   Course: Object-Oriented Programming (OOPM) Lab
 *   Roll No: 50
 *   Batch: B3
 *   Repository: https://github.com/Amey-Thakur/OOPM-JAVA-LAB
 *   Date: January 17, 2020
 *   
 *   Description: Service Worker for PWA offline capabilities and caching.
 * ================================================================
 */

const CACHE_NAME = 'oopm-portfolio-v1';
const ASSETS = [
    'index.html',
    'style.css',
    'script.js',
    'manifest.json'
];

self.addEventListener('install', (event) => {
    event.waitUntil(
        caches.open(CACHE_NAME).then((cache) => cache.addAll(ASSETS))
    );
});

self.addEventListener('fetch', (event) => {
    event.respondWith(
        caches.match(event.request).then((response) => response || fetch(event.request))
    );
});
