package com.multithreading;

// create a second thread
class NewThread implements Runnable {
    Thread newThread;

    NewThread() {
        // create a new second thread
        newThread = new Thread(this, "Demo thread");
        System.out.println("Child thread" + newThread);
        newThread.start();
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

public class ThreadDemo {
    public static void main(String[] args) {
        new NewThread();

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
