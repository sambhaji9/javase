package com.lang;

public class ProcessBuilderDemo {
    public static void main(String[] args) {
        try {
            ProcessBuilder processBuilder = new ProcessBuilder("notepad.exe", "testfile");
            processBuilder.start();
        } catch (Exception exception) {
            System.out.println("Error executing notepad");
        }
    }
}
