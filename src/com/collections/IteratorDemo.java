package com.collections;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.ListIterator;

public class IteratorDemo {
    public static void main(String [] args) {
        // create an array list
        ArrayList<String> arrayList = new ArrayList<String>();

        // Add elements to the arrayList
        arrayList.add("A");
        arrayList.add("B");
        arrayList.add("C");
        arrayList.add("D");
        arrayList.add("E");
        arrayList.add("F");

        // use iterator to display contents of arrayList
        System.out.println("Original contents of arraylist: ");
        Iterator<String> iterator = arrayList.iterator();
        while (iterator.hasNext()) {
            String element = iterator.next();
            System.out.println(element + " ");
        }

        // modify objects being iterated
        ListIterator<String> listIterator = arrayList.listIterator();
        while(listIterator.hasNext()) {
            String element = listIterator.next();
            listIterator.set(element + element);
        }

        System.out.println("\nModified contents of arrayList");
        iterator = arrayList.iterator();

        while(iterator.hasNext()) {
            System.out.println(iterator.next());
        }

        System.out.println("\nDisplay arrayList backwards");
        while(listIterator.hasPrevious()) {
            System.out.println(listIterator.previous());
        }
    }
}
