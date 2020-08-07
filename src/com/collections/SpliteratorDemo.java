package com.collections;

import java.util.ArrayList;
import java.util.Spliterator;

// A simple Spliterator example
public class SpliteratorDemo {
    public static void main(String[] args) {
        // Create an arraylist for doubles
        ArrayList<Double> vals = new ArrayList<Double>();

        // add values to the arrayList
        vals.add(1.0);
        vals.add(2.0);
        vals.add(3.0);
        vals.add(4.0);
        vals.add(5.0);

        // Use tryAdvance() to display contents of vals
        System.out.println("Contents of vals: /n");
        Spliterator<Double> spliterator = vals.spliterator();
        while (spliterator.tryAdvance((n) -> System.out.println(n)));
        System.out.println();

        // Create new list that contains square roots
        spliterator = vals.spliterator();
        ArrayList<Double> sqrs = new ArrayList<Double>();
        while (spliterator.tryAdvance((n) -> sqrs.add(Math.sqrt(n))));

        // Use forEachRemaining() to display contents of sqrs
        System.out.println("Contents of sqrs:");
        spliterator = sqrs.spliterator();
        spliterator.forEachRemaining((n)->System.out.println(n));

    }
}
