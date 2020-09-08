package com.string_handling;

public class ChangeCase {
    public static void main(String[] args) {
        String string = "This is a test";
        System.out.println("Original: " + string);

        String upper = string.toUpperCase();
        String lower = string.toLowerCase();

        System.out.println("Uppercase: " + upper);
        System.out.println("Lowercase: " + lower);
    }
}
