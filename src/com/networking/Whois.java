package com.networking;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.Socket;

/**
 * Demonstrate sockets
 */
public class Whois {
    public static void main(String[] args) throws IOException {
        int c;

        // create a socket connected to internic.net, port 43
        Socket socket = new Socket("whois.internic.net", 43);

        // obtain input and output streams
        InputStream inputStream = socket.getInputStream();
        OutputStream outputStream = socket.getOutputStream();

        // construct a request string
        String string = (args.length == 0 ? "OraclePressBooks.com" : args[0]) + "/n";
        // convert to bytes
        byte buf[] = string.getBytes();

        // send request
        outputStream.write(buf);

        // read and display records
        while ((c = inputStream.read()) != -1) {
            System.out.println((char) c);
        }
        socket.close();
    }
}
