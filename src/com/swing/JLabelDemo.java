package com.swing;

import javax.swing.*;
import java.awt.*;

public class JLabelDemo {
    public JLabelDemo() {
        // set up JFrame
        JFrame jFrame = new JFrame("JLabel Demo");
        jFrame.setLayout(new FlowLayout());
        jFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        jFrame.setSize(500, 500);

        // create an icon
        ImageIcon imageIcon = new ImageIcon("citrus-close-up-crop-129574.jpg");

        // create a label
        JLabel jLabel = new JLabel("Hourglass", imageIcon, JLabel.CENTER);

        // add the label to the content pane
        jFrame.add(jLabel);
        // display the frame
        jFrame.setVisible(true);
    }

    public static void main(String[] args) {
        // create the frame on event dispatching thread
        SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run() {
                new JLabelDemo();
            }
        });
    }
}
