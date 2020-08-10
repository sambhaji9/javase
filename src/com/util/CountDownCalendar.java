package com.util;

import java.util.GregorianCalendar;

// demonstrate a countdown calendar
public class CountDownCalendar {
    public static void main(String[] args) {
        GregorianCalendar gregorianCalendarNow = new GregorianCalendar();
        gregorianCalendarNow.set(2020,7, 10);
        int now = gregorianCalendarNow.get(GregorianCalendar.DAY_OF_YEAR);

        GregorianCalendar gregorianCalendarDiwali = new GregorianCalendar();
        gregorianCalendarDiwali.set(2020, 10, 12);
        int diwali = gregorianCalendarDiwali.get(GregorianCalendar.DAY_OF_YEAR);

        System.out.println("Days till Diwali vacation: " + (diwali - now));
    }
}
