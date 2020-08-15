package com.util;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

/**
 * Demonstrate scanner to read various types of data from a file
 */
public class ScannerMixed {
    public static void main(String[] args) throws IOException {
        int i;
        double d;
        boolean b;
        String str;

        // write output to a file
        FileWriter fileWriter = new FileWriter("test.txt");
        fileWriter.write("Testing scanner 10 12.2 one true two false");
        fileWriter.close();

        FileReader fileReader = new FileReader("test.txt");
        Scanner scanner = new Scanner(fileReader);

        // read to end
        while(scanner.hasNext()) {
            if (scanner.hasNextInt()) {
                i = scanner.nextInt();
                System.out.println("int: " + i);
            } else if (scanner.hasNextDouble()) {
                d = scanner.nextDouble();
                System.out.println("double: " + d);
            } else if (scanner.hasNextBoolean()) {
                b = scanner.nextBoolean();
                System.out.println("boolean: " + b);
            } else {
                str = scanner.next();
                System.out.println("string: " + str);
            }
        }
        scanner.close();
    }
}
