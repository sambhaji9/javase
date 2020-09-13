package com.collections;

import java.util.TreeSet;

public class ComparatorDemo2 {
    public static void main(String[] args) {
        // pass a reverse comparator to treeset via a lambda expression
        TreeSet<String> treeSet = new TreeSet<String>(
                (string1, string2) -> string2.compareTo(string1)
        );

        // add elements to the treeset
        // add elements to tree set
        treeSet.add("c");
        treeSet.add("d");
        treeSet.add("a");
        treeSet.add("b");
        treeSet.add("f");
        treeSet.add("e");

        // display the elements
        for(String element: treeSet)
            System.out.println(element + "");

        System.out.println();
    }
}
