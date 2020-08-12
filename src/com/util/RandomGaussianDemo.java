package com.util;

import java.util.Random;

/**
 * Demonstrate a bell curve using random gaussian values
 */
public class RandomGaussianDemo {
    public static void main(String[] args) {
        Random random = new Random();
        double val;
        double sum = 0;
        int bell[] = new int[10];

        for (int i = 0; i < 100; i++) {
            val = random.nextGaussian();
            sum += val;
            double t = -2;

            for (int x = 0; x < 10; x++, t += 0.5) {
                if (val < t) {
                    bell[x]++;
                    break;
                }
            }
            //System.out.println("Average of values: " + (sum/100));

            // display bell curve, sideways
            for (int j = 0; j < 10; j++) {
                for (int x = bell[i]; x > 0 ; x--)
                    System.out.print("*");

                System.out.println();
            }
        }
    }
}
