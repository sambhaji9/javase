package com.patterns;

/**
 * Demonstrate a left triangle star pattern
 *     *
 *    **
 *   ***
 *  ****
 * *****
 */
public class LeftTriangleStarPattern {
    public static void main(String[] args) {
        for (int i = 5; i > 0; i--) {
            for (int j = 0; j < 6; j++) {
                if (i <= j) {
                    System.out.print(" * ");
                } else {
                    System.out.print("   ");
                }
            }
            System.out.println();
        }
    }
}
