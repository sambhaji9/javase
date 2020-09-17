package com.collections;

import org.omg.CORBA.INTERNAL;

import java.util.Enumeration;
import java.util.Vector;

public class VectorDemo {
    public static void main(String[] args) {
        // initial size is 3, increment is 2
        Vector<Integer> vector = new Vector<Integer>(3, 2);
        System.out.println("Initial size: " + vector.size());
        System.out.println("Initial capacity: " + vector.capacity());

        vector.addElement(1);
        vector.addElement(2);
        vector.addElement(3);
        vector.addElement(4);

        System.out.println("Capacity after four additions: " + vector.capacity());

        vector.addElement(5);
        System.out.println("Current capacity: " + vector.capacity());

        vector.addElement(6);
        vector.addElement(7);

        System.out.println("Current capacity: " + vector.capacity());

        vector.addElement(9);
        vector.addElement(10);

        System.out.println("Current capacity: " + vector.capacity());

        vector.addElement(11);
        vector.addElement(12);

        System.out.println("First element: " + vector.firstElement());
        System.out.println("Last element: " + vector.lastElement());

        if (vector.contains(3)) {
            System.out.println("Vector contains 3");
        }

        // enumerate the element in the vector
        Enumeration<Integer> enumeration = vector.elements();
        System.out.println("\nElements in vector: ");
        while(enumeration.hasMoreElements())
            System.out.print(enumeration.nextElement() + " ");

        System.out.println();
    }
}
