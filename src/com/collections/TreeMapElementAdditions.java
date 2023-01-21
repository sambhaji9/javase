package com.collections;

// Java Program to Illustrate Addition of Elements
// in TreeMap using put() Method

// Importing required classes
import java.util.*;

// Main class
class TreeMapElementAdditions {

    // Main driver method
    public static void main(String args[])
    {
        // Default Initialization of a TreeMap
        TreeMap tm1 = new TreeMap();

        // Inserting the elements in TreeMap
        // using put() method
        tm1.put(3, "Geeks");
        tm1.put(2, "For");
        tm1.put(1, "Geeks");

        // Initialization of a TreeMap using Generics
        TreeMap<Integer, String> tm2
                = new TreeMap<Integer, String>();

        // Inserting the elements in TreeMap
        // again using put() method
        tm2.put(new Integer(3), "Geeks");
        tm2.put(new Integer(2), "For");
        tm2.put(new Integer(1), "Geeks");

        // Printing the elements of both TreeMaps

        // Map 1
        System.out.println(tm1);
        // Map 2
        System.out.println(tm2);
    }
}

