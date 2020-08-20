package com.string_handling;

public class GetCharsDemo {
    public static void main(String[] args) {
        String string = "This is a demo of getchars method";
        int start = 10;
        int end = 14;

        char buf[] = new char[end - start];
        string.getChars(start, end, buf, 0);
        System.out.println(buf);

        char ch;
        ch = "abc".charAt(1);
        System.out.println("Character at index 1: " + ch);

        System.out.println("Bytes at index 1: " + "abc".getBytes());
    }

}
