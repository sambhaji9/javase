package com.util;

import java.util.Random;

/**
 * Demonstrate the random gaussian value
 */
public class RandomNumberDemo {
    public static void main(String[] args) {
        Random random = new Random();
        System.out.println("Random int: " + random.nextInt());
        System.out.println("Random double: " + random.nextDouble());
        System.out.println("Random long: " + random.nextLong());
        System.out.println("Random float: " + random.nextFloat());
        System.out.println("Random Boolean: " + random.nextBoolean());
        System.out.println("Random Gaussian: " + random.nextGaussian());
    }
}
