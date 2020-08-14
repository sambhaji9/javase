package com.util;

import java.util.GregorianCalendar;

// demonstrate a countdown calendar
public class CountDownCalendar {
    public static void main(String[] args) {

        // get the current date
        GregorianCalendar gregorianCalendarNow = new GregorianCalendar();
        gregorianCalendarNow.set(2020,7, 14);
        int now = gregorianCalendarNow.get(GregorianCalendar.DAY_OF_YEAR);

        //get the date in future
        GregorianCalendar gregorianCalendarDiwali = new GregorianCalendar();
        gregorianCalendarDiwali.set(2020, 10, 12);
        int diwali = gregorianCalendarDiwali.get(GregorianCalendar.DAY_OF_YEAR);

        // Get the difference between the dates
        System.out.println("Days till Diwali vacation: " + (diwali - now));
    }
}
