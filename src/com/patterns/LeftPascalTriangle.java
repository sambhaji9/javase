package com.patterns;

/**
 * Demonstratee left pascal triangle
 *     *
 *    **
 *   ***
 *  ****
 * *****
 *  ****
 *   ***
 *    **
 *     *
 */

public class LeftPascalTriangle {
    public static void main(String[] args) {
        for (int i = 10; i > 0; i--) {
            if (i > 5) {
                for (int j = 6; j <= 10; j++) {
                    if (j < i) {
                        System.out.print("   ");
                    } else {
                        System.out.print(" * ");
                    }
                }
            } else {
                for (int j = 5; j > 0; j--) {
                    if (j < i) {
                        System.out.print(" * ");
                    } else {
                        System.out.print("   ");
                    }
                }
            }
            System.out.println();
        }
    }
}
