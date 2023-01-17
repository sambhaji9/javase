package com.collections;

// Java Program to Demonstrate TreeMap
// using the SortedMap Constructor

// Importing required classes
import java.util.*;
import java.util.concurrent.*;

// Main class
// TreeMapImplementation
public class TreeMap4 {

    // Method
    // To show TreeMap(SortedMap) constructor
    static void Example4thConstructor()
    {
        // Creating a SortedMap
        SortedMap<Integer, String> sorted_map
                = new ConcurrentSkipListMap<Integer, String>();

        // Mapping string values to int keys
        // using put() method
        sorted_map.put(10, "Geeks");
        sorted_map.put(15, "4");
        sorted_map.put(20, "Geeks");
        sorted_map.put(25, "Welcomes");
        sorted_map.put(30, "You");

        // Creating the TreeMap using the SortedMap
        TreeMap<Integer, String> tree_map
                = new TreeMap<Integer, String>(sorted_map);

        // Printing the elements of TreeMap
        System.out.println("TreeMap: " + tree_map);
    }

    // Method 2
    // Main driver method
    public static void main(String[] args)
    {

        System.out.println("TreeMap using "
                + "TreeMap(SortedMap)"
                + " constructor:\n");

        Example4thConstructor();
    }
}

