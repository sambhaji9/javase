package com.util;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

/**
 * use scanner to compute an average of values in a file
 */
public class ScannerAverageFile {
    public static void main(String[] args) throws IOException {
        int count = 0;
        double sum = 0.0;

        // write output to file
        FileWriter fileWriter = new FileWriter("test.txt");
        fileWriter.write("2 3.4 5 6 7.4 done");
        fileWriter.close();

        FileReader fileReader = new FileReader("test.txt");
        Scanner scanner = new Scanner(fileReader);

        // read and sum numbers
        while(scanner.hasNext()) {
            if (scanner.hasNextDouble()) {
                sum += scanner.nextDouble();
                count++;
            } else {
                String string = scanner.next();
                if (string.equals("done")) break;
                else {
                    System.out.println("File format error.");
                    return;
                }
            }
        }
        scanner.close();
        System.out.println("Average is " + sum/count);
    }
}
