package com.swing;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class EventDemo {
    JLabel jLabel;

    public EventDemo() {
        // create a new JFrame container
        JFrame jFrame = new JFrame("An event example");

        // specify flowlayout for layout manager
        jFrame.setLayout(new FlowLayout());

        // give the frame an initial size
        jFrame.setSize(500, 500);

        // terminate the program when user closes the application
        jFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        // make two buttons
        JButton jButtonAlpha = new JButton("Alpha");
        JButton jButtonBeta = new JButton("Beta");

        // add action listener for alpha
        jButtonAlpha.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                jLabel.setText("Alpha was pressed");
            }
        });

        jButtonBeta.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                jLabel.setText("Beta was pressed");
            }
        });

        // add the buttons to the content pane
        jFrame.add(jButtonAlpha);
        jFrame.add(jButtonBeta);

        // create a text based label
        jLabel = new JLabel("Press a button");
        jFrame.add(jLabel);

        // display the frame
        jFrame.setVisible(true);
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run() {
                new EventDemo();
            }
        });
    }
}
