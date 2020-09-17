package com.collections;

import java.util.Enumeration;
import java.util.Hashtable;
import java.util.Iterator;
import java.util.Set;

public class HashTableDemo2 {
    public static void main(String[] args) {
        Hashtable<String, Double> balance = new Hashtable<String, Double>();

        String string;
        double bal;

        balance.put("Sambhaji", 1000.10);
        balance.put("Sadhana", 2000.10);
        balance.put("Satyam", 3000.10);
        balance.put("Aaradhya", 4000.10);

        // show all the balances in hashtable
        // first get a set view of the keys
        Set<String> set = balance.keySet();
        // get an iterator
        Iterator<String> iterator = set.iterator();
        while (iterator.hasNext()) {
            string = iterator.next();
            System.out.println(string + ": " + balance.get(string));
        }

        System.out.println();

        // deposit 1000 in satyams account
        bal = balance.get("Satyam");
        balance.put("Satyam", bal + 11000);
        System.out.println("Satyam's new balance: " + balance.get("Satyam"));
    }
}
