/**
 * Program: Multithreading Demo
 * Description: A Java program to demonstrate the concept of Multithreading by extending the Thread class.
 *              It creates multiple threads that run concurrently.
 * Author: Amey Thakur
 * Reference: https://github.com/Amey-Thakur/OOPM-JAVA-LAB
 */

class ThreadOne extends Thread {
    @Override
    public void run() {
        for (int i = 1; i <= 10; i++) {
            System.out.println("Thread 1 (A) -- Value: " + i);
            try {
                // Adding a small delay to visualize concurrency
                Thread.sleep(100); 
            } catch (InterruptedException e) {
                System.out.println(e);
            }
        }
    }
}

class ThreadTwo extends Thread {
    @Override
    public void run() {
        for (int i = 1; i <= 10; i++) {
            System.out.println("Thread 2 (B) -- Value: " + i);
            try {
                Thread.sleep(100);
            } catch (InterruptedException e) {
                System.out.println(e);
            }
        }
    }
}

class ThreadThree extends Thread {
    @Override
    public void run() {
        for (int i = 1; i <= 10; i++) {
            System.out.println("Thread 3 (C) -- Value: " + i);
            try {
                Thread.sleep(100);
            } catch (InterruptedException e) {
                System.out.println(e);
            }
        }
    }
}

public class Multithreading_Demo {
    public static void main(String[] args) {
        System.out.println("---------------------------------------------");
        System.out.println("       Multithreading Demo");
        System.out.println("---------------------------------------------");

        // Creating thread objects
        ThreadOne t1 = new ThreadOne();
        ThreadTwo t2 = new ThreadTwo();
        ThreadThree t3 = new ThreadThree();

        System.out.println("Status of Thread 1 before start: " + t1.isAlive());

        // Starting threads
        System.out.println("Starting threads...");
        t1.start();
        t2.start();
        t3.start();

        System.out.println("Status of Thread 1 after start: " + t1.isAlive());
        System.out.println("\nAll threads started. They will execute concurrently.");
        System.out.println("---------------------------------------------");
    }
}
