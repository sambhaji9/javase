package com.lang;

public class ExecDemo {
    public static void main(String[] args) {
        Runtime runtime = Runtime.getRuntime();
        Process process = null;

        try {
            process = runtime.exec("notepad");
        } catch (Exception exception) {
            System.out.println("Error executing notepad.");
        }
    }
}
