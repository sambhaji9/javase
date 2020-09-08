package com.string_handling;

public class ReplaceDemo {
    public static void main(String[] args) {
        StringBuffer stringBuffer = new StringBuffer("This is a test");
        System.out.println("Before replace: " + stringBuffer);

        stringBuffer.replace(5, 7, "was");
        System.out.println("After replace: " + stringBuffer);
    }
}
