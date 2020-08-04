package com.collections;

import java.util.LinkedList;

public class LinkedListDemo {
    public static void main(String [] args) {
        // create a linked list
        LinkedList<String> linkedList = new LinkedList<String>();

        // Add elements to the linked list
        linkedList.add("A");
        linkedList.add("a");
        linkedList.add("r");
        linkedList.add("a");
        linkedList.add("d");
        linkedList.add("h");
        linkedList.add("y");
        linkedList.add("a");

        System.out.println("\nShow the Linkedlist");
        System.out.println(linkedList);

        System.out.println("\nAdd element at first index");
        linkedList.addFirst("Miss");
        System.out.println(linkedList);

        System.out.println("\nAdd element at last index");
        linkedList.addLast("Mane");
        System.out.println(linkedList);

        System.out.println("\nGet the element at first index");
        System.out.println(linkedList.getFirst());

        System.out.println("\nGet the element at last index");
        System.out.println(linkedList.getLast());

        System.out.println("\nRemove the element from first index");
        linkedList.removeFirst();
        System.out.println(linkedList);

        System.out.println("\nRemove the element from last index");
        linkedList.removeLast();
        System.out.println(linkedList);

        System.out.println("\nRemove the element from specific index");
        linkedList.remove(4);
        System.out.println(linkedList);

        System.out.println("\nInsert the element at specific index");
        linkedList.add(4, "d");
        System.out.println(linkedList);
    }
}
