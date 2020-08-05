package com.collections;

import java.util.HashSet;

public class HashSetDemo {
    public static void main(String [] args) {
        // create a hash set
        HashSet<String> hashSet = new HashSet<String>();

        // Add elements to hashSet
        hashSet.add("Sambhaji");
        hashSet.add("Sadhana");
        hashSet.add("Satyam");
        hashSet.add("Aaradhya");

        // print the hashset
        System.out.println("Elements are not stored in sorted order and the precise output may vary");
        System.out.println(hashSet);
    }
}
