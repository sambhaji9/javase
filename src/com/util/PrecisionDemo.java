package com.util;

import java.util.Formatter;

public class PrecisionDemo {
    public static void main(String[] args) {
        Formatter formatter = new Formatter();

        // format 4 decimal places
        formatter.format("%.4f", 123.1234567);
        System.out.println("Format 4 decimal places: " + formatter);
        formatter.close();

        // format to 2 decimal places in a 16 character field
        formatter = new Formatter();
        formatter.format("%16.2e", 123.1234567);
        System.out.println("Format to 2 decimal places: " + formatter);
        formatter.close();

        // display at most 15 characters in a string
        formatter = new Formatter();
        formatter.format("%.15s", "Formatting with java is now easy.");
        System.out.println(formatter);
        formatter.close();
    }
}
