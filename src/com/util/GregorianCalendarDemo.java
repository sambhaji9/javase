package com.util;

import java.util.Calendar;
import java.util.GregorianCalendar;

public class GregorianCalendarDemo {
    public static void main(String[] args) {
        String months[] = {
                "Jan", "Feb", "Mar", "Apr", "May", "Jun", "Jul", "Aug", "Sep", "Oct", "Nov", "Dec"
        };

        // create a gregorian calendar initialized with the current date and time in default locale and timezone
        GregorianCalendar gregorianCalendar = new GregorianCalendar();
        int year = gregorianCalendar.get(Calendar.YEAR);

        // Display current time and date information
        System.out.println("Date: " + months[gregorianCalendar.get(GregorianCalendar.MONTH)] + " " +
                gregorianCalendar.get(GregorianCalendar.DATE) + " " + gregorianCalendar.get(GregorianCalendar.YEAR));

        System.out.println("Time: " + gregorianCalendar.get(GregorianCalendar.HOUR) + ":" +
                gregorianCalendar.get(GregorianCalendar.MINUTE) + ":" + GregorianCalendar.SECOND);

        // test if current year is leap year
        if (gregorianCalendar.isLeapYear(year)) {
            System.out.println("This year is a leap year");
        } else {
            System.out.println("This year is not a leap year");
        }
    }
}
