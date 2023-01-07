package com.multithreading;

// create a second thread by extending thread
class NewThread1 extends Thread {
    Thread newThread;

    NewThread1() {
        // create a new second thread
        super("Demo thread");
        System.out.println("Child thread" + this);
        start();
    }

    @Override
    public void run() {
        try {
            for (int i = 5; i > 0; i--) {
                System.out.println("Child thread: " + i);
                Thread.sleep(1000);
            }
        } catch (InterruptedException interruptedException) {
            System.out.println("Child thread interrupted");
        }
        System.out.println("Child thread exiting");
    }
}

public class ExtendThreadDemo {
    public static void main(String[] args) {
        new NewThread1();

        try {
            for (int i = 5; i > 0; i--) {
                System.out.println("Main thread: " + i);
                Thread.sleep(1000);
            }
        } catch (InterruptedException interruptedException) {
            System.out.println("Main thread interrupted");
        }
        System.out.println("Main thread exiting");
    }
}
