package com.util;

import java.util.Calendar;
import java.util.Formatter;

/**
 * Demonstrate time and date format
 */
public class TimeDateFormat {
    public static void main(String[] args) {
        Formatter formatter = new Formatter();
        Calendar calendar = Calendar.getInstance();

        // display standard 12-hour time format
        formatter.format("%tr", calendar);
        System.out.println("Time in 12 hour format: " + formatter);
        formatter.close();

        // display complete time and date information
        formatter = new Formatter();
        formatter.format("%tc", calendar);
        System.out.println("Complete time and date: " + formatter);
        formatter.close();

        // display just hour and minute
        formatter = new Formatter();
        formatter.format("%tl:%tM", calendar, calendar);
        System.out.println("Diplay hour and minute: " + formatter);
        formatter.close();

        // display month by name and number;
        formatter = new Formatter();
        formatter.format("%tB %tb %tm", calendar, calendar, calendar);
        System.out.println("Display month name and number: " + formatter);
        formatter.close();
    }
}
