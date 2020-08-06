package com.collections;

import java.util.ArrayDeque;

public class ArrayDequeDemo {
    public static void main(String[] args) {
        // create an array deque
        ArrayDeque<String> arrayDeque = new ArrayDeque<String>();

        // Use an arraydeque like a stack
        arrayDeque.push("A");
        arrayDeque.push("B");
        arrayDeque.push("C");
        arrayDeque.push("D");
        arrayDeque.push("E");
        arrayDeque.push("F");
        arrayDeque.push("G");

        System.out.println("Printing the ArrayDeque");
        System.out.println(arrayDeque);


        System.out.println("\nPopping the ArrayDeque");
        while (arrayDeque.peek() != null) {
            System.out.println(arrayDeque.pop() + " ");
        }

    }
}
