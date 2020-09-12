package com.lang;

public class ExecDemoFinish {
    public static void main(String[] args) {
        Runtime runtime = Runtime.getRuntime();
        Process process = null;

        try {
            process = runtime.exec("notepad");
            process.waitFor();
        } catch(Exception exception) {
            System.out.println("Error executing notepad");
        }
        System.out.println("Notepad returned " + process.exitValue());
    }
}
