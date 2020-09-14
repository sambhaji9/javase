package com.collections;

import java.util.Comparator;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;

// use a comparator to sort accounts by last name
// compare last whole words in two strings
class TComp implements Comparator<String> {

    @Override
    public int compare(String string1, String string2) {
        int i, j, k;
        // find index of beginning of last name
        i = string1.indexOf(' ');
        j = string2.indexOf(' ');

        k = string1.substring(i).compareToIgnoreCase(string2.substring(j));
        // last names match, check entire name
        if (k == 0) {
            return string1.compareToIgnoreCase(string2);
        } else
            return k;
    }
}

public class TreeMapDemo2 {
    public static void main(String[] args) {
        // create a tree map
        TreeMap<String, Double> treeMap = new TreeMap<String, Double>(new TComp());

        // put elements to the map
        treeMap.put("Sambhaji Mane", 1000.10);
        treeMap.put("Sadhana Mane", 2000.10);
        treeMap.put("Satyam Mane", 3000.10);
        treeMap.put("Aaradhya Mane", 4000.10);

        // get a set of entries
        Set<Map.Entry<String, Double>> set = treeMap.entrySet();

        // display the elements
        for (Map.Entry<String, Double> me: set) {
            System.out.print(me.getKey() + ": ");
            System.out.println(me.getValue());
        }
        System.out.println();

        // deposit 1000 into John Doe account
        double balance = treeMap.get("Satyam Mane");
        treeMap.put("Satyam Mane", balance + 1000);

        System.out.println("Satyam mane new balance: " +
        treeMap.get("Satyam Mane"));
    }
}
