package com.patterns;

/**
 * Demonstrate number pattern
 * 1
 * 12
 * 123
 * 1234
 * 12345
 */
public class SimpleNumberPattern {
    public static void main(String[] args) {

        for (int i = 0; i < 5; i++) {
            for (int j = 0; j <= i; j++) {
                System.out.print(" " + (j + 1));
            }
            System.out.println();
        }
    }
}
