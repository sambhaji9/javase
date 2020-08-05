package com.collections;

import sun.awt.image.ImageWatched;

import java.util.LinkedHashSet;

public class LinkedHashSetDemo {
    public static void main(String [] args) {
        LinkedHashSet<String> linkedHashSet = new LinkedHashSet<String>();
        linkedHashSet.add("Sambhaji");
        linkedHashSet.add("Sadhana");
        linkedHashSet.add("Satyam");
        linkedHashSet.add("Aaradhya");

        System.out.println("LinkedHashSet holds list of entries in the inserted order");
        System.out.println(linkedHashSet);
    }
}
