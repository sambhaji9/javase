package com.algorithms;

import java.util.Collections;
import java.util.Comparator;
import java.util.LinkedList;

public class AlgorithmsDemo {
    public static void main(String[] args) {
        // create and initialize linked list
        LinkedList<Integer> linkedList = new LinkedList<Integer>();
        linkedList.add(-8);
        linkedList.add(20);
        linkedList.add(-20);
        linkedList.add(10);
        linkedList.add(0);

        // create a reverse order comparator
        Comparator<Integer> comparator = Collections.reverseOrder();

        // sort list by using the comparator
        Collections.sort(linkedList, comparator);

        System.out.println("List sorted in reverse: ");
        for(int i: linkedList)
            System.out.print(i + " ");

        System.out.println();

        //shuffle list
        Collections.shuffle(linkedList);

        // display randomized list
        System.out.println("List shuffled: ");
        for(int i: linkedList)
            System.out.print(i + " ");

        System.out.println();

        System.out.println("Maximum: " + Collections.max(linkedList));
        System.out.println("Minimum: " + Collections.min(linkedList));
    }
}
