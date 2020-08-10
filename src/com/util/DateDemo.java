package com.util;

import java.util.Date;

public class DateDemo {
    public static void main(String[] args) {
        // instantiate a date object
        Date date = new Date();

        // display the date and time using toString()
        System.out.println(date);

        // display number of milliseconds since midnight, January 1 1970
        long msec = date.getTime();
        System.out.println("Milliseconds since Jan 1 1970 GMT: " + msec);
    }
}
