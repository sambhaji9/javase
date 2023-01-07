package com.multithreading;
import java.lang.Thread;

public class CurrentThreadDemo {
    public static void main(String[] args) {
        Thread thread = Thread.currentThread();
        System.out.println("Current Thread: " +  thread);

        // change the name of the thread
        thread.setName("My thread");
        System.out.println("After name change: " + thread);

        try {
            for (int i = 5; i > 0; i--) {
                System.out.println(i);
                Thread.sleep(1000);
            }
        } catch (InterruptedException interruptedException) {
            System.out.println("Main thread interrupted");
        }
    }
}
