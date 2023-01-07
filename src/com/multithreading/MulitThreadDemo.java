package com.multithreading;

class NewThread3 implements Runnable {
    String name;
    Thread thread;

    NewThread3(String threadName) {
        name = threadName;
        thread = new Thread(this.name);
        System.out.println("New thread: " + thread);
        thread.start();
    }

    @Override
    public void run() {

        try {
            for (int i = 5; i > 0; i--) {
                System.out.println("name " + ": " + i);
                Thread.sleep(1000);
            }
        } catch (InterruptedException interruptedException) {
            System.out.println(name + "Interruped");
        }
        System.out.println(name + " exiting");
    }
}

public class MulitThreadDemo {
    public static void main(String[] args) {

        new NewThread3("One");
        new NewThread3("Two");
        new NewThread3("Three");

        try {
            // wait for other thread to end
            Thread.sleep(10000);
        } catch (InterruptedException interruptedException) {
            System.out.println("Main thread Interruped");
        }
        System.out.println("Main thread exiting");
    }
}
