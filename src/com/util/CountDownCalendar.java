package com.util;

import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;

// demonstrate a countdown calendar
public class CountDownCalendar {
    public static void main(String[] args) {
        // get the current date
        GregorianCalendar gregorianCalendarNow = new GregorianCalendar();
        gregorianCalendarNow.set(2020, 8, 8);
        int now = gregorianCalendarNow.get(GregorianCalendar.DAY_OF_YEAR);

        //get the date in future
        GregorianCalendar gregorianCalendarDiwali = new GregorianCalendar();
        gregorianCalendarDiwali.set(2020, 10, 12);
        int diwali = gregorianCalendarDiwali.get(GregorianCalendar.DAY_OF_YEAR);

        // Get the difference between the dates
        System.out.println("Days till Diwali vacation: " + (diwali - now));

        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("dd/MM/yyyy");
        Calendar calendar = Calendar.getInstance();
        System.out.println("Current date: " + simpleDateFormat.format(calendar.getTime()));


        Calendar calendar1 = Calendar.getInstance();
        calendar1.set(2020, 8, 02);
        System.out.println("Future date: " + simpleDateFormat.format(calendar1.getTime()));

        System.out.println("Difference : " + ((calendar1.getTimeInMillis() - calendar.getTimeInMillis())/(1000 * 60 * 60 * 24)));



        /*Calendar calendar1 = Calendar.getInstance();
        Calendar calendar2 = Calendar.getInstance();

        calendar2.set(2020, 8, 1);
        calendar1.set(2021, 10, 12);

        System.out.println((calendar1.getTimeInMillis() - calendar2.getTimeInMillis())/(1000d * 60 * 60 * 24));

        LocalDate localDate1 = LocalDate.parse("2020-09-01");
        LocalDate localDate2 = LocalDate.parse("2020-09-10");
        System.out.println(localDate1.until(localDate2, ChronoUnit.DAYS));*/


    }
}
