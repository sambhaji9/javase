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

        System.out.println("\nMethods for arrayList");
        // remove elements from the arraylist
        arrayList.remove("2");
        System.out.println("Contents of arrayList after deletion: " + arrayList);
        System.out.println("Size of arrayList after deletions: " + arrayList.size());

        // checkif some element is in collection
        System.out.println("\ncheck if some element is in collection");
        System.out.println("t is in collection arrayList: " + arrayList.contains("t"));
        System.out.println("100 is in collection arrayList: " + arrayList.contains("100"));

        // checkif all the members are in another collection
        System.out.println("\ncheck if all the members are in another collection");
        ArrayList<String> arrayList3 = new ArrayList<String>();
        arrayList3.add("S");
        arrayList3.add("a");
        arrayList3.add("t");
        System.out.println("Sat is in collection arrayList: " + arrayList.containsAll(arrayList3));

        ArrayList<String> arrayList2 = new ArrayList<String>();
        arrayList2.addAll(0, arrayList);
        System.out.println(arrayList2);
    }
}
