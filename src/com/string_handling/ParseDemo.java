package com.string_handling;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class ParseDemo {
    public static void main(String[] args) throws IOException {
        // create a bufferedreader using system.in
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        String string;
        int i = 0;
        int sum = 0;

        System.out.println("Enter numbers, 0 to quit: ");
        do {
            string = bufferedReader.readLine();
            try {
                i = Integer.parseInt(string);
            } catch (NumberFormatException numberFormatException) {
                System.out.println("Invalid format");
                i = 0;
            }
            sum += i;
            System.out.println("Current sum is: " + sum);
        } while (i != 0);
    }
}
