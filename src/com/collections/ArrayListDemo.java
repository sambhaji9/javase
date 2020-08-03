package com.collections;

import java.util.ArrayList;

public class ArrayListDemo {
    public static void main(String [] args) {
        // create an array list
        ArrayList<String> arrayList = new ArrayList<String>();
        System.out.println("Initial size of arrayList: " + arrayList.size());

        arrayList.add("S");
        arrayList.add("a");
        arrayList.add("t");
        arrayList.add("y");
        arrayList.add("a");
        arrayList.add("m");
        arrayList.add("2");

        System.out.println("Size of arrayList after additions: " + arrayList.size());

        // display the arraylist
        System.out.println("Contents of arrayList: " + arrayList);

        // remove elements from the arraylist
        arrayList.remove("2");
        System.out.println("Contents of arrayList after deletion: " + arrayList);
        System.out.println("Size of arrayList after deletions: " + arrayList.size());
    }
}
