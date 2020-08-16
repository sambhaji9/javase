package com.networking;

import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class HttpUrlConnection {
    public static void main(String[] args) throws IOException {
        URL url = new URL("http://www.google.com");
        HttpURLConnection httpUrlConnection = (HttpURLConnection) url.openConnection();

        // display request method
        System.out.println("Request method is: " + httpUrlConnection.getRequestMethod());
        // display response message
        System.out.println("Response message is: " + httpUrlConnection.getResponseMessage());

        // get a list of header fields and a set of the header keys
        Map<String, List<String>> headerMap = httpUrlConnection.getHeaderFields();
        Set<String> headerField = headerMap.keySet();

        System.out.println("\nHere is the header: \n");

        // display all header keys and values
        for (String key: headerField) {
            System.out.println("Key: " + key + " Value: " + headerMap.get(key));
        }
    }
}
