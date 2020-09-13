package com.collections;

// use a custom comparator
// a reverse comparator for strings

import java.util.Comparator;
import java.util.TreeSet;

public class ComparatorDemo {
    public static void main(String[] args) {
        // create a tree set
        TreeSet<String> treeSet = new TreeSet<String>(new MyComp());

        // add elements to tree set
        treeSet.add("c");
        treeSet.add("d");
        treeSet.add("a");
        treeSet.add("b");
        treeSet.add("f");
        treeSet.add("e");

        // display the elements
        for (String element: treeSet)
            System.out.print(element + " ");

        System.out.println();
    }
}
