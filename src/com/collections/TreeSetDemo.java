package com.collections;

import java.util.TreeSet;

public class TreeSetDemo {
    public static void main(String [] args) {
        // create a tree set
        TreeSet<String> treeSet = new TreeSet<String>();

        // Add elements to the tree set
        treeSet.add("Sambhaji");
        treeSet.add("Samadhan");
        treeSet.add("Samidha");
        treeSet.add("Sameer");
        treeSet.add("Sam");

        System.out.println("Elements are sorted in ascending order");
        System.out.println(treeSet);

        System.out.println("Display the subset of treeSet from Samadhan (inclusive) to Samidha (exclusive)");
        System.out.println(treeSet.subSet("Samadhan", "Samidha"));
    }
}
