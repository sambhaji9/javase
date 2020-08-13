package com.util;

// Demonstrate Timer and TimerTask

import java.util.Timer;
import java.util.TimerTask;

class MyTimerTask extends TimerTask {

    @Override
    public void run() {
        System.out.println("Timer task executed");
    }
}

public class TimerDemo {
    public static void main(String[] args) {
        MyTimerTask myTimerTask = new MyTimerTask();
        Timer timer = new Timer();

        // set an initial delay of 1 second, then repeat every half second
        timer.schedule(myTimerTask, 1000, 500);

        try {
            Thread.sleep(5000);
        } catch (InterruptedException exception) {

        }

        timer.cancel();
    }
}
