package com.string_handling;

public class IndexofDemo {
    public static void main(String[] args) {
        StringBuffer stringBuffer = new StringBuffer("one two one");

        int i = stringBuffer.indexOf("one");
        System.out.println("First index: " + i);

        i = stringBuffer.lastIndexOf("one");
        System.out.println("Last index: " + i);
    }
}
