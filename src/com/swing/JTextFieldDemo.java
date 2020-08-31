package com.swing;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class JTextFieldDemo {
    public JTextFieldDemo() {
        // set up JFrame
        JFrame jFrame = new JFrame("JTextfield demo");
        jFrame.setLayout(new FlowLayout());
        jFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        jFrame.setSize(500, 500);

        // add textfield to content pane
        JTextField jTextField = new JTextField(15);
        jFrame.add(jTextField);

        // add a label
        JLabel jLabel = new JLabel();
        jFrame.add(jLabel);

        // handle action events
        jTextField.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                // show the text when user hits enter
                jLabel.setText(jTextField.getText());
            }
        });

        // display the jframe
        jFrame.setVisible(true);
    }

    public static void main(String[] args) {
        // create the frame on event dispatching thread
        SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run() {
                new JTextFieldDemo();
            }
        });
    }
}
