package com.networking;

import java.io.IOException;
import java.net.URL;
import java.net.URLConnection;
import java.util.Date;

/**
 * Demonstrate url connection demo
 */
public class UrlConnectionDemo {
    public static void main(String[] args) throws IOException {
        URL url = new URL("http://www.google.com");
        URLConnection urlConnection = url.openConnection();

        // get date
        long date = urlConnection.getDate();
        if (date == 0)
            System.out.println("No date information");
        else
            System.out.println("Date: " + new Date(date));

        // get content type
        System.out.println("Content type: " + urlConnection.getContentType());

        // get expiration date
        date = urlConnection.getExpiration();
        if (date == 0)
            System.out.println("No expiration information");
        else
            System.out.println("Expires: " + new Date(date));

        // get last modified date
        date = urlConnection.getLastModified();
        if (date == 0)
            System.out.println("No last modified information");
        else
            System.out.println("Last modified: " + new Date(date));

        // get content length
        long length = urlConnection.getContentLengthLong();
        if (length == -1)
            System.out.println("Content length unavailable");
        else
            System.out.println("Content length: " + length);
    }
}
