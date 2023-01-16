package com.collections;

// Java Program to Demonstrate TreeMap
// using the Default Constructor

// Importing required classes
import java.util.*;

// Main class
public class TreeMapImplementation {

    // Method 1
    // To illustrate constructor<Map>
    static void Example3rdConstructor()
    {
        // Creating an empty HashMap
        Map<Integer, String> hash_map
                = new HashMap<Integer, String>();

        // Mapping string values to int keys
        // using put() method
        hash_map.put(10, "Geeks");
        hash_map.put(15, "4");
        hash_map.put(20, "Geeks");
        hash_map.put(25, "Welcomes");
        hash_map.put(30, "You");

        // Creating the TreeMap using the Map
        TreeMap<Integer, String> tree_map
                = new TreeMap<Integer, String>(hash_map);

        // Printing the elements of TreeMap
        System.out.println("TreeMap: " + tree_map);
    }

    // Method 2
    // Main driver method
    public static void main(String[] args)
    {

        System.out.println("TreeMap using "
                + "TreeMap(Map)"
                + " constructor:\n");

        Example3rdConstructor();
    }
}

