package com.collections;

import java.util.Enumeration;
import java.util.Hashtable;

public class HashTableDemo {
    public static void main(String[] args) {
        Hashtable<String, Double> balance = new Hashtable<String, Double>();

        Enumeration<String> names;
        String string;
        double bal;

        balance.put("Sambhaji", 1000.10);
        balance.put("Sadhana", 2000.10);
        balance.put("Satyam", 3000.10);
        balance.put("Aaradhya", 4000.10);

        // show all the balances in hashtable
        names = balance.keys();
        while(names.hasMoreElements()) {
            string = names.nextElement();
            System.out.println(string + ": " + balance.get(string));
        }

        System.out.println();

        // deposit 1000 in satyams account
        bal = balance.get("Satyam");
        balance.put("Satyam", bal + 10000);
        System.out.println("Satyam's new balance: " + balance.get("Satyam"));
    }
}
