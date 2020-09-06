package com.swing;

import javax.swing.*;

public class SwingHelloWorld {
    static class SwingDemo {
        SwingDemo() {
            // create a new JFrame container
            JFrame jFrame = new JFrame("A Simple Swing application");

            // give the frame an initial size
            jFrame.setSize(500, 500);

            // terminate the program when the user closes the application
            jFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

            // create a text-based label
            JLabel jLabel = new JLabel("Swing means powerful GUIs");

            // add the label to the content pane
            jFrame.add(jLabel);

            // display the frame
            jFrame.setVisible(true);

        }
    }
    public static void main(String[] args) {
        // create the frame on the event dispatching thread
        SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run() {
                new SwingDemo();
            }
        });
    }
}
