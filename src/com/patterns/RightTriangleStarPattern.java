package com.patterns;

/**
 * Demonstrate a Right triangle star pattern, show below
 * *
 * **
 * ***
 * ****
 * *****
 */
public class RightTriangleStarPattern {
    public static void main(String[] args) {

        for (int i = 0; i <= 5; i++) {
            for (int j = 0; j < i; j++) {
                System.out.print(" * ");
            }
            System.out.println();
        }

    }
}
