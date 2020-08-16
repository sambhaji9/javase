package com.networking;

import java.net.InetAddress;
import java.net.UnknownHostException;

/**
 * Demonstrate Inetaddress demo
 */
public class InetAddressDemo {
    public static void main(String[] args) throws UnknownHostException {
        InetAddress address = InetAddress.getLocalHost();
        System.out.println("InetAddress is: " + address);

        address = InetAddress.getByName("www.nike.com");
        System.out.println(address);

        InetAddress sw[] = InetAddress.getAllByName("www.nike.com");
        for (int i = 0; i < sw.length; i++) {
            System.out.println(sw[i]);
        }
    }
}
