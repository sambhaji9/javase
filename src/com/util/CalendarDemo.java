package com.util;

import java.util.Calendar;

public class CalendarDemo {
    public static void main(String[] args) {
        String months[] = {
                "Jan", "Feb", "Mar", "Apr", "May", "Jun", "Jul", "Aug", "Sep", "Oct", "Nov", "Dec"
        };

        // create a calendar initialized with the current date and time in default locale and timezone
        Calendar calendar = Calendar.getInstance();

        // display current time and date information
        System.out.println("Date: " + months[calendar.get(Calendar.MONTH)] + " " + calendar.get(Calendar.DATE) + " " +
                calendar.get(Calendar.YEAR));
        System.out.println("Time: " + calendar.get(Calendar.HOUR) + ":" + calendar.get(Calendar.MINUTE) + ":" +
                calendar.get(Calendar.SECOND));

        // set the time and date information and then display it
        calendar.set(Calendar.HOUR, 10);
        calendar.set(Calendar.MINUTE, 30);
        calendar.set(Calendar.SECOND, 59);

        System.out.println("Updated time: " + calendar.get(Calendar.HOUR) + ":" + calendar.get(Calendar.MINUTE) + ":" +
                calendar.get(Calendar.SECOND));
    }
}
